package net.hunnbug.mishamod.item;

import net.hunnbug.mishamod.item.custom.mishaboomitem;
import net.hunnbug.mishamod.mishamod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, mishamod.MOD_ID);

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }

    public static final RegistryObject<Item> MISHAYEBAT
            = ITEMS.register("misha", () -> new mishaboomitem(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(16)));
}
