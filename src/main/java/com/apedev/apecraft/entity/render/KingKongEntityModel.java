package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.entity.KingKongEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;

// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class KingKongEntityModel extends HierarchicalModel<KingKongEntity> {
    private final ModelPart root;
    private final ModelPart bone;
    private final ModelPart cube_r1;
    private final ModelPart cube_r2;
    private final ModelPart cube_r3;
    private final ModelPart head;
    private final ModelPart cube_r4;
    private final ModelPart cube_r5;
    private final ModelPart cube_r6;
    private final ModelPart cube_r7;
    private final ModelPart cube_r8;
    private final ModelPart leftLeg;
    private final ModelPart cube_r9;
    private final ModelPart cube_r10;
    private final ModelPart leftArm;
    private final ModelPart cube_r11;
    private final ModelPart cube_r12;
    private final ModelPart cube_r13;
    private final ModelPart cube_r14;
    private final ModelPart rightArm;
    private final ModelPart cube_r15;
    private final ModelPart cube_r16;
    private final ModelPart cube_r17;
    private final ModelPart cube_r18;
    private final ModelPart rightLeg;
    private final ModelPart cube_r19;
    private final ModelPart cube_r20;
    private final ModelPart cube_r21;

    public KingKongEntityModel(ModelPart root) {
        super();
        this.root = root;
        this.bone = this.root.getChild("bone");
        this.leftLeg = this.bone.getChild("leftleg");
        this.leftArm = this.bone.getChild("leftarm");
        this.rightArm = this.bone.getChild("rightarm");
        this.rightLeg = this.bone.getChild("rightleg");
        this.head = this.bone.getChild("head");
        this.cube_r1 = this.bone.getChild("cube_r1");
        this.cube_r2 = this.bone.getChild("cube_r2");
        this.cube_r3 = this.bone.getChild("cube_r3");
        this.cube_r4 = this.head.getChild("cube_r4");
        this.cube_r5 = this.head.getChild("cube_r5");
        this.cube_r6 = this.head.getChild("cube_r6");
        this.cube_r7 = this.head.getChild("cube_r7");
        this.cube_r8 = this.head.getChild("cube_r8");
        this.cube_r9 = this.leftLeg.getChild("cube_r9");
        this.cube_r10 = this.leftLeg.getChild("cube_r10");
        this.cube_r11 = this.leftArm.getChild("cube_r11");
        this.cube_r12 = this.leftArm.getChild("cube_r12");
        this.cube_r13 = this.leftArm.getChild("cube_r13");
        this.cube_r14 = this.leftArm.getChild("cube_r14");
        this.cube_r15 = this.rightArm.getChild("cube_r15");
        this.cube_r16 = this.rightArm.getChild("cube_r16");
        this.cube_r17 = this.rightArm.getChild("cube_r17");
        this.cube_r18 = this.rightArm.getChild("cube_r18");
        this.cube_r19 = this.rightLeg.getChild("cube_r19");
        this.cube_r20 = this.rightLeg.getChild("cube_r20");
        this.cube_r21 = this.rightLeg.getChild("cube_r21");
    }

    public static LayerDefinition getTexturedModelData() {
        MeshDefinition modelData = new MeshDefinition();
        PartDefinition modelPartData = modelData.getRoot();
        PartDefinition bone = modelPartData.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 31.0F));

        PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-24.0F, -71.0F, -36.0F, 48.0F, 26.0F, 51.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

        PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 77).addBox(-26.0F, -63.0F, -86.0F, 52.0F, 31.0F, 42.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

        PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(147, 0).addBox(-20.0F, -91.0F, -66.0F, 40.0F, 26.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

        PartDefinition head = bone.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, 13.0F));

        PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(193, 118).addBox(-12.0F, -122.0F, -68.0F, 24.0F, 21.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

        PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(264, 250).addBox(-12.0F, -73.0F, -129.0F, 24.0F, 18.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

        PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(292, 225).addBox(-14.0F, -112.0F, -86.0F, 28.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

        PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(297, 123).addBox(-11.0F, -94.0F, -97.0F, 22.0F, 11.0F, 17.0F, new CubeDeformation(0.0F))
                .texOffs(0, 22).addBox(-11.0F, -92.0F, -87.0F, 22.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

        PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(261, 0).addBox(-11.0F, -105.0F, -66.0F, 22.0F, 9.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

        PartDefinition leftleg = bone.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(180, 250).addBox(-39.0F, -36.0F, -9.0F, 21.0F, 31.0F, 21.0F, new CubeDeformation(0.0F))
                .texOffs(269, 91).addBox(-39.0F, -5.0F, -15.0F, 21.0F, 5.0F, 27.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

        PartDefinition cube_r9 = leftleg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(67, 209).addBox(-19.0F, -5.0F, -1.0F, 5.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

        PartDefinition cube_r10 = leftleg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(196, 185).addBox(-41.0F, -72.0F, -19.0F, 24.0F, 41.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

        PartDefinition leftarm = bone.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(0, 274).addBox(-48.0F, -14.0F, -64.0F, 22.0F, 7.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(242, 291).addBox(-48.0F, -4.0F, -63.0F, 22.0F, 4.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-48.0F, -12.0F, -65.0F, 22.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(147, 43).addBox(-48.0F, -7.0F, -63.0F, 22.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 31).addBox(-48.0F, -7.0F, -64.0F, 22.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, -5.0F, 0.0F, 0.0873F, 0.0F));

        PartDefinition cube_r11 = leftarm.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 209).addBox(-46.0F, -85.0F, -57.0F, 22.0F, 42.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

        PartDefinition cube_r12 = leftarm.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 77).addBox(-5.0F, -8.0F, -65.0F, 9.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0845F, 0.3789F, -0.1853F));

        PartDefinition cube_r13 = leftarm.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 91).addBox(-12.0F, -8.0F, -65.0F, 9.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2465F, 0.3024F, 0.7414F));

        PartDefinition cube_r14 = leftarm.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 150).addBox(-51.0F, -40.0F, -67.0F, 28.0F, 32.0F, 27.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

        PartDefinition rightarm = bone.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(88, 274).addBox(26.0F, -14.0F, -64.0F, 22.0F, 7.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(292, 199).addBox(26.0F, -4.0F, -63.0F, 22.0F, 4.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(0, 11).addBox(26.0F, -12.0F, -65.0F, 22.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(83, 150).addBox(26.0F, -7.0F, -63.0F, 22.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 37).addBox(26.0F, -7.0F, -64.0F, 22.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 0.0F, -6.0F, 0.0F, -0.0873F, 0.0F));

        PartDefinition cube_r15 = rightarm.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(90, 209).addBox(24.0F, -85.0F, -57.0F, 22.0F, 42.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

        PartDefinition cube_r16 = rightarm.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 105).addBox(-4.0F, -8.0F, -65.0F, 9.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0845F, -0.3789F, 0.1853F));

        PartDefinition cube_r17 = rightarm.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(83, 158).addBox(3.0F, -8.0F, -65.0F, 9.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2465F, -0.3024F, -0.7414F));

        PartDefinition cube_r18 = rightarm.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(110, 150).addBox(23.0F, -40.0F, -67.0F, 28.0F, 32.0F, 27.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

        PartDefinition rightleg = bone.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-10.0F, 0.0F, 0.0F, 0.0F, 0.1309F, 0.0F));

        PartDefinition cube_r19 = rightleg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(188, 118).addBox(14.0F, -5.0F, -1.0F, 5.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        PartDefinition cube_r20 = rightleg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(268, 167).addBox(18.0F, -5.0F, -15.0F, 21.0F, 5.0F, 27.0F, new CubeDeformation(0.0F))
                .texOffs(246, 22).addBox(18.0F, -36.0F, -9.0F, 21.0F, 31.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

        PartDefinition cube_r21 = rightleg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(174, 53).addBox(17.0F, -72.0F, -19.0F, 24.0F, 41.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, -0.2618F, 0.0F));
        return LayerDefinition.create(modelData, 400, 400);
    }

    @Override
    public void setupAnim(KingKongEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.head.xRot = headPitch * (float) (Math.PI / 180);
        this.head.yRot = netHeadYaw * (float) (Math.PI / 180);

        this.leftArm.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * 1.4F * limbSwingAmount;
        this.leftLeg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightLeg.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * 1.4F * limbSwingAmount;
    }

    @Override
    public ModelPart root() {
        return this.root;
    }
}