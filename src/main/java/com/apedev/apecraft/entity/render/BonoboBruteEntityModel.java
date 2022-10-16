package com.apedev.apecraft.entity.render;// Made with Model Converter by Globox_Z
// Generate all required imports
// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

import com.apedev.apecraft.entity.BonoboBruteEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;


public class BonoboBruteEntityModel extends HierarchicalModel<BonoboBruteEntity> {
    private final ModelPart root;
    private final ModelPart leftleg;
    private final ModelPart torso;
    private final ModelPart cube_r1;
    private final ModelPart cube_r2;
    private final ModelPart rightArm;
    private final ModelPart head;
    private final ModelPart cube_r3;
    private final ModelPart cube_r4;
    private final ModelPart cube_r5;
    private final ModelPart rightLeg;
    private final ModelPart leftArm;
    private final ModelPart spear;

    public BonoboBruteEntityModel(ModelPart root) {
        super();
        this.root = root;
        this.leftleg = root.getChild("Leftleg");
        this.torso = root.getChild("torso");
        this.cube_r2 = this.torso.getChild("cube_r2");
        this.cube_r1 = this.torso.getChild("cube_r1");
        this.rightArm = root.getChild("rightarm");
        this.head = root.getChild("head");
        this.cube_r5 = this.head.getChild("cube_r5");
        this.cube_r4 = this.head.getChild("cube_r4");
        this.cube_r3 = this.head.getChild("cube_r3");
        this.rightLeg = root.getChild("rightleg");
        this.leftArm = root.getChild("leftarm");
        this.spear = this.leftArm.getChild("spear");
    }

    public static LayerDefinition getTexturedModelData() {
        MeshDefinition modelData = new MeshDefinition();
        PartDefinition modelPartData = modelData.getRoot();
        modelPartData.addOrReplaceChild("Leftleg", CubeListBuilder.create().texOffs(12, 35).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), PartPose.offset(-2.0F, 12.0F, 0.0F));
        PartDefinition modelPartData1 = modelPartData.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(23, 0).addBox(0.0F, -23.0F, -2.0F, 7.0F, 1.0F, 3.0F), PartPose.offset(-3.0F, 24.0F, -2.0F));
        modelPartData1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -22.0F, 2.0F, 9.0F, 4.0F, 5.0F).texOffs(24, 5).addBox(0.0F, -14.0F, 3.0F, 7.0F, 3.0F, 4.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
        modelPartData1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(43, 24).addBox(0.0F, -18.0F, 3.0F, 7.0F, 4.0F, 4.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
        modelPartData.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(19, 15).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 13.0F, 4.0F), PartPose.offset(5.0F, 2.0F, -2.0F));
        PartDefinition modelPartData2 = modelPartData.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 8).addBox(-4.0F, -6.0F, -3.0F, 7.0F, 6.0F, 6.0F).texOffs(0, 28).addBox(-4.0F, -6.0F, 3.0F, 7.0F, 6.0F, 0.0F, true), PartPose.offset(1.0F, 1.0F, -3.0F));
        modelPartData2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(35, 24).addBox(1.0F, -26.0F, 1.0F, 5.0F, 2.0F, 1.0F).texOffs(24, 13).addBox(1.0F, -27.0F, 1.0F, 5.0F, 1.0F, 1.0F), PartPose.offset(-4.0F, 24.0F, 1.0F));
        modelPartData2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 9).addBox(-2.0F, -28.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(-4.0F, 24.0F, 1.0F));
        modelPartData2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(8.0F, -28.0F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(-4.0F, 24.0F, 1.0F));
        modelPartData.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(31, 30).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F), PartPose.offset(3.0F, 11.0F, 0.0F));
        PartDefinition modelPartData3 = modelPartData.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(0, 20).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 13.0F, 4.0F), PartPose.offset(-4.0F, 2.0F, -2.0F));
        modelPartData3.addOrReplaceChild("spear", CubeListBuilder.create().texOffs(28, 46).addBox(-2.0F, -2.0F, -21.0F, 2.0F, 2.0F, 16.0F).texOffs(0, 58).addBox(-1.0F, -2.0F, -25.0F, 1.0F, 2.0F, 4.0F).texOffs(0, 50).addBox(-1.0F, -2.0F, -28.0F, 1.0F, 1.0F, 3.0F), PartPose.offset(1.0F, 12.0F, 8.0F));
        return LayerDefinition.create(modelData, 64, 64);
    }

    @Override
    public void setupAnim(BonoboBruteEntity entity, float limbAngle, float limbDistance, float animationProgress, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.head.xRot = headPitch * (float) (Math.PI / 180);
        this.head.yRot = netHeadYaw * (float) (Math.PI / 180);
        this.cube_r1.xRot = 0.2182F;
        this.cube_r2.xRot = 0.2182F;
        this.cube_r3.xRot = 0.2182F;
        this.cube_r4.zRot = 0.0436F;
        this.cube_r5.zRot = -0.0436F;

        this.leftleg.xRot = Mth.cos(limbAngle * 0.6662F) * 1.4F * limbDistance;
        this.rightLeg.xRot = Mth.cos(limbAngle * 0.6662F + 3.1415927F) * 1.4F * limbDistance;
    }

    @Override
    public ModelPart root() {
        return this.root;
    }
}