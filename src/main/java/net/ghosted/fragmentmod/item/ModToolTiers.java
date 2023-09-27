package net.ghosted.fragmentmod.item;

import net.ghosted.fragmentmod.FragmentMod;
import net.ghosted.fragmentmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier STAREECH = TierSortingRegistry.registerTier(
            new ForgeTier(5, 500, 15f, 2f, 30,
                    ModTags.Blocks.NEEDS_STAREECH_TOOL, () -> Ingredient.of(ModItems.STAREECH.get())),
            new ResourceLocation(FragmentMod.MOD_ID, "stareech"), List.of(Tiers.NETHERITE), List.of());
}
