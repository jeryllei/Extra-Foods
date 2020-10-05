package com.dyrnwyn.extrafoods.items;

import com.dyrnwyn.extrafoods.ExtraFoods;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class CandiedChorusFruit extends Item {
    public CandiedChorusFruit() {
        super(new Item.Properties()
                .group(ExtraFoods.TAB)
                .food(new Food.Builder()
                        .hunger(7)
                        .saturation(0.5F)
                        .setAlwaysEdible()
                        .effect(new EffectInstance(Effects.JUMP_BOOST, 2400, 2), 1.0F)
                        .effect(new EffectInstance(Effects.SLOW_FALLING, 2400, 0), 1.0F)
                        .build())

        );
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new StringTextComponent("\u00A75" + "Jump to new heights!" + "\u00A75"));
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
