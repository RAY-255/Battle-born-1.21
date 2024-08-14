package net.rays.battle_born.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rays.battle_born.BattleBorn;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BattleBorn.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BattleBorn.LOGGER.info("Registering Mod Items for" + BattleBorn.MOD_ID);
    }
}
