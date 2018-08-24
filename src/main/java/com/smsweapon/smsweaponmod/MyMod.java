package com.smsweapon.smsweaponmod;


import com.smsweapon.smsweaponmod.blocks.MyBlock;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

@Mod(modid = "mymod", name = "MyMod", version = "1.0.0")
public class MyMod {

    private static final String MODID = "mymod";
    private static final String MYBLOCK = "firstBlock";
    public static MyBlock myBlock;
    public static com.mclearning.learningMod.items.MyItem myItem;
    public static com.mclearning.learningMod.items.MyTool myTool;
    public static com.mclearning.learningMod.items.MyWeapon myWeapon;
    public static com.mclearning.learningMod.items.MyWand myWand;
    public static Material myMaterial = new com.mclearning.learningMod.materials.MyMaterial();

    @Mod.EventHandler
    public void preLoad(FMLPreInitializationEvent event) {
        myBlock = new MyBlock();
        myBlock.setCreativeTab(CreativeTabs.tabBlock);
        myBlock.setBlockTextureName(MODID + ":" + MYBLOCK);
        GameRegistry.registerBlock(myBlock, myBlock.getUnlocalizedName().substring(5));

        myItem = new com.mclearning.learningMod.items.MyItem();
        GameRegistry.registerItem(myItem, myItem.getUnlocalizedName().substring(5));

        myTool = new com.mclearning.learningMod.items.MyTool();
        GameRegistry.registerItem(myTool, myTool.getUnlocalizedName().substring(5));

        myWeapon = new com.mclearning.learningMod.items.MyWeapon();
        GameRegistry.registerItem(myWeapon,myWeapon.getUnlocalizedName().substring(5));

        myWand = new com.mclearning.learningMod.items.MyWand();
        GameRegistry.registerItem(myWand,myWand.getUnlocalizedName().substring(5));

        GameRegistry.addSmelting(myBlock, new ItemStack(myItem, 2), 100f);     //冶炼公式


        GameRegistry.addRecipe(new ItemStack(myBlock, 1), "##",'#',myItem);
        GameRegistry.addRecipe(new ItemStack(myWeapon, 1), "#","#","X",'#',myItem,'X', Items.stick);
        GameRegistry.addRecipe(new ItemStack(myTool, 1), "###", " x ", " x ", '#', myItem, 'x', Items.stick);
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postLoad(FMLPostInitializationEvent event) {

    }
}
