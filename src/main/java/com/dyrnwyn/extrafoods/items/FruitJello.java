package com.dyrnwyn.extrafoods.items;

import com.dyrnwyn.extrafoods.ExtraFoods;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class FruitJello extends Item {
    public FruitJello() {
        super(new Item.Properties()
                .group(ExtraFoods.TAB)
                .food(new Food.Builder()
                        .hunger(6)
                        .saturation(0.4F)
                        .fastToEat()
                        .build())

        );
    }
}
