package com.dyrnwyn.skewersreborn.items;

import com.dyrnwyn.skewersreborn.SkewersReborn;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class PremiumSkewer extends Item {
    public PremiumSkewer() {
        super(new Item.Properties()
            .group(SkewersReborn.TAB)
            .food(new Food.Builder()
                    .hunger(24)
                    .saturation(0.9F)
                    .effect(new EffectInstance(Effects.REGENERATION, 60, 0), 1.0F)
                    .meat()
                    .build()
            )
        );
    }
}
