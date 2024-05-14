package net.hunnbug.mishamod.entity;

import net.hunnbug.mishamod.mishamod;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.hunnbug.mishamod.entity.custom.mishaboomprojectile;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>>  ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, mishamod.MOD_ID);


    public static final RegistryObject<EntityType<mishaboomprojectile>> MISHA_PROJECTILE
            = ENTITY_TYPES.register("misha_projectile", () -> EntityType.Builder.<mishaboomprojectile>of(mishaboomprojectile::new, MobCategory.MISC)
            .sized(0.5f, 0.5f).build("misha_projectile"));



    public static void register(IEventBus eventBus) { ENTITY_TYPES.register(eventBus); }
}
