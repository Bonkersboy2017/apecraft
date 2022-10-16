package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.entity.GeorgeEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;

// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class GeorgeEntityModel extends HierarchicalModel<GeorgeEntity> {
    private final ModelPart root;
    private final ModelPart bone;
    private final ModelPart head;
    private final ModelPart cube_r1;
    private final ModelPart cube_r2;
    private final ModelPart cube_r3;
    private final ModelPart cube_r4;
    private final ModelPart cube_r5;
    private final ModelPart cube_r6;
    private final ModelPart cube_r7;
    private final ModelPart cube_r8;
    private final ModelPart leftLeg;
    private final ModelPart cube_r9;
    private final ModelPart cube_r10;
    private final ModelPart torso;
    private final ModelPart cube_r11;
    private final ModelPart cube_r12;
    private final ModelPart cube_r13;
    private final ModelPart leftArm;
    private final ModelPart cube_r14;
    private final ModelPart cube_r15;
    private final ModelPart lefthand;
    private final ModelPart cube_r16;
    private final ModelPart cube_r17;
    private final ModelPart rightArm;
    private final ModelPart cube_r18;
    private final ModelPart cube_r19;
    private final ModelPart righthand;
    private final ModelPart cube_r20;
    private final ModelPart cube_r21;
    private final ModelPart rightLeg;
    private final ModelPart cube_r22;
    private final ModelPart cube_r23;

    public GeorgeEntityModel(ModelPart root) {
        this.root = root;
        this.bone = this.root.getChild("KingKong");
        this.leftLeg = this.bone.getChild("leftleg");
        this.torso = this.bone.getChild("torso");
        this.leftArm = this.bone.getChild("leftarm");
        this.lefthand = this.leftArm.getChild("lefthand");
        this.rightArm = this.bone.getChild("rightarm");
        this.rightLeg = this.bone.getChild("rightleg");
        this.righthand = this.rightArm.getChild("righthand");
        this.head = this.bone.getChild("head");
        this.cube_r1 = this.head.getChild("cube_r1");
        this.cube_r2 = this.head.getChild("cube_r2");
        this.cube_r3 = this.head.getChild("cube_r3");
        this.cube_r4 = this.head.getChild("cube_r4");
        this.cube_r5 = this.head.getChild("cube_r5");
        this.cube_r6 = this.head.getChild("cube_r6");
        this.cube_r7 = this.head.getChild("cube_r7");
        this.cube_r8 = this.head.getChild("cube_r8");
        this.cube_r9 = this.leftLeg.getChild("cube_r9");
        this.cube_r10 = this.leftLeg.getChild("cube_r10");
        this.cube_r11 = this.torso.getChild("cube_r11");
        this.cube_r12 = this.torso.getChild("cube_r12");
        this.cube_r13 = this.torso.getChild("cube_r13");
        this.cube_r14 = this.leftArm.getChild("cube_r14");
        this.cube_r15 = this.leftArm.getChild("cube_r15");
        this.cube_r16 = this.lefthand.getChild("cube_r16");
        this.cube_r17 = this.lefthand.getChild("cube_r17");
        this.cube_r18 = this.rightArm.getChild("cube_r18");
        this.cube_r19 = this.rightArm.getChild("cube_r19");
        this.cube_r20 = this.righthand.getChild("cube_r20");
        this.cube_r21 = this.righthand.getChild("cube_r21");
        this.cube_r22 = this.rightLeg.getChild("cube_r22");
        this.cube_r23 = this.rightLeg.getChild("cube_r23");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition modelPartData = meshdefinition.getRoot();

        PartDefinition bone = modelPartData.addOrReplaceChild("KingKong", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 31.0F));

        PartDefinition head = bone.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(-1.0F, -81.0F, -60.0F));

        PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(98, 222).addBox(-12.0F, -122.0F, -68.0F, 24.0F, 17.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 88.0F, 80.0F, 0.3054F, 0.0F, 0.0F));

        PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(261, 227).addBox(-11.0F, -73.0F, -129.0F, 22.0F, 18.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 88.0F, 80.0F, -0.3491F, 0.0F, 0.0F));

        PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(460, 506).addBox(-12.0F, -91.0F, -109.0F, 24.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(152, 497).addBox(-10.0F, -78.0F, -104.0F, 20.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 88.0F, 80.0F, -0.0436F, 0.0F, 0.0F));

        PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 499).addBox(-2.0F, -97.0F, -100.0F, 4.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 88.0F, 80.0F, 0.0436F, 0.0F, 0.0F));

        PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(146, 0).addBox(-12.0F, -112.0F, -86.0F, 24.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 88.0F, 80.0F, 0.1745F, 0.0F, 0.0F));

        PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(222, 497).addBox(-8.0F, -77.0F, -109.0F, 16.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 88.0F, 80.0F, -0.0873F, 0.0F, 0.0F));

        PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(287, 113).addBox(-9.0F, -96.0F, -97.0F, 18.0F, 11.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 88.0F, 80.0F, 0.0873F, 0.0F, 0.0F));

        PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(284, 205).addBox(-12.0F, -103.0F, -68.0F, 24.0F, 7.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 88.0F, 80.0F, 0.2618F, 0.0F, 0.0F));

        PartDefinition leftleg = bone.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(255, 61).addBox(-10.5001F, 19.0F, -15.1444F, 21.0F, 31.0F, 21.0F, new CubeDeformation(0.0F))
                .texOffs(265, 268).addBox(-10.5001F, 50.0F, -21.1444F, 21.0F, 5.0F, 27.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.0F, -55.0F, 11.0F, 0.0F, 0.1745F, 0.0F));

        PartDefinition cube_r9 = leftleg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 98).addBox(-19.0F, -5.0F, -1.0F, 5.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(28.4999F, 55.0F, -6.1444F, 0.0F, -0.2618F, 0.0F));

        PartDefinition cube_r10 = leftleg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(188, 189).addBox(-41.0F, -68.0F, -18.0F, 24.0F, 37.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(28.4999F, 55.0F, -6.1444F, -0.2628F, -0.0843F, 0.0226F));

        PartDefinition torso = bone.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.0F, -4.0F, -0.1309F, 0.0F, 0.0F));

        PartDefinition cube_r11 = torso.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-26.0F, -63.0F, -86.0F, 52.0F, 31.0F, 42.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

        PartDefinition cube_r12 = torso.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 73).addBox(-24.0F, -73.0F, -31.0F, 48.0F, 26.0F, 45.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        PartDefinition cube_r13 = torso.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(141, 73).addBox(-20.0F, -91.0F, -66.0F, 40.0F, 26.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

        PartDefinition leftarm = bone.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-31.0F, -69.0F, -50.0F, 0.0F, 0.0873F, 0.0F));

        PartDefinition cube_r14 = leftarm.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(106, 144).addBox(-45.0F, -88.0F, -59.0F, 22.0F, 42.0F, 27.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(33.3233F, 69.0F, 55.114F, 0.0873F, 0.0F, 0.0F));

        PartDefinition cube_r15 = leftarm.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 213).addBox(-47.0F, -40.0F, -66.0F, 24.0F, 32.0F, 25.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(33.3233F, 69.0F, 55.114F, -0.0873F, 0.0F, 0.0F));

        PartDefinition lefthand = leftarm.addOrReplaceChild("lefthand", CubeListBuilder.create().texOffs(284, 26).addBox(-46.0F, -4.0F, -63.0F, 20.0F, 4.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(0, 28).addBox(-46.0F, -7.0F, -64.0F, 20.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(79, 152).addBox(-46.0F, -7.0F, -63.0F, 20.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(84, 271).addBox(-46.0F, -14.0F, -64.0F, 20.0F, 7.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(0, 11).addBox(-46.0F, -12.0F, -65.0F, 20.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(34.3233F, 69.0F, 55.114F));

        PartDefinition cube_r16 = lefthand.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(73, 213).addBox(-10.0F, -8.0F, -65.0F, 7.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2465F, 0.3024F, 0.7414F));

        PartDefinition cube_r17 = lefthand.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(212, 173).addBox(-3.0F, -8.0F, -65.0F, 7.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0845F, 0.3789F, -0.1853F));

        PartDefinition rightarm = bone.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(29.0F, -68.0F, -48.0F, 0.0F, -0.0873F, 0.0F));

        PartDefinition cube_r18 = rightarm.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 144).addBox(23.0F, -88.0F, -59.0F, 22.0F, 42.0F, 27.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-31.5052F, 68.0F, 52.9473F, 0.0873F, 0.0F, 0.0F));

        PartDefinition cube_r19 = rightarm.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(212, 116).addBox(23.0F, -40.0F, -66.0F, 24.0F, 32.0F, 25.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-31.5052F, 68.0F, 52.9473F, -0.0873F, 0.0F, 0.0F));

        PartDefinition righthand = rightarm.addOrReplaceChild("righthand", CubeListBuilder.create().texOffs(284, 0).addBox(26.0F, -4.0F, -63.0F, 20.0F, 4.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(0, 22).addBox(26.0F, -7.0F, -64.0F, 20.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(79, 144).addBox(26.0F, -7.0F, -63.0F, 20.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 270).addBox(26.0F, -14.0F, -64.0F, 20.0F, 7.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(26.0F, -12.0F, -65.0F, 20.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-32.5052F, 68.0F, 52.9473F));

        PartDefinition cube_r20 = righthand.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(146, 18).addBox(3.0F, -8.0F, -65.0F, 7.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2465F, -0.3024F, -0.7414F));

        PartDefinition cube_r21 = righthand.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(186, 116).addBox(-4.0F, -8.0F, -65.0F, 7.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0845F, -0.3789F, 0.1853F));

        PartDefinition rightleg = bone.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(255, 61).mirror().addBox(-8.704F, 18.0F, -16.4765F, 21.0F, 31.0F, 21.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(265, 268).mirror().addBox(-8.704F, 49.0F, -22.4765F, 21.0F, 5.0F, 27.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(15.0F, -54.0F, 12.0F, 0.0F, -0.1745F, 0.0F));

        PartDefinition cube_r22 = rightleg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(14.0F, -5.0F, -1.0F, 5.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-26.704F, 54.0F, -7.4765F, 0.0F, 0.2618F, 0.0F));

        PartDefinition cube_r23 = rightleg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(188, 189).mirror().addBox(17.0F, -68.0F, -18.0F, 24.0F, 37.0F, 24.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-26.704F, 54.0F, -7.4765F, -0.2628F, 0.0843F, -0.0226F));

        return LayerDefinition.create(meshdefinition, 512, 512);
    }

    @Override
    public void setupAnim(GeorgeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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