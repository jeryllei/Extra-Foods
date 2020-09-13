package com.dyrnwyn.skewersreborn.items;

import com.dyrnwyn.skewersreborn.SkewersReborn;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Jam extends Item {
    public Jam() {
        super(new Item.Properties()
                .group(SkewersReborn.TAB)
                .food(new Food.Builder()
                        .hunger(3)
                        .saturation(0.7F)
                        .build())
        );
    }
}
