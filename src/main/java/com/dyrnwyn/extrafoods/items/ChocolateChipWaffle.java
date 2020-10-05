package com.dyrnwyn.extrafoods.items;

import com.dyrnwyn.extrafoods.ExtraFoods;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class ChocolateChipWaffle extends Item {
    public ChocolateChipWaffle() {
        super(new Item.Properties()
                .group(ExtraFoods.TAB)
                .food(new Food.Builder()
                        .hunger(8)
                        .saturation(0.6F)
                        .build())
        );
    }
}
