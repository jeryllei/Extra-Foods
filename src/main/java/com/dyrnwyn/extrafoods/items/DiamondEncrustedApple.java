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

public class DiamondEncrustedApple extends Item {
    public DiamondEncrustedApple() {
        super(new Item.Properties()
                .group(ExtraFoods.TAB)
                .food(new Food.Builder()
                        .hunger(20)
                        .saturation(1.5F)
                        .setAlwaysEdible()
                        .effect(new EffectInstance(Effects.HASTE, 12000, 1), 1.0F)
                        .effect(new EffectInstance(Effects.ABSORPTION, 12000, 5), 1.0F)
                        .effect(new EffectInstance(Effects.REGENERATION, 4800, 2), 1.0F)
                        .effect(new EffectInstance(Effects.STRENGTH, 12000, 2), 1.0F)
                        .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 12000, 0), 1.0F)
                        .effect(new EffectInstance(Effects.RESISTANCE, 12000, 2), 1.0F)
                        .build())
        );
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new StringTextComponent("\u00A7b" + "Eat the rich!" + "\u00A7b"));
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
