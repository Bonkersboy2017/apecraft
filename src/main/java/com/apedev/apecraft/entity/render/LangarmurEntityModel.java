package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.entity.LangarmurEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;

// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class LangarmurEntityModel extends HierarchicalModel<LangarmurEntity> {
    private final ModelPart root;
    private final ModelPart rightarm;
    private final ModelPart leftarm;
    private final ModelPart rightleg;
    private final ModelPart leftleg;
    private final ModelPart head;
    private final ModelPart cube_r1;
    private final ModelPart cube_r2;
    private final ModelPart bb_main;
    private final ModelPart cube_r3;

    public LangarmurEntityModel(ModelPart root) {
        super();
        this.root = root;
        this.rightarm = this.root.getChild("rightarm");
        this.leftarm = this.root.getChild("leftarm");
        this.rightleg = this.root.getChild("rightleg");
        this.leftleg = this.root.getChild("leftleg");
        this.head = this.root.getChild("head");
        this.bb_main = this.root.getChild("bb_main");
        this.cube_r1 = this.head.getChild("cube_r1");
        this.cube_r2 = this.head.getChild("cube_r2");
        this.cube_r3 = this.bb_main.getChild("cube_r3");
    }

    public static LayerDefinition getTexturedModelData() {
        MeshDefinition modelData = new MeshDefinition();
        PartDefinition modelPartData = modelData.getRoot();
        PartDefinition rightarm = modelPartData.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(0, 33).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 20.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -6.0F, -2.0F));

        PartDefinition leftarm = modelPartData.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(44, 24).addBox(0.0F, -1.0F, -2.0F, 4.0F, 20.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -6.0F, -2.0F));

        PartDefinition rightleg = modelPartData.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(32, 0).addBox(-2.0F, -1.0F, -2.0F, 5.0F, 20.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 5.0F, 0.0F));

        PartDefinition leftleg = modelPartData.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(26, 29).addBox(-2.0F, -2.0F, -2.0F, 5.0F, 20.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 6.0F, 0.0F));

        PartDefinition head = modelPartData.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.0F, -7.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 0.0F));

        PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(44, 48).addBox(-3.0F, -33.0F, -9.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 31.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

        PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(50, 0).addBox(-3.0F, -36.0F, -12.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 31.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

        PartDefinition bb_main = modelPartData.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(120, 93).addBox(-2.0F, -20.0F, -3.0F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 16).addBox(-5.0F, -31.0F, -1.0F, 10.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
        return LayerDefinition.create(modelData, 128, 128);
    }

    @Override
    public void setupAnim(LangarmurEntity entity, float limbAngle, float limbDistance, float animationProgress, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.head.xRot = headPitch * (float) (Math.PI / 180);
        this.head.yRot = netHeadYaw * (float) (Math.PI / 180);

        this.leftleg.xRot = Mth.cos(limbAngle * 0.6662F) * 1.4F * limbDistance;
        this.rightleg.xRot = Mth.cos(limbAngle * 0.6662F + 3.1415927F) * 1.4F * limbDistance;
    }

    @Override
    public ModelPart root() {
        return this.root;
    }
}