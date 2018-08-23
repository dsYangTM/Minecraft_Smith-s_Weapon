package com.mclearning.learningMod.items;

import com.mclearning.learningMod.utils.PositionCaculator;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;

import java.util.HashSet;

public class MyWand extends ItemTool {
    public MyWand() {
        super(7f, ToolMaterial.EMERALD, new HashSet());
        this.setCreativeTab(CreativeTabs.tabTools);
        this.setHarvestLevel("sword", 4);
        this.setMaxDamage(0);
        this.setTextureName("mymod:myWand");
        this.setUnlocalizedName("myWand");
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
        if (!world.isRemote) {
            Double length = 2.0;
            PositionCaculator pc = new PositionCaculator(length,player.posX,player.posY,player.posZ,player.rotationYaw,player.rotationPitch);
            EntitySnowman snowman = new EntitySnowman(world);
            snowman.setPosition(pc.getPosX(),Math.ceil(pc.getPosY()),pc.getPosZ());
            world.spawnEntityInWorld(snowman);
        }
        return itemStack;
    }
}
