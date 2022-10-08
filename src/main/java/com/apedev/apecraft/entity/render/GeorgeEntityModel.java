package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.entity.GeorgeEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class GeorgeEntityModel extends SinglePartEntityModel<GeorgeEntity> {
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

    public static TexturedModelData createBodyLayer() {
        ModelData meshdefinition = new ModelData();
        ModelPartData modelPartData = meshdefinition.getRoot();

        ModelPartData bone = modelPartData.addChild("KingKong", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 31.0F));

        ModelPartData head = bone.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(-1.0F, -81.0F, -60.0F));

        ModelPartData cube_r1 = head.addChild("cube_r1", ModelPartBuilder.create().uv(98, 222).cuboid(-12.0F, -122.0F, -68.0F, 24.0F, 17.0F, 28.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 88.0F, 80.0F, 0.3054F, 0.0F, 0.0F));

        ModelPartData cube_r2 = head.addChild("cube_r2", ModelPartBuilder.create().uv(261, 227).cuboid(-11.0F, -73.0F, -129.0F, 22.0F, 18.0F, 23.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 88.0F, 80.0F, -0.3491F, 0.0F, 0.0F));

        ModelPartData cube_r3 = head.addChild("cube_r3", ModelPartBuilder.create().uv(460, 506).cuboid(-12.0F, -91.0F, -109.0F, 24.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(152, 497).cuboid(-10.0F, -78.0F, -104.0F, 20.0F, 14.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 88.0F, 80.0F, -0.0436F, 0.0F, 0.0F));

        ModelPartData cube_r4 = head.addChild("cube_r4", ModelPartBuilder.create().uv(0, 499).cuboid(-2.0F, -97.0F, -100.0F, 4.0F, 8.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 88.0F, 80.0F, 0.0436F, 0.0F, 0.0F));

        ModelPartData cube_r5 = head.addChild("cube_r5", ModelPartBuilder.create().uv(146, 0).cuboid(-12.0F, -112.0F, -86.0F, 24.0F, 17.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 88.0F, 80.0F, 0.1745F, 0.0F, 0.0F));

        ModelPartData cube_r6 = head.addChild("cube_r6", ModelPartBuilder.create().uv(222, 497).cuboid(-8.0F, -77.0F, -109.0F, 16.0F, 15.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 88.0F, 80.0F, -0.0873F, 0.0F, 0.0F));

        ModelPartData cube_r7 = head.addChild("cube_r7", ModelPartBuilder.create().uv(287, 113).cuboid(-9.0F, -96.0F, -97.0F, 18.0F, 11.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 88.0F, 80.0F, 0.0873F, 0.0F, 0.0F));

        ModelPartData cube_r8 = head.addChild("cube_r8", ModelPartBuilder.create().uv(284, 205).cuboid(-12.0F, -103.0F, -68.0F, 24.0F, 7.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 88.0F, 80.0F, 0.2618F, 0.0F, 0.0F));

        ModelPartData leftleg = bone.addChild("leftleg", ModelPartBuilder.create().uv(255, 61).cuboid(-10.5001F, 19.0F, -15.1444F, 21.0F, 31.0F, 21.0F, new Dilation(0.0F))
                .uv(265, 268).cuboid(-10.5001F, 50.0F, -21.1444F, 21.0F, 5.0F, 27.0F, new Dilation(0.0F)), ModelTransform.of(-17.0F, -55.0F, 11.0F, 0.0F, 0.1745F, 0.0F));

        ModelPartData cube_r9 = leftleg.addChild("cube_r9", ModelPartBuilder.create().uv(0, 98).cuboid(-19.0F, -5.0F, -1.0F, 5.0F, 5.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(28.4999F, 55.0F, -6.1444F, 0.0F, -0.2618F, 0.0F));

        ModelPartData cube_r10 = leftleg.addChild("cube_r10", ModelPartBuilder.create().uv(188, 189).cuboid(-41.0F, -68.0F, -18.0F, 24.0F, 37.0F, 24.0F, new Dilation(0.0F)), ModelTransform.of(28.4999F, 55.0F, -6.1444F, -0.2628F, -0.0843F, 0.0226F));

        ModelPartData torso = bone.addChild("torso", ModelPartBuilder.create(), ModelTransform.of(0.0F, 5.0F, -4.0F, -0.1309F, 0.0F, 0.0F));

        ModelPartData cube_r11 = torso.addChild("cube_r11", ModelPartBuilder.create().uv(0, 0).cuboid(-26.0F, -63.0F, -86.0F, 52.0F, 31.0F, 42.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

        ModelPartData cube_r12 = torso.addChild("cube_r12", ModelPartBuilder.create().uv(0, 73).cuboid(-24.0F, -73.0F, -31.0F, 48.0F, 26.0F, 45.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        ModelPartData cube_r13 = torso.addChild("cube_r13", ModelPartBuilder.create().uv(141, 73).cuboid(-20.0F, -91.0F, -66.0F, 40.0F, 26.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

        ModelPartData leftarm = bone.addChild("leftarm", ModelPartBuilder.create(), ModelTransform.of(-31.0F, -69.0F, -50.0F, 0.0F, 0.0873F, 0.0F));

        ModelPartData cube_r14 = leftarm.addChild("cube_r14", ModelPartBuilder.create().uv(106, 144).cuboid(-45.0F, -88.0F, -59.0F, 22.0F, 42.0F, 27.0F, new Dilation(0.0F)), ModelTransform.of(33.3233F, 69.0F, 55.114F, 0.0873F, 0.0F, 0.0F));

        ModelPartData cube_r15 = leftarm.addChild("cube_r15", ModelPartBuilder.create().uv(0, 213).cuboid(-47.0F, -40.0F, -66.0F, 24.0F, 32.0F, 25.0F, new Dilation(0.0F)), ModelTransform.of(33.3233F, 69.0F, 55.114F, -0.0873F, 0.0F, 0.0F));

        ModelPartData lefthand = leftarm.addChild("lefthand", ModelPartBuilder.create().uv(284, 26).cuboid(-46.0F, -4.0F, -63.0F, 20.0F, 4.0F, 22.0F, new Dilation(0.0F))
                .uv(0, 28).cuboid(-46.0F, -7.0F, -64.0F, 20.0F, 5.0F, 1.0F, new Dilation(0.0F))
                .uv(79, 152).cuboid(-46.0F, -7.0F, -63.0F, 20.0F, 3.0F, 5.0F, new Dilation(0.0F))
                .uv(84, 271).cuboid(-46.0F, -14.0F, -64.0F, 20.0F, 7.0F, 22.0F, new Dilation(0.0F))
                .uv(0, 11).cuboid(-46.0F, -12.0F, -65.0F, 20.0F, 10.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(34.3233F, 69.0F, 55.114F));

        ModelPartData cube_r16 = lefthand.addChild("cube_r16", ModelPartBuilder.create().uv(73, 213).cuboid(-10.0F, -8.0F, -65.0F, 7.0F, 5.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.2465F, 0.3024F, 0.7414F));

        ModelPartData cube_r17 = lefthand.addChild("cube_r17", ModelPartBuilder.create().uv(212, 173).cuboid(-3.0F, -8.0F, -65.0F, 7.0F, 5.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0845F, 0.3789F, -0.1853F));

        ModelPartData rightarm = bone.addChild("rightarm", ModelPartBuilder.create(), ModelTransform.of(29.0F, -68.0F, -48.0F, 0.0F, -0.0873F, 0.0F));

        ModelPartData cube_r18 = rightarm.addChild("cube_r18", ModelPartBuilder.create().uv(0, 144).cuboid(23.0F, -88.0F, -59.0F, 22.0F, 42.0F, 27.0F, new Dilation(0.0F)), ModelTransform.of(-31.5052F, 68.0F, 52.9473F, 0.0873F, 0.0F, 0.0F));

        ModelPartData cube_r19 = rightarm.addChild("cube_r19", ModelPartBuilder.create().uv(212, 116).cuboid(23.0F, -40.0F, -66.0F, 24.0F, 32.0F, 25.0F, new Dilation(0.0F)), ModelTransform.of(-31.5052F, 68.0F, 52.9473F, -0.0873F, 0.0F, 0.0F));

        ModelPartData righthand = rightarm.addChild("righthand", ModelPartBuilder.create().uv(284, 0).cuboid(26.0F, -4.0F, -63.0F, 20.0F, 4.0F, 22.0F, new Dilation(0.0F))
                .uv(0, 22).cuboid(26.0F, -7.0F, -64.0F, 20.0F, 5.0F, 1.0F, new Dilation(0.0F))
                .uv(79, 144).cuboid(26.0F, -7.0F, -63.0F, 20.0F, 3.0F, 5.0F, new Dilation(0.0F))
                .uv(0, 270).cuboid(26.0F, -14.0F, -64.0F, 20.0F, 7.0F, 22.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(26.0F, -12.0F, -65.0F, 20.0F, 10.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-32.5052F, 68.0F, 52.9473F));

        ModelPartData cube_r20 = righthand.addChild("cube_r20", ModelPartBuilder.create().uv(146, 18).cuboid(3.0F, -8.0F, -65.0F, 7.0F, 5.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.2465F, -0.3024F, -0.7414F));

        ModelPartData cube_r21 = righthand.addChild("cube_r21", ModelPartBuilder.create().uv(186, 116).cuboid(-4.0F, -8.0F, -65.0F, 7.0F, 5.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0845F, -0.3789F, 0.1853F));

        ModelPartData rightleg = bone.addChild("rightleg", ModelPartBuilder.create().uv(255, 61).mirrored().cuboid(-8.704F, 18.0F, -16.4765F, 21.0F, 31.0F, 21.0F, new Dilation(0.0F)).mirrored(false)
                .uv(265, 268).mirrored().cuboid(-8.704F, 49.0F, -22.4765F, 21.0F, 5.0F, 27.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(15.0F, -54.0F, 12.0F, 0.0F, -0.1745F, 0.0F));

        ModelPartData cube_r22 = rightleg.addChild("cube_r22", ModelPartBuilder.create().uv(0, 98).mirrored().cuboid(14.0F, -5.0F, -1.0F, 5.0F, 5.0F, 11.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-26.704F, 54.0F, -7.4765F, 0.0F, 0.2618F, 0.0F));

        ModelPartData cube_r23 = rightleg.addChild("cube_r23", ModelPartBuilder.create().uv(188, 189).mirrored().cuboid(17.0F, -68.0F, -18.0F, 24.0F, 37.0F, 24.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-26.704F, 54.0F, -7.4765F, -0.2628F, 0.0843F, -0.0226F));

        return TexturedModelData.of(meshdefinition, 512, 512);
    }

    @Override
    public void setAngles(GeorgeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.head.pitch = headPitch * (float) (Math.PI / 180);
        this.head.yaw = netHeadYaw * (float) (Math.PI / 180);

        this.leftArm.pitch = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightArm.pitch = MathHelper.cos(limbSwing * 0.6662F + 3.1415927F) * 1.4F * limbSwingAmount;
        this.leftLeg.pitch = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightLeg.pitch = MathHelper.cos(limbSwing * 0.6662F + 3.1415927F) * 1.4F * limbSwingAmount;
    }

    @Override
    public ModelPart getPart() {
        return this.root;
    }
}