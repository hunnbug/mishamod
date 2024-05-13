package net.hunnbug.mishamod.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class mishaboomitem extends Item {
    public mishaboomitem(Properties p_41383_) { super(p_41383_);}

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        ItemStack itemstack = player.getItemInHand(interactionHand);
        player.getCooldowns().addCooldown(this, 20);

        if(!level.isClientSide){

        }

        if(!player.getAbilities().instabuild){
            itemstack.shrink(1);
        }
        return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide);
    }
}
