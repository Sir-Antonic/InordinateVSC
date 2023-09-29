package com.antonic.inordinate;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.antonic.inordinate.item.ModItems;

public class InordinateMod implements ModInitializer {
	public static final String MOD_ID = "inordinate";
	public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}