package com.mclearning.learningMod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MyItem extends Item {

    public MyItem(){
        super();
        this.setUnlocalizedName("firstItem");
        this.setTextureName("mymod:firstItem");
        this.setCreativeTab(CreativeTabs.tabMisc);
    }
}
