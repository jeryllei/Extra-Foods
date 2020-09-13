package com.dyrnwyn.skewersreborn.items;

import com.dyrnwyn.skewersreborn.SkewersReborn;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class ChocolateBar extends Item {
    public ChocolateBar() {
        super(new Item.Properties()
                .group(SkewersReborn.TAB)
                .food(new Food.Builder()
                        .hunger(5)
                        .saturation(0.8F)
                        .build())
            );
    }
}
