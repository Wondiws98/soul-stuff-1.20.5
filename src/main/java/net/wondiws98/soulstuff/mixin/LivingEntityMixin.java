package net.wondiws98.soulstuff.mixin;

import net.minecraft.entity.Attackable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity implements Attackable {
	public LivingEntityMixin(EntityType<?> type, World world) {
		super(type, world);
	}
	/**
	 * @author wondiws98
	 * @reason makes blocks less than a block tall functional with soul speed.
	 */
	@Overwrite
	public boolean isOnSoulSpeedBlock() {
		World thisWorld = this.getWorld();
		TagKey soulSpeedBlocks = BlockTags.SOUL_SPEED_BLOCKS;
		return thisWorld.getBlockState(this.getVelocityAffectingPos()).isIn(soulSpeedBlocks) || thisWorld.getBlockState(this.getSteppingPos()).isIn(soulSpeedBlocks);
	}
}