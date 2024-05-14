package net.hunnbug.mishamod.entity;

import net.hunnbug.mishamod.mishamod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>>  ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, mishamod.MOD_ID);


    public static void register(IEventBus eventBus) { ENTITY_TYPES.register(eventBus); }
}
