package gregtech.loaders.postload;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;


import static gregtech.api.enums.GTNH_ExtraMaterials.ExtremeTurbineSteel;
import static gregtech.api.enums.GTNH_ExtraMaterials.TurbineSteel;
import static gregtech.api.enums.GT_Values.*;
import static gregtech.api.enums.Materials.*;
import static gregtech.api.enums.OrePrefixes.*;





public class GT_CustomRecipeLoader implements Runnable {

    public void run() {

            //Blast Furnace Recipes
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(dust, Electrum, 1), GT_Utility.getIntegratedCircuit(11), Nitrogen.getGas(1000), null, GT_OreDictUnificator.get(ingot, Electrum, 1), null, 2000, 480, 2454);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(dust, TurbineSteel, 1), GT_Utility.getIntegratedCircuit(11), Argon.getGas(1000), null, GT_OreDictUnificator.get(ingot, TurbineSteel, 1), null, 2400, 500000, 9000 );
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(dust, Platinum, 1), GT_Utility.getIntegratedCircuit(11), Nitrogen.getGas(1000), null, GT_OreDictUnificator.get(ingot, Platinum, 1), null, 1200,1900, 3500);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(dust, Aluminium, 1),GT_Utility.getIntegratedCircuit(11), Nitrogen.getGas(144), null, GT_OreDictUnificator.get(ingot, Aluminium, 1), null, 1200, 120, 1000);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(dust, Aluminium, 1),GT_Utility.getIntegratedCircuit(11), null, null, GT_OreDictUnificator.get(ingot, Aluminium, 1), null, 1315, 120, 1000);

            //Mixer Recipes
            GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(dust, StainlessSteel, 4), GT_OreDictUnificator.get(dust, Electrum, 1), GT_OreDictUnificator.get(dust, Carbon, 12), GT_OreDictUnificator.get(dust, Oriharukon, 6), null, null, GT_OreDictUnificator.get(dust, TurbineSteel, 11), 4800, Voltage.UV.getVoltage());
            GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(dust, TurbineSteel, 10), GT_OreDictUnificator.get(dust, Neutronium, 1),GT_OreDictUnificator.get(dust, Indium, 2), GT_OreDictUnificator.get(dust, InfinityCatalyst,1), null, null, GT_OreDictUnificator.get(dust, ExtremeTurbineSteel, 14), 4800, Voltage.UHV.getVoltage());
            GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(dust, Ichorium, 1), null, null, null, null, null, GT_OreDictUnificator.get(dust, Blaze, 1), 20, Voltage.LV.getVoltage());

            //Fluid Extractor Recipes
            GT_Values.RA.addFluidExtractionRecipe(GT_OreDictUnificator.get(dust, Aluminium, 1), null, Aluminium.getFluid(144L), 100, 20, Voltage.HV.getVoltage());
            GT_Values.RA.addFluidExtractionRecipe(GT_OreDictUnificator.get(ingot,Aluminium, 1), null, Aluminium.getFluid(288L), 100, 60, Voltage.HV.getVoltage());
            GT_Values.RA.addFluidExtractionRecipe(GT_OreDictUnificator.get(dust,Calcium, 1), null, Calcium.getMolten(144L), 10000, 20, Voltage.LV.getVoltage());
            GT_Values.RA.addFluidExtractionRecipe(GT_OreDictUnificator.get(dust,Calcium, 1), null, Calcium.getMolten(144L), 10000, 20, Voltage.LV.getVoltage());


            //Grinder Recipes
            GT_Values.RA.addGrinderRecipe(GT_OreDictUnificator.get(ore, EnderPearl, 1), null, GT_OreDictUnificator.get(crushed, EnderPearl, 2), GT_OreDictUnificator.get(gem, EnderPearl,1), null, null);
            GT_Values.RA.addPulveriserRecipe(GT_OreDictUnificator.get(ore, EnderPearl, 1), new ItemStack[]{GT_OreDictUnificator.get(crushed, EnderPearl, 2), GT_OreDictUnificator.get(gem, EnderPearl, 1)}, new int[]{10000, 1000}, Voltage.HV.getVoltage(), 2);

            //Centrifuge Recipes
            GT_Values.RA.addCentrifugeRecipe(GT_OreDictUnificator.get(dust, Tungstate, 7L), NI, NF, Oxygen.getGas(576L), GT_OreDictUnificator.get(dust,Tungsten, 1L), GT_OreDictUnificator.get(dust, Lithium, 2L), GT_OreDictUnificator.get(dust, Tungsten, 1L), NI, NI, NI, new int[]{10000, 10000, 750}, 20, Voltage.LV.getVoltage());
            GT_Values.RA.addCentrifugeRecipe(GT_Values.NI, GT_Values.NI, Lava.getFluid(100L), GT_Values.NF, GT_OreDictUnificator.get(nugget, Copper, 1L), GT_OreDictUnificator.get(nugget, Tin, 1L), GT_OreDictUnificator.get(nugget, Gold, 1L), GT_OreDictUnificator.get(nugget, Silver, 1L), GT_OreDictUnificator.get(nugget, Tantalum, 1L), GT_OreDictUnificator.get(dustSmall, Tungstate, 1L), new int[]{2000, 1000, 250, 250, 250, 250}, 80, 80);
            GT_Values.RA.addCentrifugeRecipe(GT_Values.NI, GT_Values.NI, FluidRegistry.getFluidStack("ic2pahoehoelava", 100), GT_Values.NF, GT_OreDictUnificator.get(nugget, Copper, 1L), GT_OreDictUnificator.get(nugget, Tin, 1L), GT_OreDictUnificator.get(nugget, Gold, 1L), GT_OreDictUnificator.get(nugget, Silver, 1L), GT_OreDictUnificator.get(nugget, Tantalum, 1L), GT_OreDictUnificator.get(dustSmall, Tungstate, 1L), new int[]{2000, 1000, 250, 250, 250, 250}, 40, 80);



            //Electrolyzer Recipes
            GT_Values.RA.addElectrolyzerRecipe(GT_OreDictUnificator.get(dust, Tungstate, 7L), NI, NF, Oxygen.getGas(576L), GT_OreDictUnificator.get(dust, Tungsten, 1L), GT_OreDictUnificator.get(dust, Lithium, 2L), GT_OreDictUnificator.get(dust, Tungsten, 1L), NI, NI, NI, new int[]{10000, 10000, 1000},20, Voltage.MV.getVoltage());
            GT_Values.RA.addElectrolyzerRecipe(GT_OreDictUnificator.get(dust, Tungstate, 7L), NI, NF, Oxygen.getGas(576L), GT_OreDictUnificator.get(dust, Tungsten, 1L), GT_OreDictUnificator.get(dust, Lithium, 2L), NI, NI, NI, NI, null, 20, Voltage.MV.getVoltage());

            //Fusion Recipes, custom tailored to work with my turbines and their respective values. Don't like 'em, fork it and remove this section.
            //v- This feeds an extra efficient turbine made from turbine steel at perfect flow rate and produces a metric shitton of EU.
            GT_Values.RA.addFusionReactorRecipe(Aluminium.getMolten(120L), Gallium.getMolten(120L), Neutronium.getPlasma(240L), 20, 131072, 320000000);
            GT_Values.RA.addFusionReactorRecipe(Beryllium.getMolten(120L), Gallium.getMolten(120L), DraconiumAwakened.getPlasma(240L), 20, 524288, 320000000);
            GT_Values.RA.addFusionReactorRecipe(Aluminium.getMolten(272L), Helium_3.getGas(272L), Radon.getPlasma(545L), 20, 131072, 480000000);

            GT_Values.RA.addFusionReactorRecipe(Deuterium.getGas(72L), Tritium.getGas(72L), Radon.getPlasma(144L), 20, 131072, 320000000);

            //Test Recipes
            GT_Values.RA.addMixerRecipe(EnderPearl.getGems(4), Redstone.getDust(4), Neutronium.getDustTiny(1), GT_Utility.getIntegratedCircuit(14), null, null, Infinity.getDustTiny(1), 2400, Voltage.UHV.getVoltage());




    }

        enum Voltage {
                ULV, LV, MV,
                HV, EV, IV,
                LUV, ZPM, UV,
                UHV, UEV, UIV,
                UMV, UXV, OpV,
                MAX;
                public int getVoltage() {
                        return (int) (V[this.ordinal()] / 1.5);
                }

        }


}


