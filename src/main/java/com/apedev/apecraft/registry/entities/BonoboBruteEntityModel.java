package com.apedev.apecraft.registry.entities;// Made with Model Converter by Globox_Z
// Generate all required imports
// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
import com.apedev.apecraft.registry.entities.BonoboBruteEntity;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;


public class BonoboBruteEntityModel extends EntityModel<BonoboBruteEntity> {
private final ModelPart Leftleg;
	private final ModelPart torso;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart rightarm;
	private final ModelPart head;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart cube_r5;
	private final ModelPart rightleg;
	private final ModelPart leftarm;
	private final ModelPart spear;
public BonoboBruteEntityModel(ModelPart root) {
this.Leftleg = root.getChild("Leftleg");
this.torso = root.getChild("torso");
this.cube_r2 = this.torso.getChild("cube_r2");
this.cube_r1 = this.torso.getChild("cube_r1");
this.rightarm = root.getChild("rightarm");
this.head = root.getChild("head");
this.cube_r5 = this.head.getChild("cube_r5");
this.cube_r4 = this.head.getChild("cube_r4");
this.cube_r3 = this.head.getChild("cube_r3");
this.rightleg = root.getChild("rightleg");
this.leftarm = root.getChild("leftarm");
this.spear = this.leftarm.getChild("spear");
}
public static TexturedModelData getTexturedModelData() {
ModelData modelData = new ModelData();
ModelPartData modelPartData = modelData.getRoot();
modelPartData.addChild("Leftleg", ModelPartBuilder.create().uv(12,35).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), ModelTransform.pivot(-2.0F,12.0F,0.0F));
ModelPartData modelPartData1 = modelPartData.addChild("torso", ModelPartBuilder.create().uv(23,0).cuboid(0.0F, -23.0F, -2.0F, 7.0F, 1.0F, 3.0F), ModelTransform.pivot(-3.0F,24.0F,-2.0F));
modelPartData1.addChild("cube_r1", ModelPartBuilder.create().uv(0,0).cuboid(-1.0F, -22.0F, 2.0F, 9.0F, 4.0F, 5.0F).uv(24,5).cuboid(0.0F, -14.0F, 3.0F, 7.0F, 3.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r2", ModelPartBuilder.create().uv(43,24).cuboid(0.0F, -18.0F, 3.0F, 7.0F, 4.0F, 4.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData.addChild("rightarm", ModelPartBuilder.create().uv(19,15).cuboid(-1.0F, 0.0F, -2.0F, 3.0F, 13.0F, 4.0F), ModelTransform.pivot(5.0F,2.0F,-2.0F));
ModelPartData modelPartData2 = modelPartData.addChild("head", ModelPartBuilder.create().uv(0,8).cuboid(-4.0F, -6.0F, -3.0F, 7.0F, 6.0F, 6.0F).uv(0,28).cuboid(-4.0F, -6.0F, 3.0F, 7.0F, 6.0F, 0.0F, true), ModelTransform.pivot(1.0F,1.0F,-3.0F));
modelPartData2.addChild("cube_r3", ModelPartBuilder.create().uv(35,24).cuboid(1.0F, -26.0F, 1.0F, 5.0F, 2.0F, 1.0F).uv(24,13).cuboid(1.0F, -27.0F, 1.0F, 5.0F, 1.0F, 1.0F), ModelTransform.pivot(-4.0F,24.0F,1.0F));
modelPartData2.addChild("cube_r4", ModelPartBuilder.create().uv(0,9).cuboid(-2.0F, -28.0F, -1.0F, 1.0F, 2.0F, 1.0F), ModelTransform.pivot(-4.0F,24.0F,1.0F));
modelPartData2.addChild("cube_r5", ModelPartBuilder.create().uv(0,0).cuboid(8.0F, -28.0F, -1.0F, 1.0F, 2.0F, 1.0F), ModelTransform.pivot(-4.0F,24.0F,1.0F));
modelPartData.addChild("rightleg", ModelPartBuilder.create().uv(31,30).cuboid(-2.0F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F), ModelTransform.pivot(3.0F,11.0F,0.0F));
ModelPartData modelPartData3 = modelPartData.addChild("leftarm", ModelPartBuilder.create().uv(0,20).cuboid(-2.0F, 0.0F, -2.0F, 3.0F, 13.0F, 4.0F), ModelTransform.pivot(-4.0F,2.0F,-2.0F));
modelPartData3.addChild("spear", ModelPartBuilder.create().uv(28,46).cuboid(-2.0F, -2.0F, -21.0F, 2.0F, 2.0F, 16.0F).uv(0,58).cuboid(-1.0F, -2.0F, -25.0F, 1.0F, 2.0F, 4.0F).uv(0,50).cuboid(-1.0F, -2.0F, -28.0F, 1.0F, 1.0F, 3.0F), ModelTransform.pivot(1.0F,12.0F,8.0F));
return TexturedModelData.of(modelData,64,64);
}
@Override
public void setAngles(BonoboBruteEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch){
this.cube_r1.pitch = 0.2182F;
this.cube_r2.pitch = 0.2182F;
this.cube_r3.pitch = 0.2182F;
this.cube_r4.roll = 0.0436F;
this.cube_r5.roll = -0.0436F;

	this.Leftleg.pitch = MathHelper.cos(limbAngle * 0.6662F) * 1.4F * limbDistance;
	this.rightleg.pitch = MathHelper.cos(limbAngle * 0.6662F + 3.1415927F) * 1.4F * limbDistance;
		//previously the render function, render code was moved to a method below
}
@Override
public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		Leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		torso.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
}
public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
}
	}