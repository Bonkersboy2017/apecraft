package com.apedev.apecraft.registry.entities.render;

import com.apedev.apecraft.registry.entities.GeorgeEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class GeorgeEntityModel extends EntityModel<GeorgeEntity> {
	private final ModelPart KingKong;
	private final ModelPart bone5;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart cube_r5;
	private final ModelPart cube_r6;
	private final ModelPart cube_r7;
	private final ModelPart cube_r8;
	private final ModelPart leftleg;
	private final ModelPart cube_r9;
	private final ModelPart cube_r10;
	private final ModelPart body;
	private final ModelPart cube_r11;
	private final ModelPart cube_r12;
	private final ModelPart cube_r13;
	private final ModelPart leftarm;
	private final ModelPart cube_r14;
	private final ModelPart cube_r15;
	private final ModelPart lefthand;
	private final ModelPart cube_r16;
	private final ModelPart cube_r17;
	private final ModelPart rightarm;
	private final ModelPart cube_r18;
	private final ModelPart cube_r19;
	private final ModelPart righthand;
	private final ModelPart cube_r20;
	private final ModelPart cube_r21;
	private final ModelPart rightleg;
	private final ModelPart cube_r22;
	private final ModelPart cube_r23;
	public GeorgeEntityModel(ModelPart root) {
		this.KingKong = root.getChild("KingKong");
		this.leftleg = this.KingKong.getChild("leftleg");
		this.body = this.KingKong.getChild("body");
		this.leftarm = this.KingKong.getChild("leftarm");
		this.lefthand = this.leftarm.getChild("lefthand");
		this.rightarm = this.KingKong.getChild("rightarm");
		this.rightleg = this.KingKong.getChild("rightleg");
		this.righthand = this.rightarm.getChild("righthand");
		this.bone5 = this.KingKong.getChild("bone5");
		this.cube_r1 = this.bone5.getChild("cube_r1");
		this.cube_r2 = this.bone5.getChild("cube_r2");
		this.cube_r3 = this.bone5.getChild("cube_r3");
		this.cube_r4 = this.bone5.getChild("cube_r4");
		this.cube_r5 = this.bone5.getChild("cube_r5");
		this.cube_r6 = this.bone5.getChild("cube_r6");
		this.cube_r7 = this.bone5.getChild("cube_r7");
		this.cube_r8 = this.bone5.getChild("cube_r8");
		this.cube_r9 = this.leftleg.getChild("cube_r9");
		this.cube_r10 = this.leftleg.getChild("cube_r10");
		this.cube_r11 = this.body.getChild("cube_r11");
		this.cube_r12 = this.body.getChild("cube_r12");
		this.cube_r13 = this.body.getChild("cube_r13");
		this.cube_r14 = this.leftarm.getChild("cube_r14");
		this.cube_r15 = this.leftarm.getChild("cube_r15");
		this.cube_r16 = this.lefthand.getChild("cube_r16");
		this.cube_r17 = this.lefthand.getChild("cube_r17");
		this.cube_r18 = this.rightarm.getChild("cube_r18");
		this.cube_r19 = this.rightarm.getChild("cube_r19");
		this.cube_r20 = this.righthand.getChild("cube_r20");
		this.cube_r21 = this.righthand.getChild("cube_r21");
		this.cube_r22 = this.rightleg.getChild("cube_r22");
		this.cube_r23 = this.rightleg.getChild("cube_r23");




	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData KingKong = modelPartData.addChild("KingKong", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 31.0F));

		ModelPartData bone5 = KingKong.addChild("bone5", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 7.0F, 20.0F));

		ModelPartData cube_r1 = bone5.addChild("cube_r1", ModelPartBuilder.create().uv(98, 222).cuboid(-12.0F, -122.0F, -68.0F, 24.0F, 17.0F, 28.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r2 = bone5.addChild("cube_r2", ModelPartBuilder.create().uv(261, 227).cuboid(-11.0F, -73.0F, -129.0F, 22.0F, 18.0F, 23.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

		ModelPartData cube_r3 = bone5.addChild("cube_r3", ModelPartBuilder.create().uv(460, 506).cuboid(-12.0F, -91.0F, -109.0F, 24.0F, 4.0F, 2.0F, new Dilation(0.0F))
		.uv(152, 497).cuboid(-10.0F, -78.0F, -104.0F, 20.0F, 14.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		ModelPartData cube_r4 = bone5.addChild("cube_r4", ModelPartBuilder.create().uv(0, 499).cuboid(-2.0F, -97.0F, -100.0F, 4.0F, 8.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		ModelPartData cube_r5 = bone5.addChild("cube_r5", ModelPartBuilder.create().uv(146, 0).cuboid(-12.0F, -112.0F, -86.0F, 24.0F, 17.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		ModelPartData cube_r6 = bone5.addChild("cube_r6", ModelPartBuilder.create().uv(222, 497).cuboid(-8.0F, -77.0F, -109.0F, 16.0F, 15.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r7 = bone5.addChild("cube_r7", ModelPartBuilder.create().uv(287, 113).cuboid(-9.0F, -96.0F, -97.0F, 18.0F, 11.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r8 = bone5.addChild("cube_r8", ModelPartBuilder.create().uv(284, 205).cuboid(-12.0F, -103.0F, -68.0F, 24.0F, 7.0F, 14.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		ModelPartData leftleg = KingKong.addChild("leftleg", ModelPartBuilder.create().uv(255, 61).cuboid(-39.0F, -36.0F, -9.0F, 21.0F, 31.0F, 21.0F, new Dilation(0.0F))
		.uv(265, 268).cuboid(-39.0F, -5.0F, -15.0F, 21.0F, 5.0F, 27.0F, new Dilation(0.0F)), ModelTransform.of(10.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		ModelPartData cube_r9 = leftleg.addChild("cube_r9", ModelPartBuilder.create().uv(0, 98).cuboid(-19.0F, -5.0F, -1.0F, 5.0F, 5.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

		ModelPartData cube_r10 = leftleg.addChild("cube_r10", ModelPartBuilder.create().uv(188, 189).cuboid(-41.0F, -68.0F, -18.0F, 24.0F, 37.0F, 24.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.2628F, -0.0843F, 0.0226F));

		ModelPartData body = KingKong.addChild("body", ModelPartBuilder.create(), ModelTransform.of(0.0F, 5.0F, -4.0F, -0.1309F, 0.0F, 0.0F));

		ModelPartData cube_r11 = body.addChild("cube_r11", ModelPartBuilder.create().uv(0, 0).cuboid(-26.0F, -63.0F, -86.0F, 52.0F, 31.0F, 42.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

		ModelPartData cube_r12 = body.addChild("cube_r12", ModelPartBuilder.create().uv(0, 73).cuboid(-24.0F, -73.0F, -31.0F, 48.0F, 26.0F, 45.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		ModelPartData cube_r13 = body.addChild("cube_r13", ModelPartBuilder.create().uv(141, 73).cuboid(-20.0F, -91.0F, -66.0F, 40.0F, 26.0F, 17.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		ModelPartData leftarm = KingKong.addChild("leftarm", ModelPartBuilder.create(), ModelTransform.of(7.0F, 0.0F, 2.0F, 0.0F, 0.0873F, 0.0F));

		ModelPartData cube_r14 = leftarm.addChild("cube_r14", ModelPartBuilder.create().uv(106, 144).cuboid(-45.0F, -88.0F, -59.0F, 22.0F, 42.0F, 27.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r15 = leftarm.addChild("cube_r15", ModelPartBuilder.create().uv(0, 213).cuboid(-47.0F, -40.0F, -66.0F, 24.0F, 32.0F, 25.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		ModelPartData lefthand = leftarm.addChild("lefthand", ModelPartBuilder.create().uv(284, 26).cuboid(-46.0F, -4.0F, -63.0F, 20.0F, 4.0F, 22.0F, new Dilation(0.0F))
		.uv(0, 28).cuboid(-46.0F, -7.0F, -64.0F, 20.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(79, 152).cuboid(-46.0F, -7.0F, -63.0F, 20.0F, 3.0F, 5.0F, new Dilation(0.0F))
		.uv(84, 271).cuboid(-46.0F, -14.0F, -64.0F, 20.0F, 7.0F, 22.0F, new Dilation(0.0F))
		.uv(0, 11).cuboid(-46.0F, -12.0F, -65.0F, 20.0F, 10.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 0.0F, 0.0F));

		ModelPartData cube_r16 = lefthand.addChild("cube_r16", ModelPartBuilder.create().uv(73, 213).cuboid(-10.0F, -8.0F, -65.0F, 7.0F, 5.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.2465F, 0.3024F, 0.7414F));

		ModelPartData cube_r17 = lefthand.addChild("cube_r17", ModelPartBuilder.create().uv(212, 173).cuboid(-3.0F, -8.0F, -65.0F, 7.0F, 5.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0845F, 0.3789F, -0.1853F));

		ModelPartData rightarm = KingKong.addChild("rightarm", ModelPartBuilder.create(), ModelTransform.of(-7.0F, 0.0F, 2.0F, 0.0F, -0.0873F, 0.0F));

		ModelPartData cube_r18 = rightarm.addChild("cube_r18", ModelPartBuilder.create().uv(0, 144).cuboid(23.0F, -88.0F, -59.0F, 22.0F, 42.0F, 27.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		ModelPartData cube_r19 = rightarm.addChild("cube_r19", ModelPartBuilder.create().uv(212, 116).cuboid(23.0F, -40.0F, -66.0F, 24.0F, 32.0F, 25.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		ModelPartData righthand = rightarm.addChild("righthand", ModelPartBuilder.create().uv(284, 0).cuboid(26.0F, -4.0F, -63.0F, 20.0F, 4.0F, 22.0F, new Dilation(0.0F))
		.uv(0, 22).cuboid(26.0F, -7.0F, -64.0F, 20.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(79, 144).cuboid(26.0F, -7.0F, -63.0F, 20.0F, 3.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 270).cuboid(26.0F, -14.0F, -64.0F, 20.0F, 7.0F, 22.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(26.0F, -12.0F, -65.0F, 20.0F, 10.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 0.0F, 0.0F));

		ModelPartData cube_r20 = righthand.addChild("cube_r20", ModelPartBuilder.create().uv(146, 18).cuboid(3.0F, -8.0F, -65.0F, 7.0F, 5.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.2465F, -0.3024F, -0.7414F));

		ModelPartData cube_r21 = righthand.addChild("cube_r21", ModelPartBuilder.create().uv(186, 116).cuboid(-4.0F, -8.0F, -65.0F, 7.0F, 5.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0845F, -0.3789F, 0.1853F));

		ModelPartData rightleg = KingKong.addChild("rightleg", ModelPartBuilder.create().uv(255, 61).mirrored().cuboid(18.0F, -36.0F, -9.0F, 21.0F, 31.0F, 21.0F, new Dilation(0.0F)).mirrored(false)
		.uv(265, 268).mirrored().cuboid(18.0F, -5.0F, -15.0F, 21.0F, 5.0F, 27.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-10.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		ModelPartData cube_r22 = rightleg.addChild("cube_r22", ModelPartBuilder.create().uv(0, 98).mirrored().cuboid(14.0F, -5.0F, -1.0F, 5.0F, 5.0F, 11.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));

		ModelPartData cube_r23 = rightleg.addChild("cube_r23", ModelPartBuilder.create().uv(188, 189).mirrored().cuboid(17.0F, -68.0F, -18.0F, 24.0F, 37.0F, 24.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.2628F, 0.0843F, -0.0226F));
		return TexturedModelData.of(modelData, 512, 512);
	}
	@Override
	public void setAngles(GeorgeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		KingKong.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r1.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r2.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r3.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r4.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r5.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r6.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r7.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r8.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r9.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r10.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r11.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r12.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r13.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r14.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r15.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r16.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r17.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r18.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r19.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r20.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r21.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r22.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cube_r23.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		bone5.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		lefthand.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		righthand.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		rightarm.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		leftarm.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		leftleg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		rightleg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);


	}
}