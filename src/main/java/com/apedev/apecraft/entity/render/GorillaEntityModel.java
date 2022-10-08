// Made with Model Converter by Globox_Z
// Generate all required imports
// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.entity.GorillaEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.util.math.MathHelper;


public class GorillaEntityModel extends SinglePartEntityModel<GorillaEntity> {
    private final ModelPart root;
    private final ModelPart leftArm;
    private final ModelPart cube_r1;
    private final ModelPart cube_r2;
    private final ModelPart cube_r3;
    private final ModelPart leftLeg;
    private final ModelPart cube_r4;
    private final ModelPart cube_r5;
    private final ModelPart torso;
    private final ModelPart cube_r6;
    private final ModelPart cube_r7;
    private final ModelPart cube_r8;
    private final ModelPart cube_r9;
    private final ModelPart cube_r10;
    private final ModelPart cube_r11;
    private final ModelPart cube_r12;
    private final ModelPart rightLeg;
    private final ModelPart cube_r13;
    private final ModelPart cube_r14;
    private final ModelPart rightArm;
    private final ModelPart cube_r15;
    private final ModelPart cube_r16;
    private final ModelPart cube_r17;
    private final ModelPart head;
    private final ModelPart cube_r18;
    private final ModelPart cube_r19;
    private final ModelPart cube_r20;

    public GorillaEntityModel(ModelPart root) {
        super();
        this.root = root;
        this.leftArm = this.root.getChild("leftarm");
        this.cube_r3 = this.leftArm.getChild("cube_r3");
        this.cube_r2 = this.leftArm.getChild("cube_r2");
        this.cube_r1 = this.leftArm.getChild("cube_r1");
        this.leftLeg = this.root.getChild("leftleg");
        this.cube_r5 = this.leftLeg.getChild("cube_r5");
        this.cube_r4 = this.leftLeg.getChild("cube_r4");
        this.torso = this.root.getChild("torso");
        this.cube_r12 = this.torso.getChild("cube_r12");
        this.cube_r11 = this.torso.getChild("cube_r11");
        this.cube_r10 = this.torso.getChild("cube_r10");
        this.cube_r9 = this.torso.getChild("cube_r9");
        this.cube_r8 = this.torso.getChild("cube_r8");
        this.cube_r7 = this.torso.getChild("cube_r7");
        this.cube_r6 = this.torso.getChild("cube_r6");
        this.rightLeg = this.root.getChild("rightleg");
        this.cube_r14 = this.rightLeg.getChild("cube_r14");
        this.cube_r13 = this.rightLeg.getChild("cube_r13");
        this.rightArm = this.root.getChild("rightarm");
        this.cube_r17 = this.rightArm.getChild("cube_r17");
        this.cube_r16 = this.rightArm.getChild("cube_r16");
        this.cube_r15 = this.rightArm.getChild("cube_r15");
        this.head = this.root.getChild("head");
        this.cube_r20 = this.head.getChild("cube_r20");
        this.cube_r19 = this.head.getChild("cube_r19");
        this.cube_r18 = this.head.getChild("cube_r18");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();

        ModelPartData modelPartData1 = modelPartData.addChild("leftarm", ModelPartBuilder.create().uv(90, 89).cuboid(-3.7846F, 20.0F, -3.8742F, 10.0F, 3.0F, 9.0F), ModelTransform.pivot(9.0F, 1.0F, 2.0F));
        modelPartData1.addChild("cube_r1", ModelPartBuilder.create().uv(92, 109).cuboid(16.0F, -24.0F, 1.0F, 8.0F, 12.0F, 7.0F), ModelTransform.pivot(-19.0F, 23.0F, -2.0F));
        modelPartData1.addChild("cube_r2", ModelPartBuilder.create().uv(99, 102).cuboid(16.0F, -2.0F, -3.0F, 8.0F, 3.0F, 2.0F), ModelTransform.pivot(-19.0F, 23.0F, -2.0F));
        modelPartData1.addChild("cube_r3", ModelPartBuilder.create().uv(60, 94).cuboid(15.0F, -14.0F, -2.0F, 10.0F, 12.0F, 9.0F), ModelTransform.pivot(-19.0F, 23.0F, -2.0F));
        ModelPartData modelPartData2 = modelPartData.addChild("leftleg", ModelPartBuilder.create(), ModelTransform.pivot(15.0F, 7.0F, 21.0F));
        modelPartData2.addChild("cube_r4", ModelPartBuilder.create().uv(42, 98).cuboid(-10.7846F, 12.0F, -0.8742F, 5.0F, 2.0F, 1.0F), ModelTransform.pivot(-2.0F, 3.0F, 0.0F));
        modelPartData2.addChild("cube_r5", ModelPartBuilder.create().uv(30, 102).cuboid(-11.7846F, -5.0F, -1.8742F, 7.0F, 19.0F, 7.0F), ModelTransform.pivot(-2.0F, 3.0F, 0.0F));
        ModelPartData modelPartData3 = modelPartData.addChild("torso", ModelPartBuilder.create(), ModelTransform.pivot(-8.0F, 24.0F, 0.0F));
        modelPartData3.addChild("cube_r6", ModelPartBuilder.create().uv(97, 11).cuboid(-16.0F, -14.0F, -14.0F, 7.0F, 2.0F, 7.0F), ModelTransform.pivot(16.0F, 0.0F, 0.0F));
        modelPartData3.addChild("cube_r7", ModelPartBuilder.create().uv(79, 0).cuboid(9.0F, -14.0F, -14.0F, 7.0F, 2.0F, 7.0F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        modelPartData3.addChild("cube_r8", ModelPartBuilder.create().uv(62, 13).cuboid(2.0F, -27.0F, -5.0F, 12.0F, 6.0F, 4.0F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        modelPartData3.addChild("cube_r9", ModelPartBuilder.create().uv(46, 25).cuboid(1.0F, -17.0F, 20.0F, 14.0F, 7.0F, 4.0F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        modelPartData3.addChild("cube_r10", ModelPartBuilder.create().uv(48, 0).cuboid(3.0F, -22.0F, -21.0F, 10.0F, 3.0F, 10.0F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        modelPartData3.addChild("cube_r11", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, -24.0F, -15.0F, 16.0F, 10.0F, 15.0F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        modelPartData3.addChild("cube_r12", ModelPartBuilder.create().uv(0, 26).cuboid(1.0F, 5.0F, 13.0F, 14.0F, 14.0F, 9.0F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        ModelPartData modelPartData4 = modelPartData.addChild("rightleg", ModelPartBuilder.create(), ModelTransform.pivot(-5.0F, 7.0F, 21.0F));
        modelPartData4.addChild("cube_r13", ModelPartBuilder.create().uv(7, 99).cuboid(-3.2154F, 12.0F, -1.8742F, 5.0F, 2.0F, 1.0F, true), ModelTransform.pivot(1.0F, 3.0F, 0.0F));
        modelPartData4.addChild("cube_r14", ModelPartBuilder.create().uv(0, 102).cuboid(-18.0F, -19.0F, 17.0F, 7.0F, 19.0F, 7.0F, true), ModelTransform.pivot(13.0F, 17.0F, -21.0F));
        ModelPartData modelPartData5 = modelPartData.addChild("rightarm", ModelPartBuilder.create().uv(32, 67).cuboid(-6.2154F, 20.0F, -4.8742F, 10.0F, 3.0F, 9.0F, true), ModelTransform.pivot(-9.0F, 1.0F, 3.0F));
        modelPartData5.addChild("cube_r15", ModelPartBuilder.create().uv(0, 75).cuboid(-8.0F, -24.0F, 2.0F, 8.0F, 12.0F, 7.0F), ModelTransform.pivot(3.0F, 23.0F, -3.0F));
        modelPartData5.addChild("cube_r16", ModelPartBuilder.create().uv(36, 79).cuboid(-24.0F, -2.0F, -3.0F, 8.0F, 3.0F, 2.0F, true), ModelTransform.pivot(19.0F, 23.0F, -3.0F));
        modelPartData5.addChild("cube_r17", ModelPartBuilder.create().uv(0, 53).cuboid(-9.0F, -14.0F, -2.0F, 10.0F, 12.0F, 9.0F), ModelTransform.pivot(3.0F, 23.0F, -3.0F));
        ModelPartData modelPartData6 = modelPartData.addChild("head", ModelPartBuilder.create().uv(57, 59).cuboid(-5.0F, -2.0F, -8.0F, 10.0F, 8.0F, 9.0F), ModelTransform.pivot(0.0F, -5.0F, 0.0F));
        modelPartData6.addChild("cube_r18", ModelPartBuilder.create().uv(96, 61).cuboid(5.0F, -27.0F, -8.0F, 6.0F, 4.0F, 5.0F), ModelTransform.pivot(-8.0F, 29.0F, 0.0F));
        modelPartData6.addChild("cube_r19", ModelPartBuilder.create().uv(87, 50).cuboid(3.0F, -21.0F, -26.0F, 10.0F, 4.0F, 6.0F), ModelTransform.pivot(-8.0F, 29.0F, 0.0F));
        modelPartData6.addChild("cube_r20", ModelPartBuilder.create().uv(98, 72).cuboid(3.0F, -20.0F, -29.0F, 10.0F, 4.0F, 5.0F), ModelTransform.pivot(-8.0F, 29.0F, 0.0F));
        return TexturedModelData.of(modelData, 128, 128);
    }

    @Override
    public void setAngles(GorillaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.head.pitch = headPitch * (float) (Math.PI / 180);
        this.head.yaw = netHeadYaw * (float) (Math.PI / 180);

        this.leftArm.pitch = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightArm.pitch = MathHelper.cos(limbSwing * 0.6662F + 3.1415927F) * 1.4F * limbSwingAmount;
        this.leftLeg.pitch = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightLeg.pitch = MathHelper.cos(limbSwing * 0.6662F + 3.1415927F) * 1.4F * limbSwingAmount;

        this.cube_r1.pitch = 0.131F;
        this.cube_r1.yaw = -0.0433F;
        this.cube_r1.roll = -0.0057F;
        this.cube_r2.pitch = -0.2618F;
        this.cube_r3.pitch = -0.0873F;
        this.cube_r4.pitch = -0.1309F;
        this.cube_r4.yaw = -0.0873F;
        this.cube_r5.yaw = -0.0873F;
        this.cube_r6.pitch = -0.654F;
        this.cube_r6.yaw = 0.028F;
        this.cube_r6.roll = 0.0334F;
        this.cube_r7.pitch = -0.654F;
        this.cube_r7.yaw = -0.028F;
        this.cube_r7.roll = -0.0334F;
        this.cube_r8.pitch = -0.0436F;
        this.cube_r9.pitch = 0.0436F;
        this.cube_r10.pitch = -0.7854F;
        this.cube_r11.pitch = -0.5672F;
        this.cube_r12.pitch = 1.3963F;
        this.cube_r13.pitch = -0.1309F;
        this.cube_r13.yaw = 0.0873F;
        this.cube_r14.yaw = 0.0873F;
        this.cube_r15.pitch = 0.131F;
        this.cube_r15.yaw = 0.0433F;
        this.cube_r15.roll = 0.0057F;
        this.cube_r16.pitch = -0.2618F;
        this.cube_r17.pitch = -0.1309F;
        this.cube_r18.pitch = 0.0873F;
        this.cube_r19.pitch = -0.7418F;
        this.cube_r20.pitch = -0.9163F;
    }

    @Override
    public ModelPart getPart() {
        return this.root;
    }
}