package com.smsweapon.smsweaponmod.items.materials.impl;

import com.smsweapon.smsweaponmod.SmithsWeapon;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class FireDust extends Item{

    public FireDust (){
        super();
        this.setUnlocalizedName("fireDust");
        this.setTextureName("smsweaponmod:fireDust");
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }
}
