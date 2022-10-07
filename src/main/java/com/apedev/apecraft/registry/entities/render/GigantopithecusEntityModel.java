// Made with Model Converter by Globox_Z
// Generate all required imports
// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	package com.apedev.apecraft.registry.entities.render;

import com.apedev.apecraft.registry.entities.GigantopithecusEntity;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class GigantopithecusEntityModel extends EntityModel<GigantopithecusEntity> {
private final ModelPart bone;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart rightarm;
	private final ModelPart cube_r3;
	private final ModelPart leftarm;
	private final ModelPart cube_r4;
	private final ModelPart rightleg;
	private final ModelPart leftleg;
	private final ModelPart head;
	private final ModelPart cube_r5;
	private final ModelPart cube_r6;
public GigantopithecusEntityModel(ModelPart root) {
this.bone = root.getChild("bone");
this.cube_r2 = this.bone.getChild("cube_r2");
this.cube_r1 = this.bone.getChild("cube_r1");
this.rightarm = root.getChild("rightarm");
this.cube_r3 = this.rightarm.getChild("cube_r3");
this.leftarm = root.getChild("leftarm");
this.cube_r4 = this.leftarm.getChild("cube_r4");
this.rightleg = root.getChild("rightleg");
this.leftleg = root.getChild("leftleg");
this.head = root.getChild("head");
this.cube_r6 = this.head.getChild("cube_r6");
this.cube_r5 = this.head.getChild("cube_r5");
}
public static TexturedModelData getTexturedModelData() {
ModelData modelData = new ModelData();
ModelPartData modelPartData = modelData.getRoot();
ModelPartData modelPartData1 = modelPartData.addChild("bone", ModelPartBuilder.create().uv(68,53).cuboid(-6.0F, -35.0F, -10.0F, 12.0F, 5.0F, 9.0F).uv(43,41).cuboid(-10.0F, -17.0F, -2.0F, 20.0F, 5.0F, 7.0F), ModelTransform.pivot(0.0F,15.0F,0.0F));
modelPartData1.addChild("cube_r1", ModelPartBuilder.create().uv(0,24).cuboid(-8.0F, -30.0F, 0.0F, 16.0F, 15.0F, 9.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r2", ModelPartBuilder.create().uv(0,0).cuboid(-9.0F, -33.0F, -1.0F, 18.0F, 10.0F, 14.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
ModelPartData modelPartData2 = modelPartData.addChild("rightarm", ModelPartBuilder.create(), ModelTransform.pivot(-7.0F,-16.0F,-3.0F));
modelPartData2.addChild("cube_r3", ModelPartBuilder.create().uv(64,0).cuboid(-14.0F, -33.0F, -8.0F, 6.0F, 26.0F, 7.0F), ModelTransform.pivot(7.0F,31.0F,3.0F));
ModelPartData modelPartData3 = modelPartData.addChild("leftarm", ModelPartBuilder.create(), ModelTransform.pivot(11.0F,-15.0F,-3.0F));
modelPartData3.addChild("cube_r4", ModelPartBuilder.create().uv(42,53).cuboid(8.0F, -33.0F, -8.0F, 6.0F, 26.0F, 7.0F), ModelTransform.pivot(-11.0F,30.0F,3.0F));
modelPartData.addChild("rightleg", ModelPartBuilder.create().uv(68,67).cuboid(-4.0F, -1.0F, -4.0F, 7.0F, 21.0F, 7.0F), ModelTransform.pivot(-6.0F,4.0F,2.0F));
modelPartData.addChild("leftleg", ModelPartBuilder.create().uv(0,69).cuboid(-3.0F, -1.0F, -4.0F, 7.0F, 21.0F, 7.0F), ModelTransform.pivot(6.0F,4.0F,2.0F));
ModelPartData modelPartData4 = modelPartData.addChild("head", ModelPartBuilder.create().uv(28,86).cuboid(-8.0F, -9.0F, -7.0F, 16.0F, 11.0F, 2.0F).uv(41,24).cuboid(-3.0F, -2.0F, -9.0F, 6.0F, 3.0F, 2.0F).uv(0,48).cuboid(-5.0F, -10.0F, -6.0F, 10.0F, 10.0F, 11.0F), ModelTransform.pivot(0.0F,-19.0F,-7.0F));
modelPartData4.addChild("cube_r5", ModelPartBuilder.create().uv(0,0).cuboid(-2.0F, -31.0F, -18.0F, 4.0F, 3.0F, 0.0F), ModelTransform.pivot(0.0F,34.0F,7.0F));
modelPartData4.addChild("cube_r6", ModelPartBuilder.create().uv(41,29).cuboid(-3.0F, -34.0F, -13.0F, 6.0F, 1.0F, 2.0F), ModelTransform.pivot(0.0F,34.0F,7.0F));
return TexturedModelData.of(modelData,128,128);
		
		
}
@Override
public void setAngles(GigantopithecusEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch){
this.cube_r1.pitch = 0.2618F;
this.cube_r2.pitch = 0.3927F;
this.cube_r3.pitch = -0.0436F;
this.cube_r4.pitch = -0.0436F;
this.cube_r5.pitch = -0.0873F;
this.cube_r6.pitch = 0.0873F;

	this.leftleg.pitch = MathHelper.cos(limbAngle * 0.6662F) * 1.4F * limbDistance;
	this.rightleg.pitch = MathHelper.cos(limbAngle * 0.6662F + 3.1415927F) * 1.4F * limbDistance;

		//previously the render function, render code was moved to a method below
}
@Override
public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
}
public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
}
	}