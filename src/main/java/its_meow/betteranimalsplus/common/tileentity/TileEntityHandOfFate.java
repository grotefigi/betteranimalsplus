package its_meow.betteranimalsplus.common.tileentity;

import java.util.Random;

import its_meow.betteranimalsplus.common.entity.miniboss.hirschgeist.EntityHirschgeist;
import its_meow.betteranimalsplus.init.ModBlocks;
import its_meow.betteranimalsplus.init.ModTileEntities;
import its_meow.betteranimalsplus.init.ModTriggers;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class TileEntityHandOfFate extends TileEntity {

    private boolean onFire;
    private final String keyOnFire = "OnFire";

    private boolean hasNetherWart;
    private final String keyNetherWart = "HasNetherWart";

    private boolean hasAntler;
    private final String keyAntler = "HasAntler";

    private boolean hasVenison;
    private final String keyVenison = "HasVenison";

    public TileEntityHandOfFate() {
        super(ModTileEntities.HAND_OF_FATE_TYPE);
    }

    public TileEntityHandOfFate(World worldIn) {
        super(ModTileEntities.HAND_OF_FATE_TYPE);
        this.world = worldIn;
    }

    public void setOnFire(boolean b) {
        this.onFire = b;
        if (this.world.isRemote) {
            this.world.getPendingBlockTicks().scheduleTick(this.pos, this.getBlockState().getBlock(), 100);
            this.world.notifyBlockUpdate(this.pos, this.world.getBlockState(this.pos),
                    this.world.getBlockState(this.pos), 0);
            //this.world.markBlockRangeForRenderUpdate(this.getPos().down(5).west(5).north(5), this.getPos().up(5).east(5).south(5));
        }
        this.markDirty();
    }

    public boolean isOnFire() {
        return this.onFire;
    }

    public boolean hasNetherWart() {
        return this.hasNetherWart;
    }

    public void setHasNetherWart(PlayerEntity player, boolean hasNetherWart) {
        this.hasNetherWart = hasNetherWart;
        this.markDirty();
        this.checkHasAllThree(player);
    }

    public boolean hasAntler() {
        return this.hasAntler;
    }

    public void setHasAntler(PlayerEntity player, boolean hasAntler) {
        this.hasAntler = hasAntler;
        this.markDirty();
        this.checkHasAllThree(player);
    }

    public boolean hasVenison() {
        return this.hasVenison;
    }

    public void setHasVenison(PlayerEntity player, boolean hasVenison) {
        this.hasVenison = hasVenison;
        this.markDirty();
        this.checkHasAllThree(player);
    }

    private void checkHasAllThree(PlayerEntity player) {
        if (this.hasVenison && this.hasAntler && this.hasNetherWart && this.isOnFire()) {
            this.setHasVenison(player, false);
            this.setHasAntler(player, false);
            this.setHasNetherWart(player, false);
            this.fireBurst();
            this.spawnHirschgeist();
            if(!world.isRemote && player instanceof ServerPlayerEntity) {
                ModTriggers.HAND_OF_FATE_SUMMON.trigger((ServerPlayerEntity) player);
            }
        }
    }

    private void spawnHirschgeist() {
        if (!this.world.isRemote) {
            EntityHirschgeist hg = new EntityHirschgeist(this.world);
            hg.setLocationAndAngles(this.pos.getX(), this.pos.getY() + 1F, this.pos.getZ(), 0, 0);
            hg.setNoAI(false);
            this.world.addEntity(hg);
        }
    }

    private void fireBurst() {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            this.world.addParticle(ParticleTypes.FLAME, this.getPos().getX() + (rand.nextFloat() + 0.5F) / 2,
                    this.getPos().getY() + 1.5F, this.getPos().getZ() + (rand.nextFloat() + 0.5F) / 2, 0, 0.5F, 0);
        }
    }

    @Override
    public void read(CompoundNBT compound) {
        super.read(compound);
        if (compound.contains(this.keyOnFire)) {
            this.onFire = compound.getBoolean(this.keyOnFire);
        }
        if (compound.contains(this.keyNetherWart)) {
            this.hasNetherWart = compound.getBoolean(this.keyNetherWart);
        }
        if (compound.contains(this.keyAntler)) {
            this.hasAntler = compound.getBoolean(this.keyAntler);
        }
        if (compound.contains(this.keyVenison)) {
            this.hasVenison = compound.getBoolean(this.keyVenison);
        }
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        super.write(compound);
        compound.putBoolean(this.keyOnFire, this.onFire);
        compound.putBoolean(this.keyAntler, this.hasAntler);
        compound.putBoolean(this.keyNetherWart, this.hasNetherWart);
        compound.putBoolean(this.keyVenison, this.hasVenison);
        return compound;
    }

    @Override
    public SUpdateTileEntityPacket getUpdatePacket() {
        CompoundNBT tag = new CompoundNBT();
        this.write(tag);
        return new SUpdateTileEntityPacket(this.pos, 1, tag);
    }

    @Override
    public void onDataPacket(NetworkManager net, SUpdateTileEntityPacket packet) {
        this.read(packet.getNbtCompound());
        this.world.getPendingBlockTicks().scheduleTick(this.pos, this.getBlockState().getBlock(), 100);
    }

    @Override
    public CompoundNBT getUpdateTag() {
        CompoundNBT tag = new CompoundNBT();
        this.write(tag);
        return tag;
    }

    @Override
    public void handleUpdateTag(CompoundNBT tag) {
        this.read(tag);
    }

    @OnlyIn(Dist.CLIENT)
    public float getRotation() {
        BlockState state = this.world.getBlockState(this.pos);
        if (state.getBlock() == ModBlocks.HAND_OF_FATE) {
            Direction facing = state.get(HorizontalBlock.HORIZONTAL_FACING).getOpposite();
            if (facing == Direction.NORTH) {
                return 0F;
            }
            if (facing == Direction.EAST) {
                return 90F;
            }
            if (facing == Direction.SOUTH) {
                return 180F;
            }
            if (facing == Direction.WEST) {
                return 270F;
            }
        }
        return 0F;
    }

}
