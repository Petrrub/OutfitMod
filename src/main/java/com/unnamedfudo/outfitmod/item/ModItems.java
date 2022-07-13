package com.unnamedfudo.outfitmod.item;

import com.unnamedfudo.outfitmod.OutritMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static  final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OutritMod.MODID);

 //   public static final RegistryObject<Item> STRAW_HAT = ITEMS.register("straw_hat",
  //          () -> new ArmorItem(ModArmorMaterial.STRAW, EquipmentSlot.HEAD,new  Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> STRAW_HAT = ITEMS.register("straw_hat",
            () -> new ItemHat("straw_hat", 1));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
