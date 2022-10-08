package com.apedev.apecraft.entity.render;// Made with Model Converter by Globox_Z
// Generate all required imports
// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

import com.apedev.apecraft.entity.BonoboBruteEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.util.math.MathHelper;


public class BonoboBruteEntityModel extends SinglePartEntityModel<BonoboBruteEntity> {
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

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        modelPartData.addChild("Leftleg", ModelPartBuilder.create().uv(12, 35).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), ModelTransform.pivot(-2.0F, 12.0F, 0.0F));
        ModelPartData modelPartData1 = modelPartData.addChild("torso", ModelPartBuilder.create().uv(23, 0).cuboid(0.0F, -23.0F, -2.0F, 7.0F, 1.0F, 3.0F), ModelTransform.pivot(-3.0F, 24.0F, -2.0F));
        modelPartData1.addChild("cube_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -22.0F, 2.0F, 9.0F, 4.0F, 5.0F).uv(24, 5).cuboid(0.0F, -14.0F, 3.0F, 7.0F, 3.0F, 4.0F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        modelPartData1.addChild("cube_r2", ModelPartBuilder.create().uv(43, 24).cuboid(0.0F, -18.0F, 3.0F, 7.0F, 4.0F, 4.0F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        modelPartData.addChild("rightarm", ModelPartBuilder.create().uv(19, 15).cuboid(-1.0F, 0.0F, -2.0F, 3.0F, 13.0F, 4.0F), ModelTransform.pivot(5.0F, 2.0F, -2.0F));
        ModelPartData modelPartData2 = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 8).cuboid(-4.0F, -6.0F, -3.0F, 7.0F, 6.0F, 6.0F).uv(0, 28).cuboid(-4.0F, -6.0F, 3.0F, 7.0F, 6.0F, 0.0F, true), ModelTransform.pivot(1.0F, 1.0F, -3.0F));
        modelPartData2.addChild("cube_r3", ModelPartBuilder.create().uv(35, 24).cuboid(1.0F, -26.0F, 1.0F, 5.0F, 2.0F, 1.0F).uv(24, 13).cuboid(1.0F, -27.0F, 1.0F, 5.0F, 1.0F, 1.0F), ModelTransform.pivot(-4.0F, 24.0F, 1.0F));
        modelPartData2.addChild("cube_r4", ModelPartBuilder.create().uv(0, 9).cuboid(-2.0F, -28.0F, -1.0F, 1.0F, 2.0F, 1.0F), ModelTransform.pivot(-4.0F, 24.0F, 1.0F));
        modelPartData2.addChild("cube_r5", ModelPartBuilder.create().uv(0, 0).cuboid(8.0F, -28.0F, -1.0F, 1.0F, 2.0F, 1.0F), ModelTransform.pivot(-4.0F, 24.0F, 1.0F));
        modelPartData.addChild("rightleg", ModelPartBuilder.create().uv(31, 30).cuboid(-2.0F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F), ModelTransform.pivot(3.0F, 11.0F, 0.0F));
        ModelPartData modelPartData3 = modelPartData.addChild("leftarm", ModelPartBuilder.create().uv(0, 20).cuboid(-2.0F, 0.0F, -2.0F, 3.0F, 13.0F, 4.0F), ModelTransform.pivot(-4.0F, 2.0F, -2.0F));
        modelPartData3.addChild("spear", ModelPartBuilder.create().uv(28, 46).cuboid(-2.0F, -2.0F, -21.0F, 2.0F, 2.0F, 16.0F).uv(0, 58).cuboid(-1.0F, -2.0F, -25.0F, 1.0F, 2.0F, 4.0F).uv(0, 50).cuboid(-1.0F, -2.0F, -28.0F, 1.0F, 1.0F, 3.0F), ModelTransform.pivot(1.0F, 12.0F, 8.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void setAngles(BonoboBruteEntity entity, float limbAngle, float limbDistance, float animationProgress, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.head.pitch = headPitch * (float) (Math.PI / 180);
        this.head.yaw = netHeadYaw * (float) (Math.PI / 180);
        this.cube_r1.pitch = 0.2182F;
        this.cube_r2.pitch = 0.2182F;
        this.cube_r3.pitch = 0.2182F;
        this.cube_r4.roll = 0.0436F;
        this.cube_r5.roll = -0.0436F;

        this.leftleg.pitch = MathHelper.cos(limbAngle * 0.6662F) * 1.4F * limbDistance;
        this.rightLeg.pitch = MathHelper.cos(limbAngle * 0.6662F + 3.1415927F) * 1.4F * limbDistance;
    }

    @Override
    public ModelPart getPart() {
        return this.root;
    }
}