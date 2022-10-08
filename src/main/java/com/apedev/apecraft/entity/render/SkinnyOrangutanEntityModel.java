// Made with Model Converter by Globox_Z
// Generate all required imports
// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.entity.SkinnyOrangutanEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.util.math.MathHelper;


public class SkinnyOrangutanEntityModel extends SinglePartEntityModel<SkinnyOrangutanEntity> {
    private final ModelPart root;
    private final ModelPart rightLeg;
    private final ModelPart cube_r1;
    private final ModelPart head;
    private final ModelPart cube_r2;
    private final ModelPart cube_r3;
    private final ModelPart cube_r4;
    private final ModelPart cube_r5;
    private final ModelPart rightArm;
    private final ModelPart cube_r6;
    private final ModelPart cube_r7;
    private final ModelPart body;
    private final ModelPart cube_r8;
    private final ModelPart cube_r9;
    private final ModelPart cube_r10;
    private final ModelPart rightArm2;
    private final ModelPart cube_r11;
    private final ModelPart cube_r12;
    private final ModelPart rightLeg2;
    private final ModelPart cube_r13;

    public SkinnyOrangutanEntityModel(ModelPart root) {
        super();
        this.root = root;
        this.rightLeg = this.root.getChild("rightleg");
        this.cube_r1 = this.rightLeg.getChild("cube_r1");
        this.head = this.root.getChild("head");
        this.cube_r5 = this.head.getChild("cube_r5");
        this.cube_r4 = this.head.getChild("cube_r4");
        this.cube_r3 = this.head.getChild("cube_r3");
        this.cube_r2 = this.head.getChild("cube_r2");
        this.rightArm = this.root.getChild("rightarm");
        this.cube_r7 = this.rightArm.getChild("cube_r7");
        this.cube_r6 = this.rightArm.getChild("cube_r6");
        this.body = this.root.getChild("body");
        this.cube_r10 = this.body.getChild("cube_r10");
        this.cube_r9 = this.body.getChild("cube_r9");
        this.cube_r8 = this.body.getChild("cube_r8");
        this.rightArm2 = this.root.getChild("rightarm2");
        this.cube_r12 = this.rightArm2.getChild("cube_r12");
        this.cube_r11 = this.rightArm2.getChild("cube_r11");
        this.rightLeg2 = this.root.getChild("rightleg2");
        this.cube_r13 = this.rightLeg2.getChild("cube_r13");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();

        ModelPartData modelPartData1 = modelPartData.addChild("rightleg", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 12.0F, 3.0F));
        modelPartData1.addChild("cube_r1", ModelPartBuilder.create().uv(88, 89).cuboid(2.0F, -14.0F, 0.0F, 6.0F, 14.0F, 6.0F), ModelTransform.pivot(-5.0F, 12.0F, -3.0F));
        ModelPartData modelPartData2 = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, 1.0F, -8.0F, 8.0F, 3.0F, 1.0F).uv(0, 68).cuboid(-6.0F, -4.0F, -6.0F, 12.0F, 10.0F, 11.0F).uv(107, 0).cuboid(-5.0F, -5.0F, -7.0F, 10.0F, 11.0F, 9.0F), ModelTransform.pivot(0.0F, -4.0F, -9.0F));
        modelPartData2.addChild("cube_r2", ModelPartBuilder.create().uv(0, 8).cuboid(-3.0F, -20.0F, -26.0F, 6.0F, 4.0F, 0.0F), ModelTransform.pivot(0.0F, 32.0F, 13.0F));
        modelPartData2.addChild("cube_r3", ModelPartBuilder.create().uv(116, 118).cuboid(-4.0F, -24.0F, -28.0F, 8.0F, 3.0F, 8.0F), ModelTransform.pivot(0.0F, 32.0F, 11.0F));
        modelPartData2.addChild("cube_r4", ModelPartBuilder.create().uv(71, 0).cuboid(-4.0F, -29.0F, -19.0F, 8.0F, 2.0F, 15.0F), ModelTransform.pivot(0.0F, 32.0F, 11.0F));
        modelPartData2.addChild("cube_r5", ModelPartBuilder.create().uv(0, 4).cuboid(-4.0F, -22.0F, -25.0F, 8.0F, 4.0F, 0.0F), ModelTransform.pivot(0.0F, 32.0F, 11.0F));
        ModelPartData modelPartData3 = modelPartData.addChild("rightarm", ModelPartBuilder.create(), ModelTransform.pivot(8.0F, -3.0F, -8.0F));
        modelPartData3.addChild("cube_r6", ModelPartBuilder.create().uv(98, 56).cuboid(7.0F, -30.0F, -10.0F, 6.0F, 11.0F, 7.0F).uv(222, 75).cuboid(7.0F, -3.0F, -14.0F, 7.0F, 3.0F, 7.0F), ModelTransform.pivot(-9.7682F, 27.0F, 4.7212F));
        modelPartData3.addChild("cube_r7", ModelPartBuilder.create().uv(54, 68).cuboid(7.0F, -19.0F, -14.0F, 7.0F, 20.0F, 7.0F), ModelTransform.pivot(-9.7682F, 27.0F, 4.7212F));
        ModelPartData modelPartData4 = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 29.0F, 0.0F));
        modelPartData4.addChild("cube_r8", ModelPartBuilder.create().uv(0, 36).cuboid(-7.0F, -14.0F, -26.0F, 14.0F, 13.0F, 13.0F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        modelPartData4.addChild("cube_r9", ModelPartBuilder.create().uv(154, 167).cuboid(-7.0F, -20.0F, -13.0F, 1.0F, 0.0F, 3.0F), ModelTransform.pivot(0.0F, -10.0F, 0.0F));
        modelPartData4.addChild("cube_r10", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, -29.0F, -23.0F, 16.0F, 13.0F, 14.0F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        ModelPartData modelPartData5 = modelPartData.addChild("rightarm2", ModelPartBuilder.create(), ModelTransform.pivot(-8.0F, -3.0F, -8.0F));
        modelPartData5.addChild("cube_r11", ModelPartBuilder.create().uv(98, 56).cuboid(-13.0F, -30.0F, -10.0F, 6.0F, 11.0F, 7.0F, true).uv(179, 60).cuboid(-14.0F, -3.0F, -14.0F, 7.0F, 3.0F, 7.0F, true), ModelTransform.pivot(7.5715F, 27.0F, 6.9401F));
        modelPartData5.addChild("cube_r12", ModelPartBuilder.create().uv(54, 68).cuboid(-14.0F, -19.0F, -14.0F, 7.0F, 20.0F, 7.0F, true), ModelTransform.pivot(7.5715F, 27.0F, 6.9401F));
        ModelPartData modelPartData6 = modelPartData.addChild("rightleg2", ModelPartBuilder.create(), ModelTransform.pivot(-6.0F, 11.0F, 4.0F));
        modelPartData6.addChild("cube_r13", ModelPartBuilder.create().uv(88, 89).cuboid(2.0F, -14.0F, -1.0F, 6.0F, 14.0F, 6.0F), ModelTransform.pivot(-3.2339F, 13.0F, -2.9179F));
        return TexturedModelData.of(modelData, 256, 256);
    }

    @Override
    public void setAngles(SkinnyOrangutanEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.head.pitch = headPitch * (float) (Math.PI / 180);
        this.head.yaw = netHeadYaw * (float) (Math.PI / 180);

        this.rightArm.pitch = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightArm2.pitch = MathHelper.cos(limbSwing * 0.6662F + 3.1415927F) * 1.4F * limbSwingAmount;
        this.rightLeg.pitch = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightLeg2.pitch = MathHelper.cos(limbSwing * 0.6662F + 3.1415927F) * 1.4F * limbSwingAmount;

        this.cube_r1.yaw = -0.0873F;
        this.cube_r2.pitch = -0.2618F;
        this.cube_r3.pitch = -0.3054F;
        this.cube_r4.pitch = 0.0436F;
        this.cube_r5.pitch = -0.2618F;
        this.rightArm.yaw = 0.1309F;
        this.cube_r6.yaw = -0.3054F;
        this.cube_r7.pitch = -0.2182F;
        this.cube_r7.yaw = -0.3054F;
        this.cube_r8.pitch = -1.1781F;
        this.cube_r9.pitch = -0.4363F;
        this.cube_r10.pitch = -0.4363F;
        this.rightArm2.yaw = 0.1309F;
        this.cube_r12.pitch = -0.2182F;
        this.rightLeg2.yaw = 0.1309F;
        this.cube_r13.yaw = -0.0873F;
    }

    @Override
    public ModelPart getPart() {
        return this.root;
    }
}