package com.smsweapon.smsweaponmod.items.moulds;

import com.smsweapon.smsweaponmod.items.weapons.Weapon;
import net.minecraft.item.ItemStack;

public interface Mould {
    public abstract Weapon synthetic(ItemStack itemStack);
}
