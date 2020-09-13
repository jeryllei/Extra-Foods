package com.dyrnwyn.skewersreborn.items;

import com.dyrnwyn.skewersreborn.SkewersReborn;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class NormalSkewer extends Item {
    public NormalSkewer(int hung, float sat) {
        super(new Properties()
                .group(SkewersReborn.TAB)
                .food(new Food.Builder()
                        .hunger(hung)
                        .saturation(sat)
                        .build())
        );
    }
}
