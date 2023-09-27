package net.ghosted.fragmentmod.datagen.loot;

import net.ghosted.fragmentmod.block.ModBlocks;
import net.ghosted.fragmentmod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.STAREECH_BLOCK.get());

        this.add(ModBlocks.STAREECH_ORE.get(),
                block -> createOreDrop(ModBlocks.STAREECH_ORE.get(), ModItems.STAREECH_DUST.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}