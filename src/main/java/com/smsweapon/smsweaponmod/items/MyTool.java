package com.mclearning.learningMod.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemTool;

import java.util.HashSet;
import java.util.Set;

public class MyTool extends ItemTool {

    public MyTool() {
        super(100f, ToolMaterial.IRON, new HashSet());
        this.setHarvestLevel("pickaxe",4);
        this.setMaxDamage(0);
        this.setCreativeTab(CreativeTabs.tabTools);
        this.setTextureName("mymod:firstTool");
        this.setUnlocalizedName("firstTool");
    }

}
