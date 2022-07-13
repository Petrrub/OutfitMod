package com.unnamedfudo.outfitmod.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class ItemHat extends ArmorItem {

    private int modelIndex;
    private String name;

    public ItemHat(String name, int modelIndex) {
        super(ModArmorMaterial.HATS, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_MISC));

        this.modelIndex = modelIndex;
        this.name = name;
    }


}
