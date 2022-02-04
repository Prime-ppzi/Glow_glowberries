
package com.github.Primeppzi.mixin;


import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import org.spongepowered.asm.mixin.*;
import net.minecraft.item.FoodComponent.Builder;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;




@Mixin(FoodComponents.class)
public class glowberriesMixin {
	@Mutable
	@Shadow @Final public static FoodComponent CHICKEN;

	@Mutable
	@Shadow @Final public static FoodComponent CHORUS_FRUIT;

	@Mutable
	@Shadow @Final public static FoodComponent COD;

	@Mutable
	@Shadow @Final public static FoodComponent COOKED_BEEF;

	@Mutable
	@Shadow @Final public static FoodComponent COOKED_CHICKEN;

	@Mutable
	@Shadow @Final public static FoodComponent COOKED_COD;

	@Mutable
	@Shadow @Final public static FoodComponent COOKED_MUTTON;

	@Mutable
	@Shadow @Final public static FoodComponent COOKED_PORKCHOP;

	@Mutable
	@Shadow @Final public static FoodComponent COOKED_RABBIT;

	@Mutable
	@Shadow @Final public static FoodComponent COOKED_SALMON;

	@Mutable
	@Shadow @Final public static FoodComponent COOKIE;

	@Mutable
	@Shadow @Final public static FoodComponent ENCHANTED_GOLDEN_APPLE;
	@Mutable
	@Shadow @Final public static FoodComponent GOLDEN_CARROT;

	@Mutable
	@Shadow @Final public static FoodComponent MELON_SLICE;

	@Mutable
	@Shadow @Final public static FoodComponent PORKCHOP;

	@Mutable
	@Shadow @Final public static FoodComponent SUSPICIOUS_STEW;

	@Mutable
	@Shadow @Final public static FoodComponent TROPICAL_FISH;

	@Mutable
	@Shadow @Final public static FoodComponent HONEY_BOTTLE;

	@Mutable
	@Shadow @Final public static FoodComponent SALMON;

	@Mutable
	@Shadow @Final public static FoodComponent SPIDER_EYE;

	@Mutable
	@Shadow @Final public static FoodComponent SWEET_BERRIES;

	@Mutable
	@Shadow @Final public static FoodComponent MUSHROOM_STEW;

	@Mutable
	@Shadow @Final public static FoodComponent POISONOUS_POTATO;

	@Mutable
	@Shadow @Final public static FoodComponent PUFFERFISH;
	@Mutable
	@Shadow @Final public static FoodComponent RABBIT_STEW;

	@Mutable
	@Shadow @Final public static FoodComponent ROTTEN_FLESH;

	@Mutable
	@Shadow @Final public static FoodComponent GLOW_BERRIES;

	@Mutable
	@Shadow @Final public static FoodComponent POTATO;

	@Mutable
	@Shadow @Final public static FoodComponent PUMPKIN_PIE;

	@Mutable
	@Shadow @Final public static FoodComponent MUTTON;
	@Mutable
	@Shadow @Final public static FoodComponent DRIED_KELP;

	@Mutable
	@Shadow @Final public static FoodComponent GOLDEN_APPLE;

	@Mutable
	@Shadow @Final public static FoodComponent RABBIT;

	/**
	 * @author
	 */
	@Overwrite
	private static Builder create(int hunger) {
		return (new Builder()).hunger(hunger).saturationModifier(0.6F);
	}

	static {
		CHICKEN = (new Builder()).hunger(2).saturationModifier(0.3F).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.3F).meat().build();
		CHORUS_FRUIT = (new Builder()).hunger(4).saturationModifier(0.3F).alwaysEdible().build();
		COD = (new Builder()).hunger(2).saturationModifier(0.1F).build();
		COOKED_BEEF = (new Builder()).hunger(8).saturationModifier(0.8F).meat().build();
		COOKED_CHICKEN = (new Builder()).hunger(6).saturationModifier(0.6F).meat().build();
		COOKED_COD = (new Builder()).hunger(5).saturationModifier(0.6F).build();
		COOKED_MUTTON = (new Builder()).hunger(6).saturationModifier(0.8F).meat().build();
		COOKED_PORKCHOP = (new Builder()).hunger(8).saturationModifier(0.8F).meat().build();
		COOKED_RABBIT = (new Builder()).hunger(5).saturationModifier(0.6F).meat().build();
		COOKED_SALMON = (new Builder()).hunger(6).saturationModifier(0.8F).build();
		COOKIE = (new Builder()).hunger(2).saturationModifier(0.1F).build();
		DRIED_KELP = (new Builder()).hunger(1).saturationModifier(0.3F).snack().build();
		ENCHANTED_GOLDEN_APPLE = (new Builder()).hunger(4).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 3), 1.0F).alwaysEdible().build();
		GOLDEN_APPLE = (new Builder()).hunger(4).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0F).alwaysEdible().build();
		GOLDEN_CARROT = (new Builder()).hunger(6).saturationModifier(1.2F).build();
		HONEY_BOTTLE = (new Builder()).hunger(6).saturationModifier(0.1F).build();
		MELON_SLICE = (new Builder()).hunger(2).saturationModifier(0.3F).build();
		MUSHROOM_STEW = create(6).build();
		MUTTON = (new Builder()).hunger(2).saturationModifier(0.3F).meat().build();
		POISONOUS_POTATO = (new Builder()).hunger(2).saturationModifier(0.3F).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 0), 0.6F).build();
		PORKCHOP = (new Builder()).hunger(3).saturationModifier(0.3F).meat().build();
		POTATO = (new Builder()).hunger(1).saturationModifier(0.3F).build();
		PUFFERFISH = (new Builder()).hunger(1).saturationModifier(0.1F).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 1200, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 300, 2), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 0), 1.0F).build();
		PUMPKIN_PIE = (new Builder()).hunger(8).saturationModifier(0.3F).build();
		RABBIT = (new Builder()).hunger(3).saturationModifier(0.3F).meat().build();
		RABBIT_STEW = create(10).build();
		ROTTEN_FLESH = (new Builder()).hunger(4).saturationModifier(0.1F).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.8F).meat().build();
		SALMON = (new Builder()).hunger(2).saturationModifier(0.1F).build();
		SPIDER_EYE = (new Builder()).hunger(2).saturationModifier(0.8F).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 0), 1.0F).build();
		SUSPICIOUS_STEW = create(6).alwaysEdible().build();
		SWEET_BERRIES = (new Builder()).hunger(2).saturationModifier(0.1F).build();
		GLOW_BERRIES = (new Builder()).hunger(2).saturationModifier(0.1F).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 1200, 1), 1.0F).build();
		TROPICAL_FISH = (new Builder()).hunger(1).saturationModifier(0.1F).build();
	}
}