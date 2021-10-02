package gregtech.loaders.postload;

import gregtech.api.GregTech_API;
import gregtech.api.enums.*;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;


import static gregtech.api.enums.GTNH_ExtraMaterials.ExtremeTurbineSteel;
import static gregtech.api.enums.GTNH_ExtraMaterials.TurbineSteel;
import static gregtech.api.enums.GT_Values.*;
import static gregtech.api.enums.Materials.*;
import static gregtech.api.enums.OrePrefixes.*;





public class GT_CustomRecipeLoader implements Runnable {

        public void run() {

                //Blast Furnace Recipes
                GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(dust, Electrum, 1), GT_Utility.getIntegratedCircuit(11), Nitrogen.getGas(1000), null, GT_OreDictUnificator.get(ingot, Electrum, 1), null, 2000, 480, 2454);
                GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(dust, TurbineSteel, 1), GT_Utility.getIntegratedCircuit(11), Argon.getGas(1000), null, GT_OreDictUnificator.get(ingot, TurbineSteel, 1), null, 2400, 500000, 9000);
                GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(dust, Platinum, 1), GT_Utility.getIntegratedCircuit(11), Nitrogen.getGas(1000), null, GT_OreDictUnificator.get(ingot, Platinum, 1), null, 1200, 1900, 3500);
                GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(dust, Aluminium, 1), GT_Utility.getIntegratedCircuit(11), Nitrogen.getGas(144), null, GT_OreDictUnificator.get(ingot, Aluminium, 1), null, 1200, 120, 1000);
                GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(dust, Aluminium, 1), GT_Utility.getIntegratedCircuit(11), null, null, GT_OreDictUnificator.get(ingot, Aluminium, 1), null, 1315, 120, 1000);

                //Mixer Recipes
                GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(dust, StainlessSteel, 4), GT_OreDictUnificator.get(dust, Electrum, 1), GT_OreDictUnificator.get(dust, Carbon, 12), GT_OreDictUnificator.get(dust, Oriharukon, 6), null, null, GT_OreDictUnificator.get(dust, TurbineSteel, 11), 4800, Voltage.UV.getVoltage());
                GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(dust, TurbineSteel, 10), GT_OreDictUnificator.get(dust, Neutronium, 1), GT_OreDictUnificator.get(dust, Indium, 2), GT_OreDictUnificator.get(dust, InfinityCatalyst, 1), null, null, GT_OreDictUnificator.get(dust, ExtremeTurbineSteel, 14), 4800, Voltage.UHV.getVoltage());
                GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(dust, Ichorium, 1), null, null, null, null, null, GT_OreDictUnificator.get(dust, Blaze, 1), 20, Voltage.LV.getVoltage());

                //Fluid Extractor Recipes
                GT_Values.RA.addFluidExtractionRecipe(GT_OreDictUnificator.get(dust, Aluminium, 1), null, Aluminium.getFluid(144L), 100, 20, Voltage.HV.getVoltage());
                GT_Values.RA.addFluidExtractionRecipe(GT_OreDictUnificator.get(ingot, Aluminium, 1), null, Aluminium.getFluid(288L), 100, 60, Voltage.HV.getVoltage());
                GT_Values.RA.addFluidExtractionRecipe(GT_OreDictUnificator.get(dust, Calcium, 1), null, Calcium.getMolten(144L), 10000, 20, Voltage.LV.getVoltage());
                GT_Values.RA.addFluidExtractionRecipe(GT_OreDictUnificator.get(dust, Calcium, 1), null, Calcium.getMolten(144L), 10000, 20, Voltage.LV.getVoltage());

                //Canner Recipes
                GT_Values.RA.addCannerRecipe(ItemList.Large_Fluid_Cell_Neutronium.get(1L), GT_OreDictUnificator.get(OrePrefixes.dust, Infinity, 3), ItemList.IFCell_1.get(1L), null, 30, 16);

                //Assembler Recipes
                GT_Values.RA.addAssemblerRecipe(new ItemStack[] {ItemList.IFCell_1.get(2L), GT_OreDictUnificator.get(stick, Neutronium, 4L), GT_Utility.getIntegratedCircuit(2)}, null, ItemList.IFCell_2.get(1L), 100, 400);
                GT_Values.RA.addAssemblerRecipe(new ItemStack[] {ItemList.IFCell_1.get(4L), GT_OreDictUnificator.get(stickLong, Neutronium, 6L), GT_Utility.getIntegratedCircuit(4)}, null, ItemList.IFCell_4.get(1L), 150, 400);
                GT_Values.RA.addAssemblerRecipe(new ItemStack[] {ItemList.IFCell_2.get(2L), GT_OreDictUnificator.get(stick, Neutronium, 4L), GT_Utility.getIntegratedCircuit(5)}, null, ItemList.IFCell_4.get(1L), 100, 400);
                //Fuel rod disassembly recipes, because centrifuging singles gives great resources while centrifuging 2x and 4x rods gives shit all comparatively.
                //I can't be bothered to do the math for each rod type, so disassemble your spent rods instead! Apparently this behaviour is intended. Well, not anymore.
                GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("IC2", "reactorUraniumQuaddepleted", 1L, 0), GT_Utility.getIntegratedCircuit(1), GT_ModHandler.getModItem("IC2", "reactorUraniumSimpledepleted", 4L, 0), 20, Voltage.HV.getVoltage());
                GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("IC2", "reactorUraniumDualdepleted", 1L, 0), GT_Utility.getIntegratedCircuit(1), GT_ModHandler.getModItem("IC2", "reactorUraniumSimpledepleted", 2L, 0), 20, Voltage.HV.getVoltage());
                GT_Values.RA.addAssemblerRecipe(ItemList.Depleted_Thorium_4.get(1L), GT_Utility.getIntegratedCircuit(1), ItemList.Depleted_Thorium_1.get(4L), 20, Voltage.HV.getVoltage());
                GT_Values.RA.addAssemblerRecipe(ItemList.Depleted_Thorium_2.get(1L), GT_Utility.getIntegratedCircuit(1), ItemList.Depleted_Thorium_1.get(2L), 20, Voltage.HV.getVoltage());
                GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("IC2", "reactorMOXQuaddepleted", 1L, 0), GT_Utility.getIntegratedCircuit(1), GT_ModHandler.getModItem("IC2", "reactorMOXSimpledepleted", 4L, 0), 20, Voltage.HV.getVoltage());
                GT_Values.RA.addAssemblerRecipe(GT_ModHandler.getModItem("IC2", "reactorMOXDualdepleted", 1L, 0), GT_Utility.getIntegratedCircuit(1), GT_ModHandler.getModItem("IC2", "reactorMOXSimpledepleted", 2L, 0), 20, Voltage.HV.getVoltage());
                GT_Values.RA.addAssemblerRecipe(ItemList.Depleted_IFCell_4.get(1L), GT_Utility.getIntegratedCircuit(1), ItemList.Depleted_IFCell_1.get(4L), 20, Voltage.HV.getVoltage());
                GT_Values.RA.addAssemblerRecipe(ItemList.Depleted_IFCell_2.get(1L), GT_Utility.getIntegratedCircuit(1), ItemList.Depleted_IFCell_1.get(2L), 20, Voltage.HV.getVoltage());

                //Sifter Recipes
                GT_Values.RA.addSifterRecipe(GT_OreDictUnificator.get(dust, Cinnabar, 1L), new ItemStack[]{GT_ModHandler.getModItem("Thaumcraft", "ItemResource", 1L, 3), GT_ModHandler.getModItem("Thaumcraft", "ItemResource", 1L, 3), GT_ModHandler.getModItem("Thaumcraft", "ItemResource", 1L, 3), GT_ModHandler.getModItem("Thaumcraft", "ItemResource", 1L, 3), GT_ModHandler.getModItem("Thaumcraft", "ItemResource", 1L, 3), GT_ModHandler.getModItem("Thaumcraft", "ItemResource", 1L, 3), GT_ModHandler.getModItem("Thaumcraft", "ItemResource", 1L, 3), GT_ModHandler.getModItem("Thaumcraft", "ItemResource", 1L, 3), GT_ModHandler.getModItem("Thaumcraft", "ItemResource", 1L, 3)}, new int[]{100, 300, 500, 1000, 1000, 1500, 2300, 2500, 3500}, 800, 16);

                //Compressor Recipes
                GT_Values.RA.addCompressorRecipe(GT_ModHandler.getModItem("Thaumcraft", "ItemResource", 9L, 3),GT_ModHandler.getModItem("thaumicbases", "quicksilverBlock", 1L), 300, 2);

                //Grinder Recipes
                GT_Values.RA.addGrinderRecipe(GT_OreDictUnificator.get(ore, EnderPearl, 1), null, GT_OreDictUnificator.get(crushed, EnderPearl, 2), GT_OreDictUnificator.get(gem, EnderPearl, 1), null, null);
                GT_Values.RA.addPulveriserRecipe(GT_OreDictUnificator.get(ore, EnderPearl, 1), new ItemStack[]{GT_OreDictUnificator.get(crushed, EnderPearl, 2), GT_OreDictUnificator.get(gem, EnderPearl, 1)}, new int[]{10000, 1000}, Voltage.HV.getVoltage(), 2);

                //Centrifuge Recipes
                GT_Values.RA.addCentrifugeRecipe(GT_OreDictUnificator.get(dust, Tungstate, 7L), NI, NF, Oxygen.getGas(576L), GT_OreDictUnificator.get(dust, Tungsten, 1L), GT_OreDictUnificator.get(dust, Lithium, 2L), GT_OreDictUnificator.get(dust, Tungsten, 1L), NI, NI, NI, new int[]{10000, 10000, 750}, 20, Voltage.LV.getVoltage());
                GT_Values.RA.addCentrifugeRecipe(GT_Values.NI, GT_Values.NI, Lava.getFluid(100L), GT_Values.NF, GT_OreDictUnificator.get(nugget, Copper, 1L), GT_OreDictUnificator.get(nugget, Tin, 1L), GT_OreDictUnificator.get(nugget, Gold, 1L), GT_OreDictUnificator.get(nugget, Silver, 1L), GT_OreDictUnificator.get(nugget, Tantalum, 1L), GT_OreDictUnificator.get(dustSmall, Tungstate, 1L), new int[]{2000, 1000, 250, 250, 250, 250}, 80, 80);
                GT_Values.RA.addCentrifugeRecipe(GT_Values.NI, GT_Values.NI, FluidRegistry.getFluidStack("ic2pahoehoelava", 100), GT_Values.NF, GT_OreDictUnificator.get(nugget, Copper, 1L), GT_OreDictUnificator.get(nugget, Tin, 1L), GT_OreDictUnificator.get(nugget, Gold, 1L), GT_OreDictUnificator.get(nugget, Silver, 1L), GT_OreDictUnificator.get(nugget, Tantalum, 1L), GT_OreDictUnificator.get(dustSmall, Tungstate, 1L), new int[]{2000, 1000, 250, 250, 250, 250}, 40, 80);
                GT_Values.RA.addCentrifugeRecipe(ItemList.Depleted_IFCell_1.get(1), null,null,null, GT_OreDictUnificator.get(dust, Infinity, 1L), GT_OreDictUnificator.get(dust, Infinity, 1L), GT_OreDictUnificator.get(dustSmall, Infinity, 1L), GT_OreDictUnificator.get(dustTiny, CosmicNeutronium, 1L), GT_OreDictUnificator.get(dust, Neutronium, 8L), GT_OreDictUnificator.get(dust, Draconium, 1L), new int[]{10_000,5_000,5_000,2_500,10_000,10_000},500,2000);
                GT_Values.RA.addCentrifugeRecipe(ItemList.Depleted_IFCell_2.get(1), null,null,null, GT_OreDictUnificator.get(dust, Infinity, 2L), GT_OreDictUnificator.get(dust, Infinity, 2L), GT_OreDictUnificator.get(dust, Infinity, 1L), GT_OreDictUnificator.get(dustTiny, CosmicNeutronium, 4L), GT_OreDictUnificator.get(dust, Neutronium, 16L), GT_OreDictUnificator.get(dust, Draconium, 2L), new int[]{10_000,5_000,5_000,2_500,10_000,10_000},1000,2000);
                GT_Values.RA.addCentrifugeRecipe(ItemList.Depleted_IFCell_4.get(1), null,null,null, GT_OreDictUnificator.get(dust, Infinity, 4L), GT_OreDictUnificator.get(dust, Infinity, 4L), GT_OreDictUnificator.get(dust, Infinity, 2L), GT_OreDictUnificator.get(dustTiny, CosmicNeutronium, 8L), GT_OreDictUnificator.get(dust, Neutronium, 32L), GT_OreDictUnificator.get(dust, Draconium, 4L), new int[]{10_000,5_000,5_000,2_500,10_000,10_000},2000,2000);

                //Electrolyzer Recipes
                GT_Values.RA.addElectrolyzerRecipe(GT_OreDictUnificator.get(dust, Tungstate, 7L), NI, NF, Oxygen.getGas(576L), GT_OreDictUnificator.get(dust, Tungsten, 1L), GT_OreDictUnificator.get(dust, Lithium, 2L), GT_OreDictUnificator.get(dust, Tungsten, 1L), NI, NI, NI, new int[]{10000, 10000, 1000}, 20, Voltage.MV.getVoltage());
                GT_Values.RA.addElectrolyzerRecipe(GT_OreDictUnificator.get(dust, Tungstate, 7L), NI, NF, Oxygen.getGas(576L), GT_OreDictUnificator.get(dust, Tungsten, 1L), GT_OreDictUnificator.get(dust, Lithium, 2L), NI, NI, NI, NI, null, 20, Voltage.MV.getVoltage());

                //Chem Reactor Recipes
                GT_Values.RA.addChemicalRecipe(GT_OreDictUnificator.get(gem, CertusQuartz, 9), GT_OreDictUnificator.get(dust, Gold, 1), GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 9L, 1), 400, Voltage.HV.getVoltage());
                GT_Values.RA.addChemicalRecipe(GT_OreDictUnificator.get(gem, CertusQuartz, 1), GT_Utility.getIntegratedCircuit(1), GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 1L, 1), 1000, Voltage.ZPM.getVoltage());

                //Autoclave Recipes
                GT_Values.RA.addAutoclaveRecipe(GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 1L, 7), GT_Utility.getIntegratedCircuit(3), Materials.Void.getMolten(16L), GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 1L, 12), 10000, 100, Voltage.EV.getVoltage(), false);

                //Fusion Recipes, custom tailored to work with my turbines and their respective values. Don't like 'em, fork it and remove this section.
                //v- This feeds an extra efficient turbine made from turbine steel at perfect flow rate and produces a metric shitton of EU.
                GT_Values.RA.addFusionReactorRecipe(Aluminium.getMolten(120L), Gallium.getMolten(120L), Neutronium.getPlasma(240L), 20, 131000, 320000000);
                GT_Values.RA.addFusionReactorRecipe(Beryllium.getMolten(120L), Gallium.getMolten(120L), DraconiumAwakened.getPlasma(240L), 20, 524288, 320000000);
                GT_Values.RA.addFusionReactorRecipe(Aluminium.getMolten(272L), Helium_3.getGas(272L), Radon.getPlasma(545L), 20, 131000, 480000000);
                GT_Values.RA.addFusionReactorRecipe(Deuterium.getGas(72L), Tritium.getGas(72L), Radon.getPlasma(144L), 20, 131000, 320000000);
                GT_Values.RA.addFusionReactorRecipe(Neutronium.getMolten(72L), Radon.getGas(72L), CosmicNeutronium.getPlasma(144L), 20, 196608,  640000000);
                GT_Values.RA.addFusionReactorRecipe(Materials.Beryllium.getMolten(16), Materials.Deuterium.getGas(109), Materials.Nitrogen.getPlasma(125), 20, 16384, 180000000);
                GT_Values.RA.addFusionReactorRecipe(InfinityCatalyst.getMolten(72L), Neutronium.getMolten(72L), Materials.Infinity.getPlasma(144L), 40, 131000, 480000000);
                //Test Recipes
                GT_Values.RA.addMixerRecipe(EnderPearl.getGems(4), Redstone.getDust(4), Neutronium.getDustTiny(1), GT_Utility.getIntegratedCircuit(14), null, null, Infinity.getDustTiny(1), 2400, Voltage.UHV.getVoltage());

                // Assembly line recipes
                GT_Values.RA.addAssemblylineRecipe(ItemList.Casing_Coil_Infinity.get(1L), 432000, new Object[]{
                        ItemList.OreDrill4.get(1),
                        GT_OreDictUnificator.get(frameGt, Infinity, 4L),
                        GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Infinite, 4L),
                        ItemList.Electric_Motor_UV.get(4L),
                        ItemList.Electric_Pump_UV.get(4L),
                        ItemList.Conveyor_Module_UV.get(4L),
                        ItemList.Field_Generator_ZPM.get(2),
                        GT_OreDictUnificator.get(gearGt, Neutronium, 4L),
                        GT_OreDictUnificator.get(wireGt04, SuperconductorUV, 32)}, new FluidStack[]{
                        Materials.SolderingAlloy.getMolten(2880)},
                        ItemList.OreDrill5.get(1),
                        18000, Voltage.UV.getVoltage());


        }

        public void addCircuitRecipes() {

                // Taken from the GTNH Core Mod, will generate these without using recursive circuit crafting.
                // TODO: Find some interesting new wire materials
                for (Materials tMat : Materials.values()) {
                        if (tMat.mStandardMoltenFluid != null && tMat.contains(SubTag.SOLDERING_MATERIAL) && !(GregTech_API.mUseOnlyGoodSolderingMaterials && !tMat.contains(SubTag.SOLDERING_MATERIAL_GOOD))) {
                                int tMultiplier = tMat.contains(SubTag.SOLDERING_MATERIAL_GOOD) ? 1 : tMat.contains(SubTag.SOLDERING_MATERIAL_BAD) ? 4 : 2;

                                //Primitive Circuit - checked
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Phenolic_Good.get(1L), ItemList.Circuit_Chip_Simple_SoC.get(1L), GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.RedAlloy, 2), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Tin, 2)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.NandChip.get(4L), 300, 120);

                                //Basic Circuit - checked
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Coated_Basic.get(1L), ItemList.Circuit_Parts_Resistor.get(2L), GT_OreDictUnificator.get(OrePrefixes.wireGt01, Materials.RedAlloy, 2), ItemList.Circuit_Parts_Vacuum_Tube.get(2L)}, tMat.getMolten(144L * tMultiplier / 2L), GT_ModHandler.getModItem("IC2", "itemPartCircuit", 1L, 0), 200, 16);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Coated_Basic.get(1L), ItemList.Circuit_Parts_ResistorSMD.get(2L), GT_OreDictUnificator.get(OrePrefixes.wireGt01, Materials.RedAlloy, 2), ItemList.Circuit_Parts_Vacuum_Tube.get(2L)}, tMat.getMolten(144L * tMultiplier / 2L), GT_ModHandler.getModItem("IC2", "itemPartCircuit", 1L, 0), 200, 16);

                                //Good Circuit - checked
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Phenolic_Good.get(1L), GT_ModHandler.getModItem("IC2", "itemPartCircuit", 1L, 0), ItemList.Circuit_Parts_Diode.get(2L), GT_OreDictUnificator.get(OrePrefixes.wireGt01, Materials.Copper, 2)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Good.get(1L), 300, 30);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Phenolic_Good.get(1L), GT_ModHandler.getModItem("IC2", "itemPartCircuit", 1L, 0), ItemList.Circuit_Parts_DiodeSMD.get(2L), GT_OreDictUnificator.get(OrePrefixes.wireGt01, Materials.Copper, 2)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Good.get(1L), 300, 30);

                                //Integraded Circuits - checked
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Coated_Basic.get(1L), ItemList.Circuit_Chip_ILC.get(1L), ItemList.Circuit_Parts_Resistor.get(2L), ItemList.Circuit_Parts_Diode.get(2L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Copper, 2), GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Tin, 2)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Basic.get(1L), 200, 16);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Coated_Basic.get(1L), ItemList.Circuit_Chip_ILC.get(1L), ItemList.Circuit_Parts_ResistorSMD.get(2L), ItemList.Circuit_Parts_Diode.get(2L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Copper, 2), GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Tin, 2)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Basic.get(1L), 200, 16);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Coated_Basic.get(1L), ItemList.Circuit_Chip_ILC.get(1L), ItemList.Circuit_Parts_ResistorSMD.get(2L), ItemList.Circuit_Parts_DiodeSMD.get(2L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Copper, 2), GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Tin, 2)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Basic.get(1L), 200, 16);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Coated_Basic.get(1L), ItemList.Circuit_Chip_ILC.get(1L), ItemList.Circuit_Parts_Resistor.get(2L), ItemList.Circuit_Parts_DiodeSMD.get(2L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Copper, 2), GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Tin, 2)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Basic.get(1L), 200, 16);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Phenolic_Good.get(1L), ItemList.Circuit_Basic.get(1L), ItemList.Circuit_Parts_Resistor.get(4L), ItemList.Circuit_Parts_Diode.get(4L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Gold, 4), GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Silver, 4)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Integrated_Good.get(1L), 400, 24);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Phenolic_Good.get(1L), ItemList.Circuit_Basic.get(1L), ItemList.Circuit_Parts_ResistorSMD.get(4L), ItemList.Circuit_Parts_Diode.get(4L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Gold, 4), GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Silver, 4)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Integrated_Good.get(1L), 400, 24);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Phenolic_Good.get(1L), ItemList.Circuit_Basic.get(1L), ItemList.Circuit_Parts_ResistorSMD.get(4L), ItemList.Circuit_Parts_DiodeSMD.get(4L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Gold, 4), GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Silver, 4)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Integrated_Good.get(1L), 400, 24);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Phenolic_Good.get(1L), ItemList.Circuit_Basic.get(1L), ItemList.Circuit_Parts_ResistorASMD.get(1L), ItemList.Circuit_Parts_DiodeASMD.get(1L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Gold, 4), GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Silver, 4)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Integrated_Good.get(1L), 200, 24);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Phenolic_Good.get(1L), ItemList.Circuit_Basic.get(1L), ItemList.Circuit_Parts_Resistor.get(4L), ItemList.Circuit_Parts_DiodeSMD.get(4L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Gold, 4), GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Silver, 4)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Integrated_Good.get(1L), 400, 24);

                                //Advanced circuit - checked
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Integrated_Good.get(1L), ItemList.Circuit_Chip_ILC.get(1L), ItemList.Circuit_Chip_Ram.get(2L), ItemList.Circuit_Parts_Transistor.get(4L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Electrum, 4), GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.AnnealedCopper, 4)}, tMat.getMolten(144L * tMultiplier / 2L), GT_ModHandler.getIC2Item("advancedCircuit", 1L), 800, 30, false);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Integrated_Good.get(1L), ItemList.Circuit_Chip_ILC.get(1L), ItemList.Circuit_Chip_Ram.get(2L), ItemList.Circuit_Parts_TransistorSMD.get(4L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Electrum, 4), GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.AnnealedCopper, 4)}, tMat.getMolten(144L * tMultiplier / 2L), GT_ModHandler.getIC2Item("advancedCircuit", 1L), 800, 30, false);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Integrated_Good.get(1L), ItemList.Circuit_Chip_ILC.get(1L), ItemList.Circuit_Chip_Ram.get(2L), ItemList.Circuit_Parts_TransistorASMD.get(1L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Electrum, 4), GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.AnnealedCopper, 4)}, tMat.getMolten(144L * tMultiplier / 2L), GT_ModHandler.getIC2Item("advancedCircuit", 1L), 400, 30, false);

                                //Integrated Circuits - checked
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Chip_CPU.get(1L), ItemList.Circuit_Parts_Resistor.get(2L), ItemList.Circuit_Parts_Capacitor.get(2L), ItemList.Circuit_Parts_Transistor.get(2L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Copper, 2)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Microprocessor.get(2L), 200, 60, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Chip_CPU.get(1L), ItemList.Circuit_Parts_ResistorSMD.get(2L), ItemList.Circuit_Parts_Capacitor.get(2L), ItemList.Circuit_Parts_Transistor.get(2L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Copper, 2)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Microprocessor.get(2L), 200, 60, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Chip_CPU.get(1L), ItemList.Circuit_Parts_Resistor.get(2L), ItemList.Circuit_Parts_CapacitorSMD.get(2L), ItemList.Circuit_Parts_Transistor.get(2L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Copper, 2)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Microprocessor.get(2L), 200, 60, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Chip_CPU.get(1L), ItemList.Circuit_Parts_Resistor.get(2L), ItemList.Circuit_Parts_Capacitor.get(2L), ItemList.Circuit_Parts_TransistorSMD.get(2L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Copper, 2)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Microprocessor.get(2L), 200, 60, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Chip_CPU.get(1L), ItemList.Circuit_Parts_ResistorSMD.get(2L), ItemList.Circuit_Parts_CapacitorSMD.get(2L), ItemList.Circuit_Parts_Transistor.get(2L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Copper, 2)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Microprocessor.get(2L), 200, 60, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Chip_CPU.get(1L), ItemList.Circuit_Parts_ResistorSMD.get(2L), ItemList.Circuit_Parts_Capacitor.get(2L), ItemList.Circuit_Parts_TransistorSMD.get(2L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Copper, 2)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Microprocessor.get(2L), 200, 60, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Chip_CPU.get(1L), ItemList.Circuit_Parts_Resistor.get(2L), ItemList.Circuit_Parts_CapacitorSMD.get(2L), ItemList.Circuit_Parts_TransistorSMD.get(2L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Copper, 2)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Microprocessor.get(2L), 200, 60, true);

                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Chip_CPU.get(1L), ItemList.Circuit_Parts_Resistor.get(4L), ItemList.Circuit_Parts_Capacitor.get(4L), ItemList.Circuit_Parts_Transistor.get(4L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.RedAlloy, 4)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Processor.get(1L), 200, 60, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Chip_CPU.get(1L), ItemList.Circuit_Parts_ResistorSMD.get(4L), ItemList.Circuit_Parts_Capacitor.get(4L), ItemList.Circuit_Parts_Transistor.get(4L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.RedAlloy, 4)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Processor.get(1L), 200, 60, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Chip_CPU.get(1L), ItemList.Circuit_Parts_ResistorASMD.get(1L), ItemList.Circuit_Parts_CapacitorASMD.get(1L), ItemList.Circuit_Parts_TransistorASMD.get(1L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.RedAlloy, 4)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Processor.get(1L), 100, 60, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Chip_CPU.get(1L), ItemList.Circuit_Parts_Resistor.get(4L), ItemList.Circuit_Parts_CapacitorSMD.get(4L), ItemList.Circuit_Parts_Transistor.get(4L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.RedAlloy, 4)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Processor.get(1L), 200, 60, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Chip_CPU.get(1L), ItemList.Circuit_Parts_Resistor.get(4L), ItemList.Circuit_Parts_Capacitor.get(4L), ItemList.Circuit_Parts_TransistorSMD.get(4L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.RedAlloy, 4)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Processor.get(1L), 200, 60, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Chip_CPU.get(1L), ItemList.Circuit_Parts_ResistorSMD.get(4L), ItemList.Circuit_Parts_CapacitorSMD.get(4L), ItemList.Circuit_Parts_Transistor.get(4L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.RedAlloy, 4)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Processor.get(1L), 200, 60, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Chip_CPU.get(1L), ItemList.Circuit_Parts_ResistorSMD.get(4L), ItemList.Circuit_Parts_Capacitor.get(4L), ItemList.Circuit_Parts_TransistorSMD.get(4L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.RedAlloy, 4)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Processor.get(1L), 200, 60, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Chip_CPU.get(1L), ItemList.Circuit_Parts_Resistor.get(4L), ItemList.Circuit_Parts_CapacitorSMD.get(4L), ItemList.Circuit_Parts_TransistorSMD.get(4L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.RedAlloy, 4)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Processor.get(1L), 200, 60, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Processor.get(1L), ItemList.Circuit_Parts_Coil.get(4L), ItemList.Circuit_Parts_Capacitor.get(8L), ItemList.Circuit_Chip_Ram.get(4L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.RedAlloy, 8)}, tMat.getMolten(144L * tMultiplier), ItemList.Circuit_Computer.get(1L), 400, 120, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Chip_CPU.get(1L), ItemList.Circuit_Chip_NAND.get(32L), ItemList.Circuit_Chip_Ram.get(4L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.RedAlloy, 16), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Plastic, 4)}, tMat.getMolten(144L * tMultiplier), ItemList.Tool_DataStick.get(1L), 400, 90, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Advanced.get(1L), ItemList.Circuit_Parts_Diode.get(4L), ItemList.Circuit_Chip_Ram.get(8L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Electrum, 4), GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Platinum, 16)}, tMat.getMolten(144L * tMultiplier), ItemList.Circuit_Data.get(1L), 400, 120, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Aluminium, 2), GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Data, 2), ItemList.Circuit_Parts_Coil.get(12L), ItemList.Circuit_Parts_Capacitor.get(24), ItemList.Circuit_Chip_Ram.get(16L), GT_OreDictUnificator.get(OrePrefixes.wireGt01, Materials.AnnealedCopper, 8)}, tMat.getMolten(144L * tMultiplier * 2), ItemList.Circuit_Elite.get(1L), 1600, 480, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Chip_CPU.get(1L), ItemList.Circuit_Parts_ResistorSMD.get(2L), ItemList.Circuit_Parts_CapacitorSMD.get(2L), ItemList.Circuit_Parts_TransistorSMD.get(2L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Copper, 2)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Microprocessor.get(2L), 200, 60, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Chip_CPU.get(1L), ItemList.Circuit_Parts_ResistorSMD.get(4L), ItemList.Circuit_Parts_CapacitorSMD.get(4L), ItemList.Circuit_Parts_TransistorSMD.get(4L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.RedAlloy, 4)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Processor.get(1L), 200, 60, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Processor.get(1L), ItemList.Circuit_Parts_Coil.get(4L), ItemList.Circuit_Parts_CapacitorSMD.get(8L), ItemList.Circuit_Chip_Ram.get(4L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.RedAlloy, 8)}, tMat.getMolten(144L * tMultiplier), ItemList.Circuit_Computer.get(1L), 400, 96, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Chip_CPU.get(1L), ItemList.Circuit_Parts_ResistorASMD.get(4L), ItemList.Circuit_Parts_CapacitorASMD.get(1L), ItemList.Circuit_Parts_TransistorASMD.get(1L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.RedAlloy, 4)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Processor.get(1L), 100, 60, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Processor.get(1L), ItemList.Circuit_Parts_Coil.get(4L), ItemList.Circuit_Parts_CapacitorASMD.get(2L), ItemList.Circuit_Chip_Ram.get(4L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.RedAlloy, 8)}, tMat.getMolten(144L * tMultiplier), ItemList.Circuit_Computer.get(1L), 200, 96, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Advanced.get(1L), ItemList.Circuit_Parts_DiodeSMD.get(4L), ItemList.Circuit_Chip_Ram.get(8L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Electrum, 4), GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Platinum, 16)}, tMat.getMolten(144L * tMultiplier), ItemList.Circuit_Data.get(1L), 400, 120, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Advanced.get(1L), ItemList.Circuit_Parts_DiodeASMD.get(1L), ItemList.Circuit_Chip_Ram.get(8L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Electrum, 4), GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Platinum, 16)}, tMat.getMolten(144L * tMultiplier), ItemList.Circuit_Data.get(1L), 200, 120, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Aluminium, 2), GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Data, 1), ItemList.Circuit_Parts_Coil.get(12L), ItemList.Circuit_Parts_CapacitorSMD.get(16L), ItemList.Circuit_Chip_Ram.get(16L), GT_OreDictUnificator.get(OrePrefixes.wireGt01, Materials.AnnealedCopper, 6)}, tMat.getMolten(144L * tMultiplier * 2), ItemList.Circuit_Elite.get(1L), 1600, 480, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Aluminium, 2), GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Data, 1), ItemList.Circuit_Parts_Coil.get(12L), ItemList.Circuit_Parts_CapacitorASMD.get(4L), ItemList.Circuit_Chip_Ram.get(16L), GT_OreDictUnificator.get(OrePrefixes.wireGt01, Materials.AnnealedCopper, 6)}, tMat.getMolten(144L * tMultiplier * 2), ItemList.Circuit_Elite.get(1L), 800, 480, true);

                                //Nanotech Circuits
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Epoxy_Advanced.get(1L), ItemList.Circuit_Chip_NanoCPU.get(1L), ItemList.Circuit_Parts_ResistorSMD.get(8L), ItemList.Circuit_Parts_CapacitorSMD.get(8L), ItemList.Circuit_Parts_TransistorSMD.get(8L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Electrum, 2)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Nanoprocessor.get(1L), 200, 600, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Epoxy_Advanced.get(1L), ItemList.Circuit_Chip_NanoCPU.get(1L), ItemList.Circuit_Parts_ResistorASMD.get(2L), ItemList.Circuit_Parts_CapacitorASMD.get(2L), ItemList.Circuit_Parts_TransistorASMD.get(2L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Electrum, 2)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Nanoprocessor.get(1L), 100, 600, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Epoxy_Advanced.get(1L), ItemList.Circuit_Nanoprocessor.get(1L), ItemList.Circuit_Parts_Coil.get(8L), ItemList.Circuit_Parts_CapacitorSMD.get(8L), ItemList.Circuit_Chip_Ram.get(8L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Electrum, 4)}, tMat.getMolten(144L * tMultiplier), ItemList.Circuit_Nanocomputer.get(1L), 400, 600, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Epoxy_Advanced.get(1L), ItemList.Circuit_Nanoprocessor.get(1L), ItemList.Circuit_Parts_Coil.get(8L), ItemList.Circuit_Parts_CapacitorASMD.get(2L), ItemList.Circuit_Chip_Ram.get(8L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Electrum, 4)}, tMat.getMolten(144L * tMultiplier), ItemList.Circuit_Nanocomputer.get(1L), 200, 600, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Epoxy_Advanced.get(1L), ItemList.Circuit_Nanoprocessor.get(1L), ItemList.Circuit_Chip_Ram.get(4L), ItemList.Circuit_Chip_NOR.get(32L), ItemList.Circuit_Chip_NAND.get(64L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Platinum, 32)}, tMat.getMolten(144L * tMultiplier), ItemList.Tool_DataOrb.get(1L), 400, 1200, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Epoxy_Advanced.get(1L), ItemList.Circuit_Nanocomputer.get(1L), ItemList.Circuit_Parts_DiodeSMD.get(8L), ItemList.Circuit_Chip_NOR.get(4L), ItemList.Circuit_Chip_Ram.get(16L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Electrum, 6)}, tMat.getMolten(144L * tMultiplier), ItemList.Circuit_Elitenanocomputer.get(1L), 400, 600, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Epoxy_Advanced.get(1L), ItemList.Circuit_Nanocomputer.get(1L), ItemList.Circuit_Parts_DiodeASMD.get(2L), ItemList.Circuit_Chip_NOR.get(4L), ItemList.Circuit_Chip_Ram.get(16L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Electrum, 6)}, tMat.getMolten(144L * tMultiplier), ItemList.Circuit_Elitenanocomputer.get(1L), 200, 600, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Aluminium, 2), ItemList.Circuit_Elitenanocomputer.get(1L), ItemList.Circuit_Parts_Coil.get(16L), ItemList.Circuit_Parts_CapacitorSMD.get(32L), ItemList.Circuit_Chip_Ram.get(16L), GT_OreDictUnificator.get(OrePrefixes.wireGt01, Materials.AnnealedCopper, 8)}, tMat.getMolten(144L * tMultiplier * 2), ItemList.Circuit_Master.get(1L), 1600, 1920, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Aluminium, 2), ItemList.Circuit_Elitenanocomputer.get(1L), ItemList.Circuit_Parts_Coil.get(16L), ItemList.Circuit_Parts_CapacitorASMD.get(8L), ItemList.Circuit_Chip_Ram.get(16L), GT_OreDictUnificator.get(OrePrefixes.wireGt01, Materials.AnnealedCopper, 8)}, tMat.getMolten(144L * tMultiplier * 2), ItemList.Circuit_Master.get(1L), 800, 1920, true);

                                //Quantum Circuits
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Fiberglass_Advanced.get(1L), ItemList.Circuit_Chip_QuantumCPU.get(1L), ItemList.Circuit_Chip_NanoCPU.get(1L), ItemList.Circuit_Parts_CapacitorSMD.get(12L), ItemList.Circuit_Parts_TransistorSMD.get(12L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Platinum, 2)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Quantumprocessor.get(1L), 200, 2400, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Fiberglass_Advanced.get(1L), ItemList.Circuit_Chip_QuantumCPU.get(1L), ItemList.Circuit_Chip_NanoCPU.get(1L), ItemList.Circuit_Parts_CapacitorASMD.get(3L), ItemList.Circuit_Parts_TransistorASMD.get(3L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Platinum, 2)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Quantumprocessor.get(1L), 100, 2400, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Fiberglass_Advanced.get(1L), ItemList.Circuit_Quantumprocessor.get(1L), ItemList.Circuit_Parts_Coil.get(12L), ItemList.Circuit_Parts_CapacitorSMD.get(16L), ItemList.Circuit_Chip_Ram.get(4L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Platinum, 4)}, tMat.getMolten(144L * tMultiplier), ItemList.Circuit_Quantumcomputer.get(1L), 400, 2400, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Fiberglass_Advanced.get(1L), ItemList.Circuit_Quantumprocessor.get(1L), ItemList.Circuit_Parts_Coil.get(12L), ItemList.Circuit_Parts_CapacitorASMD.get(4L), ItemList.Circuit_Chip_Ram.get(4L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Platinum, 4)}, tMat.getMolten(144L * tMultiplier), ItemList.Circuit_Quantumcomputer.get(1L), 200, 2400, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Fiberglass_Advanced.get(1L), ItemList.Circuit_Quantumcomputer.get(1L), ItemList.Circuit_Parts_DiodeSMD.get(8L), ItemList.Circuit_Chip_NOR.get(4L), ItemList.Circuit_Chip_Ram.get(16L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Platinum, 6)}, tMat.getMolten(144L * tMultiplier), ItemList.Circuit_Masterquantumcomputer.get(1L), 400, 2400, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Fiberglass_Advanced.get(1L), ItemList.Circuit_Quantumcomputer.get(1L), ItemList.Circuit_Parts_DiodeASMD.get(2L), ItemList.Circuit_Chip_NOR.get(4L), ItemList.Circuit_Chip_Ram.get(16L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Platinum, 6)}, tMat.getMolten(144L * tMultiplier), ItemList.Circuit_Masterquantumcomputer.get(1L), 200, 2400, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Aluminium, 2), ItemList.Circuit_Masterquantumcomputer.get(1L), ItemList.Circuit_Parts_Coil.get(24), ItemList.Circuit_Parts_CapacitorSMD.get(48L), ItemList.Circuit_Chip_Ram.get(24), GT_OreDictUnificator.get(OrePrefixes.wireGt01, Materials.AnnealedCopper, 8)}, tMat.getMolten(144L * tMultiplier * 2), ItemList.Circuit_Quantummainframe.get(1L), 1600, 7680, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Aluminium, 2), ItemList.Circuit_Masterquantumcomputer.get(1L), ItemList.Circuit_Parts_Coil.get(24), ItemList.Circuit_Parts_CapacitorASMD.get(12L), ItemList.Circuit_Chip_Ram.get(24), GT_OreDictUnificator.get(OrePrefixes.wireGt01, Materials.AnnealedCopper, 8)}, tMat.getMolten(144L * tMultiplier * 2), ItemList.Circuit_Quantummainframe.get(1L), 800, 7680, true);

                                //Crystallized Circuits
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Multifiberglass_Elite.get(1L), ItemList.Circuit_Chip_CrystalCPU.get(1L), ItemList.Circuit_Chip_NanoCPU.get(2L), ItemList.Circuit_Parts_CapacitorASMD.get(6), ItemList.Circuit_Parts_TransistorASMD.get(6), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.NiobiumTitanium, 2)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Crystalprocessor.get(1L), 100, 9600, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Multifiberglass_Elite.get(1L), ItemList.Circuit_Crystalprocessor.get(1L), ItemList.Circuit_Parts_Coil.get(24), ItemList.Circuit_Parts_CapacitorASMD.get(8L), ItemList.Circuit_Chip_Ram.get(24), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.NiobiumTitanium, 4)}, tMat.getMolten(144L * tMultiplier), ItemList.Circuit_Crystalcomputer.get(1L), 200, 9600, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Multifiberglass_Elite.get(1L), ItemList.Circuit_Crystalcomputer.get(1L), ItemList.Circuit_Chip_Ram.get(4L), ItemList.Circuit_Chip_NOR.get(32L), ItemList.Circuit_Chip_NAND.get(64L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.NiobiumTitanium, 6)}, tMat.getMolten(144L * tMultiplier), ItemList.Circuit_Ultimatecrystalcomputer.get(1L), 400, 9600, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Aluminium, 2), ItemList.Circuit_Ultimatecrystalcomputer.get(1L), ItemList.Circuit_Parts_Coil.get(32L), ItemList.Circuit_Parts_CapacitorASMD.get(16L), ItemList.Circuit_Chip_Ram.get(32L), GT_OreDictUnificator.get(OrePrefixes.wireGt01, Materials.SuperconductorLuV, 2)}, tMat.getMolten(144L * tMultiplier * 2), ItemList.Circuit_Crystalmainframe.get(1L), 800, 30720, true);                //Wetware Circuits

                                //Wetware Boards
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Chip_NeuroCPU.get(1L),ItemList.Circuit_Chip_CrystalCPU.get(1L), ItemList.Circuit_Chip_NanoCPU.get(1L), ItemList.Circuit_Parts_CapacitorASMD.get(8L),ItemList.Circuit_Parts_TransistorASMD.get(8L),GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.YttriumBariumCuprate, 2)},tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Neuroprocessor.get(1L), 200, 38400, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Wetware_Extreme.get(1L), ItemList.Circuit_Neuroprocessor.get(1L), ItemList.Circuit_Parts_Coil.get(32L), ItemList.Circuit_Parts_CapacitorASMD.get(12L), ItemList.Circuit_Chip_Ram.get(24L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.YttriumBariumCuprate, 4)}, tMat.getMolten(144L * tMultiplier), ItemList.Circuit_Wetwarecomputer.get(1L), 300, 38400, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Wetware_Extreme.get(2L), ItemList.Circuit_Wetwarecomputer.get(1L), ItemList.Circuit_Parts_DiodeASMD.get(8L), ItemList.Circuit_Chip_NOR.get(16L), ItemList.Circuit_Chip_Ram.get(64L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.YttriumBariumCuprate, 6)}, tMat.getMolten(144L * tMultiplier), ItemList.Circuit_Wetwaresupercomputer.get(1L), 600, 38400, true);

                                //Bio Circuits
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Chip_BioCPU.get(1L),ItemList.Circuit_Chip_CrystalSoC2.get(1L), ItemList.Circuit_Chip_NanoCPU.get(2L), ItemList.Circuit_Parts_CapacitorASMD.get(12L),ItemList.Circuit_Parts_TransistorASMD.get(12L),GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.NiobiumTitanium, 2)},tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Bioprocessor.get(1L), 300, 153600, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Bio_Ultra.get(1L), ItemList.Circuit_Bioprocessor.get(1L), ItemList.Circuit_Parts_Coil.get(48L), ItemList.Circuit_Parts_CapacitorASMD.get(16L), ItemList.Circuit_Chip_Ram.get(32L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.NiobiumTitanium, 4)}, tMat.getMolten(144L * tMultiplier), ItemList.Circuit_Biowarecomputer.get(1L), 400, 153600, true);

                                //SoC
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Chip_SoC.get(1L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Copper, 2), GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Copper, 2)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Microprocessor.get(2L), 50, 600, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Plastic_Advanced.get(1L), ItemList.Circuit_Chip_SoC.get(1L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.RedAlloy, 2), GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.AnnealedCopper, 4)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Processor.get(1L), 50, 2400, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Epoxy_Advanced.get(1L), ItemList.Circuit_Chip_SoC2.get(1L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Electrum, 2), GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.Platinum, 8)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Nanoprocessor.get(1L), 50, 9600, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Fiberglass_Advanced.get(1L), ItemList.Circuit_Chip_SoC2.get(1L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Platinum, 2), GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.NiobiumTitanium, 8)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Quantumprocessor.get(1L), 50, 38400, true);
                                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Multifiberglass_Elite.get(1L), ItemList.Circuit_Chip_CrystalSoC.get(1L), GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.NiobiumTitanium, 2), GT_OreDictUnificator.get(OrePrefixes.bolt, Materials.YttriumBariumCuprate, 8)}, tMat.getMolten(144L * tMultiplier / 2L), ItemList.Circuit_Crystalprocessor.get(1L), 50, 153600, true);


                        }
                }

                // Circuit Board Recipes from core mod will modify these to be less of a pain


                // Circuit Board
                GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Wood, 8), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Copper, 32), Materials.Glue.getFluid(576), ItemList.Circuit_Board_Coated_Basic.get(8L), 1600, 8);
                GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Wood, 8), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Copper, 32), Materials.Plastic.getMolten(288L), ItemList.Circuit_Board_Coated_Basic.get(16L), 1600, 8);
                GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Wood, 8), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Copper, 32), Materials.Polytetrafluoroethylene.getMolten(144L), ItemList.Circuit_Board_Coated_Basic.get(16L), 1600, 8);
                GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Wood, 8), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Copper, 32), Materials.Epoxid.getMolten(144L), ItemList.Circuit_Board_Coated_Basic.get(24L), 1600, 8);
                GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Wood, 8), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Copper, 32), Materials.Polybenzimidazole.getMolten(72L), ItemList.Circuit_Board_Coated_Basic.get(32L), 1600, 8);

                // Good circuit board
                GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Wood, 8), GT_Utility.getIntegratedCircuit(1), Materials.Glue.getFluid(288), ItemList.Circuit_Board_Phenolic.get(8L), 2400, 16);
                GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Wood, 8), GT_Utility.getIntegratedCircuit(1), Materials.BisphenolA.getFluid(144), ItemList.Circuit_Board_Phenolic.get(16L), 2400, 16);
                GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Wood, 8), GT_Utility.getIntegratedCircuit(1), Materials.Epoxid.getMolten(144L), ItemList.Circuit_Board_Phenolic.get(24L), 2400, 30);
                GT_Values.RA.addChemicalRecipe(ItemList.Circuit_Board_Phenolic.get(1L), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Gold, 1), Materials.IronIIIChloride.getFluid(100L), GT_Values.NF, ItemList.Circuit_Board_Phenolic_Good.get(1L), 600, 30);
                GT_Values.RA.addChemicalRecipe(ItemList.Circuit_Board_Phenolic.get(1L), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Gold, 1), Materials.SodiumPersulfate.getFluid(200), GT_Values.NF, ItemList.Circuit_Board_Phenolic_Good.get(1L), 600, 30);

                // Plastic Circuit board
                GT_Values.RA.addChemicalRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Plastic, 1), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Copper, 2), Materials.SulfuricAcid.getFluid(500), GT_Values.NF, ItemList.Circuit_Board_Plastic.get(1L), 500, 10);
                GT_Values.RA.addChemicalRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.PolyvinylChloride, 1), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Copper, 2), Materials.SulfuricAcid.getFluid(500), GT_Values.NF, ItemList.Circuit_Board_Plastic.get(2L), 500, 10);
                GT_Values.RA.addChemicalRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Polytetrafluoroethylene, 1), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Copper, 2), Materials.SulfuricAcid.getFluid(500), GT_Values.NF, ItemList.Circuit_Board_Plastic.get(4L), 500, 10);
                GT_Values.RA.addChemicalRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Polybenzimidazole, 1), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Copper, 2), Materials.SulfuricAcid.getFluid(500), GT_Values.NF, ItemList.Circuit_Board_Plastic.get(8L), 500, 10);
                GT_Values.RA.addChemicalRecipe(ItemList.Circuit_Board_Plastic.get(1L), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Copper, 1), Materials.IronIIIChloride.getFluid(250L), GT_Values.NF, ItemList.Circuit_Board_Plastic_Advanced.get(1L), 800, 30);
                GT_Values.RA.addChemicalRecipe(ItemList.Circuit_Board_Plastic.get(1L), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Copper, 1), Materials.SodiumPersulfate.getFluid(500), GT_Values.NF, ItemList.Circuit_Board_Plastic_Advanced.get(1L), 800, 30);

                // Advanced circuit board
                GT_Values.RA.addChemicalRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Epoxid, 1), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Gold, 1), Materials.SulfuricAcid.getFluid(500), GT_Values.NF, ItemList.Circuit_Board_Epoxy.get(1L), 600, 30);
                GT_Values.RA.addChemicalRecipe(ItemList.Circuit_Board_Epoxy.get(1L), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Electrum, 1), Materials.IronIIIChloride.getFluid(500L), GT_Values.NF, ItemList.Circuit_Board_Epoxy_Advanced.get(1L), 1200, 30);
                GT_Values.RA.addChemicalRecipe(ItemList.Circuit_Board_Epoxy.get(1L), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Electrum, 1), Materials.SodiumPersulfate.getFluid(1000L), GT_Values.NF, ItemList.Circuit_Board_Epoxy_Advanced.get(1L), 1200, 30);

                //Fiber reinforced circuit board
                GT_Values.RA.addChemicalBathRecipe(ItemList.Circuit_Parts_GlassFiber.get(1L), Materials.Epoxid.getMolten(144L), Materials.EpoxidFiberReinforced.getPlates(1), GT_Values.NI, GT_Values.NI, new int[]{10000}, 240, 16);
                GT_Values.RA.addChemicalBathRecipe(GT_ModHandler.getIC2Item("carbonFiber", 1), Materials.Epoxid.getMolten(144L), Materials.EpoxidFiberReinforced.getPlates(1), GT_Values.NI, GT_Values.NI, new int[]{10000}, 240, 16);
                GT_Values.RA.addChemicalRecipe(GT_OreDictUnificator.get(OrePrefixes.plate, Materials.EpoxidFiberReinforced, 1), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Copper, 1), Materials.SulfuricAcid.getFluid(500), GT_Values.NF, ItemList.Circuit_Board_Fiberglass.get(1L), 500, 10);

                // More Advanced Circuit board
                GT_Values.RA.addChemicalRecipe(ItemList.Circuit_Board_Fiberglass.get(1L), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.AnnealedCopper, 1), Materials.IronIIIChloride.getFluid(1000L), GT_Values.NF, ItemList.Circuit_Board_Fiberglass_Advanced.get(1L), GT_Values.NI, 1800, 30, true);
                GT_Values.RA.addChemicalRecipe(ItemList.Circuit_Board_Fiberglass.get(1L), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.AnnealedCopper, 1), Materials.SodiumPersulfate.getFluid(2000),GT_Values.NF, ItemList.Circuit_Board_Fiberglass_Advanced.get(1L), GT_Values.NI, 1800, 30, true);

                // Elite Circuit board
                GT_Values.RA.addChemicalRecipe(ItemList.Circuit_Board_Fiberglass.get(1L), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Platinum, 1), Materials.SulfuricAcid.getFluid(500), null, ItemList.Circuit_Board_Multifiberglass.get(1L), GT_Values.NI, 600, 480, true);
                GT_Values.RA.addChemicalRecipe(ItemList.Circuit_Board_Multifiberglass.get(1L), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Platinum, 1), Materials.IronIIIChloride.getFluid(2000L), GT_Values.NF, ItemList.Circuit_Board_Multifiberglass_Elite.get(1L), GT_Values.NI, 2400, 120, true);
                GT_Values.RA.addChemicalRecipe(ItemList.Circuit_Board_Multifiberglass.get(1L), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Platinum, 1), Materials.SodiumPersulfate.getFluid(4000), GT_Values.NF, ItemList.Circuit_Board_Multifiberglass_Elite.get(1L), GT_Values.NI, 2400, 120, true);

                // Extreme Wetware
                GT_Values.RA.addChemicalRecipe(ItemList.Circuit_Board_Wetware.get(1L), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.NiobiumTitanium, 1), Materials.IronIIIChloride.getFluid(5000L), GT_Values.NF, ItemList.Circuit_Board_Wetware_Extreme.get(1L), GT_Values.NI, 3000, 480, true);
                GT_Values.RA.addChemicalRecipe(ItemList.Circuit_Board_Wetware.get(1L), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.NiobiumTitanium, 1), Materials.SodiumPersulfate.getFluid(10000L), GT_Values.NF, ItemList.Circuit_Board_Wetware_Extreme.get(1L), GT_Values.NI, 3000, 480, true);

                //Bio Mutated
                GT_Values.RA.addChemicalRecipe(ItemList.Circuit_Board_Bio.get(1L), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Neutronium, 1), Materials.IronIIIChloride.getFluid(7500L), GT_Values.NF, ItemList.Circuit_Board_Bio_Ultra.get(1L), GT_Values.NI, 3600, 1920, true);
                GT_Values.RA.addChemicalRecipe(ItemList.Circuit_Board_Bio.get(1L), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Neutronium, 1), Materials.SodiumPersulfate.getFluid(14000L), GT_Values.NF, ItemList.Circuit_Board_Bio_Ultra.get(1L), GT_Values.NI, 3600, 1920, true);

                //Wetware Board
                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Multifiberglass.get(16L), ItemList.Circuit_Parts_PetriDish.get(1L), ItemList.Electric_Pump_LuV.get(1L), ItemList.Sensor_IV.get(1L), GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 1L), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.NiobiumTitanium, 16L)},  Materials.GrowthMediumSterilized.getFluid(4000L), ItemList.Circuit_Board_Wetware.get(16L), 1200, 30720, true);

                //Bio Board
                GT_Values.RA.addCircuitAssemblerRecipe(new ItemStack[]{ItemList.Circuit_Board_Wetware.get(32L), ItemList.Circuit_Parts_PetriDish.get(8L), ItemList.Electric_Pump_UV.get(1L),  ItemList.Sensor_LuV.get(2L), GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Superconductor, 1L), GT_OreDictUnificator.get(OrePrefixes.foil, Materials.Neutronium, 32L)},  Materials.BioMediumSterilized.getFluid(16000L), ItemList.Circuit_Board_Bio.get(32L), 1200, 500000, true);


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


