package com.mclearning.learningMod.blocks;

import com.mclearning.learningMod.MyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.audio.SoundList;

public class MyBlock extends Block{

    public MyBlock(){
        super(MyMod.myMaterial);
        setHardness(10.0f);  //方块硬度
        setResistance(10.0f);   //对爆炸抗性
        setLightLevel(3.0f);    //发光亮度
        setHarvestLevel("pickaxe", 4);  //采集所需工具及其材质
        setStepSound(Block.soundTypeWood);  //踏步音效
        setBlockName("firstBlock");  //方块名字

    }

}
