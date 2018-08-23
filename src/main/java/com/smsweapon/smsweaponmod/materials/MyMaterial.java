package com.mclearning.learningMod.materials;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

    /*
    Material类的构造函数的参数是一个MapColor,它是指在游戏内置的物品地图中此砖块显示的颜色.
    Material在创建时的参数方法包括:
    setTranslucent 使其可透过光
    setRequiresTool 需要有正确的工具才会有掉落
    setBurning 可以被点燃
    setReplaceable 让这个砖块可以被其他砖块直接取代,比如雪,你直接往雪上盖个砖块就会自动把雪覆盖消失.
    setNoPushMobility 让这个砖块无法被活塞推动,活塞的塞子会直接穿过它.
    setImmovableMobility 让这个砖块无法被活塞推动,并且会挡住活塞的塞子.
    setAdventureModeExempt 让砖块无节操化,可以被玩家用任意东西破坏,成为可以被任何人用任何东西推倒的街角自行车,妖の惨劇に濡れて...

    此外,除了Material类以外,还有几个派生自Material的类:
    MaterialLogic 没有碰撞体积的砖块,不会影响它的正下方的草,可以被玩家用任意物品破坏.
    MaterialLiquid 液体
    MaterialPortal 传送门的材质
    MaterialWeb 蜘蛛网的材质
    MaterialTransparent 火的材质
    */

public class MyMaterial extends Material{

    public MyMaterial() {
        super(MapColor.clayColor);
        setRequiresTool();
    }
}
