package com.unnamedfudo.outfitmod.item;


import com.unnamedfudo.outfitmod.OutritMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterial  implements ArmorMaterial {

    HATS("hats", 5, new int[]{1, 1, 1, 1}, 15, SoundEvents.COMPOSTER_READY, 1.0F, 0.1F, () -> {
        return Ingredient.of(Items.WHEAT);
    });

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private ModArmorMaterial(String ArmorName, int ArmorDur, int[] slotProtect, int enchValue, SoundEvent ArmorSound, float ArmorToughness, float knockbackRes, Supplier<Ingredient> repairIng) {
        this.name = ArmorName;
        this.durabilityMultiplier = ArmorDur;
        this.slotProtections = slotProtect;
        this.enchantmentValue = enchValue;
        this.sound = ArmorSound;
        this.toughness = ArmorToughness;
        this.knockbackResistance = knockbackRes;
        this.repairIngredient = new LazyLoadedValue<>(repairIng);
    }

    public int getDurabilityForSlot(EquipmentSlot p_40484_) {
        return HEALTH_PER_SLOT[p_40484_.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot p_40487_) {
        return this.slotProtections[p_40487_.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return OutritMod.MODID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
