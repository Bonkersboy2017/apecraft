package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.entity.KingKongEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class KingKongEntityModel extends SinglePartEntityModel<KingKongEntity> {
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

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 31.0F));

        ModelPartData cube_r1 = bone.addChild("cube_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-24.0F, -71.0F, -36.0F, 48.0F, 26.0F, 51.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

        ModelPartData cube_r2 = bone.addChild("cube_r2", ModelPartBuilder.create().uv(0, 77).cuboid(-26.0F, -63.0F, -86.0F, 52.0F, 31.0F, 42.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

        ModelPartData cube_r3 = bone.addChild("cube_r3", ModelPartBuilder.create().uv(147, 0).cuboid(-20.0F, -91.0F, -66.0F, 40.0F, 26.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

        ModelPartData head = bone.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 7.0F, 13.0F));

        ModelPartData cube_r4 = head.addChild("cube_r4", ModelPartBuilder.create().uv(193, 118).cuboid(-12.0F, -122.0F, -68.0F, 24.0F, 21.0F, 28.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

        ModelPartData cube_r5 = head.addChild("cube_r5", ModelPartBuilder.create().uv(264, 250).cuboid(-12.0F, -73.0F, -129.0F, 24.0F, 18.0F, 23.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

        ModelPartData cube_r6 = head.addChild("cube_r6", ModelPartBuilder.create().uv(292, 225).cuboid(-14.0F, -112.0F, -86.0F, 28.0F, 12.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

        ModelPartData cube_r7 = head.addChild("cube_r7", ModelPartBuilder.create().uv(297, 123).cuboid(-11.0F, -94.0F, -97.0F, 22.0F, 11.0F, 17.0F, new Dilation(0.0F))
                .uv(0, 22).cuboid(-11.0F, -92.0F, -87.0F, 22.0F, 9.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

        ModelPartData cube_r8 = head.addChild("cube_r8", ModelPartBuilder.create().uv(261, 0).cuboid(-11.0F, -105.0F, -66.0F, 22.0F, 9.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

        ModelPartData leftleg = bone.addChild("leftleg", ModelPartBuilder.create().uv(180, 250).cuboid(-39.0F, -36.0F, -9.0F, 21.0F, 31.0F, 21.0F, new Dilation(0.0F))
                .uv(269, 91).cuboid(-39.0F, -5.0F, -15.0F, 21.0F, 5.0F, 27.0F, new Dilation(0.0F)), ModelTransform.of(10.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

        ModelPartData cube_r9 = leftleg.addChild("cube_r9", ModelPartBuilder.create().uv(67, 209).cuboid(-19.0F, -5.0F, -1.0F, 5.0F, 5.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

        ModelPartData cube_r10 = leftleg.addChild("cube_r10", ModelPartBuilder.create().uv(196, 185).cuboid(-41.0F, -72.0F, -19.0F, 24.0F, 41.0F, 24.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

        ModelPartData leftarm = bone.addChild("leftarm", ModelPartBuilder.create().uv(0, 274).cuboid(-48.0F, -14.0F, -64.0F, 22.0F, 7.0F, 22.0F, new Dilation(0.0F))
                .uv(242, 291).cuboid(-48.0F, -4.0F, -63.0F, 22.0F, 4.0F, 22.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-48.0F, -12.0F, -65.0F, 22.0F, 10.0F, 1.0F, new Dilation(0.0F))
                .uv(147, 43).cuboid(-48.0F, -7.0F, -63.0F, 22.0F, 3.0F, 5.0F, new Dilation(0.0F))
                .uv(0, 31).cuboid(-48.0F, -7.0F, -64.0F, 22.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(10.0F, 0.0F, -5.0F, 0.0F, 0.0873F, 0.0F));

        ModelPartData cube_r11 = leftarm.addChild("cube_r11", ModelPartBuilder.create().uv(0, 209).cuboid(-46.0F, -85.0F, -57.0F, 22.0F, 42.0F, 23.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

        ModelPartData cube_r12 = leftarm.addChild("cube_r12", ModelPartBuilder.create().uv(0, 77).cuboid(-5.0F, -8.0F, -65.0F, 9.0F, 5.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0845F, 0.3789F, -0.1853F));

        ModelPartData cube_r13 = leftarm.addChild("cube_r13", ModelPartBuilder.create().uv(0, 91).cuboid(-12.0F, -8.0F, -65.0F, 9.0F, 5.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.2465F, 0.3024F, 0.7414F));

        ModelPartData cube_r14 = leftarm.addChild("cube_r14", ModelPartBuilder.create().uv(0, 150).cuboid(-51.0F, -40.0F, -67.0F, 28.0F, 32.0F, 27.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

        ModelPartData rightarm = bone.addChild("rightarm", ModelPartBuilder.create().uv(88, 274).cuboid(26.0F, -14.0F, -64.0F, 22.0F, 7.0F, 22.0F, new Dilation(0.0F))
                .uv(292, 199).cuboid(26.0F, -4.0F, -63.0F, 22.0F, 4.0F, 22.0F, new Dilation(0.0F))
                .uv(0, 11).cuboid(26.0F, -12.0F, -65.0F, 22.0F, 10.0F, 1.0F, new Dilation(0.0F))
                .uv(83, 150).cuboid(26.0F, -7.0F, -63.0F, 22.0F, 3.0F, 5.0F, new Dilation(0.0F))
                .uv(0, 37).cuboid(26.0F, -7.0F, -64.0F, 22.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-10.0F, 0.0F, -6.0F, 0.0F, -0.0873F, 0.0F));

        ModelPartData cube_r15 = rightarm.addChild("cube_r15", ModelPartBuilder.create().uv(90, 209).cuboid(24.0F, -85.0F, -57.0F, 22.0F, 42.0F, 23.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

        ModelPartData cube_r16 = rightarm.addChild("cube_r16", ModelPartBuilder.create().uv(0, 105).cuboid(-4.0F, -8.0F, -65.0F, 9.0F, 5.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0845F, -0.3789F, 0.1853F));

        ModelPartData cube_r17 = rightarm.addChild("cube_r17", ModelPartBuilder.create().uv(83, 158).cuboid(3.0F, -8.0F, -65.0F, 9.0F, 5.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.2465F, -0.3024F, -0.7414F));

        ModelPartData cube_r18 = rightarm.addChild("cube_r18", ModelPartBuilder.create().uv(110, 150).cuboid(23.0F, -40.0F, -67.0F, 28.0F, 32.0F, 27.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

        ModelPartData rightleg = bone.addChild("rightleg", ModelPartBuilder.create(), ModelTransform.of(-10.0F, 0.0F, 0.0F, 0.0F, 0.1309F, 0.0F));

        ModelPartData cube_r19 = rightleg.addChild("cube_r19", ModelPartBuilder.create().uv(188, 118).cuboid(14.0F, -5.0F, -1.0F, 5.0F, 5.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        ModelPartData cube_r20 = rightleg.addChild("cube_r20", ModelPartBuilder.create().uv(268, 167).cuboid(18.0F, -5.0F, -15.0F, 21.0F, 5.0F, 27.0F, new Dilation(0.0F))
                .uv(246, 22).cuboid(18.0F, -36.0F, -9.0F, 21.0F, 31.0F, 21.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

        ModelPartData cube_r21 = rightleg.addChild("cube_r21", ModelPartBuilder.create().uv(174, 53).cuboid(17.0F, -72.0F, -19.0F, 24.0F, 41.0F, 24.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.2618F, -0.2618F, 0.0F));
        return TexturedModelData.of(modelData, 400, 400);
    }

    @Override
    public void setAngles(KingKongEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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