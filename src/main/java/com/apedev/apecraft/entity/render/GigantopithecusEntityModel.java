// Made with Model Converter by Globox_Z
// Generate all required imports
// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.entity.GigantopithecusEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;

public class GigantopithecusEntityModel extends HierarchicalModel<GigantopithecusEntity> {
    private final ModelPart root;
    private final ModelPart bone;
    private final ModelPart cube_r1;
    private final ModelPart cube_r2;
    private final ModelPart rightarm;
    private final ModelPart cube_r3;
    private final ModelPart leftarm;
    private final ModelPart cube_r4;
    private final ModelPart rightleg;
    private final ModelPart leftleg;
    private final ModelPart head;
    private final ModelPart cube_r5;
    private final ModelPart cube_r6;

    public GigantopithecusEntityModel(ModelPart root) {
        super();
        this.root = root;
        this.bone = this.root.getChild("bone");
        this.cube_r2 = this.bone.getChild("cube_r2");
        this.cube_r1 = this.bone.getChild("cube_r1");
        this.rightarm = this.root.getChild("rightarm");
        this.cube_r3 = this.rightarm.getChild("cube_r3");
        this.leftarm = this.root.getChild("leftarm");
        this.cube_r4 = this.leftarm.getChild("cube_r4");
        this.rightleg = this.root.getChild("rightleg");
        this.leftleg = this.root.getChild("leftleg");
        this.head = this.root.getChild("head");
        this.cube_r6 = this.head.getChild("cube_r6");
        this.cube_r5 = this.head.getChild("cube_r5");
    }

    public static LayerDefinition getTexturedModelData() {
        MeshDefinition modelData = new MeshDefinition();
        PartDefinition modelPartData = modelData.getRoot();
        PartDefinition modelPartData1 = modelPartData.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(68, 53).addBox(-6.0F, -35.0F, -10.0F, 12.0F, 5.0F, 9.0F).texOffs(43, 41).addBox(-10.0F, -17.0F, -2.0F, 20.0F, 5.0F, 7.0F), PartPose.offset(0.0F, 15.0F, 0.0F));
        modelPartData1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 24).addBox(-8.0F, -30.0F, 0.0F, 16.0F, 15.0F, 9.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
        modelPartData1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -33.0F, -1.0F, 18.0F, 10.0F, 14.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition modelPartData2 = modelPartData.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offset(-7.0F, -16.0F, -3.0F));
        modelPartData2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(64, 0).addBox(-14.0F, -33.0F, -8.0F, 6.0F, 26.0F, 7.0F), PartPose.offset(7.0F, 31.0F, 3.0F));
        PartDefinition modelPartData3 = modelPartData.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offset(11.0F, -15.0F, -3.0F));
        modelPartData3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(42, 53).addBox(8.0F, -33.0F, -8.0F, 6.0F, 26.0F, 7.0F), PartPose.offset(-11.0F, 30.0F, 3.0F));
        modelPartData.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(68, 67).addBox(-4.0F, -1.0F, -4.0F, 7.0F, 21.0F, 7.0F), PartPose.offset(-6.0F, 4.0F, 2.0F));
        modelPartData.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(0, 69).addBox(-3.0F, -1.0F, -4.0F, 7.0F, 21.0F, 7.0F), PartPose.offset(6.0F, 4.0F, 2.0F));
        PartDefinition modelPartData4 = modelPartData.addOrReplaceChild("head", CubeListBuilder.create().texOffs(28, 86).addBox(-8.0F, -9.0F, -7.0F, 16.0F, 11.0F, 2.0F).texOffs(41, 24).addBox(-3.0F, -2.0F, -9.0F, 6.0F, 3.0F, 2.0F).texOffs(0, 48).addBox(-5.0F, -10.0F, -6.0F, 10.0F, 10.0F, 11.0F), PartPose.offset(0.0F, -19.0F, -7.0F));
        modelPartData4.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -31.0F, -18.0F, 4.0F, 3.0F, 0.0F), PartPose.offset(0.0F, 34.0F, 7.0F));
        modelPartData4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(41, 29).addBox(-3.0F, -34.0F, -13.0F, 6.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 34.0F, 7.0F));
        return LayerDefinition.create(modelData, 128, 128);
    }

    @Override
    public void setupAnim(GigantopithecusEntity entity, float limbAngle, float limbDistance, float animationProgress, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.head.xRot = headPitch * (float) (Math.PI / 180);
        this.head.yRot = netHeadYaw * (float) (Math.PI / 180);

        this.cube_r1.xRot = 0.2618F;
        this.cube_r2.xRot = 0.3927F;
        this.cube_r3.xRot = -0.0436F;
        this.cube_r4.xRot = -0.0436F;
        this.cube_r5.xRot = -0.0873F;
        this.cube_r6.xRot = 0.0873F;

        this.leftleg.xRot = Mth.cos(limbAngle * 0.6662F) * 1.4F * limbDistance;
        this.rightleg.xRot = Mth.cos(limbAngle * 0.6662F + (float) Math.PI) * 1.4F * limbDistance;
    }

    @Override
    public ModelPart root() {
        return this.root;
    }
}