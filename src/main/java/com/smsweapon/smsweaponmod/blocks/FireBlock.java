package com.smsweapon.smsweaponmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class FireBlock extends Block {

    public FireBlock(){
        super(Material.iron);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockName("fireBlock");
        this.setBlockTextureName("smsweaponmod:fireBlock");
        setHardness(5.0f);  //方块硬度
        setResistance(10.0f);   //对爆炸抗性
        setLightLevel(2.0f);    //发光亮度
        setHarvestLevel("pickaxe", 2);  //采集所需工具及其材质
        setStepSound(Block.soundTypeStone);  //踏步音效
    }
}
