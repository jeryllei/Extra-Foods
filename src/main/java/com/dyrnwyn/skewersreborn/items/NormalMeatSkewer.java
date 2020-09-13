package com.dyrnwyn.skewersreborn.items;

import com.dyrnwyn.skewersreborn.SkewersReborn;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class NormalMeatSkewer extends Item {
    public NormalMeatSkewer(int hung, float sat) {
        super(new Item.Properties()
                .group(SkewersReborn.TAB)
                .food(new Food.Builder()
                        .hunger(hung)
                        .saturation(sat)
                        .meat()
                        .build())
        );
    }
}
