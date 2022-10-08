// Made with Model Converter by Globox_Z
// Generate all required imports
// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.entity.AlbinoChimpanzeeEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.util.math.MathHelper;

public class AlbinoChimpanzeeEntityModel extends SinglePartEntityModel<AlbinoChimpanzeeEntity> {
    private final ModelPart root;
    private final ModelPart leftLeg;
    private final ModelPart torso;
    private final ModelPart cube_r1;
    private final ModelPart cube_r2;
    private final ModelPart cube_r3;
    private final ModelPart cube_r4;
    private final ModelPart rightArm;
    private final ModelPart head;
    private final ModelPart cube_r5;
    private final ModelPart cube_r6;
    private final ModelPart cube_r7;
    private final ModelPart rightLeg;
    private final ModelPart leftarm;

    public AlbinoChimpanzeeEntityModel(ModelPart root) {
        super();
        this.root = root;
        this.leftLeg = this.root.getChild("Leftleg");
        this.torso = this.root.getChild("torso");
        this.cube_r4 = this.torso.getChild("cube_r4");
        this.cube_r3 = this.torso.getChild("cube_r3");
        this.cube_r2 = this.torso.getChild("cube_r2");
        this.cube_r1 = this.torso.getChild("cube_r1");
        this.rightArm = this.root.getChild("rightarm");
        this.head = this.root.getChild("head");
        this.cube_r7 = this.head.getChild("cube_r7");
        this.cube_r6 = this.head.getChild("cube_r6");
        this.cube_r5 = this.head.getChild("cube_r5");
        this.rightLeg = this.root.getChild("rightleg");
        this.leftarm = this.root.getChild("leftarm");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        modelPartData.addChild("Leftleg", ModelPartBuilder.create().uv(12, 35).cuboid(-2.0F, -1.0F, -2.0F, 4.0F, 13.0F, 4.0F), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
        ModelPartData modelPartData1 = modelPartData.addChild("torso", ModelPartBuilder.create().uv(23, 0).cuboid(-3.0F, -6.0F, -5.0F, 7.0F, 2.0F, 3.0F), ModelTransform.pivot(0.0F, 6.0F, 1.0F));
        modelPartData1.addChild("cube_r1", ModelPartBuilder.create().uv(23, 22).cuboid(-6.0F, -20.0F, 7.0F, 5.0F, 6.0F, 0.0F, true), ModelTransform.of(3.0F, 18.0F, -3.0F, 0.2182F, 0.0F, 0.0F));
        modelPartData1.addChild("cube_r2", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -23.0F, 2.0F, 9.0F, 4.0F, 5.0F).uv(24, 5).cuboid(-1.0F, -15.0F, 3.0F, 9.0F, 4.0F, 4.0F), ModelTransform.of(-3.0F, 18.0F, -3.0F, 0.2182F, 0.0F, 0.0F));
        modelPartData1.addChild("cube_r3", ModelPartBuilder.create().uv(35, 13).cuboid(-2.0F, -21.0F, 3.0F, 5.0F, 7.0F, 4.0F), ModelTransform.of(-3.0F, 18.0F, -3.0F, 0.2174F, -0.0189F, 0.0852F));
        modelPartData1.addChild("cube_r4", ModelPartBuilder.create().uv(43, 24).cuboid(4.0F, -20.0F, 3.0F, 5.0F, 6.0F, 4.0F), ModelTransform.pivot(-3.0F, 18.0F, -3.0F));
        modelPartData.addChild("rightarm", ModelPartBuilder.create().uv(19, 15).cuboid(0.0F, -1.0F, -2.0F, 3.0F, 14.0F, 4.0F), ModelTransform.pivot(5.0F, 2.0F, -2.0F));
        ModelPartData modelPartData2 = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 8).cuboid(-4.0F, -6.0F, -3.0F, 7.0F, 6.0F, 6.0F).uv(0, 8).cuboid(-4.0F, -6.0F, 3.0F, 7.0F, 2.0F, 0.0F, true), ModelTransform.pivot(1.0F, 0.0F, -3.0F));
        modelPartData2.addChild("cube_r5", ModelPartBuilder.create().uv(35, 24).cuboid(1.0F, -26.0F, 1.0F, 5.0F, 2.0F, 1.0F).uv(24, 13).cuboid(1.0F, -27.0F, 1.0F, 5.0F, 1.0F, 1.0F), ModelTransform.pivot(-4.0F, 24.0F, 1.0F));
        modelPartData2.addChild("cube_r6", ModelPartBuilder.create().uv(0, 9).cuboid(0.0F, -29.0F, -1.0F, 2.0F, 2.0F, 1.0F), ModelTransform.pivot(-4.0F, 24.0F, 1.0F));
        modelPartData2.addChild("cube_r7", ModelPartBuilder.create().uv(0, 0).cuboid(5.0F, -29.0F, -1.0F, 2.0F, 2.0F, 1.0F), ModelTransform.pivot(-4.0F, 24.0F, 1.0F));
        modelPartData.addChild("rightleg", ModelPartBuilder.create().uv(31, 30).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 13.0F, 4.0F), ModelTransform.pivot(3.0F, 11.0F, 0.0F));
        modelPartData.addChild("leftarm", ModelPartBuilder.create().uv(0, 20).cuboid(-3.0F, -1.0F, -2.0F, 3.0F, 14.0F, 4.0F), ModelTransform.pivot(-4.0F, 2.0F, -2.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void setAngles(AlbinoChimpanzeeEntity entity, float limbAngle, float limbDistance, float animationProgress, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.head.pitch = headPitch * (float) (Math.PI / 180);
        this.head.yaw = netHeadYaw * (float) (Math.PI / 180);
        this.cube_r4.pitch = 0.2174F;
        this.cube_r4.yaw = 0.0189F;
        this.cube_r4.roll = -0.0852F;
        this.cube_r5.pitch = 0.2182F;
        this.cube_r6.roll = -0.0436F;
        this.cube_r7.roll = 0.0436F;

        this.leftLeg.pitch = MathHelper.cos(limbAngle * 0.6662F) * 1.4F * limbDistance;
        this.rightLeg.pitch = MathHelper.cos(limbAngle * 0.6662F + 3.1415927F) * 1.4F * limbDistance;
    }

    @Override
    public ModelPart getPart() {
        return this.root;
    }
}