package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.entity.LangarmurEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class LangarmurEntityModel extends SinglePartEntityModel<LangarmurEntity> {
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

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData rightarm = modelPartData.addChild("rightarm", ModelPartBuilder.create().uv(0, 33).cuboid(-4.0F, -1.0F, -2.0F, 4.0F, 20.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, -6.0F, -2.0F));

        ModelPartData leftarm = modelPartData.addChild("leftarm", ModelPartBuilder.create().uv(44, 24).cuboid(0.0F, -1.0F, -2.0F, 4.0F, 20.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, -6.0F, -2.0F));

        ModelPartData rightleg = modelPartData.addChild("rightleg", ModelPartBuilder.create().uv(32, 0).cuboid(-2.0F, -1.0F, -2.0F, 5.0F, 20.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, 5.0F, 0.0F));

        ModelPartData leftleg = modelPartData.addChild("leftleg", ModelPartBuilder.create().uv(26, 29).cuboid(-2.0F, -2.0F, -2.0F, 5.0F, 20.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 6.0F, 0.0F));

        ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -7.0F, -7.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -7.0F, 0.0F));

        ModelPartData cube_r1 = head.addChild("cube_r1", ModelPartBuilder.create().uv(44, 48).cuboid(-3.0F, -33.0F, -9.0F, 6.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 31.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

        ModelPartData cube_r2 = head.addChild("cube_r2", ModelPartBuilder.create().uv(50, 0).cuboid(-3.0F, -36.0F, -12.0F, 6.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 31.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

        ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(120, 93).cuboid(-2.0F, -20.0F, -3.0F, 4.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData cube_r3 = bb_main.addChild("cube_r3", ModelPartBuilder.create().uv(0, 16).cuboid(-5.0F, -31.0F, -1.0F, 10.0F, 12.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 128, 128);
    }

    @Override
    public void setAngles(LangarmurEntity entity, float limbAngle, float limbDistance, float animationProgress, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.head.pitch = headPitch * (float) (Math.PI / 180);
        this.head.yaw = netHeadYaw * (float) (Math.PI / 180);

        this.leftleg.pitch = MathHelper.cos(limbAngle * 0.6662F) * 1.4F * limbDistance;
        this.rightleg.pitch = MathHelper.cos(limbAngle * 0.6662F + 3.1415927F) * 1.4F * limbDistance;
    }

    @Override
    public ModelPart getPart() {
        return this.root;
    }
}