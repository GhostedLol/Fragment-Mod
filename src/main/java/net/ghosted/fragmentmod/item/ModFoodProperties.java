package net.ghosted.fragmentmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties HASTER = new FoodProperties.Builder().nutrition(100).saturationMod(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 7200000), 1f).build();

}
