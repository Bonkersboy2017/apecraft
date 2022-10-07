package com.apedev.apecraft.registry.entities.render;

import com.apedev.apecraft.registry.entities.LangarmurEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class LangarmurEntityModel extends EntityModel<LangarmurEntity> {
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
		this.rightarm = root.getChild("rightarm");
		this.leftarm = root.getChild("leftarm");
		this.rightleg = root.getChild("rightleg");
		this.leftleg = root.getChild("leftleg");
		this.head = root.getChild("head");
		this.bb_main = root.getChild("bb_main");
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
	public void setAngles(LangarmurEntity entity,float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

		this.leftleg.pitch = MathHelper.cos(limbAngle * 0.6662F) * 1.4F * limbDistance;
		this.rightleg.pitch = MathHelper.cos(limbAngle * 0.6662F + 3.1415927F) * 1.4F * limbDistance;

	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		rightarm.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		leftarm.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		rightleg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		leftleg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		head.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		bb_main.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r1.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r2.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r3.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}