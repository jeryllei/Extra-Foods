package com.dyrnwyn.skewersreborn.items;

import com.dyrnwyn.skewersreborn.SkewersReborn;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class FruitJello extends Item {
    public FruitJello() {
        super(new Item.Properties()
                .group(SkewersReborn.TAB)
                .food(new Food.Builder()
                        .hunger(6)
                        .saturation(0.4F)
                        .fastToEat()
                        .build())

        );
    }
}
