package com.smsweapon.smsweaponmod.items.weapons.impl;

import com.smsweapon.smsweaponmod.SmithsWeapon;
import com.smsweapon.smsweaponmod.items.moulds.Mould;
import com.smsweapon.smsweaponmod.items.moulds.impl.SwordMould;
import com.smsweapon.smsweaponmod.items.weapons.Weapon;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FireSword extends Item implements Weapon {

    private Mould mould;
    private ItemStack itemStack;

    public FireSword() {
        super();
        mould = SmithsWeapon.swordMould;
        itemStack = new ItemStack(SmithsWeapon.fireDust,1);
        this.setUnlocalizedName("fireSword");
        this.setTextureName("smsweaponmod:fireSword");
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

    public Mould getMould() {
        return mould;
    }

    public void setMould(Mould mould) {
        this.mould = mould;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    @Override
    public Mould decompose() {
        return mould;
    }
}
