package com.dyrnwyn.skewersreborn.items;

import com.dyrnwyn.skewersreborn.SkewersReborn;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class ChocolateChipWaffle extends Item {
    public ChocolateChipWaffle() {
        super(new Item.Properties()
                .group(SkewersReborn.TAB)
                .food(new Food.Builder()
                        .hunger(8)
                        .saturation(0.6F)
                        .build())
        );
    }
}
