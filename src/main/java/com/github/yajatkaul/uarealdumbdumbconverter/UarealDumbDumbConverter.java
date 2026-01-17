package com.github.yajatkaul.uarealdumbdumbconverter;

import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class UarealDumbDumbConverter implements ModInitializer {
    private static final String DUMB_DUMB_MODID = "genesisforms";
    private static final String CHAD_MODID = "gimme-that-gimmick";
    private static final String GIGACHAD_MODID = "pokelegenditems";

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
        convert("pink_nectar", "pinknectar");
        convert("purple_nectar", "purplenectar");
        convert("red_nectar", "rednectar");
        convert("yellow_nectar", "yellownectar");
        convert("prison_bottle", "prison_bottle");
        convert("reveal_glass", "reveal_glass");
        convert("meteorite", "meteorite");
        convert("rotom_catalog", "rotom_catalog");

        //TODO take permission
        convert("rotom_fan", "rotom_catalog");
        convert("rotom_microwave_oven", "rotom_catalog");
        convert("rotom_lawn_mower", "rotom_catalog");
        convert("rotom_refrigerator", "rotom_catalog");
        convert("rotom_washing_machine", "rotom_catalog");
        convert("rotom_light_bulb", "rotom_catalog");

        convert("zygarde_cube", "zygarde_cube");

        convert("wishing_star", "dynamax_band");
        convert("sparkling_stone", "z_ring");

        //TODO
        convert("mega_shard", "zygarde_cube");

        convert("venusaurite", "venusaurite");
        convert("charizardite-x", "charizarditex");
        convert("charizardite-y", "charizarditey");
        convert("blastoisinite", "blastoisinite");
        convert("alakazite", "alakazite");
        convert("gengarite", "gengarite");
        convert("kangaskhanite", "kangaskhanite");
        convert("pinsirite", "pinsirite");
        convert("gyaradosite", "gyaradosite");
        convert("aerodactylite", "aerodactylite");
        convert("mewtwonite-x", "mewtwonitext");
        convert("mewtwonite-y", "mewtwonitey");
        convert("ampharosite", "ampharosite");
        convert("scizorite", "scizorite");
        convert("heracronite", "heracronite");
        convert("houndoominite", "houndoominite");
        convert("tyranitarite", "tyranitarite");
        convert("blazikenite", "blazikenite");
        convert("gardevoirite", "gardevoirite");
        convert("mawilite", "mawilite");
        convert("aggronite", "aggronite");
        convert("medichamite", "medichamite");
        convert("manectite", "manectite");
        convert("banettite", "banettite");
        convert("absolite", "absolite");
        convert("latiasite", "latiasite");
        convert("latiosite", "latiosite");
        convert("garchompite", "garchompite");
        convert("lucarionite", "lucarionite");
        convert("abomasite", "abomasite");
        convert("beedrillite", "beedrillite");
        convert("pidgeotite", "pidgeotite");
        convert("slowbronite", "slowbronite");
        convert("steelixite", "steelixite");
        convert("sceptilite", "sceptilite");
        convert("swampertite", "swampertite");
        convert("sablenite", "sablenite");
        convert("sharpedonite", "sharpedonite");
        convert("cameruptite", "cameruptite");
        convert("altarianite", "altarianite");
        convert("glalitite", "glalitite");
        convert("salamencite", "salamencite");
        convert("metagrossite", "metagrossite");
        convert("lopunnite", "lopunnite");
        convert("galladite", "galladite");
        convert("audinite", "audinite");
        convert("diancite", "diancite");
        convertChad("clefablite", "clefablite");
        convertChad("victreebelite", "victreebelite");
        convertChad("starminite", "starminite");
        convertChad("dragoninite", "dragoninite");
        convertChad("meganiumite", "meganiumite");
        convertChad("feraligite", "feraligite");
        convertChad("skarmorite", "skarmorite");
        convertChad("froslassite", "froslassite");
        convertChad("emboarite", "emboarite");
        convertChad("excadrite", "excadrite");
        convertChad("scolipite", "scolipite");
        convertChad("scraftinite", "scraftinite");
        convertChad("eelektrossite", "eelektrossite");
        convertChad("chandelurite", "chandelurite");
        convertChad("chesnaughtite", "chesnaughtite");
        convertChad("delphoxite", "delphoxite");
        convertChad("greninjite", "greninjite");
        convertChad("pyroarite", "pyroarite");
        convertChad("floettite", "floettite");
        convertChad("malamarite", "malamarite");
        convertChad("barbaracite", "barbaracite");
        convertChad("dragalgite", "dragalgite");
        convertChad("hawluchanite", "hawluchanite");
        convertChad("zygardite", "zygardite");
        convertChad("drampanite", "drampanite");
        convertChad("falinksite", "falinksite");
        convertChad("raichunite-x", "raichunitex");
        convertChad("raichunite-y", "raichunitey");
        convertChad("chimechite", "chimechite");
        convertChad("absolite-z", "absolitez");
        convertChad("staraptite", "staraptite");
        convertChad("garchompite-z", "garchompitez");
        convertChad("lucarionite-z", "lucarionitez");
        convertChad("heatranite", "heatranite");
        convertChad("darkranite", "darkranite");
        convertChad("golurkite", "golurkite");
        convertChad("meowsticite", "meowsticite");
        convertChad("crabominite", "crabominite");
        convertChad("golisopite", "golisopite");
        convertChad("magearnite", "magearnite");
        convertChad("zeraorite", "zeraorite");
        convertChad("scovillainite", "scovillainite");
        convertChad("glimmoranite", "glimmoranite");
        convertChad("tatsugirinite", "tatsugirinite");
        convertChad("baxcalibrite", "baxcalibrite");

        convertChad("adrenaline_orb", "adrenaline_orb");
        convertChad("berserk_gene", "berserk_gene");
        convertChad("booster_energy", "berserk_gene");
        convertChad("lucky_punch", "lucky_punch");
        convertChad("macho_brace", "macho_brace");
        convertChad("adamant_orb", "adamant_orb");
        convertChad("griseous_orb", "griseous_orb");
        convertChad("lustrous_orb", "lustrous_orb");
    }

    private static void convert(String oldId, String newId) {
        Registries.ITEM.addAlias(Identifier.of(DUMB_DUMB_MODID, oldId), Identifier.of(CHAD_MODID, newId));
    }

    private static void convertChad(String oldId, String newId) {
        Registries.ITEM.addAlias(Identifier.of(DUMB_DUMB_MODID, oldId), Identifier.of(GIGACHAD_MODID, newId));
    }
}
