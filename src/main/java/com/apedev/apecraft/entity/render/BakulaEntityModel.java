// Made with Model Converter by Globox_Z
// Generate all required imports
// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports
package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.entity.BakulaEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.util.math.MathHelper;

public class BakulaEntityModel extends SinglePartEntityModel<BakulaEntity> {
    private final ModelPart root;
    private final ModelPart leftArm;
    private final ModelPart cube_r1;
    private final ModelPart cube_r2;
    private final ModelPart cube_r3;
    private final ModelPart cube_r4;
    private final ModelPart leftLeg;
    private final ModelPart cube_r5;
    private final ModelPart cube_r6;
    private final ModelPart torso;
    private final ModelPart cube_r7;
    private final ModelPart cube_r8;
    private final ModelPart cube_r9;
    private final ModelPart cube_r10;
    private final ModelPart cube_r11;
    private final ModelPart cube_r12;
    private final ModelPart cube_r13;
    private final ModelPart rightLeg;
    private final ModelPart cube_r14;
    private final ModelPart cube_r15;
    private final ModelPart rightArm;
    private final ModelPart cube_r16;
    private final ModelPart cube_r17;
    private final ModelPart cube_r18;
    private final ModelPart cube_r19;
    private final ModelPart head;
    private final ModelPart cube_r20;
    private final ModelPart cube_r21;
    private final ModelPart cube_r22;

    public BakulaEntityModel(ModelPart root) {
        super();
        this.root = root;
        this.leftArm = this.root.getChild("leftarm");
        this.cube_r4 = this.leftArm.getChild("cube_r4");
        this.cube_r3 = this.leftArm.getChild("cube_r3");
        this.cube_r2 = this.leftArm.getChild("cube_r2");
        this.cube_r1 = this.leftArm.getChild("cube_r1");
        this.leftLeg = this.root.getChild("leftleg");
        this.cube_r6 = this.leftLeg.getChild("cube_r6");
        this.cube_r5 = this.leftLeg.getChild("cube_r5");
        this.torso = this.root.getChild("torso");
        this.cube_r13 = this.torso.getChild("cube_r13");
        this.cube_r12 = this.torso.getChild("cube_r12");
        this.cube_r11 = this.torso.getChild("cube_r11");
        this.cube_r10 = this.torso.getChild("cube_r10");
        this.cube_r9 = this.torso.getChild("cube_r9");
        this.cube_r8 = this.torso.getChild("cube_r8");
        this.cube_r7 = this.torso.getChild("cube_r7");
        this.rightLeg = this.root.getChild("rightleg");
        this.cube_r15 = this.rightLeg.getChild("cube_r15");
        this.cube_r14 = this.rightLeg.getChild("cube_r14");
        this.rightArm = this.root.getChild("rightarm");
        this.cube_r19 = this.rightArm.getChild("cube_r19");
        this.cube_r18 = this.rightArm.getChild("cube_r18");
        this.cube_r17 = this.rightArm.getChild("cube_r17");
        this.cube_r16 = this.rightArm.getChild("cube_r16");
        this.head = this.root.getChild("head");
        this.cube_r22 = this.head.getChild("cube_r22");
        this.cube_r21 = this.head.getChild("cube_r21");
        this.cube_r20 = this.head.getChild("cube_r20");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();

        ModelPartData modelPartData1 = modelPartData.addChild("leftarm", ModelPartBuilder.create(), ModelTransform.pivot(9.0F, -1.0F, 2.0F));
        modelPartData1.addChild("cube_r1", ModelPartBuilder.create().uv(82, 6).cuboid(16.0F, -24.0F, 1.0F, 8.0F, 12.0F, 7.0F), ModelTransform.pivot(-19.0F, 23.0F, -2.0F));
        modelPartData1.addChild("cube_r2", ModelPartBuilder.create().uv(0, 72).cuboid(1.2154F, 10.0F, -22.8742F, 10.0F, 4.0F, 9.0F), ModelTransform.pivot(-5.0F, 9.0F, 19.0F));
        modelPartData1.addChild("cube_r3", ModelPartBuilder.create().uv(46, 33).cuboid(16.0F, -2.0F, -2.0F, 8.0F, 4.0F, 2.0F), ModelTransform.pivot(-19.0F, 23.0F, -2.0F));
        modelPartData1.addChild("cube_r4", ModelPartBuilder.create().uv(37, 39).cuboid(15.0F, -14.0F, -2.0F, 10.0F, 12.0F, 9.0F), ModelTransform.pivot(-19.0F, 23.0F, -2.0F));
        ModelPartData modelPartData2 = modelPartData.addChild("leftleg", ModelPartBuilder.create(), ModelTransform.pivot(15.0F, 7.0F, 21.0F));
        modelPartData2.addChild("cube_r5", ModelPartBuilder.create().uv(0, 3).cuboid(-10.7846F, 12.0F, -0.8742F, 5.0F, 2.0F, 1.0F), ModelTransform.pivot(-2.0F, 3.0F, 0.0F));
        modelPartData2.addChild("cube_r6", ModelPartBuilder.create().uv(66, 60).cuboid(-11.7846F, -5.0F, -1.8742F, 7.0F, 19.0F, 7.0F), ModelTransform.pivot(-2.0F, 3.0F, 0.0F));
        ModelPartData modelPartData3 = modelPartData.addChild("torso", ModelPartBuilder.create(), ModelTransform.pivot(-8.0F, 22.0F, 0.0F));
        modelPartData3.addChild("cube_r7", ModelPartBuilder.create().uv(90, 79).cuboid(-16.0F, -14.0F, -14.0F, 7.0F, 2.0F, 7.0F), ModelTransform.pivot(16.0F, 0.0F, 0.0F));
        modelPartData3.addChild("cube_r8", ModelPartBuilder.create().uv(89, 90).cuboid(9.0F, -14.0F, -14.0F, 7.0F, 2.0F, 7.0F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        modelPartData3.addChild("cube_r9", ModelPartBuilder.create().uv(87, 57).cuboid(2.0F, -27.0F, -5.0F, 12.0F, 6.0F, 4.0F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        modelPartData3.addChild("cube_r10", ModelPartBuilder.create().uv(75, 46).cuboid(1.0F, -14.0F, 22.0F, 14.0F, 7.0F, 4.0F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        modelPartData3.addChild("cube_r11", ModelPartBuilder.create().uv(47, 0).cuboid(3.0F, -22.0F, -21.0F, 10.0F, 3.0F, 10.0F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        modelPartData3.addChild("cube_r12", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, -24.0F, -15.0F, 16.0F, 10.0F, 15.0F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        modelPartData3.addChild("cube_r13", ModelPartBuilder.create().uv(0, 25).cuboid(1.0F, 5.0F, 13.0F, 14.0F, 14.0F, 9.0F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        ModelPartData modelPartData4 = modelPartData.addChild("rightleg", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 7.0F, 21.0F));
        modelPartData4.addChild("cube_r14", ModelPartBuilder.create().uv(0, 0).cuboid(-3.2154F, 12.0F, -1.8742F, 5.0F, 2.0F, 1.0F), ModelTransform.pivot(1.0F, 3.0F, 0.0F));
        modelPartData4.addChild("cube_r15", ModelPartBuilder.create().uv(38, 60).cuboid(-18.0F, -19.0F, 17.0F, 7.0F, 19.0F, 7.0F), ModelTransform.pivot(13.0F, 17.0F, -21.0F));
        ModelPartData modelPartData5 = modelPartData.addChild("rightarm", ModelPartBuilder.create(), ModelTransform.pivot(-9.0F, -1.0F, 3.0F));
        modelPartData5.addChild("cube_r16", ModelPartBuilder.create().uv(0, 85).cuboid(-8.0F, -24.0F, 2.0F, 8.0F, 12.0F, 7.0F), ModelTransform.pivot(3.0F, 23.0F, -3.0F));
        modelPartData5.addChild("cube_r17", ModelPartBuilder.create().uv(66, 33).cuboid(-11.2154F, 10.0F, -22.8742F, 10.0F, 4.0F, 9.0F), ModelTransform.pivot(5.0F, 9.0F, 18.0F));
        modelPartData5.addChild("cube_r18", ModelPartBuilder.create().uv(46, 33).cuboid(-24.0F, -2.0F, -2.0F, 8.0F, 4.0F, 2.0F, true), ModelTransform.pivot(19.0F, 23.0F, -3.0F));
        modelPartData5.addChild("cube_r19", ModelPartBuilder.create().uv(0, 51).cuboid(-9.0F, -14.0F, -2.0F, 10.0F, 12.0F, 9.0F), ModelTransform.pivot(3.0F, 23.0F, -3.0F));
        ModelPartData modelPartData6 = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 105).cuboid(-4.0F, 6.0F, -9.0F, 8.0F, 4.0F, 0.0F).uv(0, 6).cuboid(-6.0F, -2.0F, -8.0F, 1.0F, 6.0F, 1.0F).uv(0, 6).cuboid(5.0F, -2.0F, -8.0F, 1.0F, 6.0F, 1.0F, true).uv(53, 16).cuboid(-5.0F, -2.0F, -8.0F, 10.0F, 8.0F, 9.0F), ModelTransform.pivot(0.0F, -7.0F, -1.0F));
        modelPartData6.addChild("cube_r20", ModelPartBuilder.create().uv(94, 67).cuboid(4.0F, -28.0F, -8.0F, 8.0F, 5.0F, 5.0F), ModelTransform.pivot(-8.0F, 29.0F, 0.0F));
        modelPartData6.addChild("cube_r21", ModelPartBuilder.create().uv(64, 86).cuboid(3.0F, -22.0F, -26.0F, 10.0F, 5.0F, 6.0F), ModelTransform.pivot(-8.0F, 29.0F, 0.0F));
        modelPartData6.addChild("cube_r22", ModelPartBuilder.create().uv(30, 86).cuboid(3.0F, -19.0F, -30.0F, 10.0F, 3.0F, 7.0F), ModelTransform.pivot(-8.0F, 29.0F, 0.0F));
        return TexturedModelData.of(modelData, 128, 128);
    }

    @Override
    public void setAngles(BakulaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.head.pitch = headPitch * (float) (Math.PI / 180);
        this.head.yaw = netHeadYaw * (float) (Math.PI / 180);

        this.leftArm.pitch = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightArm.pitch = MathHelper.cos(limbSwing * 0.6662F + 3.1415927F) * 1.4F * limbSwingAmount;
        this.leftLeg.pitch = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightLeg.pitch = MathHelper.cos(limbSwing * 0.6662F + 3.1415927F) * 1.4F * limbSwingAmount;

        //this.leftArm.pitch = 0.1309F;
        this.cube_r1.pitch = 0.131F;
        this.cube_r1.yaw = -0.0433F;
        this.cube_r1.roll = -0.0057F;
        this.cube_r2.pitch = 0.0436F;
        this.cube_r3.pitch = 1.2217F;
        this.cube_r4.pitch = -0.0873F;
        this.cube_r5.pitch = -0.1309F;
        this.cube_r5.yaw = -0.0873F;
        this.cube_r6.yaw = -0.0873F;
        this.cube_r7.pitch = -0.654F;
        this.cube_r7.yaw = 0.028F;
        this.cube_r7.roll = 0.0334F;
        this.cube_r8.pitch = -0.654F;
        this.cube_r8.yaw = -0.028F;
        this.cube_r8.roll = -0.0334F;
        this.cube_r9.pitch = -0.0436F;
        this.cube_r10.pitch = 0.1745F;
        this.cube_r11.pitch = -0.7854F;
        this.cube_r12.pitch = -0.5672F;
        this.cube_r13.pitch = 1.3963F;
        this.cube_r14.pitch = -0.1309F;
        this.cube_r14.yaw = 0.0873F;
        this.cube_r15.yaw = 0.0873F;
        //this.rightArm.pitch = 0.1309F;
        this.cube_r16.pitch = 0.131F;
        this.cube_r16.yaw = 0.0433F;
        this.cube_r16.roll = 0.0057F;
        this.cube_r17.pitch = 0.0436F;
        this.cube_r18.pitch = 1.2217F;
        this.cube_r19.pitch = -0.1309F;
        this.cube_r20.pitch = 0.0873F;
        this.cube_r21.pitch = -0.7418F;
        this.cube_r22.pitch = -0.9599F;
    }

    @Override
    public ModelPart getPart() {
        return this.root;
    }
}