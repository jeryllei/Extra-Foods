package com.dyrnwyn.skewersreborn.util;

import com.dyrnwyn.skewersreborn.SkewersReborn;
import com.dyrnwyn.skewersreborn.items.*;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SkewersReborn.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    public static final RegistryObject<Caramel> CARAMEL = ITEMS.register("caramel", Caramel::new);
    public static final RegistryObject<ChocolateBar> CHOCOLATE_BAR = ITEMS.register("chocolate_bar", ChocolateBar::new);
    public static final RegistryObject<Waffle> WAFFLE = ITEMS.register("waffle", Waffle::new);
    public static final RegistryObject<ChocolateChipWaffle> CHOCOLATE_CHIP_WAFFLE = ITEMS.register("chocolate_chip_waffle", ChocolateChipWaffle::new);
    public static final RegistryObject<ApplePie> APPLE_PIE = ITEMS.register("apple_pie", ApplePie::new);
    public static final RegistryObject<DiamondEncrustedApple> DIAMOND_APPLE = ITEMS.register("enchanted_diamond_apple", DiamondEncrustedApple::new);
    public static final RegistryObject<CookedEgg> COOKED_EGG = ITEMS.register("cooked_egg", CookedEgg::new);
    public static final RegistryObject<FruitJello> FRUIT_JELLO = ITEMS.register("fruit_jello", FruitJello::new);
    public static final RegistryObject<CandiedChorusFruit> CANDIED_CHORUS_FRUIT = ITEMS.register("candied_chorus_fruit", CandiedChorusFruit::new);
    public static final RegistryObject<HoneyGlazedPork> HONEY_GLAZED_PORK = ITEMS.register("honey_glazed_pork", HoneyGlazedPork::new);

    public static final RegistryObject<Jam> JAM = ITEMS.register("jam", Jam::new);
    public static final RegistryObject<JamOnBread> JAM_ON_BREAD = ITEMS.register("jam_on_bread", JamOnBread::new);

    public static final RegistryObject<NormalSkewer> CARAMEL_APPLE = ITEMS.register("caramel_apple", () ->
            new NormalSkewer(12, 0.4F));
    public static final RegistryObject<NormalSkewer> COOKIE_SKEWER = ITEMS.register("cookie_skewer", () ->
            new NormalSkewer(6, 0.7F));
    public static final RegistryObject<NormalSkewer> WAFFLE_SKEWER = ITEMS.register("waffle_skewer", () ->
            new NormalSkewer(15, 0.3F));
    public static final RegistryObject<NormalSkewer> CHOCOLATE_CHIP_WAFFLE_SKEWER = ITEMS.register("chocolate_chip_waffle_skewer",
            () -> new NormalSkewer(18, 0.6F));
    public static final RegistryObject<FishStew> FISH_STEW = ITEMS.register("fish_stew", FishStew::new);

    // Cooked Skewers
    public static final RegistryObject<NormalMeatSkewer> COOKED_SALMON_SKEWER = ITEMS.register("cooked_salmon_skewer", () ->
            new NormalMeatSkewer(18, 0.6F));
    public static final RegistryObject<NormalMeatSkewer> COOKED_COD_SKEWER = ITEMS.register("cooked_cod_skewer", () ->
            new NormalMeatSkewer(18, 0.6F));
    public static final RegistryObject<PremiumSkewer> COOKED_PORKCHOP_SKEWER = ITEMS.register("cooked_porkchop_skewer", PremiumSkewer::new);
    public static final RegistryObject<PremiumSkewer> STEAK_SKEWER = ITEMS.register("steak_skewer", PremiumSkewer::new);
    public static final RegistryObject<NormalSkewer> ROASTED_VEGGIE_SKEWER = ITEMS.register("roasted_veggie_skewer", () ->
            new NormalSkewer(9, 1.0F));
    public static final RegistryObject<NormalMeatSkewer> COOKED_CHICKEN_SKEWER = ITEMS.register("cooked_chicken_skewer", () ->
            new NormalMeatSkewer(18, 0.8F));
    public static final RegistryObject<NormalMeatSkewer> COOKED_RABBIT_SKEWER = ITEMS.register("cooked_rabbit_skewer", () ->
            new NormalMeatSkewer(17, 0.6F));
    public static final RegistryObject<NormalMeatSkewer> COOKED_MUTTON_SKEWER = ITEMS.register("cooked_mutton_skewer", () ->
            new NormalMeatSkewer(18, 0.8F));

    // Raw Skewers
    public static final RegistryObject<NormalMeatSkewer> RAW_SALMON_SKEWER = ITEMS.register("raw_salmon_skewer", () ->
            new NormalMeatSkewer(6, 0.6F));
    public static final RegistryObject<NormalMeatSkewer> RAW_COD_SKEWER = ITEMS.register("raw_cod_skewer", () ->
            new NormalMeatSkewer(6, 0.6F));
    public static final RegistryObject<NormalMeatSkewer> RAW_PORKCHOP_SKEWER = ITEMS.register("raw_porkchop_skewer", () ->
            new NormalMeatSkewer(8, 0.6F));
    public static final RegistryObject<NormalMeatSkewer> RAW_BEEF_SKEWER = ITEMS.register("raw_beef_skewer", () ->
            new NormalMeatSkewer(8, 0.6F));
    public static final RegistryObject<NormalSkewer> VEGGIE_SKEWER = ITEMS.register("veggie_skewer", () ->
            new NormalSkewer(3, 0.6F));
    public static final RegistryObject<NormalMeatSkewer> RAW_CHICKEN_SKEWER = ITEMS.register("raw_chicken_skewer", () ->
            new NormalMeatSkewer(6, 0.5F));
    public static final RegistryObject<NormalMeatSkewer> RAW_RABBIT_SKEWER = ITEMS.register("raw_rabbit_skewer", () ->
            new NormalMeatSkewer(5, 0.5F));
    public static final RegistryObject<NormalMeatSkewer> RAW_MUTTON_SKEWER = ITEMS.register("raw_mutton_skewer", () ->
            new NormalMeatSkewer(6, 0.5F));


}
