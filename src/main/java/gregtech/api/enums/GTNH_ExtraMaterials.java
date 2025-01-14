package gregtech.api.enums;

import gregtech.api.interfaces.IMaterialHandler;

import java.util.Arrays;

import static gregtech.GT_Mod.GT_FML_LOGGER;

public class GTNH_ExtraMaterials implements IMaterialHandler {

    public GTNH_ExtraMaterials(){
        GT_FML_LOGGER.info("Registering GTNH-Materials (post Java 64kb limit)");
        Materials.add(this);
    }

    /**
     * This Class is for adding new Materials since Java has a Limiation of 64kb per Method / Class header
     */

    public static Materials Signalum                = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  2, 1|2                       , 255, 255, 255,   0,   "Signalum"                ,   "Signalum"                      ,    0,       0,         -1,    0, false, false,   3,   1,   1, Dyes._NULL          );
    public static Materials Lumium                  = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  2, 1|2                       , 255, 255, 255,   0,   "Lumium"                  ,   "Lumium"                        ,    0,       0,         -1,    0, false, false,   3,   1,   1, Dyes._NULL          );
    public static Materials EnrichedCopper          = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  2, 1|2                       , 255, 255, 255,   0,   "EnrichedCopper"          ,   "Enriched Copper"               ,    0,       0,         -1,    0, false, false,   3,   1,   1, Dyes._NULL          );
    public static Materials DiamondCopper           = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  2, 1|2                       , 255, 255, 255,   0,   "DiamondCopper"           ,   "Diamond Copper"                ,    0,       0,         -1,    0, false, false,   3,   1,   1, Dyes._NULL          );
    public static Materials TarPitch                = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  2, 1|2                       , 255, 255, 255,   0,   "TarPitch"                ,   "Tar Pitch"                     ,    0,       0,         -1,    0, false, false,   3,   1,   1, Dyes._NULL          );
    public static Materials LimePure                = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  0, 0                         , 255, 255, 255,   0,   "LimePure"                ,   "Pure Lime"                     ,    0,       0,         -1,    0, false, false,   1,   1,   1, Dyes.dyeLime        );
    public static Materials Wimalite                = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  2,       8                   , 255, 255, 255,   0,   "Wimalite"                ,   "Wimalite"                      ,    0,       0,         -1,    0, false, false,   3,   1,   1, Dyes.dyeYellow      );
    public static Materials Yellorite               = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  2,       8                   , 255, 255, 255,   0,   "Yellorite"               ,   "Yellorite"                     ,    0,       0,         -1,    0, false, false,   3,   1,   1, Dyes.dyeYellow      );
    public static Materials Quantum                 = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  0, 0                         , 255, 255, 255,   0,   "Quantum"                 ,   "Quantum"                       ,    0,       0,         -1,    0, false, false,   1,   1,   1, Dyes.dyeWhite       );
    public static Materials Turquoise               = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  1, 1                         , 255, 255, 255,   0,   "Turquoise"               ,   "Turquoise"                     ,    0,       0,         -1,    0, false, false,   3,   1,   1, Dyes._NULL          );
    public static Materials Tapazite                = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  1, 1                         , 255, 255, 255,   0,   "Tapazite"                ,   "Tapazite"                      ,    0,       0,         -1,    0, false, false,   3,   1,   1, Dyes.dyeGreen       );
    public static Materials Thyrium                 = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  1, 1|2  |8                   , 255, 255, 255,   0,   "Thyrium"                 ,   "Thyrium"                       ,    0,       0,         -1,    0, false, false,   3,   1,   1, Dyes._NULL          );
    public static Materials Tourmaline              = new Materials(  -1, TextureSet.SET_RUBY              ,   1.0F,      0,  1, 1                         , 255, 255, 255,   0,   "Tourmaline"              ,   "Tourmaline"                    ,    0,       0,         -1,    0, false, false,   3,   1,   1, Dyes._NULL          );
    public static Materials Spinel                  = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  1, 0                         , 255, 255, 255,   0,   "Spinel"                  ,   "Spinel"                        ,    0,       0,         -1,    0, false, false,   3,   1,   1, Dyes._NULL          );
    public static Materials Starconium              = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  1, 1|2  |8                   , 255, 255, 255,   0,   "Starconium"              ,   "Starconium"                    ,    0,       0,         -1,    0, false, false,   3,   1,   1, Dyes._NULL          );
    public static Materials Sugilite                = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  1, 1                         , 255, 255, 255,   0,   "Sugilite"                ,   "Sugilite"                      ,    0,       0,         -1,    0, false, false,   3,   1,   1, Dyes._NULL          );
    public static Materials Prismarine              = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  2, 1  |4                     , 255, 255, 255,   0,   "Prismarine"              ,   "Prismarine"                    ,    0,       0,         -1,    0, false, false,   3,   1,   1, Dyes._NULL          );
    public static Materials GraveyardDirt           = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  2, 1                         , 255, 255, 255,   0,   "GraveyardDirt"           ,   "Graveyard Dirt"                ,    0,       0,         -1,    0, false, false,   3,   1,   1, Dyes._NULL          );
    public static Materials Tennantite              = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  2, 1                         , 255, 255, 255,   0,   "Tennantite"              ,   "Tennantite"                    ,    0,       0,         -1,    0, false, false,   3,   1,   1, Dyes._NULL          );
    public static Materials Fairy                   = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  2, 1|2                       , 255, 255, 255,   0,   "Fairy"                   ,   "Fairy"                         ,    0,       0,         -1,    0, false, false,   3,   1,   1, Dyes._NULL          );
    public static Materials Ludicrite               = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  2, 1|2                       , 255, 255, 255,   0,   "Ludicrite"               ,   "Ludicrite"                     ,    0,       0,         -1,    0, false, false,   3,   1,   1, Dyes._NULL          );
    public static Materials AquaRegia               = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  2, 0                         , 255, 255, 255,   0,   "AquaRegia"               ,   "Aqua Regia"                    ,    0,       0,         -1,    0, false, false,   3,   1,   1, Dyes._NULL          );
    public static Materials SolutionBlueVitriol     = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  2, 0                         , 255, 255, 255,   0,   "SolutionBlueVitriol"     ,   "Blue Vitriol Solution"         ,    0,       0,         -1,    0, false, false,   3,   1,   1, Dyes._NULL          );
    public static Materials SolutionNickelSulfate   = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  2, 0                         , 255, 255, 255,   0,   "SolutionNickelSulfate"   ,   "Nickel Sulfate Solution"       ,    0,       0,         -1,    0, false, false,   3,   1,   1, Dyes._NULL          );
    public static Materials Lodestone               = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  1, 1    |8                   , 255, 255, 255,   0,   "Lodestone"               ,   "Lodestone"                     ,    0,       0,         -1,    0, false, false,   1,   1,   1, Dyes._NULL          );
    public static Materials Luminite                = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  1, 1    |8                   , 250, 250, 250,   0,   "Luminite"                ,   "Luminite"                      ,    0,       0,         -1,    0, false, false,   3,   1,   1, Dyes.dyeWhite       );
    public static Materials TurbineSteel            = new Materials( 485, TextureSet.SET_SHINY              ,  512.0F, 10485760,12,  1|2    |32|64|128     , 189, 213, 172,   0,   "TurbineSteel"           ,   "Turbine Steel"               ,    0,       0,         9000,  9000,true, false,  20,   1,   1, Dyes.dyeWhite       , Arrays.asList(new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 4), new TC_Aspects.TC_AspectStack(TC_Aspects.VITREUS, 3), new TC_Aspects.TC_AspectStack(TC_Aspects.ALIENIS, 2)));
    public static Materials ExtremeTurbineSteel     = new Materials( 958, TextureSet.SET_SHINY              ,  1024.0F, 20485760,13,  1|2    |32|64|128     , 189, 172, 213,   0,   "ExtremeTurbineSteel"    ,   "Extreme Turbine Steel"        ,    0,       0,         9000,  9000,true, false,  20,   1,   1, Dyes.dyeWhite       , Arrays.asList(new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 4), new TC_Aspects.TC_AspectStack(TC_Aspects.VITREUS, 3), new TC_Aspects.TC_AspectStack(TC_Aspects.ALIENIS, 2)));



    private static void initSubTags() {
        SubTag.METAL.addTo(Signalum, Lumium, EnrichedCopper, DiamondCopper);
        SubTag.NO_SMASHING.addTo(TarPitch);
    }

    @Override
    public void onMaterialsInit() {
        initSubTags();
    }

    @Override
    public void onComponentInit() {
    }

    @Override
    public void onComponentIteration(Materials aMaterial) {

    }
}
