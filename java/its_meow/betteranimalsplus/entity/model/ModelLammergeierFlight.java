package its_meow.betteranimalsplus.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * lammergeierflight - cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelLammergeierFlight extends ModelLammergeier {
    public ModelLammergeierFlight() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.neckFeather02 = new ModelRenderer(this, 48, 52);
        this.neckFeather02.setRotationPoint(0.0F, 1.3F, -2.4F);
        this.neckFeather02.addBox(-2.0F, -1.0F, 0.0F, 4, 2, 3, 0.0F);
        this.setRotateAngle(neckFeather02, -0.5918411493512771F, 0.0F, 0.0F);
        this.lTailFeather02 = new ModelRenderer(this, 0, 54);
        this.lTailFeather02.setRotationPoint(1.2F, 0.65F, 3.8F);
        this.lTailFeather02.addBox(-1.0F, 0.0F, 0.4F, 2, 0, 8, 0.0F);
        this.setRotateAngle(lTailFeather02, -0.091106186954104F, 0.31869712141416456F, 0.0F);
        this.rToe02 = new ModelRenderer(this, 54, 10);
        this.rToe02.mirror = true;
        this.rToe02.setRotationPoint(0.0F, 0.0F, -1.3F);
        this.rToe02.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rToe02, 0.136659280431156F, 0.0F, 0.0F);
        this.lToe02 = new ModelRenderer(this, 54, 10);
        this.lToe02.setRotationPoint(0.0F, 0.0F, -1.3F);
        this.lToe02.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lToe02, 0.136659280431156F, 0.0F, 0.0F);
        this.rWingFeathers02 = new ModelRenderer(this, 3, 44);
        this.rWingFeathers02.mirror = true;
        this.rWingFeathers02.setRotationPoint(0.0F, 0.0F, 1.2F);
        this.rWingFeathers02.addBox(-17.1F, 0.0F, -2.7F, 16, 0, 10, 0.0F);
        this.rTailFeather04 = new ModelRenderer(this, 0, 54);
        this.rTailFeather04.mirror = true;
        this.rTailFeather04.setRotationPoint(0.0F, 0.55F, 5.2F);
        this.rTailFeather04.addBox(-1.0F, 0.0F, 0.4F, 2, 0, 8, 0.0F);
        this.setRotateAngle(rTailFeather04, -0.091106186954104F, -0.091106186954104F, 0.0F);
        this.lLegFeathers = new ModelRenderer(this, 2, 35);
        this.lLegFeathers.setRotationPoint(0.5F, 1.9F, -0.1F);
        this.lLegFeathers.addBox(0.1F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(lLegFeathers, 0.18203784098300857F, 0.27314402793711257F, 0.0F);
        this.rTailFeather02 = new ModelRenderer(this, 0, 54);
        this.rTailFeather02.mirror = true;
        this.rTailFeather02.setRotationPoint(-1.2F, 0.65F, 3.8F);
        this.rTailFeather02.addBox(-1.0F, 0.0F, 0.4F, 2, 0, 8, 0.0F);
        this.setRotateAngle(rTailFeather02, -0.091106186954104F, -0.31869712141416456F, 0.0F);
        this.lowerJaw01 = new ModelRenderer(this, 53, 26);
        this.lowerJaw01.setRotationPoint(0.0F, 1.6F, -1.0F);
        this.lowerJaw01.addBox(-0.1F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lowerJaw01, -0.091106186954104F, 0.0F, 0.091106186954104F);
        this.lWing01 = new ModelRenderer(this, 25, 24);
        this.lWing01.setRotationPoint(3.0F, -1.7F, -1.7F);
        this.lWing01.addBox(0.0F, -0.5F, -1.5F, 8, 1, 3, 0.0F);
        this.rLegFeathers = new ModelRenderer(this, 2, 35);
        this.rLegFeathers.mirror = true;
        this.rLegFeathers.setRotationPoint(-0.5F, 1.9F, -0.1F);
        this.rLegFeathers.addBox(-2.1F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(rLegFeathers, 0.18203784098300857F, -0.27314402793711257F, 0.0F);
        this.rWing02 = new ModelRenderer(this, 25, 30);
        this.rWing02.mirror = true;
        this.rWing02.setRotationPoint(-7.7F, 0.0F, -0.2F);
        this.rWing02.addBox(-10.0F, -0.5F, -1.0F, 10, 1, 2, 0.0F);
        this.setRotateAngle(rWing02, 0.0F, -0.27314402793711257F, 0.0F);
        this.rTailFeather03 = new ModelRenderer(this, 0, 54);
        this.rTailFeather03.mirror = true;
        this.rTailFeather03.setRotationPoint(-0.2F, 0.6F, 4.5F);
        this.rTailFeather03.addBox(-1.0F, 0.0F, 0.4F, 2, 0, 8, 0.0F);
        this.setRotateAngle(rTailFeather03, -0.091106186954104F, -0.27314402793711257F, 0.0F);
        this.rTailFeather01 = new ModelRenderer(this, 0, 54);
        this.rTailFeather01.mirror = true;
        this.rTailFeather01.setRotationPoint(-1.2F, 0.7F, 2.9F);
        this.rTailFeather01.addBox(-1.0F, 0.0F, 0.4F, 2, 0, 8, 0.0F);
        this.setRotateAngle(rTailFeather01, -0.091106186954104F, -0.4553564018453205F, 0.0F);
        this.beard = new ModelRenderer(this, 0, 0);
        this.beard.setRotationPoint(0.0F, 1.7F, 0.4F);
        this.beard.addBox(0.0F, -1.0F, -0.3F, 0, 2, 2, 0.0F);
        this.setRotateAngle(beard, 0.18203784098300857F, 0.0F, -0.091106186954104F);
        this.upperJawR = new ModelRenderer(this, 53, 21);
        this.upperJawR.mirror = true;
        this.upperJawR.setRotationPoint(-0.7F, -0.1F, 0.1F);
        this.upperJawR.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(upperJawR, 0.0F, 0.0F, -0.22759093446006054F);
        this.rToe01 = new ModelRenderer(this, 54, 10);
        this.rToe01.mirror = true;
        this.rToe01.setRotationPoint(-0.5F, 0.1F, -1.2F);
        this.rToe01.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rToe01, 0.136659280431156F, 0.36425021489121656F, 0.0F);
        this.lToe04 = new ModelRenderer(this, 54, 14);
        this.lToe04.setRotationPoint(0.0F, 0.0F, 1.3F);
        this.lToe04.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lToe04, -0.136659280431156F, 0.0F, 0.0F);
        this.rLeg01 = new ModelRenderer(this, 30, 13);
        this.rLeg01.mirror = true;
        this.rLeg01.setRotationPoint(-0.5F, 0.6F, 3.2F);
        this.rLeg01.addBox(-3.0F, -0.5F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(rLeg01, 1.3658946726107624F, 0.0F, 0.0F);
        this.muzzle = new ModelRenderer(this, 48, 26);
        this.muzzle.setRotationPoint(0.0F, 1.7F, -2.3F);
        this.muzzle.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(muzzle, 0.22759093446006054F, 0.0F, 0.0F);
        this.tail01 = new ModelRenderer(this, 0, 16);
        this.tail01.setRotationPoint(0.0F, -0.5F, 4.8F);
        this.tail01.addBox(-2.5F, -1.0F, 0.4F, 5, 2, 6, 0.0F);
        this.setRotateAngle(tail01, -0.18203784098300857F, 0.0F, 0.0F);
        this.rWing01 = new ModelRenderer(this, 25, 24);
        this.rWing01.mirror = true;
        this.rWing01.setRotationPoint(-3.0F, -1.7F, -1.7F);
        this.rWing01.addBox(-8.0F, -0.5F, -1.5F, 8, 1, 3, 0.0F);
        this.rToe03 = new ModelRenderer(this, 54, 10);
        this.rToe03.mirror = true;
        this.rToe03.setRotationPoint(0.5F, 0.1F, -1.2F);
        this.rToe03.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rToe03, 0.136659280431156F, -0.36425021489121656F, 0.0F);
        this.neckFeather01 = new ModelRenderer(this, 48, 45);
        this.neckFeather01.setRotationPoint(0.0F, 1.1F, -2.3F);
        this.neckFeather01.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(neckFeather01, -0.4553564018453205F, 0.0F, 0.0F);
        this.headFeathers = new ModelRenderer(this, 35, 56);
        this.headFeathers.setRotationPoint(0.0F, -1.3F, -1.8F);
        this.headFeathers.addBox(-1.5F, -2.0F, -1.2F, 3, 2, 2, 0.0F);
        this.setRotateAngle(headFeathers, -0.136659280431156F, 0.0F, 0.0F);
        this.rWingFeathers01 = new ModelRenderer(this, 5, 35);
        this.rWingFeathers01.mirror = true;
        this.rWingFeathers01.setRotationPoint(0.0F, 0.0F, 1.2F);
        this.rWingFeathers01.addBox(-11.8F, -0.1F, -0.7F, 12, 0, 8, 0.0F);
        this.lowerJaw02 = new ModelRenderer(this, 53, 26);
        this.lowerJaw02.mirror = true;
        this.lowerJaw02.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lowerJaw02.addBox(-1.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lowerJaw02, 0.0F, 0.0F, -0.18203784098300857F);
        this.lowerJawBeak = new ModelRenderer(this, 58, 26);
        this.lowerJawBeak.setRotationPoint(0.2F, 2.4F, 0.1F);
        this.lowerJawBeak.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(lowerJawBeak, 0.4553564018453205F, -0.5009094953223726F, 0.6981317007977318F);
        this.neckFeather03 = new ModelRenderer(this, 17, 56);
        this.neckFeather03.setRotationPoint(0.0F, -1.3F, -1.7F);
        this.neckFeather03.addBox(-2.0F, -1.0F, 0.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(neckFeather03, 0.7285004297824331F, 0.0F, 0.0F);
        this.rToe04 = new ModelRenderer(this, 54, 14);
        this.rToe04.mirror = true;
        this.rToe04.setRotationPoint(0.0F, 0.0F, 1.3F);
        this.rToe04.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rToe04, -0.136659280431156F, 0.0F, 0.0F);
        this.lTailFeather03 = new ModelRenderer(this, 0, 54);
        this.lTailFeather03.setRotationPoint(0.2F, 0.6F, 4.5F);
        this.lTailFeather03.addBox(-1.0F, 0.0F, 0.4F, 2, 0, 8, 0.0F);
        this.setRotateAngle(lTailFeather03, -0.091106186954104F, 0.27314402793711257F, 0.0F);
        this.rFoot = new ModelRenderer(this, 43, 15);
        this.rFoot.mirror = true;
        this.rFoot.setRotationPoint(0.0F, 1.8F, 0.0F);
        this.rFoot.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(rFoot, 0.136659280431156F, 0.0F, 0.0F);
        this.upperJawL = new ModelRenderer(this, 53, 21);
        this.upperJawL.setRotationPoint(0.7F, -0.1F, 0.1F);
        this.upperJawL.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(upperJawL, 0.0F, 0.0F, 0.22759093446006054F);
        this.upperJaw01 = new ModelRenderer(this, 48, 21);
        this.upperJaw01.setRotationPoint(0.0F, 1.8F, -1.6F);
        this.upperJaw01.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.tail02 = new ModelRenderer(this, 0, 25);
        this.tail02.setRotationPoint(0.0F, 1.4F, 0.0F);
        this.tail02.addBox(-2.0F, -1.0F, 0.4F, 4, 2, 5, 0.0F);
        this.setRotateAngle(tail02, 0.22759093446006054F, 0.0F, 0.0F);
        this.lToe01 = new ModelRenderer(this, 54, 10);
        this.lToe01.setRotationPoint(0.5F, 0.1F, -1.2F);
        this.lToe01.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lToe01, 0.136659280431156F, -0.36425021489121656F, 0.0F);
        this.head = new ModelRenderer(this, 48, 35);
        this.head.setRotationPoint(0.0F, 0.3F, -2.6F);
        this.head.addBox(-2.0F, -2.0F, -3.0F, 4, 4, 3, 0.0F);
        this.setRotateAngle(head, -0.8196066167365371F, 0.0F, 0.0F);
        this.lTailFeather04 = new ModelRenderer(this, 0, 54);
        this.lTailFeather04.setRotationPoint(0.0F, 0.55F, 5.2F);
        this.lTailFeather04.addBox(-1.0F, 0.0F, 0.4F, 2, 0, 8, 0.0F);
        this.setRotateAngle(lTailFeather04, -0.091106186954104F, 0.091106186954104F, 0.0F);
        this.upperJawBeak = new ModelRenderer(this, 58, 21);
        this.upperJawBeak.setRotationPoint(0.0F, 2.6F, 0.0F);
        this.upperJawBeak.addBox(-0.5F, -0.5F, -0.2F, 1, 1, 1, 0.0F);
        this.setRotateAngle(upperJawBeak, -0.4553564018453205F, 0.4553564018453205F, 0.7740535232594852F);
        this.lToe03 = new ModelRenderer(this, 54, 10);
        this.lToe03.setRotationPoint(-0.6F, 0.1F, -1.2F);
        this.lToe03.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lToe03, 0.136659280431156F, 0.36425021489121656F, 0.0F);
        this.lLeg01 = new ModelRenderer(this, 30, 13);
        this.lLeg01.setRotationPoint(0.5F, 0.6F, 3.2F);
        this.lLeg01.addBox(0.0F, -0.5F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(lLeg01, 1.3658946726107624F, 0.0F, 0.0F);
        this.rLeg02 = new ModelRenderer(this, 44, 10);
        this.rLeg02.mirror = true;
        this.rLeg02.setRotationPoint(-1.5F, 4.3F, 0.1F);
        this.rLeg02.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(rLeg02, -1.593485607070823F, 0.0F, 0.0F);
        this.lWingFeathers01 = new ModelRenderer(this, 5, 35);
        this.lWingFeathers01.setRotationPoint(0.0F, 0.0F, 1.2F);
        this.lWingFeathers01.addBox(-0.2F, 0.0F, -0.7F, 12, 0, 8, 0.0F);
        this.lTailFeather01 = new ModelRenderer(this, 0, 54);
        this.lTailFeather01.setRotationPoint(1.2F, 0.7F, 2.9F);
        this.lTailFeather01.addBox(-1.0F, 0.0F, 0.4F, 2, 0, 8, 0.0F);
        this.setRotateAngle(lTailFeather01, -0.091106186954104F, 0.4553564018453205F, 0.0F);
        this.lLeg02 = new ModelRenderer(this, 44, 10);
        this.lLeg02.setRotationPoint(1.5F, 4.3F, 0.1F);
        this.lLeg02.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(lLeg02, -1.593485607070823F, 0.0F, 0.0F);
        this.lFoot = new ModelRenderer(this, 43, 15);
        this.lFoot.setRotationPoint(0.0F, 1.8F, 0.0F);
        this.lFoot.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 3, 0.0F);
        this.setRotateAngle(lFoot, 0.136659280431156F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 15.8F, -2.5F);
        this.body.addBox(-3.0F, -2.5F, -4.0F, 6, 5, 10, 0.0F);
        this.setRotateAngle(body, 0.045553093477052F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 48, 0);
        this.neck.setRotationPoint(0.0F, 0.4F, -1.3F);
        this.neck.addBox(-2.0F, -2.0F, -3.0F, 4, 4, 2, 0.0F);
        this.setRotateAngle(neck, -0.045553093477052F, 0.0F, 0.0F);
        this.lWing02 = new ModelRenderer(this, 25, 30);
        this.lWing02.setRotationPoint(7.7F, 0.0F, 0.0F);
        this.lWing02.addBox(0.0F, -0.5F, -1.0F, 10, 1, 2, 0.0F);
        this.setRotateAngle(lWing02, 0.0F, 0.27314402793711257F, 0.0F);
        this.chest = new ModelRenderer(this, 29, 0);
        this.chest.setRotationPoint(0.0F, 0.5F, -2.3F);
        this.chest.addBox(-2.5F, -2.0F, -3.0F, 5, 4, 3, 0.0F);
        this.setRotateAngle(chest, -0.091106186954104F, 0.0F, 0.0F);
        this.lWingFeathers02 = new ModelRenderer(this, 3, 44);
        this.lWingFeathers02.setRotationPoint(0.0F, 0.0F, 1.2F);
        this.lWingFeathers02.addBox(1.1F, 0.0F, -2.7F, 16, 0, 10, 0.0F);
        this.chest.addChild(this.neckFeather02);
        this.tail02.addChild(this.lTailFeather02);
        this.rFoot.addChild(this.rToe02);
        this.lFoot.addChild(this.lToe02);
        this.rWing02.addChild(this.rWingFeathers02);
        this.tail02.addChild(this.rTailFeather04);
        this.lLeg01.addChild(this.lLegFeathers);
        this.tail02.addChild(this.rTailFeather02);
        this.head.addChild(this.lowerJaw01);
        this.body.addChild(this.lWing01);
        this.rLeg01.addChild(this.rLegFeathers);
        this.rWing01.addChild(this.rWing02);
        this.tail02.addChild(this.rTailFeather03);
        this.tail02.addChild(this.rTailFeather01);
        this.lowerJaw01.addChild(this.beard);
        this.upperJaw01.addChild(this.upperJawR);
        this.rFoot.addChild(this.rToe01);
        this.lFoot.addChild(this.lToe04);
        this.body.addChild(this.rLeg01);
        this.head.addChild(this.muzzle);
        this.body.addChild(this.tail01);
        this.body.addChild(this.rWing01);
        this.rFoot.addChild(this.rToe03);
        this.neck.addChild(this.neckFeather01);
        this.head.addChild(this.headFeathers);
        this.rWing01.addChild(this.rWingFeathers01);
        this.lowerJaw01.addChild(this.lowerJaw02);
        this.lowerJaw01.addChild(this.lowerJawBeak);
        this.neck.addChild(this.neckFeather03);
        this.rFoot.addChild(this.rToe04);
        this.tail02.addChild(this.lTailFeather03);
        this.rLeg02.addChild(this.rFoot);
        this.upperJaw01.addChild(this.upperJawL);
        this.head.addChild(this.upperJaw01);
        this.tail01.addChild(this.tail02);
        this.lFoot.addChild(this.lToe01);
        this.neck.addChild(this.head);
        this.tail02.addChild(this.lTailFeather04);
        this.upperJaw01.addChild(this.upperJawBeak);
        this.lFoot.addChild(this.lToe03);
        this.body.addChild(this.lLeg01);
        this.rLeg01.addChild(this.rLeg02);
        this.lWing01.addChild(this.lWingFeathers01);
        this.tail02.addChild(this.lTailFeather01);
        this.lLeg01.addChild(this.lLeg02);
        this.lLeg02.addChild(this.lFoot);
        this.chest.addChild(this.neck);
        this.lWing01.addChild(this.lWing02);
        this.body.addChild(this.chest);
        this.lWing02.addChild(this.lWingFeathers02);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.body.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
