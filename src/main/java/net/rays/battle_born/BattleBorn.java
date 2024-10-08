package net.rays.battle_born;

import net.fabricmc.api.ModInitializer;

import net.rays.battle_born.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BattleBorn implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "battle_born";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}