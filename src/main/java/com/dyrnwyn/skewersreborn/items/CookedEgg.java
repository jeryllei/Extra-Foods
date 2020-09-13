package com.dyrnwyn.skewersreborn.items;

import com.dyrnwyn.skewersreborn.SkewersReborn;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class CookedEgg extends Item {

    public CookedEgg() {
        super(new Item.Properties()
                .group(SkewersReborn.TAB)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(1.1F)
                        .fastToEat()
                        .build())

        );
    }
}
