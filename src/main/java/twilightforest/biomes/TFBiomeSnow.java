/**
 * 
 */
package twilightforest.biomes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.Achievement;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenTaiga1;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import twilightforest.TFAchievementPage;
import twilightforest.TFFeature;
import twilightforest.entity.EntityTFWinterWolf;
import twilightforest.entity.EntityTFYeti;
import twilightforest.world.TFGenLargeWinter;


/**
 * @author Ben
 *
 */
public class TFBiomeSnow extends TFBiomeBase {

	
	private static final int MONSTER_SPAWN_RATE = 10;
	private Random monsterRNG = new Random(53439L);
	private ArrayList<SpawnListEntry> emptyList = new ArrayList<SpawnListEntry>();

	public TFBiomeSnow(BiomeProperties props) {
		super(props);
		
		getTFBiomeDecorator().setTreesPerChunk(7);
		getTFBiomeDecorator().setGrassPerChunk(1);
        
        getTFBiomeDecorator().canopyPerChunk = -999;
        getTFBiomeDecorator().generateLakes = false;
        
        this.spawnableMonsterList.add(new SpawnListEntry(EntityTFYeti.class, 20, 4, 4));
        this.spawnableMonsterList.add(new SpawnListEntry(EntityTFWinterWolf.class, 5, 1, 4));

	}

	@Override
    public WorldGenAbstractTree genBigTreeChance(Random random)
    {
    	if (random.nextInt(3) == 0) {
    		return new WorldGenTaiga1();
    	} 
    	else if (random.nextInt(8) == 0) {
    		return new TFGenLargeWinter();
    	} 
    	else {
    		return new WorldGenTaiga2(true);
    	}
    }

    @Override
    public boolean getEnableSnow()
    {
        return true;
    }

    @Override
    public boolean canRain()
    {
    	return false;
    }

	@Override
    public List<SpawnListEntry> getSpawnableList(EnumCreatureType par1EnumCreatureType)
    {
    	// if is is monster, then only give it the real list 1/MONSTER_SPAWN_RATE of the time
    	if (par1EnumCreatureType == EnumCreatureType.MONSTER) {
			return monsterRNG.nextInt(MONSTER_SPAWN_RATE) == 0 ? this.spawnableMonsterList : emptyList;
    	}
    	else {
    		return par1EnumCreatureType == EnumCreatureType.CREATURE ? this.spawnableCreatureList : (par1EnumCreatureType == EnumCreatureType.WATER_CREATURE ? this.spawnableWaterCreatureList : (par1EnumCreatureType == EnumCreatureType.AMBIENT ? this.spawnableCaveCreatureList : null));
    	}
    }
    
	@Override
	protected Achievement getRequiredAchievement() {
		return TFAchievementPage.twilightProgressUrghast;
	}

	@Override
	public void enforceProgession(EntityPlayer player, World world) {
		if (!world.isRemote && world.getWorldTime() % 60 == 0) {
			player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 100, 2));
			
			// hint monster?
			if (world.rand.nextInt(4) == 0) {
				TFFeature.yetiCave.trySpawnHintMonster(world, player);
			}
		}
	}
	
	
}
