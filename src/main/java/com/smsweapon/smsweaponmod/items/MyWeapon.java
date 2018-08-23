package com.mclearning.learningMod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.MathHelper;

import java.util.HashSet;

public class MyWeapon extends ItemTool {
    public MyWeapon() {
        super(100f, Item.ToolMaterial.IRON, new HashSet());
        this.setHarvestLevel("pickaxe", 4);
        this.setMaxDamage(0);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setTextureName("mymod:firstWeapon");
        this.setUnlocalizedName("firstWeapon");
    }

    @Override
    public boolean hitEntity(ItemStack par1ItemStack,
                             EntityLivingBase par2EntityLivingBase,
                             EntityLivingBase par3EntityLivingBase) {
        if (par3EntityLivingBase.worldObj.isRemote) {
            return true;
        }
        float Angle = (par3EntityLivingBase.rotationYaw/ 180F) * 3.141593F;
        float x = 3f * -MathHelper.sin(Angle);
        float y = 1f;
        float z = 3f * MathHelper.cos(Angle);
        par2EntityLivingBase.setVelocity(x, y, z);
        return true;
    }
}
