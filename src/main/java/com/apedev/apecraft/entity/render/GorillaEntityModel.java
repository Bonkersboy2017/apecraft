// Made with Model Converter by Globox_Z
// Generate all required imports
// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.entity.GorillaEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;


public class GorillaEntityModel extends HierarchicalModel<GorillaEntity> {
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

    public static LayerDefinition getTexturedModelData() {
        MeshDefinition modelData = new MeshDefinition();
        PartDefinition modelPartData = modelData.getRoot();

        PartDefinition modelPartData1 = modelPartData.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(90, 89).addBox(-3.7846F, 20.0F, -3.8742F, 10.0F, 3.0F, 9.0F), PartPose.offset(9.0F, 1.0F, 2.0F));
        modelPartData1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(92, 109).addBox(16.0F, -24.0F, 1.0F, 8.0F, 12.0F, 7.0F), PartPose.offset(-19.0F, 23.0F, -2.0F));
        modelPartData1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(99, 102).addBox(16.0F, -2.0F, -3.0F, 8.0F, 3.0F, 2.0F), PartPose.offset(-19.0F, 23.0F, -2.0F));
        modelPartData1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(60, 94).addBox(15.0F, -14.0F, -2.0F, 10.0F, 12.0F, 9.0F), PartPose.offset(-19.0F, 23.0F, -2.0F));
        PartDefinition modelPartData2 = modelPartData.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offset(15.0F, 7.0F, 21.0F));
        modelPartData2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(42, 98).addBox(-10.7846F, 12.0F, -0.8742F, 5.0F, 2.0F, 1.0F), PartPose.offset(-2.0F, 3.0F, 0.0F));
        modelPartData2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(30, 102).addBox(-11.7846F, -5.0F, -1.8742F, 7.0F, 19.0F, 7.0F), PartPose.offset(-2.0F, 3.0F, 0.0F));
        PartDefinition modelPartData3 = modelPartData.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offset(-8.0F, 24.0F, 0.0F));
        modelPartData3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(97, 11).addBox(-16.0F, -14.0F, -14.0F, 7.0F, 2.0F, 7.0F), PartPose.offset(16.0F, 0.0F, 0.0F));
        modelPartData3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(79, 0).addBox(9.0F, -14.0F, -14.0F, 7.0F, 2.0F, 7.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
        modelPartData3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(62, 13).addBox(2.0F, -27.0F, -5.0F, 12.0F, 6.0F, 4.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
        modelPartData3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(46, 25).addBox(1.0F, -17.0F, 20.0F, 14.0F, 7.0F, 4.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
        modelPartData3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(48, 0).addBox(3.0F, -22.0F, -21.0F, 10.0F, 3.0F, 10.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
        modelPartData3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -24.0F, -15.0F, 16.0F, 10.0F, 15.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
        modelPartData3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 26).addBox(1.0F, 5.0F, 13.0F, 14.0F, 14.0F, 9.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition modelPartData4 = modelPartData.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offset(-5.0F, 7.0F, 21.0F));
        modelPartData4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(7, 99).addBox(-3.2154F, 12.0F, -1.8742F, 5.0F, 2.0F, 1.0F, true), PartPose.offset(1.0F, 3.0F, 0.0F));
        modelPartData4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 102).addBox(-18.0F, -19.0F, 17.0F, 7.0F, 19.0F, 7.0F, true), PartPose.offset(13.0F, 17.0F, -21.0F));
        PartDefinition modelPartData5 = modelPartData.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(32, 67).addBox(-6.2154F, 20.0F, -4.8742F, 10.0F, 3.0F, 9.0F, true), PartPose.offset(-9.0F, 1.0F, 3.0F));
        modelPartData5.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 75).addBox(-8.0F, -24.0F, 2.0F, 8.0F, 12.0F, 7.0F), PartPose.offset(3.0F, 23.0F, -3.0F));
        modelPartData5.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(36, 79).addBox(-24.0F, -2.0F, -3.0F, 8.0F, 3.0F, 2.0F, true), PartPose.offset(19.0F, 23.0F, -3.0F));
        modelPartData5.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 53).addBox(-9.0F, -14.0F, -2.0F, 10.0F, 12.0F, 9.0F), PartPose.offset(3.0F, 23.0F, -3.0F));
        PartDefinition modelPartData6 = modelPartData.addOrReplaceChild("head", CubeListBuilder.create().texOffs(57, 59).addBox(-5.0F, -2.0F, -8.0F, 10.0F, 8.0F, 9.0F), PartPose.offset(0.0F, -5.0F, 0.0F));
        modelPartData6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(96, 61).addBox(5.0F, -27.0F, -8.0F, 6.0F, 4.0F, 5.0F), PartPose.offset(-8.0F, 29.0F, 0.0F));
        modelPartData6.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(87, 50).addBox(3.0F, -21.0F, -26.0F, 10.0F, 4.0F, 6.0F), PartPose.offset(-8.0F, 29.0F, 0.0F));
        modelPartData6.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(98, 72).addBox(3.0F, -20.0F, -29.0F, 10.0F, 4.0F, 5.0F), PartPose.offset(-8.0F, 29.0F, 0.0F));
        return LayerDefinition.create(modelData, 128, 128);
    }

    @Override
    public void setupAnim(GorillaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.head.xRot = headPitch * (float) (Math.PI / 180);
        this.head.yRot = netHeadYaw * (float) (Math.PI / 180);

        this.leftArm.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * 1.4F * limbSwingAmount;
        this.leftLeg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightLeg.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * 1.4F * limbSwingAmount;

        this.cube_r1.xRot = 0.131F;
        this.cube_r1.yRot = -0.0433F;
        this.cube_r1.zRot = -0.0057F;
        this.cube_r2.xRot = -0.2618F;
        this.cube_r3.xRot = -0.0873F;
        this.cube_r4.xRot = -0.1309F;
        this.cube_r4.yRot = -0.0873F;
        this.cube_r5.yRot = -0.0873F;
        this.cube_r6.xRot = -0.654F;
        this.cube_r6.yRot = 0.028F;
        this.cube_r6.zRot = 0.0334F;
        this.cube_r7.xRot = -0.654F;
        this.cube_r7.yRot = -0.028F;
        this.cube_r7.zRot = -0.0334F;
        this.cube_r8.xRot = -0.0436F;
        this.cube_r9.xRot = 0.0436F;
        this.cube_r10.xRot = -0.7854F;
        this.cube_r11.xRot = -0.5672F;
        this.cube_r12.xRot = 1.3963F;
        this.cube_r13.xRot = -0.1309F;
        this.cube_r13.yRot = 0.0873F;
        this.cube_r14.yRot = 0.0873F;
        this.cube_r15.xRot = 0.131F;
        this.cube_r15.yRot = 0.0433F;
        this.cube_r15.zRot = 0.0057F;
        this.cube_r16.xRot = -0.2618F;
        this.cube_r17.xRot = -0.1309F;
        this.cube_r18.xRot = 0.0873F;
        this.cube_r19.xRot = -0.7418F;
        this.cube_r20.xRot = -0.9163F;
    }

    @Override
    public ModelPart root() {
        return this.root;
    }
}