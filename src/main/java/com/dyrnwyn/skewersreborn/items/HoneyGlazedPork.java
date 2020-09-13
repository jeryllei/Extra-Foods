package com.dyrnwyn.skewersreborn.items;

import com.dyrnwyn.skewersreborn.SkewersReborn;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class HoneyGlazedPork extends Item {
    public HoneyGlazedPork() {
        super(new Item.Properties()
                .group(SkewersReborn.TAB)
                .food(new Food.Builder()
                        .hunger(15)
                        .saturation(1.5F)
                        .effect(new EffectInstance(Effects.REGENERATION, 200, 0), 1.0F)
                        .meat()
                        .build())

        );
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
