package gregtech.loaders.postload;

import cpw.mods.fml.common.Loader;
import crazypants.enderio.material.Material;
import gregtech.api.enums.*;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import static gregtech.api.enums.GTNH_ExtraMaterials.*;
import static gregtech.api.enums.Materials.*;



public class GT_CustomRecipeLoader implements Runnable {

    public void run() {

            //Blast Furnace Recipes
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Electrum, 1), GT_Utility.getIntegratedCircuit(11), Nitrogen.getGas(1000), null, GT_OreDictUnificator.get(OrePrefixes.ingot, Electrum, 1), null, 2000, 480, 2454);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, TurbineSteel, 1), GT_Utility.getIntegratedCircuit(11), Argon.getGas(1000), null, GT_OreDictUnificator.get(OrePrefixes.ingot, TurbineSteel, 1), null, 2400, 500000, 9000 );
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Platinum, 1), GT_Utility.getIntegratedCircuit(11), Nitrogen.getGas(1000), null, GT_OreDictUnificator.get(OrePrefixes.ingot, Platinum, 1), null, 1200,1900, 3500);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Aluminium, 1),GT_Utility.getIntegratedCircuit(11), Nitrogen.getGas(144), null, GT_OreDictUnificator.get(OrePrefixes.ingot, Aluminium, 1), null, 1200, 120, 1000);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Aluminium, 1),GT_Utility.getIntegratedCircuit(11), null, null, GT_OreDictUnificator.get(OrePrefixes.ingot, Aluminium, 1), null, 1315, 120, 1000);

            //Mixer Recipes
            GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, StainlessSteel, 4), GT_OreDictUnificator.get(OrePrefixes.dust, Electrum, 1), GT_OreDictUnificator.get(OrePrefixes.dust, Carbon, 12), GT_OreDictUnificator.get(OrePrefixes.dust, Oriharukon, 6), null, null, GT_OreDictUnificator.get(OrePrefixes.dust, TurbineSteel, 11), 4800, 500000);
            GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, TurbineSteel, 10), GT_OreDictUnificator.get(OrePrefixes.dust, Neutronium, 1),GT_OreDictUnificator.get(OrePrefixes.dust, Indium, 2), GT_OreDictUnificator.get(OrePrefixes.dust, InfinityCatalyst,1), null, null, GT_OreDictUnificator.get(OrePrefixes.dust, ExtremeTurbineSteel, 14), 4800, 2000000);
            GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Ichorium, 1), null, null, null, null, null, GT_OreDictUnificator.get(OrePrefixes.dust, Blaze, 1), 20, 32);

            //Fluid Extractor Recipes
            GT_Values.RA.addFluidExtractionRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Aluminium, 1), null, Aluminium.getFluid(144L), 100, 20, 480);
            GT_Values.RA.addFluidExtractionRecipe(GT_OreDictUnificator.get(OrePrefixes.ingot,Aluminium, 1), null, Aluminium.getFluid(288L), 100, 60, 480);

            //Fusion Recipes, custom tailored to work with my turbines and their respective values. Don't like 'em, fork it and remove this section.
            //v- This feeds an extra efficient turbine made from turbine steel at perfect flow rate and produces a metric shitton of EU.
            GT_Values.RA.addFusionReactorRecipe(Aluminium.getMolten(120L), Redstone.getMolten(120L), Neutronium.getPlasma(240L), 20, 131072, 320000000);
            GT_Values.RA.addFusionReactorRecipe(Aluminium.getMolten(272L), Helium_3.getGas(272L), Radon.getPlasma(545L), 20, 131072, 480000000);
    }


}
