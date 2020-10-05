package com.dyrnwyn.extrafoods.items;

import com.dyrnwyn.extrafoods.ExtraFoods;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class NormalSkewer extends Item {
    public NormalSkewer(int hung, float sat) {
        super(new Properties()
                .group(ExtraFoods.TAB)
                .food(new Food.Builder()
                        .hunger(hung)
                        .saturation(sat)
                        .build())
        );
    }
}
