package net.roz.rozscurrency.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.roz.rozscurrency.RozsCurrency;

public class ModItems {
    public static final Item COPPER_COIN = registerItem("copper_coin", new Item(new Item.Settings()));
    public static final Item IRON_COIN = registerItem("iron_coin", new Item(new Item.Settings()));
    public static final Item GOLD_COIN = registerItem("gold_coin", new Item(new Item.Settings()));
    public static final Item EMERALD_COIN = registerItem("emerald_coin", new Item(new Item.Settings()));
    public static final Item DIAMOND_COIN = registerItem("diamond_coin", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RozsCurrency.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RozsCurrency.LOGGER.info("Registering items for" + RozsCurrency.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(COPPER_COIN);
            entries.add(IRON_COIN);
            entries.add(GOLD_COIN);
            entries.add(EMERALD_COIN);
            entries.add(DIAMOND_COIN);
        });
    }
}
