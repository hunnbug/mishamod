package net.hunnbug.mishamod.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;


public class mishaboomprojectile extends ThrowableItemProjectile {
    public mishaboomprojectile(EntityType<? extends ThrowableItemProjectile> entityType, Level level) {
        super(entityType, level);
    }

    public mishaboomprojectile(Level level) {
        super(, level);
    }

    public mishaboomprojectile(Level level, LivingEntity livingEntity) {
        super(, livingEntity, level);
    }



    @Override
    protected Item getDefaultItem() {
        return null;
    }

    @Override
    protected void onHitBlock(BlockHitResult res) {
        if(!this.level.isClientSide()){
            this.level.broadcastEntityEvent(this, (byte)3);
            this.level.explode(this, this.getX(), this.getY(), this.getZ(), 15.0F, Explosion.BlockInteraction.BREAK);
        }

        super.onHitBlock(res);
    }
}
