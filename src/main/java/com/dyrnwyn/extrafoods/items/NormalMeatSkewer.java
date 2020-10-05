package com.dyrnwyn.extrafoods.items;

import com.dyrnwyn.extrafoods.ExtraFoods;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class NormalMeatSkewer extends Item {
    public NormalMeatSkewer(int hung, float sat) {
        super(new Item.Properties()
                .group(ExtraFoods.TAB)
                .food(new Food.Builder()
                        .hunger(hung)
                        .saturation(sat)
                        .meat()
                        .build())
        );
    }
}
