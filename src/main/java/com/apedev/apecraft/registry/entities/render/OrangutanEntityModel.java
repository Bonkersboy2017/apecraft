// Made with Model Converter by Globox_Z
// Generate all required imports
// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	package com.apedev.apecraft.registry.entities.render;

import com.apedev.apecraft.registry.entities.OrangutanEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;




	public class OrangutanEntityModel extends EntityModel<OrangutanEntity> {
private final ModelPart rightleg;
	private final ModelPart cube_r1;
	private final ModelPart leftleg;
	private final ModelPart cube_r2;
	private final ModelPart head;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart cube_r5;
	private final ModelPart cube_r6;
	private final ModelPart leftarm;
	private final ModelPart cube_r7;
	private final ModelPart rightarm;
	private final ModelPart cube_r8;
	private final ModelPart cube_r9;
	private final ModelPart body;
	private final ModelPart cube_r10;
	private final ModelPart cube_r11;
public OrangutanEntityModel(ModelPart root) {
this.rightleg = root.getChild("rightleg");
this.cube_r1 = this.rightleg.getChild("cube_r1");
this.leftleg = root.getChild("leftleg");
this.cube_r2 = this.leftleg.getChild("cube_r2");
this.head = root.getChild("head");
this.cube_r6 = this.head.getChild("cube_r6");
this.cube_r5 = this.head.getChild("cube_r5");
this.cube_r4 = this.head.getChild("cube_r4");
this.cube_r3 = this.head.getChild("cube_r3");
this.leftarm = root.getChild("leftarm");
this.cube_r7 = this.leftarm.getChild("cube_r7");
this.rightarm = root.getChild("rightarm");
this.cube_r9 = this.rightarm.getChild("cube_r9");
this.cube_r8 = this.rightarm.getChild("cube_r8");
this.body = root.getChild("body");
this.cube_r11 = this.body.getChild("cube_r11");
this.cube_r10 = this.body.getChild("cube_r10");
}
public static TexturedModelData getTexturedModelData() {
	ModelData modelData = new ModelData();
	ModelPartData modelPartData = modelData.getRoot();


	ModelPartData modelPartData1 = modelPartData.addChild("rightleg", ModelPartBuilder.create(), ModelTransform.pivot(9.0F, -2.0F, 21.0F));
	modelPartData1.addChild("cube_r1", ModelPartBuilder.create().uv(88, 89).cuboid(7.0F, -28.0F, 15.0F, 8.0F, 27.0F, 10.0F), ModelTransform.pivot(-9.0F, 26.0F, -21.0F));
	ModelPartData modelPartData2 = modelPartData.addChild("leftleg", ModelPartBuilder.create(), ModelTransform.pivot(-7.0F, -1.0F, 21.0F));
	modelPartData2.addChild("cube_r2", ModelPartBuilder.create().uv(0, 92).cuboid(-15.0F, -28.0F, 15.0F, 8.0F, 27.0F, 10.0F), ModelTransform.pivot(7.0F, 25.0F, -21.0F));
	ModelPartData modelPartData3 = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, 1.0F, -11.0F, 8.0F, 3.0F, 1.0F).uv(0, 68).cuboid(-8.0F, -7.0F, -9.0F, 16.0F, 13.0F, 11.0F).uv(102, 0).cuboid(-10.0F, -5.0F, -10.0F, 20.0F, 11.0F, 2.0F), ModelTransform.pivot(0.0F, -8.0F, -8.0F));
	modelPartData3.addChild("cube_r3", ModelPartBuilder.create().uv(0, 8).cuboid(-3.0F, -19.0F, -25.0F, 6.0F, 4.0F, 0.0F), ModelTransform.pivot(0.0F, 32.0F, 10.0F));
	modelPartData3.addChild("cube_r4", ModelPartBuilder.create().uv(116, 118).cuboid(-4.0F, -24.0F, -28.0F, 8.0F, 5.0F, 8.0F), ModelTransform.pivot(0.0F, 32.0F, 8.0F));
	modelPartData3.addChild("cube_r5", ModelPartBuilder.create().uv(71, 0).cuboid(-4.0F, -27.0F, -19.0F, 8.0F, 2.0F, 15.0F), ModelTransform.pivot(0.0F, 32.0F, 8.0F));
	modelPartData3.addChild("cube_r6", ModelPartBuilder.create().uv(0, 4).cuboid(-4.0F, -19.0F, -24.0F, 8.0F, 4.0F, 0.0F), ModelTransform.pivot(0.0F, 32.0F, 8.0F));
	ModelPartData modelPartData4 = modelPartData.addChild("leftarm", ModelPartBuilder.create().uv(114, 80).cuboid(-7.8602F, 28.0F, -6.8766F, 9.0F, 3.0F, 9.0F).uv(36, 99).cuboid(-7.8602F, -2.0F, -2.8766F, 9.0F, 14.0F, 10.0F), ModelTransform.pivot(-12.0F, -7.0F, -8.0F));
	modelPartData4.addChild("cube_r7", ModelPartBuilder.create().uv(84, 25).cuboid(-17.0F, -19.0F, -15.0F, 11.0F, 20.0F, 11.0F), ModelTransform.pivot(8.1398F, 31.0F, 7.1234F));
	ModelPartData modelPartData5 = modelPartData.addChild("rightarm", ModelPartBuilder.create(), ModelTransform.pivot(15.0F, -8.0F, -9.0F));
	modelPartData5.addChild("cube_r8", ModelPartBuilder.create().uv(98, 56).cuboid(7.0F, -33.0F, -10.0F, 9.0F, 14.0F, 10.0F).uv(108, 13).cuboid(7.0F, -3.0F, -14.0F, 9.0F, 3.0F, 9.0F), ModelTransform.pivot(-12.7426F, 32.0F, 4.3296F));
	modelPartData5.addChild("cube_r9", ModelPartBuilder.create().uv(54, 68).cuboid(6.0F, -19.0F, -15.0F, 11.0F, 20.0F, 11.0F), ModelTransform.pivot(-12.7426F, 32.0F, 4.3296F));
	ModelPartData modelPartData6 = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
	modelPartData6.addChild("cube_r10", ModelPartBuilder.create().uv(0, 36).cuboid(-12.0F, -28.0F, 5.0F, 24.0F, 14.0F, 18.0F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
	modelPartData6.addChild("cube_r11", ModelPartBuilder.create().uv(0, 0).cuboid(-12.0F, -29.0F, -23.0F, 24.0F, 13.0F, 23.0F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
	return TexturedModelData.of(modelData, 256, 256);



		//previously the render function, render code was moved to a method below
}
@Override
public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
}
public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
}

		@Override
		public void setAngles(OrangutanEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
			this.cube_r1.yaw = -0.0873F;
			this.cube_r2.yaw = 0.0873F;
			this.cube_r3.pitch = -0.2618F;
			this.cube_r4.pitch = -0.3054F;
			this.cube_r5.pitch = 0.0436F;
			this.cube_r6.pitch = -0.2618F;
			this.leftarm.yaw = 0.1309F;
			this.cube_r7.pitch = -0.2182F;
			this.rightarm.yaw = 0.1309F;
			this.cube_r8.yaw = -0.3054F;
			this.cube_r9.pitch = -0.2182F;
			this.cube_r9.yaw = -0.3054F;
			this.cube_r10.pitch = -0.0436F;
			this.cube_r11.pitch = -0.4363F;
		}
	}