
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.edgesoflight.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.edgesoflight.item.TitaniumItem;
import net.mcreator.edgesoflight.item.RoughTopazGemstoneItem;
import net.mcreator.edgesoflight.item.RoughSapphireGemstoneItem;
import net.mcreator.edgesoflight.item.RoughRubyGemstoneItem;
import net.mcreator.edgesoflight.item.RoughJasperGemstoneItem;
import net.mcreator.edgesoflight.item.RoughJadeGemstoneItem;
import net.mcreator.edgesoflight.item.RoughAmethystGemstoneItem;
import net.mcreator.edgesoflight.item.RoughAmberGemstoneItem;
import net.mcreator.edgesoflight.item.MercenaryItem;
import net.mcreator.edgesoflight.item.MercenaryAxeItem;
import net.mcreator.edgesoflight.item.FlawedAmethystGemstoneItem;
import net.mcreator.edgesoflight.item.FlawedAmberGemstoneItem;
import net.mcreator.edgesoflight.EdgesOfLightMod;

public class EdgesOfLightModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EdgesOfLightMod.MODID);
	public static final RegistryObject<Item> ROUGH_AMBER_GEMSTONE = REGISTRY.register("rough_amber_gemstone", () -> new RoughAmberGemstoneItem());
	public static final RegistryObject<Item> ROUGH_AMETHYST_GEMSTONE = REGISTRY.register("rough_amethyst_gemstone",
			() -> new RoughAmethystGemstoneItem());
	public static final RegistryObject<Item> ROUGH_JADE_GEMSTONE = REGISTRY.register("rough_jade_gemstone", () -> new RoughJadeGemstoneItem());
	public static final RegistryObject<Item> ROUGH_JASPER_GEMSTONE = REGISTRY.register("rough_jasper_gemstone", () -> new RoughJasperGemstoneItem());
	public static final RegistryObject<Item> ROUGH_RUBY_GEMSTONE = REGISTRY.register("rough_ruby_gemstone", () -> new RoughRubyGemstoneItem());
	public static final RegistryObject<Item> ROUGH_SAPPHIRE_GEMSTONE = REGISTRY.register("rough_sapphire_gemstone",
			() -> new RoughSapphireGemstoneItem());
	public static final RegistryObject<Item> ROUGH_TOPAZ_GEMSTONE = REGISTRY.register("rough_topaz_gemstone", () -> new RoughTopazGemstoneItem());
	public static final RegistryObject<Item> MERCENARY_HELMET = REGISTRY.register("mercenary_helmet", () -> new MercenaryItem.Helmet());
	public static final RegistryObject<Item> MERCENARY_CHESTPLATE = REGISTRY.register("mercenary_chestplate", () -> new MercenaryItem.Chestplate());
	public static final RegistryObject<Item> MERCENARY_LEGGINGS = REGISTRY.register("mercenary_leggings", () -> new MercenaryItem.Leggings());
	public static final RegistryObject<Item> MERCENARY_BOOTS = REGISTRY.register("mercenary_boots", () -> new MercenaryItem.Boots());
	public static final RegistryObject<Item> MERCENARY_AXE = REGISTRY.register("mercenary_axe", () -> new MercenaryAxeItem());
	public static final RegistryObject<Item> TITANIUM = REGISTRY.register("titanium", () -> new TitaniumItem());
	public static final RegistryObject<Item> TITANIUM_ORE = block(EdgesOfLightModBlocks.TITANIUM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FLAWED_AMBER_GEMSTONE = REGISTRY.register("flawed_amber_gemstone", () -> new FlawedAmberGemstoneItem());
	public static final RegistryObject<Item> FLAWED_AMETHYST_GEMSTONE = REGISTRY.register("flawed_amethyst_gemstone",
			() -> new FlawedAmethystGemstoneItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
