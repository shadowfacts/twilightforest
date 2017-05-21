package twilightforest.item;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSoup;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;
import twilightforest.TwilightForestMod;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TFItems {

	public static ItemArmor.ArmorMaterial ARMOR_NAGA = EnumHelper.addArmorMaterial("NAGA_SCALE", "naga_scale", 21, new int[] {2, 7, 6, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static ItemArmor.ArmorMaterial ARMOR_IRONWOOD = EnumHelper.addArmorMaterial("IRONWOOD", "ironwood", 20, new int[] {2, 7, 5, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static ItemArmor.ArmorMaterial ARMOR_FIERY = EnumHelper.addArmorMaterial("FIERY", "fiery", 25, new int[] {4, 9, 7, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static ItemArmor.ArmorMaterial ARMOR_STEELEAF = EnumHelper.addArmorMaterial("STEELEAF", "steeleaf", 10, new int[] {3, 8, 6, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static ItemArmor.ArmorMaterial ARMOR_KNIGHTLY = EnumHelper.addArmorMaterial("KNIGHTMETAL", "knightly", 20, new int[] {3, 8, 6, 3}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static ItemArmor.ArmorMaterial ARMOR_PHANTOM = EnumHelper.addArmorMaterial("KNIGHTPHANTOM", "phantom", 30, new int[] {3, 8, 6, 3}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static ItemArmor.ArmorMaterial ARMOR_YETI = EnumHelper.addArmorMaterial("YETI", "yetiarmor", 20, new int[] {4, 7, 6, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static ItemArmor.ArmorMaterial ARMOR_ARCTIC = EnumHelper.addArmorMaterial("ARCTIC", "arcticarmor", 10, new int[] {2, 7, 5, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	
	
	public static Item.ToolMaterial TOOL_IRONWOOD = EnumHelper.addToolMaterial("IRONWOOD", 2, 512, 6.5F, 2, 25);
	public static Item.ToolMaterial TOOL_FIERY = EnumHelper.addToolMaterial("FIERY", 4, 1024, 9F, 4, 10);
	public static Item.ToolMaterial TOOL_STEELEAF = EnumHelper.addToolMaterial("STEELEAF", 3, 131, 8.0F, 3, 9);
	public static Item.ToolMaterial TOOL_KNIGHTLY = EnumHelper.addToolMaterial("KNIGHTMETAL", 3, 512, 8.0F, 3, 8);
	public static Item.ToolMaterial TOOL_GIANT = EnumHelper.addToolMaterial("GIANTSTONE", 1, 1024, 4.0F, 1.0F, 5);
	public static Item.ToolMaterial TOOL_ICE = EnumHelper.addToolMaterial("TFICE", 0, 32, 1.0F, 3.5F, 5);
	public static Item.ToolMaterial TOOL_GLASS = EnumHelper.addToolMaterial("TFGLASS", 0, 1, 1.0F, 36.0F, 30);
	
    public static Item nagaScale;
    public static Item plateNaga;
    public static Item legsNaga;
    public static Item scepterTwilight;
    public static Item scepterLifeDrain;
    public static Item scepterZombie;
    public static Item wandPacification;
    public static Item oreMeter;
    public static Item magicMap;
    public static Item mazeMap;
    public static Item oreMap;
    public static Item feather;
    public static Item magicMapFocus;
    public static Item mazeMapFocus;
    public static Item liveRoot;
    public static Item ironwoodRaw;
    public static Item ironwoodIngot;
    public static Item ironwoodHelm;
    public static Item ironwoodPlate;
    public static Item ironwoodLegs;
    public static Item ironwoodBoots;
    public static Item ironwoodSword;
    public static Item ironwoodShovel;
    public static Item ironwoodPick;
    public static Item ironwoodAxe;
    public static Item ironwoodHoe;
    public static Item torchberries;
    public static Item venisonRaw;
    public static Item venisonCooked;
    public static Item hydraChop;
    public static Item fieryBlood;
    public static Item trophy;
    public static Item fieryIngot;
    public static Item fieryHelm;
    public static Item fieryPlate;
    public static Item fieryLegs;
    public static Item fieryBoots;
    public static Item fierySword;
    public static Item fieryPick;
    public static Item steeleafIngot;
    public static Item steeleafHelm;
    public static Item steeleafPlate;
    public static Item steeleafLegs;
    public static Item steeleafBoots;
    public static Item steeleafSword;
    public static Item steeleafShovel;
    public static Item steeleafPick;
    public static Item steeleafAxe;
    public static Item steeleafHoe;
    public static Item minotaurAxe;
    public static Item mazebreakerPick;
    public static Item transformPowder;
    public static Item meefRaw;
    public static Item meefSteak;
    public static Item meefStroganoff;
    public static Item mazeWafer;
    public static Item emptyMagicMap;
    public static Item emptyMazeMap;
    public static Item emptyOreMap;
    public static Item oreMagnet;
    public static Item crumbleHorn;
    public static Item peacockFan;
    public static Item moonwormQueen;
    public static Item charmOfLife1;
    public static Item charmOfLife2;
    public static Item charmOfKeeping1;
    public static Item charmOfKeeping2;
    public static Item charmOfKeeping3;
    public static Item towerKey;
    public static Item borerEssence;
    public static Item carminite;
    public static Item experiment115;
    public static Item armorShard;
    public static Item knightMetal;
    public static Item shardCluster;
    public static Item knightlyHelm;
    public static Item knightlyPlate;
    public static Item knightlyLegs;
    public static Item knightlyBoots;
    public static Item knightlySword;
    public static Item knightlyPick;
    public static Item knightlyAxe;
    public static Item phantomHelm;
    public static Item phantomPlate;
    public static Item lampOfCinders;
    public static Item fieryTears;
    public static Item alphaFur;
    public static Item yetiHelm;
    public static Item yetiPlate;
    public static Item yetiLegs;
    public static Item yetiBoots;
    public static Item iceBomb;
    public static Item arcticFur;
    public static Item arcticHelm;
    public static Item arcticPlate;
    public static Item arcticLegs;
    public static Item arcticBoots;
    public static Item magicBeans;
    public static Item giantPick;
    public static Item giantSword;
    public static Item tripleBow;
    public static Item seekerBow;
    public static Item iceBow;
    public static Item enderBow;
    public static Item iceSword;
    public static Item glassSword;
    public static Item knightmetalRing;
    public static Item chainBlock;
    public static Item cubeTalisman;
    public static Item cubeOfAnnihilation;

    public static CreativeTabTwilightForest creativeTab = new CreativeTabTwilightForest("twilightForest");

    public static void registerItems()
    {
    	nagaScale = new ItemTF().setUnlocalizedName("nagaScale");
    	plateNaga = new ItemTFNagaArmor(ARMOR_NAGA, EntityEquipmentSlot.CHEST).setUnlocalizedName("plateNaga").setMaxStackSize(1);
    	legsNaga = new ItemTFNagaArmor(ARMOR_NAGA, EntityEquipmentSlot.LEGS).setUnlocalizedName("legsNaga").setMaxStackSize(1);
    	scepterTwilight = new ItemTFTwilightWand().setUnlocalizedName("scepterTwilight").setMaxStackSize(1).setFull3D();
    	scepterLifeDrain = new ItemTFScepterLifeDrain().setUnlocalizedName("scepterLifeDrain").setMaxStackSize(1).setFull3D();
    	scepterZombie = new ItemTFZombieWand().setUnlocalizedName("scepterZombie").setMaxStackSize(1).setFull3D();
    	//wandPacification = new ItemTF().setIconIndex(6).setUnlocalizedName("wandPacification").setMaxStackSize(1).setFull3D();
    	oreMeter = new ItemTFOreMeter().setUnlocalizedName("oreMeter").setMaxStackSize(1);
    	magicMap = new ItemTFMagicMap().setUnlocalizedName("magicMap").setMaxStackSize(1);
    	mazeMap = new ItemTFMazeMap(false).setUnlocalizedName("mazeMap").setMaxStackSize(1);
    	oreMap = new ItemTFMazeMap(true).setUnlocalizedName("oreMap").setMaxStackSize(1);
    	feather = new ItemTF().setUnlocalizedName("tfFeather");
    	magicMapFocus = new ItemTF().setUnlocalizedName("magicMapFocus");
    	mazeMapFocus = new ItemTF().setUnlocalizedName("mazeMapFocus");
    	liveRoot = new ItemTF().setUnlocalizedName("liveRoot");
    	ironwoodRaw = new ItemTF().setUnlocalizedName("ironwoodRaw");
    	ironwoodIngot = new ItemTF().setUnlocalizedName("ironwoodIngot");
    	ironwoodHelm = new ItemTFIronwoodArmor(ARMOR_IRONWOOD, EntityEquipmentSlot.HEAD).setUnlocalizedName("ironwoodHelm").setMaxStackSize(1);
    	ironwoodPlate = new ItemTFIronwoodArmor(ARMOR_IRONWOOD, EntityEquipmentSlot.CHEST).setUnlocalizedName("ironwoodPlate").setMaxStackSize(1);
    	ironwoodLegs = new ItemTFIronwoodArmor(ARMOR_IRONWOOD, EntityEquipmentSlot.LEGS).setUnlocalizedName("ironwoodLegs").setMaxStackSize(1);
    	ironwoodBoots = new ItemTFIronwoodArmor(ARMOR_IRONWOOD, EntityEquipmentSlot.FEET).setUnlocalizedName("ironwoodBoots").setMaxStackSize(1);
    	ironwoodSword = new ItemTFIronwoodSword(TOOL_IRONWOOD).setUnlocalizedName("ironwoodSword").setMaxStackSize(1);
    	ironwoodShovel = new ItemTFIronwoodShovel(TOOL_IRONWOOD).setUnlocalizedName("ironwoodShovel").setMaxStackSize(1);
    	ironwoodPick = new ItemTFIronwoodPick(TOOL_IRONWOOD).setUnlocalizedName("ironwoodPick").setMaxStackSize(1);
    	ironwoodAxe = new ItemTFIronwoodAxe(TOOL_IRONWOOD).setUnlocalizedName("ironwoodAxe").setMaxStackSize(1);
    	ironwoodHoe = new ItemTFIronwoodHoe(TOOL_IRONWOOD).setUnlocalizedName("ironwoodHoe").setMaxStackSize(1);
    	torchberries = new ItemTF().setUnlocalizedName("torchberries");
    	venisonRaw = (new ItemFood(3, 0.3F, true)).setUnlocalizedName("venisonRaw");
    	venisonCooked = (new ItemFood(8, 0.8F, true)).setUnlocalizedName("venisonCooked");
    	hydraChop = (new ItemTFHydraChops(18, 2.0F, true)).setPotionEffect(new PotionEffect(MobEffects.REGENERATION, 100, 0), 1.0F).setUnlocalizedName("hydraChop");
    	fieryBlood = new ItemTF().makeRare().setUnlocalizedName("fieryBlood");
    	trophy = new ItemTFTrophy().setUnlocalizedName("trophy");
    	fieryIngot = new ItemTF().makeRare().setUnlocalizedName("fieryIngot");
    	fieryHelm = new ItemTFFieryArmor(ARMOR_FIERY, EntityEquipmentSlot.HEAD).setUnlocalizedName("fieryHelm").setMaxStackSize(1);
    	fieryPlate = new ItemTFFieryArmor(ARMOR_FIERY, EntityEquipmentSlot.CHEST).setUnlocalizedName("fieryPlate").setMaxStackSize(1);
    	fieryLegs = new ItemTFFieryArmor(ARMOR_FIERY, EntityEquipmentSlot.LEGS).setUnlocalizedName("fieryLegs").setMaxStackSize(1);
    	fieryBoots = new ItemTFFieryArmor(ARMOR_FIERY, EntityEquipmentSlot.FEET).setUnlocalizedName("fieryBoots").setMaxStackSize(1);
    	fierySword = new ItemTFFierySword(TOOL_FIERY).setUnlocalizedName("fierySword").setMaxStackSize(1);
    	fieryPick = new ItemTFFieryPick(TOOL_FIERY).setUnlocalizedName("fieryPick").setMaxStackSize(1);
    	steeleafIngot = new ItemTF().setUnlocalizedName("steeleafIngot");
    	steeleafHelm = new ItemTFSteeleafArmor(ARMOR_IRONWOOD, EntityEquipmentSlot.HEAD).setUnlocalizedName("steeleafHelm").setMaxStackSize(1);
    	steeleafPlate = new ItemTFSteeleafArmor(ARMOR_IRONWOOD, EntityEquipmentSlot.CHEST).setUnlocalizedName("steeleafPlate").setMaxStackSize(1);
    	steeleafLegs = new ItemTFSteeleafArmor(ARMOR_IRONWOOD, EntityEquipmentSlot.LEGS).setUnlocalizedName("steeleafLegs").setMaxStackSize(1);
    	steeleafBoots = new ItemTFSteeleafArmor(ARMOR_IRONWOOD, EntityEquipmentSlot.FEET).setUnlocalizedName("steeleafBoots").setMaxStackSize(1);
    	steeleafSword = new ItemTFSteeleafSword(TOOL_STEELEAF).setUnlocalizedName("steeleafSword").setMaxStackSize(1);
    	steeleafShovel = new ItemTFSteeleafShovel(TOOL_STEELEAF).setUnlocalizedName("steeleafShovel").setMaxStackSize(1);
    	steeleafPick = new ItemTFSteeleafPick(TOOL_STEELEAF).setUnlocalizedName("steeleafPick").setMaxStackSize(1);
    	steeleafAxe = new ItemTFSteeleafAxe(TOOL_STEELEAF).setUnlocalizedName("steeleafAxe").setMaxStackSize(1);
    	steeleafHoe = new ItemTFSteeleafHoe(TOOL_STEELEAF).setUnlocalizedName("steeleafHoe").setMaxStackSize(1);
    	minotaurAxe = new ItemTFMinotaurAxe(Item.ToolMaterial.DIAMOND).setUnlocalizedName("minotaurAxe").setMaxStackSize(1);
    	mazebreakerPick = new ItemTFMazebreakerPick(Item.ToolMaterial.DIAMOND).setUnlocalizedName("mazebreakerPick").setMaxStackSize(1);
    	transformPowder = new ItemTFTransformPowder().makeRare().setUnlocalizedName("transformPowder");
    	meefRaw = (new ItemFood(2, 0.3F, true)).setUnlocalizedName("meefRaw");
    	meefSteak = (new ItemFood(6, 0.6F, true)).setUnlocalizedName("meefSteak");
    	meefStroganoff = (new ItemSoup(8)).setUnlocalizedName("meefStroganoff");
    	mazeWafer = (new ItemFood(4, 0.6F, false)).setUnlocalizedName("mazeWafer");
    	emptyMagicMap = (new ItemTFEmptyMagicMap()).setUnlocalizedName("emptyMagicMap");
    	emptyMazeMap = (new ItemTFEmptyMazeMap(false)).setUnlocalizedName("emptyMazeMap");
    	emptyOreMap = (new ItemTFEmptyMazeMap(true)).setUnlocalizedName("emptyOreMap");
    	oreMagnet = (new ItemTFOreMagnet()).setUnlocalizedName("oreMagnet");
    	crumbleHorn = (new ItemTFCrumbleHorn()).setUnlocalizedName("crumbleHorn");
    	peacockFan = (new ItemTFPeacockFan()).setUnlocalizedName("peacockFan");
    	moonwormQueen = (new ItemTFMoonwormQueen()).setUnlocalizedName("moonwormQueen");
    	charmOfLife1 = new ItemTFCharm().setUnlocalizedName("charmOfLife1");
    	charmOfLife2 = new ItemTFCharm().setUnlocalizedName("charmOfLife2");
    	charmOfKeeping1 = new ItemTFCharm().setUnlocalizedName("charmOfKeeping1");
    	charmOfKeeping2 = new ItemTFCharm().setUnlocalizedName("charmOfKeeping2");
    	charmOfKeeping3 = new ItemTFCharm().setUnlocalizedName("charmOfKeeping3");
    	towerKey = new ItemTFTowerKey().setUnlocalizedName("towerKey");
    	borerEssence = new ItemTF().setUnlocalizedName("borerEssence");
    	carminite = new ItemTF().makeRare().setUnlocalizedName("carminite");
    	experiment115 = (new ItemFood(4, 0.3F, false)).setUnlocalizedName("experiment115");
    	armorShard = new ItemTF().setUnlocalizedName("armorShards");
    	knightMetal = new ItemTF().setUnlocalizedName("knightMetal");
    	shardCluster = new ItemTF().setUnlocalizedName("shardCluster");
    	knightlyHelm = new ItemTFKnightlyArmor(ARMOR_KNIGHTLY, EntityEquipmentSlot.HEAD).setUnlocalizedName("knightlyHelm").setMaxStackSize(1);
    	knightlyPlate = new ItemTFKnightlyArmor(ARMOR_KNIGHTLY, EntityEquipmentSlot.CHEST).setUnlocalizedName("knightlyPlate").setMaxStackSize(1);
    	knightlyLegs = new ItemTFKnightlyArmor(ARMOR_KNIGHTLY, EntityEquipmentSlot.LEGS).setUnlocalizedName("knightlyLegs").setMaxStackSize(1);
    	knightlyBoots = new ItemTFKnightlyArmor(ARMOR_KNIGHTLY, EntityEquipmentSlot.FEET).setUnlocalizedName("knightlyBoots").setMaxStackSize(1);
    	knightlySword = new ItemTFKnightlySword(TOOL_KNIGHTLY).setUnlocalizedName("knightlySword").setMaxStackSize(1);
    	knightlyPick = new ItemTFKnightlyPick(TOOL_KNIGHTLY).setUnlocalizedName("knightlyPick").setMaxStackSize(1);
    	knightlyAxe = new ItemTFKnightlyAxe(TOOL_KNIGHTLY).setUnlocalizedName("knightlyAxe").setMaxStackSize(1);
    	phantomHelm = new ItemTFPhantomArmor(ARMOR_PHANTOM, EntityEquipmentSlot.HEAD).setUnlocalizedName("phantomHelm").setMaxStackSize(1);
    	phantomPlate = new ItemTFPhantomArmor(ARMOR_PHANTOM, EntityEquipmentSlot.CHEST).setUnlocalizedName("phantomPlate").setMaxStackSize(1);
    	lampOfCinders = new ItemTFLampOfCinders().setUnlocalizedName("lampOfCinders");
    	fieryTears = new ItemTF().makeRare().setUnlocalizedName("fieryTears");
    	alphaFur = new ItemTF().makeRare().setUnlocalizedName("alphaFur");
    	yetiHelm = new ItemTFYetiArmor(ARMOR_YETI, EntityEquipmentSlot.HEAD).setUnlocalizedName("yetiHelm").setMaxStackSize(1);
    	yetiPlate = new ItemTFYetiArmor(ARMOR_YETI, EntityEquipmentSlot.CHEST).setUnlocalizedName("yetiPlate").setMaxStackSize(1);
    	yetiLegs = new ItemTFYetiArmor(ARMOR_YETI, EntityEquipmentSlot.LEGS).setUnlocalizedName("yetiLegs").setMaxStackSize(1);
    	yetiBoots = new ItemTFYetiArmor(ARMOR_YETI, EntityEquipmentSlot.FEET).setUnlocalizedName("yetiBoots").setMaxStackSize(1);
    	iceBomb = new ItemTFIceBomb().makeRare().setUnlocalizedName("iceBomb").setMaxStackSize(16);
    	arcticFur = new ItemTF().setUnlocalizedName("arcticFur");
    	arcticHelm = new ItemTFArcticArmor(ARMOR_ARCTIC, EntityEquipmentSlot.HEAD).setUnlocalizedName("arcticHelm").setMaxStackSize(1);
    	arcticPlate = new ItemTFArcticArmor(ARMOR_ARCTIC, EntityEquipmentSlot.CHEST).setUnlocalizedName("arcticPlate").setMaxStackSize(1);
    	arcticLegs = new ItemTFArcticArmor(ARMOR_ARCTIC, EntityEquipmentSlot.LEGS).setUnlocalizedName("arcticLegs").setMaxStackSize(1);
    	arcticBoots = new ItemTFArcticArmor(ARMOR_ARCTIC, EntityEquipmentSlot.FEET).setUnlocalizedName("arcticBoots").setMaxStackSize(1);
    	magicBeans = new ItemTFMagicBeans().setUnlocalizedName("magicBeans");
    	giantPick = new ItemTFGiantPick(TOOL_GIANT).setUnlocalizedName("giantPick").setMaxStackSize(1);
    	giantSword = new ItemTFGiantSword(TOOL_GIANT).setUnlocalizedName("giantSword").setMaxStackSize(1);
    	tripleBow = new ItemTFTripleBow().setUnlocalizedName("tripleBow").setMaxStackSize(1);
    	seekerBow = new ItemTFSeekerBow().setUnlocalizedName("seekerBow").setMaxStackSize(1);
    	iceBow = new ItemTFIceBow().setUnlocalizedName("iceBow").setMaxStackSize(1);
    	enderBow = new ItemTFEnderBow().setUnlocalizedName("enderBow").setMaxStackSize(1);
    	iceSword = new ItemTFIceSword(TOOL_ICE).setUnlocalizedName("iceSword").setMaxStackSize(1);
    	glassSword = new ItemTFGlassSword(TOOL_GLASS).setUnlocalizedName("glassSword").setMaxStackSize(1);
    	knightmetalRing = new ItemTF().setUnlocalizedName("knightmetalRing");
    	chainBlock = new ItemTFChainBlock().setUnlocalizedName("chainBlock").setMaxStackSize(1);
    	cubeTalisman = new ItemTF().setUnlocalizedName("cubeTalisman");
    	cubeOfAnnihilation = new ItemTFCubeOfAnnihilation().setUnlocalizedName("cubeOfAnnihilation").setMaxStackSize(1);

        registerTFItem(nagaScale, "naga_scale");
        registerTFItem(plateNaga, "naga_chestplate");
        registerTFItem(legsNaga, "naga_leggings");
        registerTFItem(scepterTwilight, "twilight_scepter");
        registerTFItem(scepterLifeDrain, "lifedrain_scepter");
        registerTFItem(scepterZombie, "zombie_scepter");
        //registerTFItem(wandPacification, "Wand of Pacification [NYI]");
        registerTFItem(oreMeter, "ore_meter");
        registerTFItem(magicMap, "magic_map");
        registerTFItem(mazeMap, "maze_map");
        registerTFItem(oreMap, "ore_Map");
        registerTFItem(feather, "raven_feather");
        registerTFItem(magicMapFocus, "magic_map_focus");
        registerTFItem(mazeMapFocus, "maze_map_focus");
        registerTFItem(liveRoot, "liveroot");
        registerTFItem(ironwoodRaw, "ironwood_raw");
        registerTFItem(ironwoodIngot, "ironwood_ingot");
        registerTFItem(ironwoodHelm, "ironwood_helmet");
        registerTFItem(ironwoodPlate, "ironwood_chestplate");
        registerTFItem(ironwoodLegs, "ironwood_leggings");
        registerTFItem(ironwoodBoots, "ironwood_boots");
        registerTFItem(ironwoodSword, "ironwood_sword");
        registerTFItem(ironwoodShovel, "ironwood_shovel");
        registerTFItem(ironwoodPick, "ironwood_pickaxe");
        registerTFItem(ironwoodAxe, "ironwood_axe");
        registerTFItem(ironwoodHoe, "ironwood_hoe");
        registerTFItem(torchberries, "torchberries");
        registerTFItem(venisonRaw, "raw_venison");
        registerTFItem(venisonCooked, "cooked_venison");
        registerTFItem(hydraChop, "hydra_chop");
        registerTFItem(fieryBlood, "fiery_blood");
        registerTFItem(trophy, "trophy");
        registerTFItem(fieryIngot, "fiery_ingot");
        registerTFItem(fieryHelm, "fiery_helmet");
        registerTFItem(fieryPlate, "fiery_chestplate");
        registerTFItem(fieryLegs, "fiery_leggings");
        registerTFItem(fieryBoots, "fiery_boots");
        registerTFItem(fierySword, "fiery_sword");
        registerTFItem(fieryPick, "fiery_pickaxe");
        registerTFItem(steeleafIngot, "steeleaf_ingot");
        registerTFItem(steeleafHelm, "steeleaf_helmet");
        registerTFItem(steeleafPlate, "steeleaf_chestplate");
        registerTFItem(steeleafLegs, "steeleaf_leggings");
        registerTFItem(steeleafBoots, "steeleaf_boots");
        registerTFItem(steeleafSword, "steeleaf_sowrd");
        registerTFItem(steeleafShovel, "steeleaf_shovel");
        registerTFItem(steeleafPick, "steeleaf_pickaxe");
        registerTFItem(steeleafAxe, "steeleaf_axe");
        registerTFItem(steeleafHoe, "steeleaf_hoe");
        registerTFItem(minotaurAxe, "minotaur_axe");
        registerTFItem(mazebreakerPick, "mazebreaker_pickaxe");
        registerTFItem(transformPowder, "transformation_powder");
        registerTFItem(meefRaw, "raw_meef");
        registerTFItem(meefSteak, "cooked_meef");
        registerTFItem(meefStroganoff, "meef_stroganoff");
        registerTFItem(mazeWafer, "maze_wafer");
        registerTFItem(emptyMagicMap, "magic_map_empty");
        registerTFItem(emptyMazeMap, "maze_map_empty");
        registerTFItem(emptyOreMap, "ore_map_empty");
        registerTFItem(oreMagnet, "ore_magnet");
        registerTFItem(crumbleHorn, "crumble_horn");
        registerTFItem(peacockFan, "peacock_fan");
        registerTFItem(moonwormQueen, "moonworm_queen");
        registerTFItem(charmOfLife1, "charm_of_life_1");
        registerTFItem(charmOfLife2, "charm_of_life_2");
        registerTFItem(charmOfKeeping1, "charm_of_keeping_1");
        registerTFItem(charmOfKeeping2, "charm_of_keeping_2");
        registerTFItem(charmOfKeeping3, "charm_of_keeping_3");
        registerTFItem(towerKey, "tower_key");
        registerTFItem(borerEssence, "borer_essence");
        registerTFItem(carminite, "carminite");
        registerTFItem(experiment115, "experiment_115");
        registerTFItem(armorShard, "armor_shard");
        registerTFItem(knightMetal, "knightmetal_ingot");
        registerTFItem(shardCluster, "armor_shard_cluster");
        registerTFItem(knightlyHelm, "knightmetal_helmet");
        registerTFItem(knightlyPlate, "knightmetal_chestplate");
        registerTFItem(knightlyLegs, "knightmetal_leggings");
        registerTFItem(knightlyBoots, "knightmetal_boots");
        registerTFItem(knightlySword, "knightmetal_sword");
        registerTFItem(knightlyPick, "knightmetal_pickaxe");
        registerTFItem(knightlyAxe, "knightmetal_axe");
        registerTFItem(phantomHelm, "phantom_helmet");
        registerTFItem(phantomPlate, "phantom_chestplate");
        registerTFItem(lampOfCinders, "lamp_of_cinders");
        registerTFItem(fieryTears, "fiery_tears");
        registerTFItem(alphaFur, "alpha_fur");
        registerTFItem(yetiHelm, "yeti_helmet");
        registerTFItem(yetiPlate, "yeti_chestplate");
        registerTFItem(yetiLegs, "yeti_leggings");
        registerTFItem(yetiBoots, "yeti_boots");
        registerTFItem(iceBomb, "ice_bomb");
        registerTFItem(arcticFur, "arctic_fur");
        registerTFItem(arcticHelm, "arctic_helmet");
        registerTFItem(arcticPlate, "arctic_chestplate");
        registerTFItem(arcticLegs, "arctic_leggings");
        registerTFItem(arcticBoots, "arctic_boots");
        registerTFItem(magicBeans, "magic_beans");
        registerTFItem(giantPick, "giant_pickaxe");
        registerTFItem(giantSword, "giant_sword");
        registerTFItem(tripleBow, "triple_bow");
        registerTFItem(seekerBow, "seeker_bow");
        registerTFItem(iceBow, "ice_bow");
        registerTFItem(enderBow, "ender_bow");
        registerTFItem(iceSword, "ice_sword");
        registerTFItem(glassSword, "glass_sword");
        registerTFItem(knightmetalRing, "knightmetal_ring");
        registerTFItem(chainBlock, "block_and_chain");
        registerTFItem(cubeTalisman, "cube_talisman");
        registerTFItem(cubeOfAnnihilation, "cube_of_annihilation");
    }

	private static void registerTFItem(Item item, String registryName) {
        item.setRegistryName(TwilightForestMod.ID, registryName);
        GameRegistry.register(item);
	}
}
