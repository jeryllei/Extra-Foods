package com.dyrnwyn.extrafoods.items;

import com.dyrnwyn.extrafoods.ExtraFoods;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class JamOnBread extends Item {
    public JamOnBread() {
        super(new Item.Properties()
                .group(ExtraFoods.TAB)
                .food(new Food.Builder()
                        .hunger(9)
                        .saturation(0.7F)
                        .build())
        );
    }
}
