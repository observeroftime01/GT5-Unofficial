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


public class GT_CustomRecipeLoader implements Runnable {

    public void run() {

            //Blast Furnace Recipes
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Electrum, 1), GT_Utility.getIntegratedCircuit(11), Materials.Nitrogen.getGas(1000), null, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Electrum, 1), null, 2000, 480, 2454);



    }


}
