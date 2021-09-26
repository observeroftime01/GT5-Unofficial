package gregtech.common.tileentities.machines.multi;

import com.gtnewhorizon.structurelib.structure.IStructureDefinition;
import com.gtnewhorizon.structurelib.structure.StructureDefinition;
import gregtech.api.GregTech_API;
import gregtech.api.gui.GT_GUIContainer_MultiMachine;
import gregtech.api.interfaces.ITexture;
import gregtech.api.interfaces.metatileentity.IMetaTileEntity;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.metatileentity.implementations.GT_MetaTileEntity_EnhancedMultiBlockBase;
import gregtech.api.render.TextureFactory;
import gregtech.api.util.GT_Multiblock_Tooltip_Builder;
import gregtech.api.util.GT_Recipe;
import gregtech.api.util.GT_Utility;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import java.util.ArrayList;

import static com.gtnewhorizon.structurelib.structure.StructureUtility.*;
import static gregtech.api.enums.Textures.BlockIcons.*;
import static gregtech.api.util.GT_StructureUtility.ofHatchAdder;

public class GT_MetaTileEntity_AdvancedLargeChemicalReactor extends GT_MetaTileEntity_EnhancedMultiBlockBase<GT_MetaTileEntity_AdvancedLargeChemicalReactor> {
    private static final int CASING_INDEX = 176;
    private static final String STRUCTURE_PIECE_MAIN = "main";
    private static final IStructureDefinition<GT_MetaTileEntity_AdvancedLargeChemicalReactor> STRUCTURE_DEFINITION = StructureDefinition.<GT_MetaTileEntity_AdvancedLargeChemicalReactor>builder()
            .addShape(STRUCTURE_PIECE_MAIN, transpose(new String[][]{
                    {"ccc", "cxc", "ccc"},
                    {"c~c", "xPx", "cxc"},
                    {"ccc", "cxc", "ccc"},
            }))
            .addElement('P', ofBlock(GregTech_API.sBlockCasings8, 1))
            .addElement('c', ofChain(
                    ofHatchAdder(GT_MetaTileEntity_AdvancedLargeChemicalReactor::addInputToMachineList, CASING_INDEX, 1),
                    ofHatchAdder(GT_MetaTileEntity_AdvancedLargeChemicalReactor::addOutputToMachineList, CASING_INDEX, 1),
                    ofHatchAdder(GT_MetaTileEntity_AdvancedLargeChemicalReactor::addMaintenanceToMachineList, CASING_INDEX, 1),
                    ofHatchAdder(GT_MetaTileEntity_AdvancedLargeChemicalReactor::addEnergyInputToMachineList, CASING_INDEX, 1),
                    onElementPass(GT_MetaTileEntity_AdvancedLargeChemicalReactor::onCasingAdded, ofBlock(GregTech_API.sBlockCasings8, 11))
            ))
            .addElement('x', ofChain(
                    ofHatchAdder(GT_MetaTileEntity_AdvancedLargeChemicalReactor::addInputToMachineList, CASING_INDEX, 2),
                    ofHatchAdder(GT_MetaTileEntity_AdvancedLargeChemicalReactor::addOutputToMachineList, CASING_INDEX, 2),
                    ofHatchAdder(GT_MetaTileEntity_AdvancedLargeChemicalReactor::addMaintenanceToMachineList, CASING_INDEX, 2),
                    ofHatchAdder(GT_MetaTileEntity_AdvancedLargeChemicalReactor::addEnergyInputToMachineList, CASING_INDEX, 2),
                    onElementPass(GT_MetaTileEntity_AdvancedLargeChemicalReactor::onCoilAdded, ofBlock(GregTech_API.sBlockCasings5, 0)),
                    onElementPass(GT_MetaTileEntity_AdvancedLargeChemicalReactor::onCasingAdded, ofBlock(GregTech_API.sBlockCasings8, 0))
            ))
            .build();

    private int mCasingAmount;
    private int mCoilAmount;

    public GT_MetaTileEntity_AdvancedLargeChemicalReactor(int aID, String aName, String aNameRegional) {
        super(aID, aName, aNameRegional);
    }

    public GT_MetaTileEntity_AdvancedLargeChemicalReactor(String aName) {
        super(aName);
    }

    @Override
    public IMetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
        return new GT_MetaTileEntity_AdvancedLargeChemicalReactor(this.mName);
    }

    @Override
    public GT_Multiblock_Tooltip_Builder createTooltip() {
        final GT_Multiblock_Tooltip_Builder tt = new GT_Multiblock_Tooltip_Builder();
        tt.addMachineType("Advanced Chemical Reactor")
                .addInfo("Controller block for the Advanced Chemical Reactor")
                .addInfo("Faster than Lightning through the power of If*")
                .addInfo("Like the regular version, but BLAZING FAST")
                .addSeparator()
                .beginStructureBlock(3, 3, 3, false)
                .addController("Front center")
                .addCasingInfo("Chemically Inert Machine Casing", 8)
                .addOtherStructurePart("PTFE Pipe Machine Casing", "Center")
                .addOtherStructurePart("Infinity Coil Block", "Adjacent to the PTFE Pipe Machine Casing", 1)
                .addEnergyHatch("Any casing", 1, 2)
                .addMaintenanceHatch("Any casing", 1, 2)
                .addInputBus("Any casing", 1, 2)
                .addInputHatch("Any casing", 1, 2)
                .addOutputBus("Any casing", 1, 2)
                .addOutputHatch("Any casing", 1, 2)
                .addStructureInfo("You can have multiple hatches/busses")
                .toolTipFinisher("Gregtech");
        return tt;
    }

    @Override
    public ITexture[] getTexture(IGregTechTileEntity aBaseMetaTileEntity, byte aSide, byte aFacing, byte aColorIndex, boolean aActive,
                                 boolean aRedstone) {
        if (aSide == aFacing) {
            if (aActive) return new ITexture[]{
                    casingTexturePages[1][48],
                    TextureFactory.builder().addIcon(OVERLAY_FRONT_LARGE_CHEMICAL_REACTOR_ACTIVE).extFacing().build(),
                    TextureFactory.builder().addIcon(OVERLAY_FRONT_LARGE_CHEMICAL_REACTOR_ACTIVE_GLOW).extFacing().glow().build()};
            return new ITexture[]{
                    casingTexturePages[1][48],
                    TextureFactory.builder().addIcon(OVERLAY_FRONT_LARGE_CHEMICAL_REACTOR).extFacing().build(),
                    TextureFactory.builder().addIcon(OVERLAY_FRONT_LARGE_CHEMICAL_REACTOR_GLOW).extFacing().glow().build()};
        }
        return new ITexture[]{casingTexturePages[1][48]};
    }

    @Override
    public Object getClientGUI(int aID, InventoryPlayer aPlayerInventory, IGregTechTileEntity aBaseMetaTileEntity) {
        return new GT_GUIContainer_MultiMachine(aPlayerInventory, aBaseMetaTileEntity, getLocalName(), "LargeChemicalReactor.png");
    }

    @Override
    public boolean isCorrectMachinePart(ItemStack aStack) {
        return true;
    }

    @Override
    public boolean checkRecipe(ItemStack aStack) {
        ArrayList<ItemStack> tInputList = getStoredInputs();
        int tInputList_sS = tInputList.size();
        for (int i = 0; i < tInputList_sS - 1; i++) {
            for (int j = i + 1; j < tInputList_sS; j++) {
                if (GT_Utility.areStacksEqual(tInputList.get(i), tInputList.get(j))) {
                    if (tInputList.get(i).stackSize >= tInputList.get(j).stackSize) {
                        tInputList.remove(j--);
                        tInputList_sS = tInputList.size();
                    } else {
                        tInputList.remove(i--);
                        tInputList_sS = tInputList.size();
                        break;
                    }
                }
            }
        }
        tInputList.add(mInventory[1]);
        ItemStack[] inputs = tInputList.toArray(new ItemStack[0]);

        ArrayList<FluidStack> tFluidList = getStoredFluids();
        int tFluidList_sS = tFluidList.size();
        for (int i = 0; i < tFluidList_sS - 1; i++) {
            for (int j = i + 1; j < tFluidList_sS; j++) {
                if (GT_Utility.areFluidsEqual(tFluidList.get(i), tFluidList.get(j))) {
                    if (tFluidList.get(i).amount >= tFluidList.get(j).amount) {
                        tFluidList.remove(j--);
                        tFluidList_sS = tFluidList.size();
                    } else {
                        tFluidList.remove(i--);
                        tFluidList_sS = tFluidList.size();
                        break;
                    }
                }
            }
        }
        FluidStack[] fluids = tFluidList.toArray(new FluidStack[0]);
        if (inputs.length > 0 || fluids.length > 0) {
            long tVoltage = getMaxInputVoltage();
            byte tier = (byte) Math.max(1, GT_Utility.getTier(tVoltage));
            GT_Recipe tRecipe = GT_Recipe.GT_Recipe_Map.sMultiblockChemicalRecipes.findRecipe(getBaseMetaTileEntity(), false,
                    false, gregtech.api.enums.GT_Values.V[tier], fluids, inputs);
            if (tRecipe != null && tRecipe.isRecipeInputEqual(true, fluids, inputs)) {
                this.mEfficiency = (10000 - (getIdealStatus() - getRepairStatus()) * 1000);
                this.mEfficiencyIncrease = 10000;

                calculatePerfectOverclockedNessMulti(tRecipe.mEUt, tRecipe.mDuration, 1, tVoltage);
                //In case recipe is too OP for that machine
                if (mMaxProgresstime == Integer.MAX_VALUE - 1 && mEUt == Integer.MAX_VALUE - 1)
                    return false;
                // Do everything in 1 tick. This reactor only makes sense for late game recipes that won't hit 1 tick through overclocks.
                // It is nonsensical for just about everything else, as the LCR already overclocks most recipes to 1 tick at UHV. But hey, for those 5 recipes, it will be AMAZING...
                this.mMaxProgresstime = 1;
                if (this.mEUt > 0) {
                    this.mEUt = (-this.mEUt);
                }

                this.mOutputItems = tRecipe.mOutputs;
                this.mOutputFluids = tRecipe.mFluidOutputs;
                this.updateSlots();
                return true;
            }
        }
        return false;
    }

    @Override
    public IStructureDefinition<GT_MetaTileEntity_AdvancedLargeChemicalReactor> getStructureDefinition() {
        return STRUCTURE_DEFINITION;
    }

    private void onCasingAdded() {
        mCasingAmount++;
    }

    private void onCoilAdded() {
        mCoilAmount++;
    }

    @Override
    public boolean checkMachine(IGregTechTileEntity aBaseMetaTileEntity, ItemStack aStack) {
        mCasingAmount = 0;
        mCoilAmount = 0;
        return checkPiece(STRUCTURE_PIECE_MAIN, 1, 1, 0) &&
                mCasingAmount >= 8 && mCoilAmount == 1 &&
                !mEnergyHatches.isEmpty() && mMaintenanceHatches.size() == 1;
    }

    @Override
    public int getMaxEfficiency(ItemStack aStack) {
        return 10000;
    }

    @Override
    public int getPollutionPerTick(ItemStack aStack) {
        return 0;
    }

    @Override
    public int getDamageToComponent(ItemStack aStack) {
        return 0;
    }

    @Override
    public boolean explodesOnComponentBreak(ItemStack aStack) {
        return false;
    }

    @Override
    public void construct(ItemStack stackSize, boolean hintsOnly) {
        buildPiece(STRUCTURE_PIECE_MAIN, stackSize, hintsOnly, 1, 1, 0);
    }
}
