package net.hunnbug.mishamod.world.entity.projectile;

import net.hunnbug.mishamod.item.ModItems;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import net.minecraft.server.level.ServerPlayer;

public class thrownmisha extends ThrowableItemProjectile {
    public thrownmisha(EntityType<? extends thrownmisha> type, Level level) { super(type, level); }

    public thrownmisha(Level level, LivingEntity shooter) { super(EntityType.EGG, level); }

    protected Item getDefaultItem() {
        return null;
    }
    private Level level() {
        return this.level();
    }

    protected void onHit(HitResult result) {
        super.onHit(result);

        for(int i = 0;i < 32; ++i) {
            this.level().addParticle(ParticleTypes.EXPLOSION, this.getX(), this.getY() + this.random.nextDouble() * 2.0D, this.getZ(), this.random.nextGaussian(), 0.0D, this.random.nextGaussian());
       }

    }
}
