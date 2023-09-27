package net.ghosted.fragmentmod.item;

import net.ghosted.fragmentmod.FragmentMod;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public  static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FragmentMod.MOD_ID);

    public static final RegistryObject<Item> STAREECH = ITEMS.register("stareech",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STAREECH_DUST = ITEMS.register("stareech_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HASTER = ITEMS.register("haster",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HASTER)));
    public static final RegistryObject<Item> STAREECH_SWORD = ITEMS.register("stareech_sword",
            () -> new SwordItem(ModToolTiers.STAREECH, 3, 6, new Item.Properties()));
    public static final RegistryObject<Item> STAREECH_PICKAXE = ITEMS.register("stareech_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STAREECH, 1, 5, new Item.Properties()));
    public static final RegistryObject<Item> STAREECH_SHOVEL = ITEMS.register("stareech_shovel",
            () -> new ShovelItem(ModToolTiers.STAREECH, 1, 5, new Item.Properties()));
    public static final RegistryObject<Item> STAREECH_AXE = ITEMS.register("stareech_axe",
            () -> new AxeItem(ModToolTiers.STAREECH, 6, 3, new Item.Properties()));
    public static final RegistryObject<Item> STAREECH_HOE = ITEMS.register("stareech_hoe",
            () -> new HoeItem(ModToolTiers.STAREECH, 1, 10, new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
