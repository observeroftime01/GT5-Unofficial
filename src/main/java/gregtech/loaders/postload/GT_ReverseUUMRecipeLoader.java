package gregtech.loaders.postload;

import gregtech.GT_Mod;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.util.GT_Utility;

import static gregtech.api.enums.Materials.*;
import static gregtech.api.enums.Materials.CosmicNeutronium;

public class GT_ReverseUUMRecipeLoader implements Runnable {


    @Override
    public void run() {

        //Reverse UUM Recipes, a toggle in the config makes these produce UUA instead of UUM
        Materials tOutputFluid;
        if (GT_Mod.gregtechproxy.mReverseUUMrecipes) {
            tOutputFluid = UUMatter;
        } else {
            tOutputFluid = UUAmplifier;
        }
        // Standard value for this parameter is 512, anything less than 512 will make it cheaper, more than 512 and it increases the cost; in ticks needed for recipe completion.
        int tMult = GT_Mod.gregtechproxy.mReverseUUMRecipeCostMultiplier;
        // Standard value for this parameter is 30, anything less than 30 will make it cheaper, more than 30 and it increases the cost; in EU/t
        int tEUt = GT_Mod.gregtechproxy.mReverseUUMRecipeEUCost;
        //TODO: Find a way to iterate over the elements and generate these recipes automatically. For now, these declarations will have to do.
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Hydrogen.getCells(1), null, tOutputFluid.getFluid(Hydrogen.getMass()), ItemList.Cell_Empty.get(1L), (int) Hydrogen.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Helium.getCells(1), null, tOutputFluid.getFluid(Helium.getMass()), ItemList.Cell_Empty.get(1L), (int) Helium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Lithium.getDust(1), null, tOutputFluid.getFluid(Lithium.getMass()), null, (int) Lithium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Beryllium.getDust(1), null, tOutputFluid.getFluid(Beryllium.getMass()), null, (int) Beryllium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Boron.getDust(1), null, tOutputFluid.getFluid(Boron.getMass()), null, (int) Boron.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Carbon.getDust(1), null, tOutputFluid.getFluid(Carbon.getMass()), null, (int) Carbon.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Nitrogen.getCells(1), null, tOutputFluid.getFluid(Nitrogen.getMass()), ItemList.Cell_Empty.get(1L), (int) Nitrogen.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Oxygen.getCells(1), null, tOutputFluid.getFluid(Oxygen.getMass()), ItemList.Cell_Empty.get(1L), (int) Oxygen.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Fluorine.getCells(1), null, tOutputFluid.getFluid(Fluorine.getMass()), ItemList.Cell_Empty.get(1L), (int) Fluorine.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Sodium.getDust(1), null, tOutputFluid.getFluid(Sodium.getMass()), null, (int) Sodium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Magnesium.getDust(1), null, tOutputFluid.getFluid(Magnesium.getMass()), null, (int) Magnesium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Aluminium.getDust(1), null, tOutputFluid.getFluid(Aluminium.getMass()), null, (int) Aluminium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Silicon.getDust(1), null, tOutputFluid.getFluid(Silicon.getMass()), null, (int) Silicon.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Phosphorus.getDust(1), null, tOutputFluid.getFluid(Phosphorus.getMass()), null, (int) Phosphorus.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Sulfur.getDust(1), null, tOutputFluid.getFluid(Sulfur.getMass()), null, (int) Sulfur.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Chlorine.getCells(1), null, tOutputFluid.getFluid( Chlorine.getMass()), ItemList.Cell_Empty.get(1L), (int) Chlorine.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Potassium.getDust(1), null, tOutputFluid.getFluid(Potassium.getMass()), null, (int) Potassium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Argon.getCells(1), null, tOutputFluid.getFluid(Argon.getMass()), ItemList.Cell_Empty.get(1L), (int) Argon.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Calcium.getDust(1), null, tOutputFluid.getFluid(Calcium.getMass()), null, (int) Calcium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Scandium.getDust(1), null, tOutputFluid.getFluid(Scandium.getMass()), null, (int) Scandium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Titanium.getDust(1), null, tOutputFluid.getFluid(Titanium.getMass()), null, (int) Titanium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Desh.getDust(1), null, tOutputFluid.getFluid( Desh.getMass()), null, (int) Desh.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Vanadium.getDust(1), null, tOutputFluid.getFluid(Vanadium.getMass()), null, (int) Vanadium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Chrome.getDust(1), null, tOutputFluid.getFluid(Chrome.getMass()), null, (int) Chrome.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Manganese.getDust(1), null, tOutputFluid.getFluid(Manganese.getMass()), null, (int) Manganese.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Iron.getDust(1), null, tOutputFluid.getFluid(Iron.getMass()), null, (int) Iron.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Nickel.getDust(1), null, tOutputFluid.getFluid( Nickel.getMass()), null, (int) Nickel.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Cobalt.getDust(1), null, tOutputFluid.getFluid(Cobalt.getMass()), null, (int) Cobalt.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Copper.getDust(1), null, tOutputFluid.getFluid(Copper.getMass()), null, (int) Copper.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Zinc.getDust(1), null, tOutputFluid.getFluid(Zinc.getMass()), null, (int) Zinc.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), MeteoricIron.getDust(1), null, tOutputFluid.getFluid(MeteoricIron.getMass()), null, (int) MeteoricIron.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Gallium.getDust(1), null, tOutputFluid.getFluid(Gallium.getMass()), null, (int) Gallium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Arsenic.getDust(1), null, tOutputFluid.getFluid(Arsenic.getMass()), null, (int) Arsenic.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Rubidium.getDust(1), null, tOutputFluid.getFluid(Rubidium.getMass()), null, (int) Rubidium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Strontium.getDust(1), null, tOutputFluid.getFluid(Strontium.getMass()), null, (int) Strontium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Yttrium.getDust(1), null, tOutputFluid.getFluid(Yttrium.getMass()), null, (int) Yttrium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Niobium.getDust(1), null, tOutputFluid.getFluid(Niobium.getMass()), null, (int) Niobium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Molybdenum.getDust(1), null, tOutputFluid.getFluid(Molybdenum.getMass()), null, (int) Molybdenum.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Palladium.getDust(1), null, tOutputFluid.getFluid(Palladium.getMass()), null, (int) Palladium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Silver.getDust(1), null, tOutputFluid.getFluid(Silver.getMass()), null, (int) Silver.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Cadmium.getDust(1), null, tOutputFluid.getFluid(Cadmium.getMass()), null, (int) Cadmium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Indium.getDust(1), null, tOutputFluid.getFluid(Indium.getMass()), null, (int) Indium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Tin.getDust(1), null, tOutputFluid.getFluid(Tin.getMass()), null, (int) Tin.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Antimony.getDust(1), null, tOutputFluid.getFluid(Antimony.getMass()), null, (int) Antimony.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Tellurium.getDust(1), null, tOutputFluid.getFluid(Tellurium.getMass()), null, (int) Tellurium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Caesium.getDust(1), null, tOutputFluid.getFluid(Caesium.getMass()), null, (int) Caesium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Barium.getDust(1), null, tOutputFluid.getFluid( Barium.getMass()), null, (int) Barium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Lanthanum.getDust(1), null, tOutputFluid.getFluid(Lanthanum.getMass()), null, (int) Lanthanum.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Praseodymium.getDust(1), null, tOutputFluid.getFluid(Praseodymium.getMass()), null, (int) Praseodymium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Cerium.getDust(1), null, tOutputFluid.getFluid(Cerium.getMass()), null, (int) Cerium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Neodymium.getDust(1), null, tOutputFluid.getFluid( Neodymium.getMass()), null, (int) Neodymium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Promethium.getDust(1), null, tOutputFluid.getFluid(Promethium.getMass()), null, (int) Promethium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Samarium.getDust(1), null, tOutputFluid.getFluid(Samarium.getMass()), null, (int) Samarium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Europium.getDust(1), null, tOutputFluid.getFluid( Europium.getMass()), null, (int) Europium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Gadolinium.getDust(1), null, tOutputFluid.getFluid(Gadolinium.getMass()), null, (int) Gadolinium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Terbium.getDust(1), null, tOutputFluid.getFluid(Terbium.getMass()), null, (int) Terbium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Dysprosium.getDust(1), null, tOutputFluid.getFluid(Dysprosium.getMass()), null, (int) Dysprosium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Holmium.getDust(1), null, tOutputFluid.getFluid(Holmium.getMass()), null, (int) Holmium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Erbium.getDust(1), null, tOutputFluid.getFluid(Erbium.getMass()), null, (int) Erbium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Thulium.getDust(1), null, tOutputFluid.getFluid(Thulium.getMass()), null, (int) Thulium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Ytterbium.getDust(1), null, tOutputFluid.getFluid(Ytterbium.getMass()), null, (int) Ytterbium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Lutetium.getDust(1), null, tOutputFluid.getFluid(Lutetium.getMass()), null, (int) Lutetium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Tantalum.getDust(1), null, tOutputFluid.getFluid(Tantalum.getMass()), null, (int) Tantalum.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Tungsten.getDust(1), null, tOutputFluid.getFluid(Tungsten.getMass()), null, (int) Tungsten.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Osmium.getDust(1), null, tOutputFluid.getFluid(Osmium.getMass()), null, (int) Osmium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Iridium.getDust(1), null, tOutputFluid.getFluid(Iridium.getMass()), null, (int) Iridium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Platinum.getDust(1), null, tOutputFluid.getFluid(Platinum.getMass()), null, (int) Platinum.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Gold.getDust(1), null, tOutputFluid.getFluid(Gold.getMass()), null, (int) Gold.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Mercury.getCells(1), null, tOutputFluid.getFluid(Mercury.getMass()), ItemList.Cell_Empty.get(1), (int) Mercury.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Oriharukon.getDust(1), null, tOutputFluid.getFluid(Oriharukon.getMass()), null, (int) Oriharukon.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Lead.getDust(1), null, tOutputFluid.getFluid(Lead.getMass()), null, (int) Lead.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Bismuth.getDust(1), null, tOutputFluid.getFluid(Bismuth.getMass()), null, (int) Bismuth.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Thorium.getDust(1), null, tOutputFluid.getFluid(Thorium.getMass()), null, (int) Thorium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Uranium.getDust(1), null, tOutputFluid.getFluid(Uranium.getMass()), null, (int) Uranium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Americium.getDust(1), null, tOutputFluid.getFluid(Americium.getMass()), null, (int) Americium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Plutonium.getDust(1), null, tOutputFluid.getFluid(Plutonium.getMass()), null, (int) Plutonium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Flerovium.getDust(1), null, tOutputFluid.getFluid(Flerovium.getMass()), null, (int) Flerovium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Tritanium.getDust(1), null, tOutputFluid.getFluid(Tritanium.getMass()), null, (int) Tritanium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Naquadah.getDust(1), null, tOutputFluid.getFluid(Naquadah.getMass()), null, (int) Naquadah.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), InfinityCatalyst.getDust(1), null, tOutputFluid.getFluid( InfinityCatalyst.getMass()), null, (int) InfinityCatalyst.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Neutronium.getDust(1), null, tOutputFluid.getFluid(Neutronium.getMass()), null, (int) Neutronium.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Infinity.getDust(1), null, tOutputFluid.getFluid(Infinity.getMass()), null, (int) Infinity.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), Radon.getCells(1), null, tOutputFluid.getFluid(Radon.getMass()), ItemList.Cell_Empty.get(1), (int) Radon.getMass() * tMult, tEUt);
        GT_Values.RA.addChemicalRecipe(GT_Utility.getIntegratedCircuit(24), CosmicNeutronium.getDust(1), null, tOutputFluid.getFluid(CosmicNeutronium.getMass()), null, (int) CosmicNeutronium.getMass() * tMult, tEUt);

    }
}
