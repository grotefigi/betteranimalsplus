package its_meow.betteranimalsplus.client.model;

import its_meow.betteranimalsplus.common.entity.EntityBobbitWorm;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.LivingEntity;

/**
 * bobbit_worm - cybercat5555
 * Created using Tabula 7.0.1
 */
public class ModelBobbitWorm<T extends LivingEntity> extends EntityModel<T> {
    public RendererModel body;
    public RendererModel lFin00a;
    public RendererModel rFin00a;
    public RendererModel lFin00b;
    public RendererModel rFin00b;
    public RendererModel head;
    public RendererModel tail00;
    public RendererModel mAntenna;
    public RendererModel lAntenna00;
    public RendererModel rAntenna00;
    public RendererModel lAntenna01;
    public RendererModel rAntenna01;
    public RendererModel lMandible00;
    public RendererModel rMandible00;
    public RendererModel lMandible01;
    public RendererModel lMandible02;
    public RendererModel rMandible01;
    public RendererModel rMandible02;
    public RendererModel lFin01a;
    public RendererModel rFin01a;
    public RendererModel lFin01b;
    public RendererModel rFin01b;
    public RendererModel lFin01c;
    public RendererModel rFin01c;
    public RendererModel tail01;
    public RendererModel lFin02a;
    public RendererModel rFin02a;
    public RendererModel lFin02b;
    public RendererModel rFin02b;
    public RendererModel lFin02c;
    public RendererModel rFin02c;
    public RendererModel tail02;
    public RendererModel lFin03a;
    public RendererModel rFin03a;
    public RendererModel lFin03b;
    public RendererModel rFin03b;
    public RendererModel lFin03c;
    public RendererModel rFin03c;
    public RendererModel tail03;
    public RendererModel lFin04a;
    public RendererModel rFin04a;
    public RendererModel lFin04b;
    public RendererModel rFin04b;
    public RendererModel lFin04c;
    public RendererModel rFin04c;
    public RendererModel tail04;
    public RendererModel lFin05a;
    public RendererModel rFin05a;
    public RendererModel lFin05b;
    public RendererModel rFin05b;
    public RendererModel lFin05c;
    public RendererModel rFin05c;
    public RendererModel tail05;
    public RendererModel lFin06a;
    public RendererModel rFin06a;
    public RendererModel lFin06b;
    public RendererModel rFin06b;
    public RendererModel lFin06c;
    public RendererModel rFin06c;

    public ModelBobbitWorm() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.rFin00a = new RendererModel(this, 28, 0);
        this.rFin00a.mirror = true;
        this.rFin00a.setRotationPoint(-2.8F, 1.2F, -0.1F);
        this.rFin00a.addBox(-5.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.rMandible00 = new RendererModel(this, 31, 7);
        this.rMandible00.mirror = true;
        this.rMandible00.setRotationPoint(-0.9F, 0.5F, -5.3F);
        this.rMandible00.addBox(-7.0F, -1.4F, -2.5F, 7, 2, 3, 0.0F);
        this.setRotateAngle(rMandible00, 0.0F, -0.3839724354387525F, 0.0F);
        this.body = new RendererModel(this, 0, 13);
        this.body.setRotationPoint(0.0F, 22.0F, 0.0F);
        this.body.addBox(-3.0F, -2.0F, -4.0F, 6, 4, 8, 0.0F);
        this.rFin03a = new RendererModel(this, 28, 0);
        this.rFin03a.mirror = true;
        this.rFin03a.setRotationPoint(-2.8F, 0.0F, 1.2F);
        this.rFin03a.addBox(-5.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.rFin06a = new RendererModel(this, 28, 3);
        this.rFin06a.mirror = true;
        this.rFin06a.setRotationPoint(-1.8F, 0.0F, 1.2F);
        this.rFin06a.addBox(-4.0F, 0.0F, -1.0F, 4, 0, 2, 0.0F);
        this.setRotateAngle(rFin06a, 0.0F, 0.13962634015954636F, 0.0F);
        this.rFin04c = new RendererModel(this, 28, 0);
        this.rFin04c.mirror = true;
        this.rFin04c.setRotationPoint(-2.8F, 0.0F, 6.6F);
        this.rFin04c.addBox(-5.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.lFin05c = new RendererModel(this, 28, 0);
        this.lFin05c.setRotationPoint(1.1F, 0.0F, 6.2F);
        this.lFin05c.addBox(0.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.setRotateAngle(lFin05c, 0.0F, -0.06981317007977318F, 0.0F);
        this.rFin01c = new RendererModel(this, 28, 0);
        this.rFin01c.mirror = true;
        this.rFin01c.setRotationPoint(-2.8F, 0.0F, 6.6F);
        this.rFin01c.addBox(-5.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.rFin04b = new RendererModel(this, 28, 0);
        this.rFin04b.mirror = true;
        this.rFin04b.setRotationPoint(-2.8F, 0.0F, 4.0F);
        this.rFin04b.addBox(-5.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.lFin04b = new RendererModel(this, 28, 0);
        this.lFin04b.setRotationPoint(2.8F, 0.0F, 4.0F);
        this.lFin04b.addBox(0.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.lAntenna00 = new RendererModel(this, 37, 0);
        this.lAntenna00.setRotationPoint(1.0F, -1.3F, -6.2F);
        this.lAntenna00.addBox(-0.5F, 0.0F, -6.0F, 1, 0, 6, 0.0F);
        this.setRotateAngle(lAntenna00, -0.2792526803190927F, -0.3839724354387525F, 0.0F);
        this.lFin06c = new RendererModel(this, 28, 3);
        this.lFin06c.setRotationPoint(0.6F, 0.0F, 6.2F);
        this.lFin06c.addBox(0.0F, 0.0F, -1.0F, 4, 0, 2, 0.0F);
        this.setRotateAngle(lFin06c, 0.0F, -0.3490658503988659F, 0.0F);
        this.rFin01a = new RendererModel(this, 28, 0);
        this.rFin01a.mirror = true;
        this.rFin01a.setRotationPoint(-2.8F, 0.0F, 1.2F);
        this.rFin01a.addBox(-5.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.rMandible01 = new RendererModel(this, 31, 13);
        this.rMandible01.mirror = true;
        this.rMandible01.setRotationPoint(-6.4F, -0.8F, -0.2F);
        this.rMandible01.addBox(-5.0F, -0.5F, -1.3F, 5, 1, 2, 0.0F);
        this.setRotateAngle(rMandible01, 0.0F, -0.5235987755982988F, 0.17453292519943295F);
        this.lFin00b = new RendererModel(this, 28, 0);
        this.lFin00b.setRotationPoint(2.8F, 0.6F, 2.5F);
        this.lFin00b.addBox(0.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.rFin04a = new RendererModel(this, 28, 0);
        this.rFin04a.mirror = true;
        this.rFin04a.setRotationPoint(-2.8F, 0.0F, 1.2F);
        this.rFin04a.addBox(-5.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.lFin03b = new RendererModel(this, 28, 0);
        this.lFin03b.setRotationPoint(2.8F, 0.0F, 4.0F);
        this.lFin03b.addBox(0.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.lFin02a = new RendererModel(this, 28, 0);
        this.lFin02a.setRotationPoint(2.8F, 0.0F, 1.2F);
        this.lFin02a.addBox(0.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.lFin05a = new RendererModel(this, 28, 0);
        this.lFin05a.setRotationPoint(2.3F, 0.0F, 1.2F);
        this.lFin05a.addBox(0.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.lFin01a = new RendererModel(this, 28, 0);
        this.lFin01a.setRotationPoint(2.8F, 0.0F, 1.2F);
        this.lFin01a.addBox(0.0F, 0.0F, -1.1F, 5, 0, 2, 0.0F);
        this.rAntenna01 = new RendererModel(this, 37, 0);
        this.rAntenna01.mirror = true;
        this.rAntenna01.setRotationPoint(-0.3F, -0.9F, -6.2F);
        this.rAntenna01.addBox(-0.5F, 0.0F, -6.0F, 1, 0, 6, 0.0F);
        this.setRotateAngle(rAntenna01, -0.17453292519943295F, 0.17453292519943295F, 0.0F);
        this.lFin05b = new RendererModel(this, 28, 0);
        this.lFin05b.setRotationPoint(1.8F, 0.0F, 3.8F);
        this.lFin05b.addBox(0.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.rAntenna00 = new RendererModel(this, 37, 0);
        this.rAntenna00.mirror = true;
        this.rAntenna00.setRotationPoint(-1.0F, -1.3F, -6.2F);
        this.rAntenna00.addBox(-0.5F, 0.0F, -6.0F, 1, 0, 6, 0.0F);
        this.setRotateAngle(rAntenna00, -0.2792526803190927F, 0.3839724354387525F, 0.0F);
        this.rFin01b = new RendererModel(this, 28, 0);
        this.rFin01b.mirror = true;
        this.rFin01b.setRotationPoint(-2.8F, 0.0F, 4.0F);
        this.rFin01b.addBox(-5.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.tail05 = new RendererModel(this, 39, 13);
        this.tail05.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail05.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 8, 0.0F);
        this.lFin02b = new RendererModel(this, 28, 0);
        this.lFin02b.setRotationPoint(2.8F, 0.0F, 4.0F);
        this.lFin02b.addBox(0.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.lMandible02 = new RendererModel(this, 31, 13);
        this.lMandible02.setRotationPoint(6.4F, -0.1F, -0.2F);
        this.lMandible02.addBox(0.0F, -0.5F, -1.3F, 5, 1, 2, 0.0F);
        this.setRotateAngle(lMandible02, 0.0F, 0.5235987755982988F, 0.0F);
        this.rFin00b = new RendererModel(this, 28, 0);
        this.rFin00b.mirror = true;
        this.rFin00b.setRotationPoint(-2.8F, 0.6F, 2.5F);
        this.rFin00b.addBox(-5.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.lFin06b = new RendererModel(this, 28, 3);
        this.lFin06b.setRotationPoint(1.3F, 0.0F, 3.8F);
        this.lFin06b.addBox(0.0F, 0.0F, -1.0F, 4, 0, 2, 0.0F);
        this.setRotateAngle(lFin06b, 0.0F, -0.2792526803190927F, 0.0F);
        this.tail03 = new RendererModel(this, 0, 13);
        this.tail03.mirror = true;
        this.tail03.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail03.addBox(-3.0F, -2.0F, 0.0F, 6, 4, 8, 0.0F);
        this.lFin00a = new RendererModel(this, 28, 0);
        this.lFin00a.setRotationPoint(2.8F, 1.2F, -0.1F);
        this.lFin00a.addBox(0.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.lFin04c = new RendererModel(this, 28, 0);
        this.lFin04c.setRotationPoint(2.8F, 0.0F, 6.6F);
        this.lFin04c.addBox(0.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.rFin05a = new RendererModel(this, 28, 0);
        this.rFin05a.mirror = true;
        this.rFin05a.setRotationPoint(-2.3F, 0.0F, 1.2F);
        this.rFin05a.addBox(-5.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.rFin02c = new RendererModel(this, 28, 0);
        this.rFin02c.mirror = true;
        this.rFin02c.setRotationPoint(-2.8F, 0.0F, 6.6F);
        this.rFin02c.addBox(-5.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.lMandible00 = new RendererModel(this, 31, 7);
        this.lMandible00.setRotationPoint(0.9F, 0.5F, -5.3F);
        this.lMandible00.addBox(0.0F, -1.4F, -2.5F, 7, 2, 3, 0.0F);
        this.setRotateAngle(lMandible00, 0.0F, 0.3839724354387525F, 0.0F);
        this.rFin03b = new RendererModel(this, 28, 0);
        this.rFin03b.mirror = true;
        this.rFin03b.setRotationPoint(-2.8F, 0.0F, 4.0F);
        this.rFin03b.addBox(-5.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.lFin02c = new RendererModel(this, 28, 0);
        this.lFin02c.setRotationPoint(2.8F, 0.0F, 6.6F);
        this.lFin02c.addBox(0.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.lFin03c = new RendererModel(this, 28, 0);
        this.lFin03c.setRotationPoint(2.8F, 0.0F, 6.6F);
        this.lFin03c.addBox(0.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.lFin03a = new RendererModel(this, 28, 0);
        this.lFin03a.setRotationPoint(2.8F, 0.0F, 1.2F);
        this.lFin03a.addBox(0.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.mAntenna = new RendererModel(this, 37, 0);
        this.mAntenna.setRotationPoint(0.0F, -1.7F, -6.2F);
        this.mAntenna.addBox(-0.5F, 0.0F, -6.0F, 1, 0, 6, 0.0F);
        this.setRotateAngle(mAntenna, -0.3141592653589793F, 0.0F, 0.0F);
        this.rFin06c = new RendererModel(this, 28, 3);
        this.rFin06c.mirror = true;
        this.rFin06c.setRotationPoint(-0.6F, 0.0F, 6.2F);
        this.rFin06c.addBox(-4.0F, 0.0F, -1.0F, 4, 0, 2, 0.0F);
        this.setRotateAngle(rFin06c, 0.0F, 0.3490658503988659F, 0.0F);
        this.rMandible02 = new RendererModel(this, 31, 13);
        this.rMandible02.mirror = true;
        this.rMandible02.setRotationPoint(-6.4F, -0.1F, -0.2F);
        this.rMandible02.addBox(-5.0F, -0.5F, -1.3F, 5, 1, 2, 0.0F);
        this.setRotateAngle(rMandible02, 0.0F, -0.5235987755982988F, 0.0F);
        this.rFin05b = new RendererModel(this, 28, 0);
        this.rFin05b.mirror = true;
        this.rFin05b.setRotationPoint(-1.8F, 0.0F, 3.8F);
        this.rFin05b.addBox(-5.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.lFin01c = new RendererModel(this, 28, 0);
        this.lFin01c.setRotationPoint(2.8F, 0.0F, 6.6F);
        this.lFin01c.addBox(0.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.tail02 = new RendererModel(this, 0, 13);
        this.tail02.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail02.addBox(-3.0F, -2.0F, 0.0F, 6, 4, 8, 0.0F);
        this.rFin02a = new RendererModel(this, 28, 0);
        this.rFin02a.mirror = true;
        this.rFin02a.setRotationPoint(-2.8F, 0.0F, 1.2F);
        this.rFin02a.addBox(-5.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.lMandible01 = new RendererModel(this, 31, 13);
        this.lMandible01.setRotationPoint(6.4F, -0.8F, -0.2F);
        this.lMandible01.addBox(0.0F, -0.5F, -1.3F, 5, 1, 2, 0.0F);
        this.setRotateAngle(lMandible01, 0.0F, 0.5235987755982988F, -0.17453292519943295F);
        this.lFin06a = new RendererModel(this, 28, 3);
        this.lFin06a.setRotationPoint(1.8F, 0.0F, 1.2F);
        this.lFin06a.addBox(0.0F, 0.0F, -1.0F, 4, 0, 2, 0.0F);
        this.setRotateAngle(lFin06a, 0.0F, -0.13962634015954636F, 0.0F);
        this.rFin05c = new RendererModel(this, 28, 0);
        this.rFin05c.mirror = true;
        this.rFin05c.setRotationPoint(-1.1F, 0.0F, 6.2F);
        this.rFin05c.addBox(-5.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.setRotateAngle(rFin05c, 0.0F, 0.06981317007977318F, 0.0F);
        this.head = new RendererModel(this, 0, 0);
        this.head.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.head.addBox(-3.5F, -2.0F, -7.0F, 7, 4, 7, 0.0F);
        this.lFin04a = new RendererModel(this, 28, 0);
        this.lFin04a.setRotationPoint(2.8F, 0.0F, 1.2F);
        this.lFin04a.addBox(0.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.tail04 = new RendererModel(this, 20, 19);
        this.tail04.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail04.addBox(-2.5F, -2.0F, 0.0F, 5, 4, 8, 0.0F);
        this.tail01 = new RendererModel(this, 0, 13);
        this.tail01.mirror = true;
        this.tail01.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail01.addBox(-3.0F, -2.0F, 0.0F, 6, 4, 8, 0.0F);
        this.rFin03c = new RendererModel(this, 28, 0);
        this.rFin03c.mirror = true;
        this.rFin03c.setRotationPoint(-2.8F, 0.0F, 6.6F);
        this.rFin03c.addBox(-5.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.lFin01b = new RendererModel(this, 28, 0);
        this.lFin01b.setRotationPoint(2.8F, 0.0F, 4.0F);
        this.lFin01b.addBox(0.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.rFin06b = new RendererModel(this, 28, 3);
        this.rFin06b.mirror = true;
        this.rFin06b.setRotationPoint(-1.3F, 0.0F, 3.8F);
        this.rFin06b.addBox(-4.0F, 0.0F, -1.0F, 4, 0, 2, 0.0F);
        this.setRotateAngle(rFin06b, 0.0F, 0.2792526803190927F, 0.0F);
        this.lAntenna01 = new RendererModel(this, 37, 0);
        this.lAntenna01.setRotationPoint(0.3F, -0.9F, -6.2F);
        this.lAntenna01.addBox(-0.5F, 0.0F, -6.0F, 1, 0, 6, 0.0F);
        this.setRotateAngle(lAntenna01, -0.17453292519943295F, -0.17453292519943295F, 0.0F);
        this.tail00 = new RendererModel(this, 0, 13);
        this.tail00.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail00.addBox(-3.0F, -2.0F, 0.0F, 6, 4, 8, 0.0F);
        this.rFin02b = new RendererModel(this, 28, 0);
        this.rFin02b.mirror = true;
        this.rFin02b.setRotationPoint(-2.8F, 0.0F, 4.0F);
        this.rFin02b.addBox(-5.0F, 0.0F, -1.0F, 5, 0, 2, 0.0F);
        this.body.addChild(this.rFin00a);
        this.head.addChild(this.rMandible00);
        this.tail02.addChild(this.rFin03a);
        this.tail05.addChild(this.rFin06a);
        this.tail03.addChild(this.rFin04c);
        this.tail04.addChild(this.lFin05c);
        this.tail00.addChild(this.rFin01c);
        this.tail03.addChild(this.rFin04b);
        this.tail03.addChild(this.lFin04b);
        this.head.addChild(this.lAntenna00);
        this.tail05.addChild(this.lFin06c);
        this.tail00.addChild(this.rFin01a);
        this.rMandible00.addChild(this.rMandible01);
        this.body.addChild(this.lFin00b);
        this.tail03.addChild(this.rFin04a);
        this.tail02.addChild(this.lFin03b);
        this.tail01.addChild(this.lFin02a);
        this.tail04.addChild(this.lFin05a);
        this.tail00.addChild(this.lFin01a);
        this.head.addChild(this.rAntenna01);
        this.tail04.addChild(this.lFin05b);
        this.head.addChild(this.rAntenna00);
        this.tail00.addChild(this.rFin01b);
        this.tail04.addChild(this.tail05);
        this.tail01.addChild(this.lFin02b);
        this.lMandible00.addChild(this.lMandible02);
        this.body.addChild(this.rFin00b);
        this.tail05.addChild(this.lFin06b);
        this.tail02.addChild(this.tail03);
        this.body.addChild(this.lFin00a);
        this.tail03.addChild(this.lFin04c);
        this.tail04.addChild(this.rFin05a);
        this.tail01.addChild(this.rFin02c);
        this.head.addChild(this.lMandible00);
        this.tail02.addChild(this.rFin03b);
        this.tail01.addChild(this.lFin02c);
        this.tail02.addChild(this.lFin03c);
        this.tail02.addChild(this.lFin03a);
        this.head.addChild(this.mAntenna);
        this.tail05.addChild(this.rFin06c);
        this.rMandible00.addChild(this.rMandible02);
        this.tail04.addChild(this.rFin05b);
        this.tail00.addChild(this.lFin01c);
        this.tail01.addChild(this.tail02);
        this.tail01.addChild(this.rFin02a);
        this.lMandible00.addChild(this.lMandible01);
        this.tail05.addChild(this.lFin06a);
        this.tail04.addChild(this.rFin05c);
        this.body.addChild(this.head);
        this.tail03.addChild(this.lFin04a);
        this.tail03.addChild(this.tail04);
        this.tail00.addChild(this.tail01);
        this.tail02.addChild(this.rFin03c);
        this.tail00.addChild(this.lFin01b);
        this.tail05.addChild(this.rFin06b);
        this.head.addChild(this.lAntenna01);
        this.body.addChild(this.tail00);
        this.tail01.addChild(this.rFin02b);
    }

    @Override
    public void render(T entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.body.render(f5);
    }

    @Override
    public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
        if(entity instanceof EntityBobbitWorm) {
            EntityBobbitWorm worm = (EntityBobbitWorm) entity;
            int attack = worm.getAttackState();
            
            float add = entity.getUniqueID().hashCode() * 0.001F;
            if(attack > 0) {
                float angle = ((30 - attack) % 60) * 0.04F + 0.3839724354387525F;
                this.lMandible00.rotateAngleY = angle;
                this.rMandible00.rotateAngleY = -angle;
            } else {
                float mul = 0.1F;
                float div = 40F;
                this.lMandible00.rotateAngleY = (float) Math.cos(ageInTicks * (mul + 0.03F) + add) / div + 0.3839724354387525F;
                this.rMandible00.rotateAngleY = (float) Math.cos(ageInTicks * (mul) + add) / div - 0.3839724354387525F;
            }
            this.body.rotateAngleX = 0;
            this.body.offsetY = 0;
            if(worm.getMotion().getX() < 0.03 && worm.getMotion().getZ() < 0.03 && worm.getMotion().getY() < 0.03 && !worm.getMoveHelper().isUpdating() && worm.isGoodBurrowingPosition(worm.getPosition())) {
                this.body.rotateAngleX = - (float) Math.toRadians(60F);
                this.body.offsetY = 0.3F;
            }
            float mul = 0.3F;
            float div = 20F;
            this.lAntenna00.rotateAngleX = (float) Math.cos(ageInTicks * (mul + 0.05F) + add) / div;
            this.lAntenna01.rotateAngleX = (float) Math.cos(ageInTicks * mul + add) / div;
            this.mAntenna.rotateAngleX = (float) Math.cos(ageInTicks * (mul + 0.1F) + add) / div;
            this.rAntenna00.rotateAngleX = (float) Math.cos(ageInTicks * mul + add) / div;
            this.rAntenna01.rotateAngleX = (float) Math.cos(ageInTicks * (mul + 0.03F) + add) / div;
        }
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(RendererModel RendererModel, float x, float y, float z) {
        RendererModel.rotateAngleX = x;
        RendererModel.rotateAngleY = y;
        RendererModel.rotateAngleZ = z;
    }
}
