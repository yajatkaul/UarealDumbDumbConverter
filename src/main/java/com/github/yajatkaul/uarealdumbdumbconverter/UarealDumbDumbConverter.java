package com.github.yajatkaul.uarealdumbdumbconverter;

import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class UarealDumbDumbConverter implements ModInitializer {
    private static final String DUMB_DUMB_MODID = "genesisforms";
    private static final String CHAD_MODID = "gimme-that-gimmick";

    @Override
    public void onInitialize() {
        convert("dynamax_band", "dynamax_band");
        convert("mega_cuff", "mega_bracelet");
        convert("mega_charm", "mega_bracelet");
        convert("mega_ring", "mega_bracelet");
        convert("mega_bracelet", "mega_bracelet");
        convert("key_stone", "mega_bracelet");
        convert("tera_orb", "tera_orb");
        convert("z_ring", "z_ring");
        convert("z_power_ring", "z_ring");

        convert("dynamax_candy", "dynamax_candy");
        convert("max_mushrooms", "max_mushrooms");
        convert("max_soup", "max_soup");

        convert("normal_tera_shard", "normal_tera_shard");
        convert("fire_tera_shard", "fire_tera_shard");
        convert("water_tera_shard", "water_tera_shard");
        convert("electric_tera_shard", "electric_tera_shard");
        convert("grass_tera_shard", "grass_tera_shard");
        convert("ice_tera_shard", "ice_tera_shard");
        convert("fighting_tera_shard", "fighting_tera_shard");
        convert("poison_tera_shard", "poison_tera_shard");
        convert("ground_tera_shard", "ground_tera_shard");
        convert("flying_tera_shard", "flying_tera_shard");
        convert("psychic_tera_shard", "psychic_tera_shard");
        convert("bug_tera_shard", "bug_tera_shard");
        convert("rock_tera_shard", "rock_tera_shard");
        convert("ghost_tera_shard", "ghost_tera_shard");
        convert("dragon_tera_shard", "dragon_tera_shard");
        convert("dark_tera_shard", "dark_tera_shard");
        convert("steel_tera_shard", "steel_tera_shard");
        convert("fairy_tera_shard", "fairy_tera_shard");
        convert("stellar_tera_shard", "stellar_tera_shard");

        convert("rusted_sword", "rustedsword");
        convert("rusted_shield", "rustedshield");
        convert("blue_orb", "blueorb");
        convert("red_orb", "redorb");
        convert("rusted_shield", "rustedshield");

        convert("shock_drive", "shockdrive");
        convert("burn_drive", "burndrive");
        convert("chill_drive", "chilldrive");
        convert("douse_drive", "dousedrive");

        convert("cornerstone_mask", "cornerstonemask");
        convert("hearthflame_mask", "hearthflamemask");
        convert("wellspring_mask", "wellspringmask");

        convert("normal_memory", "normalmemory");
        convert("fire_memory", "firememory");
        convert("water_memory", "watermemory");
        convert("electric_memory", "electricmemory");
        convert("grass_memory", "grassmemory");
        convert("ice_memory", "icememory");
        convert("fighting_memory", "fightingmemory");
        convert("poison_memory", "poisonmemory");
        convert("ground_memory", "groundmemory");
        convert("flying_memory", "flyingmemory");
        convert("psychic_memory", "psychicmemory");
        convert("bug_memory", "bugmemory");
        convert("rock_memory", "rockmemory");
        convert("ghost_memory", "ghostmemory");
        convert("dragon_memory", "dragonmemory");
        convert("dark_memory", "darkmemory");
        convert("steel_memory", "steelmemory");
        convert("fairy_memory", "fairymemory");

        convert("draco_plate", "dracoplate");
        convert("dread_plate", "dreadplate");
        convert("earth_plate", "earthplate");
        convert("fist_plate", "fistplate");
        convert("flame_plate", "flameplate");
        convert("icicle_plate", "icicleplate");
        convert("insect_plate", "insectplate");
        convert("iron_plate", "ironplate");
        convert("meadow_plate", "meadowplate");
        convert("mind_plate", "mindplate");
        convert("pixie_plate", "pixieplate");
        convert("sky_plate", "skyplate");
        convert("splash_plate", "splashplate");
        convert("spooky_plate", "spookyplate");
        convert("stone_plate", "stoneplate");
        convert("toxic_plate", "toxicplate");
        convert("zap_plate", "zapplate");

        convert("normalium-z", "normaliumz");
        convert("firium-z", "firiumz");
        convert("waterium-z", "wateriumz");
        convert("electrium-z", "electriumz");
        convert("grassium-z", "grassiumz");
        convert("icium-z", "iciumz");
        convert("fightinium-z", "fightiniumz");
        convert("poisonium-z", "poisoniumz");
        convert("groundium-z", "groundiumz");
        convert("flyinium-z", "flyiniumz");
        convert("psychium-z", "psychiumz");
        convert("buginium-z", "buginiumz");
        convert("rockium-z", "rockiumz");
        convert("ghostium-z", "ghostiumz");
        convert("dragonium-z", "dragoniumz");
        convert("darkinium-z", "darkiniumz");
        convert("steelium-z", "steeliumz");
        convert("fairium-z", "fairiumz");

        convert("aloraichium-z", "aloraichiumz");
        convert("decidium-z", "decidiumz");
        convert("incinium-z", "inciniumz");
        convert("primarium-z", "primariumz");
        convert("eevium-z", "eeviumz");
        convert("pikanium-z", "pikaniumz");
        convert("snorlium-z", "snorliumz");
        convert("mewnium-z", "mewniumz");
        convert("tapunium-z", "tapuniumz");
        convert("marshadium-z", "marshadiumz");
        convert("kommonium-z", "kommoniumz");
        convert("lycanium-z", "lycaniumz");
        convert("mimikium-z", "mimikiumz");
        convert("solganium-z", "solganiumz");
        convert("lunalium-z", "lunaliumz");
        convert("ultranecrozium-z", "ultranecroziumz");

        convert("dna_splicers", "dna_splicers");
        convert("reins_of_unity", "reigns_of_unity");
        convert("n_lunarizer", "n_lunarizer");
        convert("n_solarizer", "n_solarizer");

        convert("adamant_crystal", "adamantcrystal");
        convert("lustrous_globe", "lustrousglobe");
        convert("griseous_core", "griseouscore");
        convert("gracidea_flower", "gracidea_flower");
        convert("pink_nectar", "pink_nectar");
        convert("purple_nectar", "purple_nectar");
        convert("red_nectar", "red_nectar");
        convert("yellow_nectar", "yellow_nectar");
        convert("prison_bottle", "prison_bottle");
        convert("reveal_glass", "reveal_glass");
        convert("meteorite", "meteorite");
        convert("rotom_catalog", "rotom_catalog");

        //TODO rotom blocks and held items

        convert("zygarde_cube", "zygarde_cube");

        convert("wishing_star", "dynamax_band");
        convert("sparkling_stone", "z_ring");

        //TODO
        convert("mega_shard", "zygarde_cube");

        convert("abomasite", "abomasite");
        convert("absolite", "absolite");
        convert("aerodactylite", "aerodactylite");
        convert("aggronite", "aggronite");
        convert("alakazite", "alakazite");
        convert("altarianite", "altarianite");
        convert("ampharosite", "ampharosite");
        convert("audinite", "audinite");
        convert("banettite", "banettite");
        convert("barbaracite", "barbaracite");
        convert("baxcalibrite", "baxcalibrite");
        convert("beedrillite", "beedrillite");
        convert("blastoisinite", "blastoisinite");
        convert("blazikenite", "blazikenite");
        convert("cameruptite", "cameruptite");
        convert("chandelurite", "chandelurite");
        convert("chesnaughtite", "chesnaughtite");
        convert("chimechite", "chimechite");
        convert("clefablite", "clefablite");
        convert("crabominite", "crabominite");
        convert("darkranite", "darkranite");
        convert("delphoxite", "delphoxite");
        convert("diancite", "diancite");
        convert("dragalgite", "dragalgite");
        convert("dragoninite", "dragoninite");
        convert("drampanite", "drampanite");
        convert("eelektrossite", "eelektrossite");
        convert("emboarite", "emboarite");
        convert("excadrite", "excadrite");
        convert("falinksite", "falinksite");
        convert("feraligite", "feraligite");
        convert("floettite", "floettite");
        convert("froslassite", "froslassite");
        convert("galladite", "galladite");
        convert("garchompite", "garchompite");
        convert("gardevoirite", "gardevoirite");
        convert("gengarite", "gengarite");
        convert("glalitite", "glalitite");
        convert("glimmoranite", "glimmoranite");
        convert("golisopite", "golisopite");
        convert("golurkite", "golurkite");
        convert("greninjite", "greninjite");
        convert("gyaradosite", "gyaradosite");
        convert("hawluchanite", "hawluchanite");
        convert("heatranite", "heatranite");
        convert("heracronite", "heracronite");
        convert("houndoominite", "houndoominite");
        convert("kangaskhanite", "kangaskhanite");
        convert("latiasite", "latiasite");
        convert("latiosite", "latiosite");
        convert("lopunnite", "lopunnite");
        convert("lucarionite", "lucarionite");
        convert("magearnite", "magearnite");
        convert("malamarite", "malamarite");
        convert("manectite", "manectite");
        convert("mawilite", "mawilite");
        convert("medichamite", "medichamite");
        convert("meganiumite", "meganiumite");
        convert("meowsticite", "meowsticite");
        convert("metagrossite", "metagrossite");
        convert("pidgeotite", "pidgeotite");
        convert("pinsirite", "pinsirite");
        convert("pyroarite", "pyroarite");
        convert("sablenite", "sablenite");
        convert("salamencite", "salamencite");
        convert("sceptilite", "sceptilite");
        convert("scizorite", "scizorite");
        convert("scolipite", "scolipite");
        convert("scovillainite", "scovillainite");
        convert("scraftinite", "scraftinite");
        convert("sharpedonite", "sharpedonite");
        convert("skarmorite", "skarmorite");
        convert("slowbronite", "slowbronite");
        convert("staraptite", "staraptite");
        convert("starminite", "starminite");
        convert("steelixite", "steelixite");
        convert("swampertite", "swampertite");
        convert("tatsugirinite", "tatsugirinite");
        convert("tyranitarite", "tyranitarite");
        convert("venusaurite", "venusaurite");
        convert("victreebelite", "victreebelite");
        convert("zeraorite", "zeraorite");
        convert("zygardite", "zygardite");
        convert("charizardite-x", "charizarditex");
        convert("charizardite-y", "charizarditey");
        convert("mewtwonite-x", "mewtwonitex");
        convert("mewtwonite-y", "mewtwonitey");
        convert("raichunite-x", "raichunitex");
        convert("raichunite-y", "raichunitey");
        convert("absolite-z", "absolitez");
        convert("garchompite-z", "garchompitez");
        convert("lucarionite-z", "lucarionitez");

    }

    private static void convert(String oldId, String newId) {
        Registries.ITEM.addAlias(Identifier.of(DUMB_DUMB_MODID, oldId), Identifier.of(CHAD_MODID, newId));
    }
}
