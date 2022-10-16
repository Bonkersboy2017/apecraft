// Made with Model Converter by Globox_Z
// Generate all required imports
// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.entity.ChimpanzeeBruteEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;

public class ChimpanzeeBruteEntityModel extends HierarchicalModel<ChimpanzeeBruteEntity> {
    private final ModelPart root;
    private final ModelPart leftLeg;
    private final ModelPart torso;
    private final ModelPart cube_r1;
    private final ModelPart cube_r2;
    private final ModelPart cube_r3;
    private final ModelPart cube_r4;
    private final ModelPart cube_r5;
    private final ModelPart rightArm;
    private final ModelPart head;
    private final ModelPart cube_r6;
    private final ModelPart cube_r7;
    private final ModelPart cube_r8;
    private final ModelPart rightLeg;
    private final ModelPart leftArm;
    private final ModelPart spear;

    public ChimpanzeeBruteEntityModel(ModelPart root) {
        super();
        this.root = root;
        this.leftLeg = this.root.getChild("Leftleg");
        this.torso = this.root.getChild("torso");
        this.cube_r5 = this.torso.getChild("cube_r5");
        this.cube_r4 = this.torso.getChild("cube_r4");
        this.cube_r3 = this.torso.getChild("cube_r3");
        this.cube_r2 = this.torso.getChild("cube_r2");
        this.cube_r1 = this.torso.getChild("cube_r1");
        this.rightArm = this.root.getChild("rightarm");
        this.head = this.root.getChild("head");
        this.cube_r8 = this.head.getChild("cube_r8");
        this.cube_r7 = this.head.getChild("cube_r7");
        this.cube_r6 = this.head.getChild("cube_r6");
        this.rightLeg = this.root.getChild("rightleg");
        this.leftArm = this.root.getChild("leftarm");
        this.spear = this.leftArm.getChild("spear");
    }

    public static LayerDefinition getTexturedModelData() {
        MeshDefinition modelData = new MeshDefinition();
        PartDefinition modelPartData = modelData.getRoot();
        modelPartData.addOrReplaceChild("Leftleg", CubeListBuilder.create().texOffs(12, 35).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 13.0F, 4.0F), PartPose.offset(-2.0F, 12.0F, 0.0F));
        PartDefinition modelPartData1 = modelPartData.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(23, 0).addBox(-3.0F, -6.0F, -5.0F, 7.0F, 2.0F, 3.0F), PartPose.offset(0.0F, 6.0F, 1.0F));
        modelPartData1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(23, 22).addBox(-6.0F, -20.0F, 7.0F, 5.0F, 6.0F, 0.0F, true), PartPose.offset(3.0F, 18.0F, -3.0F));
        modelPartData1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(23, 22).addBox(1.0F, -20.0F, -3.0F, 5.0F, 6.0F, 0.0F), PartPose.offset(-3.0F, 18.0F, 1.0F));
        modelPartData1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -23.0F, 2.0F, 9.0F, 4.0F, 5.0F).texOffs(24, 5).addBox(-1.0F, -15.0F, 3.0F, 9.0F, 4.0F, 4.0F), PartPose.offset(-3.0F, 18.0F, -3.0F));
        modelPartData1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(35, 13).addBox(-2.0F, -21.0F, 3.0F, 5.0F, 7.0F, 4.0F), PartPose.offset(-3.0F, 18.0F, -3.0F));
        modelPartData1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(43, 24).addBox(4.0F, -20.0F, 3.0F, 5.0F, 6.0F, 4.0F), PartPose.offset(-3.0F, 18.0F, -3.0F));
        modelPartData.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(19, 15).addBox(0.0F, -1.0F, -2.0F, 3.0F, 14.0F, 4.0F), PartPose.offset(5.0F, 2.0F, -2.0F));
        PartDefinition modelPartData2 = modelPartData.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 8).addBox(-4.0F, -6.0F, -3.0F, 7.0F, 6.0F, 6.0F).texOffs(0, 8).addBox(-4.0F, -6.0F, 3.0F, 7.0F, 2.0F, 0.0F, true), PartPose.offset(1.0F, 0.0F, -3.0F));
        modelPartData2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(35, 24).addBox(1.0F, -26.0F, 1.0F, 5.0F, 2.0F, 1.0F).texOffs(24, 13).addBox(1.0F, -27.0F, 1.0F, 5.0F, 1.0F, 1.0F), PartPose.offset(-4.0F, 24.0F, 1.0F));
        modelPartData2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 9).addBox(0.0F, -29.0F, -1.0F, 2.0F, 2.0F, 1.0F), PartPose.offset(-4.0F, 24.0F, 1.0F));
        modelPartData2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).addBox(5.0F, -29.0F, -1.0F, 2.0F, 2.0F, 1.0F), PartPose.offset(-4.0F, 24.0F, 1.0F));
        modelPartData.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(31, 30).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 13.0F, 4.0F), PartPose.offset(3.0F, 11.0F, 0.0F));
        PartDefinition modelPartData3 = modelPartData.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(0, 20).addBox(-3.0F, -1.0F, -2.0F, 3.0F, 14.0F, 4.0F), PartPose.offset(-4.0F, 2.0F, -2.0F));
        modelPartData3.addOrReplaceChild("spear", CubeListBuilder.create().texOffs(28, 46).addBox(-6.0F, -12.0F, -21.0F, 2.0F, 2.0F, 16.0F).texOffs(0, 58).addBox(-5.0F, -12.0F, -25.0F, 1.0F, 2.0F, 4.0F).texOffs(0, 50).addBox(-5.0F, -12.0F, -28.0F, 1.0F, 1.0F, 3.0F), PartPose.offset(4.0F, 22.0F, 9.0F));
        return LayerDefinition.create(modelData, 64, 64);
    }

    @Override
    public void setupAnim(ChimpanzeeBruteEntity entity, float limbAngle, float limbDistance, float animationProgress, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.head.xRot = headPitch * (float) (Math.PI / 180);
        this.head.yRot = netHeadYaw * (float) (Math.PI / 180);
        this.cube_r1.xRot = 0.2182F;
        this.cube_r2.xRot = 0.1309F;
        this.cube_r3.xRot = 0.2182F;
        this.cube_r4.xRot = 0.2174F;
        this.cube_r4.yRot = -0.0189F;
        this.cube_r4.zRot = 0.0852F;
        this.cube_r5.xRot = 0.2174F;
        this.cube_r5.yRot = 0.0189F;
        this.cube_r5.zRot = -0.0852F;
        this.cube_r6.xRot = 0.2182F;
        this.cube_r7.zRot = -0.0436F;
        this.cube_r8.zRot = 0.0436F;

        this.leftLeg.xRot = Mth.cos(limbAngle * 0.6662F) * 1.4F * limbDistance;
        this.rightLeg.xRot = Mth.cos(limbAngle * 0.6662F + 3.1415927F) * 1.4F * limbDistance;
    }

    @Override
    public ModelPart root() {
        return this.root;
    }
}