package moze_intel.projecte.gameObjs;

import moze_intel.projecte.PECore;
import moze_intel.projecte.config.ProjectEConfig;
import moze_intel.projecte.gameObjs.blocks.AlchemicalChest;
import moze_intel.projecte.gameObjs.blocks.Collector;
import moze_intel.projecte.gameObjs.blocks.Condenser;
import moze_intel.projecte.gameObjs.blocks.CondenserMK2;
import moze_intel.projecte.gameObjs.blocks.FuelBlock;
import moze_intel.projecte.gameObjs.blocks.InterdictionTorch;
import moze_intel.projecte.gameObjs.blocks.MatterBlock;
import moze_intel.projecte.gameObjs.blocks.MatterFurnace;
import moze_intel.projecte.gameObjs.blocks.NovaCataclysm;
import moze_intel.projecte.gameObjs.blocks.NovaCatalyst;
import moze_intel.projecte.gameObjs.blocks.Pedestal;
import moze_intel.projecte.gameObjs.blocks.Relay;
import moze_intel.projecte.gameObjs.blocks.TransmutationStone;
import moze_intel.projecte.gameObjs.customRecipes.RecipeShapedKleinStar;
import moze_intel.projecte.gameObjs.customRecipes.RecipeShapelessHidden;
import moze_intel.projecte.gameObjs.customRecipes.RecipesCovalenceRepair;
import moze_intel.projecte.gameObjs.entity.EntityFireProjectile;
import moze_intel.projecte.gameObjs.entity.EntityHomingArrow;
import moze_intel.projecte.gameObjs.entity.EntityLavaProjectile;
import moze_intel.projecte.gameObjs.entity.EntityLensProjectile;
import moze_intel.projecte.gameObjs.entity.EntityLootBall;
import moze_intel.projecte.gameObjs.entity.EntityMobRandomizer;
import moze_intel.projecte.gameObjs.entity.EntityNovaCataclysmPrimed;
import moze_intel.projecte.gameObjs.entity.EntityNovaCatalystPrimed;
import moze_intel.projecte.gameObjs.entity.EntitySWRGProjectile;
import moze_intel.projecte.gameObjs.entity.EntityWaterProjectile;
import moze_intel.projecte.gameObjs.items.AlchemicalBag;
import moze_intel.projecte.gameObjs.items.AlchemicalFuel;
import moze_intel.projecte.gameObjs.items.CataliticLens;
import moze_intel.projecte.gameObjs.items.CovalenceDust;
import moze_intel.projecte.gameObjs.items.DestructionCatalyst;
import moze_intel.projecte.gameObjs.items.DiviningRodHigh;
import moze_intel.projecte.gameObjs.items.DiviningRodLow;
import moze_intel.projecte.gameObjs.items.DiviningRodMedium;
import moze_intel.projecte.gameObjs.items.EvertideAmulet;
import moze_intel.projecte.gameObjs.items.GemEternalDensity;
import moze_intel.projecte.gameObjs.items.HyperkineticLens;
import moze_intel.projecte.gameObjs.items.KleinStar;
import moze_intel.projecte.gameObjs.items.Matter;
import moze_intel.projecte.gameObjs.items.MercurialEye;
import moze_intel.projecte.gameObjs.items.PEManual;
import moze_intel.projecte.gameObjs.items.PhilosophersStone;
import moze_intel.projecte.gameObjs.items.RepairTalisman;
import moze_intel.projecte.gameObjs.items.TimeWatch;
import moze_intel.projecte.gameObjs.items.Tome;
import moze_intel.projecte.gameObjs.items.TransmutationTablet;
import moze_intel.projecte.gameObjs.items.VolcaniteAmulet;
import moze_intel.projecte.gameObjs.items.armor.DMArmor;
import moze_intel.projecte.gameObjs.items.armor.GemChest;
import moze_intel.projecte.gameObjs.items.armor.GemFeet;
import moze_intel.projecte.gameObjs.items.armor.GemHelmet;
import moze_intel.projecte.gameObjs.items.armor.GemLegs;
import moze_intel.projecte.gameObjs.items.armor.RMArmor;
import moze_intel.projecte.gameObjs.items.itemBlocks.ItemAlchemyChestBlock;
import moze_intel.projecte.gameObjs.items.itemBlocks.ItemCollectorBlock;
import moze_intel.projecte.gameObjs.items.itemBlocks.ItemCondenserBlock;
import moze_intel.projecte.gameObjs.items.itemBlocks.ItemDMFurnaceBlock;
import moze_intel.projecte.gameObjs.items.itemBlocks.ItemFuelBlock;
import moze_intel.projecte.gameObjs.items.itemBlocks.ItemMatterBlock;
import moze_intel.projecte.gameObjs.items.itemBlocks.ItemRMFurnaceBlock;
import moze_intel.projecte.gameObjs.items.itemBlocks.ItemRelayBlock;
import moze_intel.projecte.gameObjs.items.itemBlocks.ItemTransmutationBlock;
import moze_intel.projecte.gameObjs.items.itemEntities.FireProjectile;
import moze_intel.projecte.gameObjs.items.itemEntities.LavaOrb;
import moze_intel.projecte.gameObjs.items.itemEntities.LensExplosive;
import moze_intel.projecte.gameObjs.items.itemEntities.LightningProjectile;
import moze_intel.projecte.gameObjs.items.itemEntities.LootBallItem;
import moze_intel.projecte.gameObjs.items.itemEntities.RandomizerProjectile;
import moze_intel.projecte.gameObjs.items.itemEntities.WaterOrb;
import moze_intel.projecte.gameObjs.items.rings.Arcana;
import moze_intel.projecte.gameObjs.items.rings.ArchangelSmite;
import moze_intel.projecte.gameObjs.items.rings.BlackHoleBand;
import moze_intel.projecte.gameObjs.items.rings.BodyStone;
import moze_intel.projecte.gameObjs.items.rings.HarvestGoddess;
import moze_intel.projecte.gameObjs.items.rings.Ignition;
import moze_intel.projecte.gameObjs.items.rings.IronBand;
import moze_intel.projecte.gameObjs.items.rings.LifeStone;
import moze_intel.projecte.gameObjs.items.rings.MindStone;
import moze_intel.projecte.gameObjs.items.rings.SWRG;
import moze_intel.projecte.gameObjs.items.rings.SoulStone;
import moze_intel.projecte.gameObjs.items.rings.VoidRing;
import moze_intel.projecte.gameObjs.items.rings.Zero;
import moze_intel.projecte.gameObjs.items.tools.DarkAxe;
import moze_intel.projecte.gameObjs.items.tools.DarkHammer;
import moze_intel.projecte.gameObjs.items.tools.DarkHoe;
import moze_intel.projecte.gameObjs.items.tools.DarkPick;
import moze_intel.projecte.gameObjs.items.tools.DarkShears;
import moze_intel.projecte.gameObjs.items.tools.DarkShovel;
import moze_intel.projecte.gameObjs.items.tools.DarkSword;
import moze_intel.projecte.gameObjs.items.tools.RedAxe;
import moze_intel.projecte.gameObjs.items.tools.RedHammer;
import moze_intel.projecte.gameObjs.items.tools.RedHoe;
import moze_intel.projecte.gameObjs.items.tools.RedKatar;
import moze_intel.projecte.gameObjs.items.tools.RedPick;
import moze_intel.projecte.gameObjs.items.tools.RedShears;
import moze_intel.projecte.gameObjs.items.tools.RedShovel;
import moze_intel.projecte.gameObjs.items.tools.RedStar;
import moze_intel.projecte.gameObjs.items.tools.RedSword;
import moze_intel.projecte.gameObjs.tiles.AlchChestTile;
import moze_intel.projecte.gameObjs.tiles.CollectorMK1Tile;
import moze_intel.projecte.gameObjs.tiles.CollectorMK2Tile;
import moze_intel.projecte.gameObjs.tiles.CollectorMK3Tile;
import moze_intel.projecte.gameObjs.tiles.CondenserMK2Tile;
import moze_intel.projecte.gameObjs.tiles.CondenserTile;
import moze_intel.projecte.gameObjs.tiles.DMFurnaceTile;
import moze_intel.projecte.gameObjs.tiles.DMPedestalTile;
import moze_intel.projecte.gameObjs.tiles.InterdictionTile;
import moze_intel.projecte.gameObjs.tiles.RMFurnaceTile;
import moze_intel.projecte.gameObjs.tiles.RelayMK1Tile;
import moze_intel.projecte.gameObjs.tiles.RelayMK2Tile;
import moze_intel.projecte.gameObjs.tiles.RelayMK3Tile;
import moze_intel.projecte.utils.Constants;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.RecipeSorter;
import net.minecraftforge.oredict.RecipeSorter.Category;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import java.util.Map.Entry;

public class ObjHandler
{
	public static final CreativeTabs cTab = new CreativeTab();
	public static Block alchChest = new AlchemicalChest();
	public static Block confuseTorch = new InterdictionTorch();
	public static Block transmuteStone = new TransmutationStone();
	public static Block condenser = new Condenser();
	public static Block condenserMk2 = new CondenserMK2();
	public static Block rmFurnaceOff = new MatterFurnace(false, true);
	public static Block rmFurnaceOn = new MatterFurnace(true, true);
	public static Block dmFurnaceOff = new MatterFurnace(false, false);
	public static Block dmFurnaceOn = new MatterFurnace(true, false);
	public static Block dmPedestal = new Pedestal();
	public static Block matterBlock = new MatterBlock();
	public static Block fuelBlock = new FuelBlock();
	public static Block energyCollector = new Collector(1);
	public static Block collectorMK2 = new Collector(2);
	public static Block collectorMK3 = new Collector(3);
	public static Block relay = new Relay(1);
	public static Block relayMK2 = new Relay(2);
	public static Block relayMK3 = new Relay(3);
	public static Block novaCatalyst = new NovaCatalyst();
	public static Block novaCataclysm = new NovaCataclysm();

	public static Item philosStone = new PhilosophersStone();
	public static Item alchBag = new AlchemicalBag();
	public static Item repairTalisman = new RepairTalisman();
	public static Item kleinStars = new KleinStar();
	public static Item fuels = new AlchemicalFuel();
	public static Item covalence = new CovalenceDust();
	public static Item matter = new Matter();

	public static Item dmPick = new DarkPick();
	public static Item dmAxe = new DarkAxe();
	public static Item dmShovel = new DarkShovel();
	public static Item dmSword = new DarkSword();
	public static Item dmHoe = new DarkHoe();
	public static Item dmShears = new DarkShears();
	public static Item dmHammer = new DarkHammer();

	public static Item rmPick = new RedPick();
	public static Item rmAxe = new RedAxe();
	public static Item rmShovel = new RedShovel();
	public static Item rmSword = new RedSword();
	public static Item rmHoe = new RedHoe();
	public static Item rmShears = new RedShears();
	public static Item rmHammer = new RedHammer();
	public static Item rmKatar = new RedKatar();
	public static Item rmStar = new RedStar();

	public static Item dmHelmet = new DMArmor(EntityEquipmentSlot.HEAD);
	public static Item dmChest = new DMArmor(EntityEquipmentSlot.CHEST);
	public static Item dmLegs = new DMArmor(EntityEquipmentSlot.LEGS);
	public static Item dmFeet = new DMArmor(EntityEquipmentSlot.FEET);

	public static Item rmHelmet = new RMArmor(EntityEquipmentSlot.HEAD);
	public static Item rmChest = new RMArmor(EntityEquipmentSlot.CHEST);
	public static Item rmLegs = new RMArmor(EntityEquipmentSlot.LEGS);
	public static Item rmFeet = new RMArmor(EntityEquipmentSlot.FEET);

	public static Item gemHelmet = new GemHelmet();
	public static Item gemChest = new GemChest();
	public static Item gemLegs = new GemLegs();
	public static Item gemFeet = new GemFeet();

	public static Item ironBand = new IronBand();
	public static Item blackHole = new BlackHoleBand();
	public static Item angelSmite = new ArchangelSmite();
	public static Item harvestGod = new HarvestGoddess();
	public static Item ignition = new Ignition();
	public static Item zero = new Zero();
	public static Item swrg = new SWRG();
	public static Item timeWatch = new TimeWatch();
	public static Item everTide = new EvertideAmulet();
	public static Item volcanite = new VolcaniteAmulet();
	public static Item eternalDensity = new GemEternalDensity();
	public static Item dRod1 = new DiviningRodLow();
	public static Item dRod2 = new DiviningRodMedium();
	public static Item dRod3 = new DiviningRodHigh();
	public static Item mercEye = new MercurialEye();
	public static Item voidRing = new VoidRing();
	public static Item arcana = new Arcana();

	public static Item dCatalyst = new DestructionCatalyst();
	public static Item hyperLens = new HyperkineticLens();
	public static Item cataliticLens = new CataliticLens();

	public static Item bodyStone = new BodyStone();
	public static Item soulStone = new SoulStone();
	public static Item mindStone = new MindStone();
	public static Item lifeStone = new LifeStone();

	public static Item tome = new Tome();

	public static Item waterOrb = new WaterOrb();
	public static Item lavaOrb = new LavaOrb();
	public static Item lootBall = new LootBallItem();
	public static Item mobRandomizer = new RandomizerProjectile();
	public static Item lensExplosive = new LensExplosive();
	public static Item fireProjectile = new FireProjectile();
	public static Item windProjectile = new LightningProjectile();
	public static Item transmutationTablet = new TransmutationTablet();
	public static Item manual = new PEManual();

	public static void register()
	{
		// Blocks without special ItemBlock
		registerBlockWithItem(confuseTorch, "interdiction_torch");
		registerBlockWithItem(condenserMk2, "condenser_mk2");
		registerBlockWithItem(dmPedestal, "dm_pedestal");
		registerBlockWithItem(novaCatalyst, "nova_catalyst");
		registerBlockWithItem(novaCataclysm, "nova_cataclysm");

		// Blocks without any item form
		registerObj(rmFurnaceOn, "rm_furnace_lit");
		registerObj(dmFurnaceOn, "dm_furnace_lit");

		// Blocks with ItemBlock
		registerBlockWithItem(alchChest, new ItemAlchemyChestBlock(alchChest), "alchemical_chest");
		registerBlockWithItem(transmuteStone, new ItemTransmutationBlock(transmuteStone), "transmutation_table");
		registerBlockWithItem(condenser, new ItemCondenserBlock(condenser), "condenser_mk1");
		registerBlockWithItem(rmFurnaceOff, new ItemRMFurnaceBlock(rmFurnaceOff), "rm_furnace");
		registerBlockWithItem(dmFurnaceOff, new ItemDMFurnaceBlock(dmFurnaceOff), "dm_furnace");
		registerBlockWithItem(matterBlock, new ItemMatterBlock(matterBlock), "matter_block");
		registerBlockWithItem(fuelBlock, new ItemFuelBlock(fuelBlock), "fuel_block");
		registerBlockWithItem(energyCollector, new ItemCollectorBlock(energyCollector), "collector_mk1");
		registerBlockWithItem(collectorMK2, new ItemCollectorBlock(collectorMK2), "collector_mk2");
		registerBlockWithItem(collectorMK3, new ItemCollectorBlock(collectorMK3), "collector_mk3");
		registerBlockWithItem(relay, new ItemRelayBlock(relay), "relay_mk1");
		registerBlockWithItem(relayMK2, new ItemRelayBlock(relayMK2), "relay_mk2");
		registerBlockWithItem(relayMK3, new ItemRelayBlock(relayMK3), "relay_mk3");

		//Items
		registerObj(philosStone, philosStone.getUnlocalizedName());
		registerObj(alchBag, alchBag.getUnlocalizedName());
		registerObj(repairTalisman, repairTalisman.getUnlocalizedName());
		registerObj(kleinStars, kleinStars.getUnlocalizedName());
		registerObj(fuels, fuels.getUnlocalizedName());
		registerObj(covalence, covalence.getUnlocalizedName());
		registerObj(matter, matter.getUnlocalizedName());

		registerObj(dmPick, dmPick.getUnlocalizedName());
		registerObj(dmAxe, dmAxe.getUnlocalizedName());
		registerObj(dmShovel, dmShovel.getUnlocalizedName());
		registerObj(dmSword, dmSword.getUnlocalizedName());
		registerObj(dmHoe, dmHoe.getUnlocalizedName());
		registerObj(dmShears, dmShears.getUnlocalizedName());
		registerObj(dmHammer, dmHammer.getUnlocalizedName());

		registerObj(rmPick, rmPick.getUnlocalizedName());
		registerObj(rmAxe, rmAxe.getUnlocalizedName());
		registerObj(rmShovel, rmShovel.getUnlocalizedName());
		registerObj(rmSword, rmSword.getUnlocalizedName());
		registerObj(rmHoe, rmHoe.getUnlocalizedName());
		registerObj(rmShears, rmShears.getUnlocalizedName());
		registerObj(rmHammer, rmHammer.getUnlocalizedName());
		registerObj(rmKatar, rmKatar.getUnlocalizedName());
		registerObj(rmStar, rmStar.getUnlocalizedName());

		registerObj(dmHelmet, dmHelmet.getUnlocalizedName());
		registerObj(dmChest, dmChest.getUnlocalizedName());
		registerObj(dmLegs, dmLegs.getUnlocalizedName());
		registerObj(dmFeet, dmFeet.getUnlocalizedName());

		registerObj(rmHelmet, rmHelmet.getUnlocalizedName());
		registerObj(rmChest, rmChest.getUnlocalizedName());
		registerObj(rmLegs, rmLegs.getUnlocalizedName());
		registerObj(rmFeet, rmFeet.getUnlocalizedName());

		registerObj(gemHelmet, gemHelmet.getUnlocalizedName());
		registerObj(gemChest, gemChest.getUnlocalizedName());
		registerObj(gemLegs, gemLegs.getUnlocalizedName());
		registerObj(gemFeet, gemFeet.getUnlocalizedName());

		registerObj(ironBand, ironBand.getUnlocalizedName());
		registerObj(blackHole, blackHole.getUnlocalizedName());
		registerObj(angelSmite, angelSmite.getUnlocalizedName());
		registerObj(harvestGod, harvestGod.getUnlocalizedName());
		registerObj(ignition, ignition.getUnlocalizedName());
		registerObj(zero, zero.getUnlocalizedName());
		registerObj(swrg, swrg.getUnlocalizedName());
		registerObj(timeWatch, timeWatch.getUnlocalizedName());
		registerObj(eternalDensity, eternalDensity.getUnlocalizedName());
		registerObj(dRod1, dRod1.getUnlocalizedName());
		registerObj(dRod2, dRod2.getUnlocalizedName());
		registerObj(dRod3, dRod3.getUnlocalizedName());
		registerObj(mercEye, mercEye.getUnlocalizedName());
		registerObj(voidRing, voidRing.getUnlocalizedName());
		registerObj(arcana, arcana.getUnlocalizedName());

		registerObj(bodyStone, bodyStone.getUnlocalizedName());
		registerObj(soulStone, soulStone.getUnlocalizedName());
		registerObj(mindStone, mindStone.getUnlocalizedName());
		registerObj(lifeStone, lifeStone.getUnlocalizedName());

		registerObj(everTide, everTide.getUnlocalizedName());
		registerObj(volcanite, volcanite.getUnlocalizedName());

		registerObj(waterOrb, waterOrb.getUnlocalizedName());
		registerObj(lavaOrb, lavaOrb.getUnlocalizedName());
		registerObj(lootBall, lootBall.getUnlocalizedName());
		registerObj(mobRandomizer, mobRandomizer.getUnlocalizedName());
		registerObj(lensExplosive, lensExplosive.getUnlocalizedName());
		registerObj(fireProjectile, fireProjectile.getUnlocalizedName());
		registerObj(windProjectile, windProjectile.getUnlocalizedName());

		registerObj(dCatalyst, dCatalyst.getUnlocalizedName());
		registerObj(hyperLens, hyperLens.getUnlocalizedName());
		registerObj(cataliticLens, cataliticLens.getUnlocalizedName());

		registerObj(tome, tome.getUnlocalizedName());
		registerObj(transmutationTablet, transmutationTablet.getUnlocalizedName());
		registerObj(manual, manual.getUnlocalizedName());

		//Tile Entities
		GameRegistry.registerTileEntityWithAlternatives(AlchChestTile.class, "AlchChestTile", "Alchemical Chest Tile");
		GameRegistry.registerTileEntityWithAlternatives(InterdictionTile.class, "InterdictionTile", "Interdiction Torch Tile");
		GameRegistry.registerTileEntityWithAlternatives(CondenserTile.class, "CondenserTile", "Condenser Tile");
		GameRegistry.registerTileEntityWithAlternatives(CondenserMK2Tile.class, "CondenserMK2Tile", "Condenser MK2 Tile");
		GameRegistry.registerTileEntityWithAlternatives(RMFurnaceTile.class, "RMFurnaceTile", "RM Furnace Tile");
		GameRegistry.registerTileEntityWithAlternatives(DMFurnaceTile.class, "DMFurnaceTile", "DM Furnace Tile");
		GameRegistry.registerTileEntityWithAlternatives(CollectorMK1Tile.class, "CollectorMK1Tile", "Energy Collector MK1 Tile");
		GameRegistry.registerTileEntityWithAlternatives(CollectorMK2Tile.class, "CollectorMK2Tile", "Energy Collector MK2 Tile");
		GameRegistry.registerTileEntityWithAlternatives(CollectorMK3Tile.class, "CollectorMK3Tile", "Energy Collector MK3 Tile");
		GameRegistry.registerTileEntityWithAlternatives(RelayMK1Tile.class, "RelayMK1Tile", "AM Relay MK1 Tile");
		GameRegistry.registerTileEntityWithAlternatives(RelayMK2Tile.class, "RelayMK2Tile", "AM Relay MK2 Tile");
		GameRegistry.registerTileEntityWithAlternatives(RelayMK3Tile.class, "RelayMK3Tile", "AM Relay MK3 Tile");
		GameRegistry.registerTileEntityWithAlternatives(DMPedestalTile.class, "DMPedestalTile", "DM Pedestal Tile");

		//Entities
		EntityRegistry.registerModEntity(EntityWaterProjectile.class, "WaterProjectile", 1, PECore.instance, 256, 10, true);
		EntityRegistry.registerModEntity(EntityLavaProjectile.class, "LavaProjectile", 2, PECore.instance, 256, 10, true);
		EntityRegistry.registerModEntity(EntityLootBall.class, "LootBall", 3, PECore.instance, 64, 10, true);
		EntityRegistry.registerModEntity(EntityMobRandomizer.class, "MobRandomizer", 4, PECore.instance, 256, 10, true);
		EntityRegistry.registerModEntity(EntityLensProjectile.class, "LensProjectile", 5, PECore.instance, 256, 10, true);
		EntityRegistry.registerModEntity(EntityNovaCatalystPrimed.class, "NovaCatalystPrimed", 6, PECore.instance, 256, 10, true);
		EntityRegistry.registerModEntity(EntityNovaCataclysmPrimed.class, "NovaCataclysmPrimed", 7, PECore.instance, 256, 10, true);
		EntityRegistry.registerModEntity(EntityHomingArrow.class, "HomingArrow", 8, PECore.instance, 256, 10, true);
		EntityRegistry.registerModEntity(EntityFireProjectile.class, "FireProjectile", 9, PECore.instance, 256, 10, true);
		EntityRegistry.registerModEntity(EntitySWRGProjectile.class, "LightningProjectile", 10, PECore.instance, 256, 10, true);
	}

	public static void addRecipes()
	{
		ItemStack diamondReplacement = new ItemStack(Items.DIAMOND);
		ItemStack diamondBlockReplacement = new ItemStack(Blocks.DIAMOND_BLOCK);

		if (ProjectEConfig.altCraftingMat)
		{
			diamondReplacement = new ItemStack(Items.NETHER_STAR);
			diamondBlockReplacement = new ItemStack(Items.NETHER_STAR);
		}

		//Shaped Recipes
		//Philos Stone
		GameRegistry.addRecipe(new ItemStack(philosStone), "RGR", "GDG", "RGR", 'R', Items.REDSTONE, 'G', Items.GLOWSTONE_DUST, 'D', diamondReplacement);

		GameRegistry.addRecipe(new ItemStack(philosStone), "GRG", "RDR", "GRG", 'R', Items.REDSTONE, 'G', Items.GLOWSTONE_DUST, 'D', diamondReplacement);

		//Interdiction torch
		if (ProjectEConfig.enableITorch)
		{
			GameRegistry.addRecipe(new ItemStack(confuseTorch, 2), "RDR", "DPD", "GGG", 'R', Blocks.REDSTONE_TORCH, 'G', Items.GLOWSTONE_DUST, 'D', Items.DIAMOND, 'P', philosStone);
		}

		//Repair Talisman
		GameRegistry.addRecipe(new ItemStack(repairTalisman), "LMH", "SPS", "HML", 'P', Items.PAPER, 'S', Items.STRING, 'L', new ItemStack(covalence, 1, 0), 'M', new ItemStack(covalence, 1, 1), 'H', new ItemStack(covalence, 1, 2));

		//Klein Star Ein
		GameRegistry.addRecipe(new ItemStack(kleinStars, 1, 0), "MMM", "MDM", "MMM", 'M', new ItemStack(fuels, 1, 1), 'D', Items.DIAMOND);

		//Matter
		GameRegistry.addRecipe(new ItemStack(matter, 1, 0), "AAA", "ADA", "AAA", 'D', Blocks.DIAMOND_BLOCK, 'A', new ItemStack(fuels, 1, 2));
		GameRegistry.addRecipe(new ItemStack(matter, 1, 1), "AAA", "DDD", "AAA", 'D', matter, 'A', new ItemStack(fuels, 1, 2));
		GameRegistry.addRecipe(new ItemStack(matter, 1, 1), "ADA", "ADA", "ADA", 'D', matter, 'A', new ItemStack(fuels, 1, 2));

		//Alchemical Chest
		if (ProjectEConfig.enableAlcChest)
		{
			GameRegistry.addRecipe(new ItemStack(alchChest), "LMH", "SDS", "ICI", 'D', diamondReplacement, 'L', new ItemStack(covalence, 1, 0), 'M', new ItemStack(covalence, 1, 1), 'H', new ItemStack(covalence, 1, 2), 'S', Blocks.STONE, 'I', Items.IRON_INGOT, 'C', Blocks.CHEST);
		}

		//Alchemical Bags
		for (int i = 0; i < 16; i++)
		{
			GameRegistry.addRecipe(new ItemStack(alchBag, 1, i), "CCC", "WAW", "WWW", 'C', new ItemStack(covalence, 1, 2), 'A', alchChest, 'W', new ItemStack(Blocks.WOOL, 1, i));
		}

		//Condenser
		if (ProjectEConfig.enableCondenser)
		{
			GameRegistry.addRecipe(new ItemStack(condenser), "ODO", "DCD", "ODO", 'D', Items.DIAMOND, 'O', new ItemStack(Blocks.OBSIDIAN), 'C', new ItemStack(alchChest));
		}

		//Condenser MK2
		if (ProjectEConfig.enableCondenser2)
		{
			GameRegistry.addRecipe(new ItemStack(condenserMk2), "RDR", "DCD", "RDR", 'D', new ItemStack(matterBlock, 1, 0), 'R', new ItemStack(matterBlock, 1, 1), 'C', condenser);
		}

		//Transmutation Table
		if (ProjectEConfig.enableTransTable)
		{
			GameRegistry.addRecipe(new ItemStack(transmuteStone), "OSO", "SPS", "OSO", 'S', Blocks.STONE, 'O', Blocks.OBSIDIAN, 'P', philosStone);
		}

		//Matter Blocks
		GameRegistry.addRecipe(new ItemStack(matterBlock, 1, 0), "DD", "DD", 'D', matter);
		GameRegistry.addRecipe(new ItemStack(matterBlock, 1, 1), "DD", "DD", 'D', new ItemStack(matter, 1, 1));

		//Matter Furnaces
		if (ProjectEConfig.enableDarkFurnace)
		{
			GameRegistry.addRecipe(new ItemStack(dmFurnaceOff), "DDD", "DFD", "DDD", 'D', new ItemStack(matterBlock, 1, 0), 'F', Blocks.FURNACE);
		}
		if (ProjectEConfig.enableRedFurnace)
		{
			GameRegistry.addRecipe(new ItemStack(rmFurnaceOff), "XRX", "RFR", 'R', new ItemStack(matterBlock, 1, 1), 'F', dmFurnaceOff);
		}

		// DM Pedestal
		if (ProjectEConfig.enableDarkPedestal)
		{
			GameRegistry.addRecipe(new ItemStack(dmPedestal), "RDR", "RDR", "DDD", 'R', new ItemStack(matter, 1, 1), 'D', new ItemStack(matterBlock, 1, 0));
		}

		//Collectors
		if (ProjectEConfig.enableCollector)
		{
			GameRegistry.addRecipe(new ItemStack(energyCollector), "GTG", "GDG", "GFG", 'G', Blocks.GLOWSTONE, 'F', Blocks.FURNACE, 'D', diamondBlockReplacement, 'T', Blocks.GLASS);
		}
		if (ProjectEConfig.enableCollector2)
		{
			GameRegistry.addRecipe(new ItemStack(collectorMK2), "GDG", "GCG", "GGG", 'G', Blocks.GLOWSTONE, 'C', energyCollector, 'D', matter);
		}
		if (ProjectEConfig.enableCollector3)
		{
			GameRegistry.addRecipe(new ItemStack(collectorMK3), "GRG", "GCG", "GGG", 'G', Blocks.GLOWSTONE, 'C', collectorMK2, 'R', new ItemStack(matter, 1, 1));
		}

		//AM Relays
		if (ProjectEConfig.enableRelay)
		{
			GameRegistry.addRecipe(new ItemStack(relay), "OSO", "ODO", "OOO", 'S', Blocks.GLASS, 'D', Blocks.DIAMOND_BLOCK, 'O', Blocks.OBSIDIAN);
		}
		if (ProjectEConfig.enableRelay2)
		{
			GameRegistry.addRecipe(new ItemStack(relayMK2), "ODO", "OAO", "OOO", 'A', relay, 'D', matter, 'O', Blocks.OBSIDIAN);
		}
		if (ProjectEConfig.enableRelay3)
		{
			GameRegistry.addRecipe(new ItemStack(relayMK3), "ORO", "OAO", "OOO", 'A', relayMK2, 'R', new ItemStack(matter, 1, 1), 'O', Blocks.OBSIDIAN);
		}

		//DM Tools
		GameRegistry.addRecipe(new ItemStack(dmPick), "MMM", "XDX", "XDX", 'D', Items.DIAMOND, 'M', matter);
		GameRegistry.addRecipe(new ItemStack(dmAxe), "MMX", "MDX", "XDX", 'D', Items.DIAMOND, 'M', matter);
		GameRegistry.addRecipe(new ItemStack(dmShovel), "XMX", "XDX", "XDX", 'D', Items.DIAMOND, 'M', matter);
		GameRegistry.addRecipe(new ItemStack(dmSword), "XMX", "XMX", "XDX", 'D', Items.DIAMOND, 'M', matter);
		GameRegistry.addRecipe(new ItemStack(dmHoe), "MMX", "XDX", "XDX", 'D', Items.DIAMOND, 'M', matter);
		GameRegistry.addRecipe(new ItemStack(dmShears), "XM", "DX", 'D', Items.DIAMOND, 'M', matter);
		GameRegistry.addRecipe(new ItemStack(dmHammer), "MDM", "XDX", "XDX", 'D', Items.DIAMOND, 'M', matter);

		//RM Tools
		GameRegistry.addRecipe(new ItemStack(rmPick), "RRR", "XPX", "XMX", 'R', new ItemStack(matter, 1, 1), 'P', dmPick, 'M', matter);
		GameRegistry.addRecipe(new ItemStack(rmAxe), "RRX", "RAX", "XMX", 'R', new ItemStack(matter, 1, 1), 'A', dmAxe, 'M', matter);
		GameRegistry.addRecipe(new ItemStack(rmShovel), "XRX", "XSX", "XMX", 'R', new ItemStack(matter, 1, 1), 'S', dmShovel, 'M', matter);
		GameRegistry.addRecipe(new ItemStack(rmSword), "XRX", "XRX", "XSX", 'R', new ItemStack(matter, 1, 1), 'S', dmSword);
		GameRegistry.addRecipe(new ItemStack(rmHoe), "RRX", "XHX", "XMX", 'R', new ItemStack(matter, 1, 1), 'H', dmHoe, 'M', matter);
		GameRegistry.addRecipe(new ItemStack(rmShears), "XR", "SX", 'R', new ItemStack(matter, 1, 1), 'S', dmShears);
		GameRegistry.addRecipe(new ItemStack(rmHammer), "RMR", "XHX", "XMX", 'R', new ItemStack(matter, 1, 1), 'H', dmHammer, 'M', matter);
		GameRegistry.addRecipe(new ItemStack(rmKatar), "123", "4RR", "RRR", '1', rmShears, '2', rmAxe, '3', rmSword, '4', rmHoe, 'R', new ItemStack(matter, 1, 1));
		GameRegistry.addRecipe(new ItemStack(rmStar), "123", "RRR", "RRR", '1', rmHammer, '2', rmPick, '3', rmShovel, 'R', new ItemStack(matter, 1, 1));

		//Armor
		GameRegistry.addRecipe(new ItemStack(dmHelmet), "MMM", "MXM", 'M', matter);
		GameRegistry.addRecipe(new ItemStack(dmChest), "MXM", "MMM", "MMM", 'M', matter);
		GameRegistry.addRecipe(new ItemStack(dmLegs), "MMM", "MXM", "MXM", 'M', matter);
		GameRegistry.addRecipe(new ItemStack(dmFeet), "MXM", "MXM", 'M', matter);

		GameRegistry.addRecipe(new ItemStack(rmHelmet), "MMM", "MDM", 'M', new ItemStack(matter, 1, 1), 'D', dmHelmet);
		GameRegistry.addRecipe(new ItemStack(rmChest), "MDM", "MMM", "MMM", 'M', new ItemStack(matter, 1, 1), 'D', dmChest);
		GameRegistry.addRecipe(new ItemStack(rmLegs), "MMM", "MDM", "MXM", 'M', new ItemStack(matter, 1, 1), 'D', dmLegs);
		GameRegistry.addRecipe(new ItemStack(rmFeet), "MDM", "MXM", 'M', new ItemStack(matter, 1, 1), 'D', dmFeet);

		//Rings
		GameRegistry.addRecipe(new ItemStack(ironBand), "III", "ILI", "III", 'I', Items.IRON_INGOT, 'L', Items.LAVA_BUCKET);
		GameRegistry.addRecipe(new ItemStack(ironBand), "III", "ILI", "III", 'I', Items.IRON_INGOT, 'L', volcanite);
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(harvestGod), "SFS", "DID", "SFS", 'I', ironBand, 'S', "treeSapling", 'F', Blocks.RED_FLOWER, 'F', Blocks.RED_FLOWER, 'D', matter));
		GameRegistry.addRecipe(new ItemStack(swrg), "DFD", "FIF", "DFD", 'I', ironBand, 'F', Items.FEATHER, 'D', matter);
		GameRegistry.addRecipe(new ItemStack(ignition), "FMF", "DID", "FMF", 'I', ironBand, 'F', new ItemStack(Items.FLINT_AND_STEEL, 1, OreDictionary.WILDCARD_VALUE), 'D', matter, 'M', new ItemStack(fuels, 1, 1));
		GameRegistry.addRecipe(new ItemStack(bodyStone), "SSS", "RLR", "SSS", 'R', new ItemStack(matter, 1, 1), 'S', Items.SUGAR, 'L', new ItemStack(Items.DYE, 1, 4));
		GameRegistry.addRecipe(new ItemStack(soulStone), "GGG", "RLR", "GGG", 'R', new ItemStack(matter, 1, 1), 'G', Items.GLOWSTONE_DUST, 'L', new ItemStack(Items.DYE, 1, 4));
		GameRegistry.addRecipe(new ItemStack(mindStone), "BBB", "RLR", "BBB", 'R', new ItemStack(matter, 1, 1), 'B', Items.BOOK, 'L', new ItemStack(Items.DYE, 1, 4));
		GameRegistry.addRecipe(new ItemStack(blackHole), "SSS", "DID", "SSS", 'I', ironBand, 'S', Items.STRING, 'D', matter);
		GameRegistry.addRecipe(new ItemStack(everTide), "WWW", "DDD", "WWW", 'W', Items.WATER_BUCKET, 'D', matter);
		GameRegistry.addRecipe(new ItemStack(volcanite), "LLL", "DDD", "LLL", 'L', Items.LAVA_BUCKET, 'D', matter);
		GameRegistry.addRecipe(new ItemStack(eternalDensity), "DOD", "MDM", "DOD", 'D', Items.DIAMOND, 'O', Blocks.OBSIDIAN, 'M', matter);
		GameRegistry.addRecipe(new ItemStack(zero), "SBS", "MIM", "SBS", 'S', Blocks.SNOW, 'B', Items.SNOWBALL, 'M', matter, 'I', ironBand);
		GameRegistry.addShapelessRecipe(new ItemStack(voidRing), blackHole, eternalDensity, new ItemStack(matter, 1, 1), new ItemStack(matter, 1, 1));
		GameRegistry.addRecipe(new ItemStack(arcana), "ZIH", "SMM", "MMM", 'Z', zero, 'I', ignition, 'H', harvestGod, 'S', swrg, 'M', new ItemStack(matter, 1, 1));
		GameRegistry.addRecipe(new ItemStack(angelSmite), "BFB", "MIM", "BFB", 'B', Items.BOW, 'F', Items.FEATHER, 'M', matter, 'I', ironBand);

		//Watch of flowing time
		GameRegistry.addRecipe(new ItemStack(timeWatch), "DOD", "GCG", "DOD", 'D', matter, 'O', Blocks.OBSIDIAN, 'G', Blocks.GLOWSTONE, 'C', Items.CLOCK);
		GameRegistry.addRecipe(new ItemStack(timeWatch), "DGD", "OCO", "DGD", 'D', matter, 'O', Blocks.OBSIDIAN, 'G', Blocks.GLOWSTONE, 'C', Items.CLOCK);

		//Divining rods
		GameRegistry.addRecipe(new ItemStack(dRod1), "DDD", "DSD", "DDD", 'D', covalence, 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(dRod2), "DDD", "DSD", "DDD", 'D', new ItemStack(covalence, 1, 1), 'S', dRod1);
		GameRegistry.addRecipe(new ItemStack(dRod3), "DDD", "DSD", "DDD", 'D', new ItemStack(covalence, 1, 2), 'S', dRod2);

		//Explosive items
		GameRegistry.addRecipe(new ItemStack(dCatalyst), "NMN", "MFM", "NMN", 'N', novaCatalyst, 'M', new ItemStack(fuels, 1, 1), 'F', new ItemStack(Items.FLINT_AND_STEEL, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(hyperLens), "DDD", "MNM", "DDD", 'N', novaCatalyst, 'M', matter, 'D', Items.DIAMOND);
		GameRegistry.addRecipe(new ItemStack(cataliticLens), "MMM", "HMD", "MMM", 'M', matter, 'H', hyperLens, 'D', dCatalyst);
		GameRegistry.addRecipe(new ItemStack(cataliticLens), "MMM", "DMH", "MMM", 'M', matter, 'H', hyperLens, 'D', dCatalyst);

		//Fuel Blocks
		GameRegistry.addRecipe(new ItemStack(fuelBlock, 1, 0), "FFF", "FFF", "FFF", 'F', fuels);
		GameRegistry.addRecipe(new ItemStack(fuelBlock, 1, 1), "FFF", "FFF", "FFF", 'F', new ItemStack(fuels, 1, 1));
		GameRegistry.addRecipe(new ItemStack(fuelBlock, 1, 2), "FFF", "FFF", "FFF", 'F', new ItemStack(fuels, 1, 2));

		//Tome
		if (ProjectEConfig.craftableTome)
		{
			GameRegistry.addRecipe(new ItemStack(tome), "HML", "KBK", "LMH", 'L', new ItemStack(covalence, 1, 0), 'M', new ItemStack(covalence, 1, 1), 'H', new ItemStack(covalence, 1, 2), 'B', Items.BOOK, 'K', new ItemStack(kleinStars, 1, 5));
		}

		//Manual
		//GameRegistry.addShapelessRecipe(new ItemStack(manual, 1, 0), Items.BOOK, new ItemStack(covalence, 1, 0));
		//GameRegistry.addShapelessRecipe(new ItemStack(manual, 1, 0), Items.BOOK, new ItemStack(covalence, 1, 1));
		//GameRegistry.addShapelessRecipe(new ItemStack(manual, 1, 0), Items.BOOK, new ItemStack(covalence, 1, 2));

		//TransmutationTablet
		GameRegistry.addRecipe(new ItemStack(transmutationTablet), "DSD", "STS", "DSD", 'D', new ItemStack(matterBlock, 1, 0), 'S', Blocks.STONE, 'T', transmuteStone);

		//Mercurial Eye
		GameRegistry.addRecipe(new ItemStack(mercEye), "OBO", "BRB", "BDB", 'O', Blocks.OBSIDIAN, 'B', Blocks.BRICK_BLOCK, 'R', new ItemStack(matter, 1, 1), 'D', Items.DIAMOND);

		//Shapeless Recipes
		//Philos Stone exchanges
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ENDER_PEARL), philosStone, Items.IRON_INGOT, Items.IRON_INGOT, Items.IRON_INGOT, Items.IRON_INGOT);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT, 8), philosStone, Items.GOLD_INGOT);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.GOLD_INGOT), philosStone, Items.IRON_INGOT, Items.IRON_INGOT, Items.IRON_INGOT, Items.IRON_INGOT, Items.IRON_INGOT, Items.IRON_INGOT, Items.IRON_INGOT, Items.IRON_INGOT);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DIAMOND), philosStone, Items.GOLD_INGOT, Items.GOLD_INGOT, Items.GOLD_INGOT, Items.GOLD_INGOT);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.GOLD_INGOT, 4), philosStone, Items.DIAMOND);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.EMERALD), philosStone, Items.DIAMOND, Items.DIAMOND);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DIAMOND, 2), philosStone, Items.EMERALD);
		GameRegistry.addShapelessRecipe(new ItemStack(fuels, 1, 0), philosStone, Items.COAL, Items.COAL, Items.COAL, Items.COAL);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.COAL, 4), philosStone, new ItemStack(fuels, 1, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(fuels, 1, 1), philosStone, new ItemStack(fuels, 1, 0), new ItemStack(fuels, 1, 0), new ItemStack(fuels, 1, 0), new ItemStack(fuels, 1, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(fuels, 4, 0), philosStone, new ItemStack(fuels, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(fuels, 1, 2), philosStone, new ItemStack(fuels, 1, 1), new ItemStack(fuels, 1, 1), new ItemStack(fuels, 1, 1), new ItemStack(fuels, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(fuels, 4, 1), philosStone, new ItemStack(fuels, 1, 2));

		//Covalence dust
		GameRegistry.addShapelessRecipe(new ItemStack(covalence, 40, 0), Blocks.COBBLESTONE, Blocks.COBBLESTONE, Blocks.COBBLESTONE, Blocks.COBBLESTONE, Blocks.COBBLESTONE, Blocks.COBBLESTONE, Blocks.COBBLESTONE, Blocks.COBBLESTONE, new ItemStack(Items.COAL, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(covalence, 40, 1), Items.IRON_INGOT, Items.REDSTONE);
		GameRegistry.addShapelessRecipe(new ItemStack(covalence, 40, 2), Items.DIAMOND, Items.COAL);

		//Klein Stars
		for (int i = 1; i < 6; i++)
		{
			ItemStack input = new ItemStack(kleinStars, 1, i - 1);
			ItemStack output = new ItemStack(kleinStars, 1, i);
			GameRegistry.addRecipe(new RecipeShapelessHidden(output, input, input, input, input));
		}

		//Other items
		GameRegistry.addShapelessRecipe(new ItemStack(novaCatalyst, 2), Blocks.TNT, new ItemStack(fuels, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(novaCataclysm, 2), novaCatalyst, new ItemStack(fuels, 1, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(lifeStone), bodyStone, soulStone);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.ICE), new ItemStack(zero, 1, OreDictionary.WILDCARD_VALUE), Items.WATER_BUCKET);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.LAVA_BUCKET), volcanite, Items.BUCKET, Items.REDSTONE);

		GameRegistry.addShapelessRecipe(new ItemStack(gemHelmet), rmHelmet, new ItemStack(kleinStars, 1, 5), everTide, soulStone);
		GameRegistry.addShapelessRecipe(new ItemStack(gemChest), rmChest, new ItemStack(kleinStars, 1, 5), volcanite, bodyStone);
		GameRegistry.addShapelessRecipe(new ItemStack(gemLegs), rmLegs, new ItemStack(kleinStars, 1, 5), blackHole, timeWatch);
		GameRegistry.addShapelessRecipe(new ItemStack(gemFeet), rmFeet, new ItemStack(kleinStars, 1, 5), swrg, swrg);

		GameRegistry.addShapelessRecipe(new ItemStack(matter, 4, 0), matterBlock);
		GameRegistry.addShapelessRecipe(new ItemStack(matter, 4, 1), new ItemStack(matterBlock, 1, 1));

		GameRegistry.addShapelessRecipe(new ItemStack(fuels, 9, 0), new ItemStack(fuelBlock, 1, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(fuels, 9, 1), new ItemStack(fuelBlock, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(fuels, 9, 2), new ItemStack(fuelBlock, 1, 2));

		// need a recipe for each arcana mode, there's probably a better way to do this
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.ICE), new ItemStack(arcana, 1, OreDictionary.WILDCARD_VALUE), Items.WATER_BUCKET);

		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.GRASS), new ItemStack(arcana, 1, OreDictionary.WILDCARD_VALUE), "dirt"));

		// Taken from OreDictionary class
		String[] dyes =
		{
			"Black",
			"Red",
			"Green",
			"Brown",
			"Blue",
			"Purple",
			"Cyan",
			"LightGray",
			"Gray",
			"Pink",
			"Lime",
			"Yellow",
			"LightBlue",
			"Magenta",
			"Orange",
			"White"
		};

		for (int i = 0; i < 15; i++)
		{
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(alchBag, 1, i), new ItemStack(alchBag, 1, OreDictionary.WILDCARD_VALUE), "dye" + dyes[15 - i]));
		}

		GameRegistry.addRecipe(new RecipesCovalenceRepair());
		RecipeSorter.register("Covalence Repair Recipes", RecipesCovalenceRepair.class, Category.SHAPELESS, "before:minecraft:shaped");
		RecipeSorter.register("", RecipeShapedKleinStar.class, Category.SHAPED, "after:minecraft:shaped before:minecraft:shapeless");
		RecipeSorter.register("", RecipeShapelessHidden.class, Category.SHAPELESS, "before:minecraft:shaped");

		//Fuel Values
		GameRegistry.registerFuelHandler(new FuelHandler());
	}
	
	private static void registerObj(IForgeRegistryEntry<?> o, String name)
	{
		GameRegistry.register(o, new ResourceLocation(PECore.MODID, name));
	}

	private static void registerBlockWithItem(Block b, String name)
	{
		registerObj(b, name);
		registerObj(new ItemBlock(b), name);
	}

	private static void registerBlockWithItem(Block b, Item i, String name)
	{
		registerObj(b, name);
		registerObj(i, name);
	}

	/**
	 * Philosopher's stone smelting recipes, EE3 style
	 */
	@SuppressWarnings("unchecked")
	public static void registerPhiloStoneSmelting()
	{
		for (Entry<ItemStack, ItemStack> entry : FurnaceRecipes.instance().getSmeltingList().entrySet())
		{
			if (entry.getKey() == null || entry.getValue() == null)
			{
				continue;
			}

			ItemStack input = entry.getKey();
			ItemStack output = entry.getValue().copy();
			output.stackSize *= 7;

			GameRegistry.addRecipe(new RecipeShapelessHidden(output, philosStone, input, input, input, input, input, input, input, new ItemStack(Items.COAL, 1, OreDictionary.WILDCARD_VALUE)));

		}
		RecipeSorter.register("Philosopher's Smelting Recipes", RecipeShapelessHidden.class, Category.SHAPELESS, "before:minecraft:shaped");
	}

	public static class FuelHandler implements IFuelHandler
	{
		@Override
		public int getBurnTime(ItemStack fuel)
		{
			if (fuel.getItem() == fuels)
			{
				switch (fuel.getItemDamage())
				{
					case 0:
						return Constants.ALCH_BURN_TIME;
					case 1:
						return Constants.MOBIUS_BURN_TIME;
					case 2:
						return Constants.AETERNALIS_BURN_TIME;
				}
			} else if (fuel.getItem() == Item.getItemFromBlock(fuelBlock))
			{
				switch (fuel.getItemDamage())
				{
					case 0:
						return Constants.ALCH_BURN_TIME * 9;
					case 1:
						return Constants.MOBIUS_BURN_TIME * 9;
					case 2:
						return Constants.AETERNALIS_BURN_TIME * 9;
				}
			}

			return 0;
		}
	}
}
