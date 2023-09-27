package net.ghosted.fragmentmod.datagen;

import net.ghosted.fragmentmod.FragmentMod;
import net.ghosted.fragmentmod.block.ModBlocks;
import net.ghosted.fragmentmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, FragmentMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.STAREECH_ORE.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.STAREECH_BLOCK.get(),
                        ModBlocks.STAREECH_ORE.get());

        this.tag(ModTags.Blocks.NEEDS_STAREECH_TOOL)
                .add(ModBlocks.STAREECH_BLOCK.get());
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
