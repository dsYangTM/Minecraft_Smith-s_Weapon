package com.smsweapon.smsweaponmod;


import com.smsweapon.smsweaponmod.blocks.FireBlock;
import com.smsweapon.smsweaponmod.items.materials.impl.FireDust;
import com.smsweapon.smsweaponmod.items.moulds.impl.SwordMould;
import com.smsweapon.smsweaponmod.items.weapons.impl.FireSword;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

@Mod(modid = "smsweaponmod", name = "Smith's Weapon", version = "1.0.0")
public class SmithsWeapon {

    private static final String MODID = "smsweaponmod";
    public static FireBlock fireBlock;
    public static FireDust fireDust;
    public static SwordMould swordMould;
    public static FireSword fireSword;

    @Mod.EventHandler
    public void preLoad(FMLPreInitializationEvent event) {

        fireBlock = new FireBlock();
        fireDust = new FireDust();
        swordMould = new SwordMould();
        fireSword = new FireSword();

        GameRegistry.registerBlock(fireBlock,fireBlock.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(fireDust, fireDust.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(swordMould,swordMould.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(fireSword,fireSword.getUnlocalizedName().substring(5));

        GameRegistry.addSmelting(fireBlock, new ItemStack(fireDust, 1), 50f);     //冶炼公式
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postLoad(FMLPostInitializationEvent event) {

    }
}
