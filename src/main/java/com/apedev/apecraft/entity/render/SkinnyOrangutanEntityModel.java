// Made with Model Converter by Globox_Z
// Generate all required imports
// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.entity.SkinnyOrangutanEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;


public class SkinnyOrangutanEntityModel extends HierarchicalModel<SkinnyOrangutanEntity> {
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

    public static LayerDefinition getTexturedModelData() {
        MeshDefinition modelData = new MeshDefinition();
        PartDefinition modelPartData = modelData.getRoot();

        PartDefinition modelPartData1 = modelPartData.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offset(5.0F, 12.0F, 3.0F));
        modelPartData1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(88, 89).addBox(2.0F, -14.0F, 0.0F, 6.0F, 14.0F, 6.0F), PartPose.offset(-5.0F, 12.0F, -3.0F));
        PartDefinition modelPartData2 = modelPartData.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 1.0F, -8.0F, 8.0F, 3.0F, 1.0F).texOffs(0, 68).addBox(-6.0F, -4.0F, -6.0F, 12.0F, 10.0F, 11.0F).texOffs(107, 0).addBox(-5.0F, -5.0F, -7.0F, 10.0F, 11.0F, 9.0F), PartPose.offset(0.0F, -4.0F, -9.0F));
        modelPartData2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 8).addBox(-3.0F, -20.0F, -26.0F, 6.0F, 4.0F, 0.0F), PartPose.offset(0.0F, 32.0F, 13.0F));
        modelPartData2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(116, 118).addBox(-4.0F, -24.0F, -28.0F, 8.0F, 3.0F, 8.0F), PartPose.offset(0.0F, 32.0F, 11.0F));
        modelPartData2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(71, 0).addBox(-4.0F, -29.0F, -19.0F, 8.0F, 2.0F, 15.0F), PartPose.offset(0.0F, 32.0F, 11.0F));
        modelPartData2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 4).addBox(-4.0F, -22.0F, -25.0F, 8.0F, 4.0F, 0.0F), PartPose.offset(0.0F, 32.0F, 11.0F));
        PartDefinition modelPartData3 = modelPartData.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offset(8.0F, -3.0F, -8.0F));
        modelPartData3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(98, 56).addBox(7.0F, -30.0F, -10.0F, 6.0F, 11.0F, 7.0F).texOffs(222, 75).addBox(7.0F, -3.0F, -14.0F, 7.0F, 3.0F, 7.0F), PartPose.offset(-9.7682F, 27.0F, 4.7212F));
        modelPartData3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(54, 68).addBox(7.0F, -19.0F, -14.0F, 7.0F, 20.0F, 7.0F), PartPose.offset(-9.7682F, 27.0F, 4.7212F));
        PartDefinition modelPartData4 = modelPartData.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 29.0F, 0.0F));
        modelPartData4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 36).addBox(-7.0F, -14.0F, -26.0F, 14.0F, 13.0F, 13.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
        modelPartData4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(154, 167).addBox(-7.0F, -20.0F, -13.0F, 1.0F, 0.0F, 3.0F), PartPose.offset(0.0F, -10.0F, 0.0F));
        modelPartData4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -29.0F, -23.0F, 16.0F, 13.0F, 14.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition modelPartData5 = modelPartData.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offset(-8.0F, -3.0F, -8.0F));
        modelPartData5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(98, 56).addBox(-13.0F, -30.0F, -10.0F, 6.0F, 11.0F, 7.0F, true).texOffs(179, 60).addBox(-14.0F, -3.0F, -14.0F, 7.0F, 3.0F, 7.0F, true), PartPose.offset(7.5715F, 27.0F, 6.9401F));
        modelPartData5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(54, 68).addBox(-14.0F, -19.0F, -14.0F, 7.0F, 20.0F, 7.0F, true), PartPose.offset(7.5715F, 27.0F, 6.9401F));
        PartDefinition modelPartData6 = modelPartData.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offset(-6.0F, 11.0F, 4.0F));
        modelPartData6.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(88, 89).addBox(2.0F, -14.0F, -1.0F, 6.0F, 14.0F, 6.0F), PartPose.offset(-3.2339F, 13.0F, -2.9179F));
        return LayerDefinition.create(modelData, 256, 256);
    }

    @Override
    public void setupAnim(SkinnyOrangutanEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.head.xRot = headPitch * (float) (Math.PI / 180);
        this.head.yRot = netHeadYaw * (float) (Math.PI / 180);

        this.rightArm.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightArm2.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * 1.4F * limbSwingAmount;
        this.rightLeg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightLeg2.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * 1.4F * limbSwingAmount;

        this.cube_r1.yRot = -0.0873F;
        this.cube_r2.xRot = -0.2618F;
        this.cube_r3.xRot = -0.3054F;
        this.cube_r4.xRot = 0.0436F;
        this.cube_r5.xRot = -0.2618F;
        this.rightArm.yRot = 0.1309F;
        this.cube_r6.yRot = -0.3054F;
        this.cube_r7.xRot = -0.2182F;
        this.cube_r7.yRot = -0.3054F;
        this.cube_r8.xRot = -1.1781F;
        this.cube_r9.xRot = -0.4363F;
        this.cube_r10.xRot = -0.4363F;
        this.rightArm2.yRot = 0.1309F;
        this.cube_r12.xRot = -0.2182F;
        this.rightLeg2.yRot = 0.1309F;
        this.cube_r13.yRot = -0.0873F;
    }

    @Override
    public ModelPart root() {
        return this.root;
    }
}