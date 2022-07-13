package com.unnamedfudo.outfitmod.item;

import com.unnamedfudo.outfitmod.OutritMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;


import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;
public class ItemHat extends ArmorItem {

    private int modelIndex;
    private String name;

    public ItemHat(String name, int modelIndex) {
        super(ModArmorMaterial.HATS, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_MISC));
        this.
        //this.set   (OutritMod.MODID, name);
        this.modelIndex = modelIndex;
        this.name = name;
    }
}
