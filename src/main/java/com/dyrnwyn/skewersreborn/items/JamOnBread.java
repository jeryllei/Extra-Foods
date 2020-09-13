package com.dyrnwyn.skewersreborn.items;

import com.dyrnwyn.skewersreborn.SkewersReborn;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class JamOnBread extends Item {
    public JamOnBread() {
        super(new Item.Properties()
                .group(SkewersReborn.TAB)
                .food(new Food.Builder()
                        .hunger(9)
                        .saturation(0.7F)
                        .build())
        );
    }
}
