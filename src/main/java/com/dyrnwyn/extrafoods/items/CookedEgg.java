package com.dyrnwyn.extrafoods.items;

import com.dyrnwyn.extrafoods.ExtraFoods;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class CookedEgg extends Item {

    public CookedEgg() {
        super(new Item.Properties()
                .group(ExtraFoods.TAB)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(1.1F)
                        .fastToEat()
                        .build())

        );
    }
}
