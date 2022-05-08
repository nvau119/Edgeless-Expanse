
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.edgesoflight.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.edgesoflight.block.TitaniumOreBlock;
import net.mcreator.edgesoflight.EdgesOfLightMod;

public class EdgesOfLightModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EdgesOfLightMod.MODID);
	public static final RegistryObject<Block> TITANIUM_ORE = REGISTRY.register("titanium_ore", () -> new TitaniumOreBlock());
}
