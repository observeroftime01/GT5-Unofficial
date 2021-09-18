package gregtech.common.blocks;

import gregtech.api.enums.ItemList;
import gregtech.api.enums.Textures;
import gregtech.api.render.TextureFactory;
import gregtech.api.util.GT_LanguageManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class GT_Block_Casings9 extends GT_Block_Casings_Abstract {

	/**
	 * Texture Index Information
	 * Textures.BlockIcons.casingTexturePages[0][0-63] - Gregtech
	 * Textures.BlockIcons.casingTexturePages[0][64-127] - GT++
	 * Textures.BlockIcons.casingTexturePages[1][0-127] - Gregtech
	 * Textures.BlockIcons.casingTexturePages[2][0-127] - Free
	 * Textures.BlockIcons.casingTexturePages[3][0-127] - Free
	 * Textures.BlockIcons.casingTexturePages[4][0-127] - Free
	 * Textures.BlockIcons.casingTexturePages[5][0-127] - Free
	 * Textures.BlockIcons.casingTexturePages[6][0-127] - Free
	 * Textures.BlockIcons.casingTexturePages[7][0-127] - Free
	 * Textures.BlockIcons.casingTexturePages[8][0-127] - TecTech
	 */


    public GT_Block_Casings9() {
        super(GT_Item_Casings9.class, "gt.blockcasings9", GT_Material_Casings.INSTANCE);
        for (int i = 0; i < 2; i++) {
            Textures.BlockIcons.casingTexturePages[7][i] = TextureFactory.of(this, i);
        }

        GT_LanguageManager.addStringLocalization(getUnlocalizedName() + ".0.name", "Test Casing 1");
        GT_LanguageManager.addStringLocalization(getUnlocalizedName() + ".1.name", "Test Casing 2");

        ItemList.Casing_MiningInfinity.set(new ItemStack(this, 1, 0));
        ItemList.Casing_Test2.set(new ItemStack( this, 1, 1));

    }

    @Override
    public IIcon getIcon(int aSide, int aMeta) {
        switch (aMeta) {
            case 0:
                return Textures.BlockIcons.CASING_MINING_INFINITY.getIcon();
            case 1:
                return Textures.BlockIcons.CASING_TEST2.getIcon();
        }
        return Textures.BlockIcons.CASING_MINING_INFINITY.getIcon();
    }

    @Override
    public int colorMultiplier(IBlockAccess aWorld, int aX, int aY, int aZ) {
        return aWorld.getBlockMetadata(aX, aY, aZ) > 9 ? super.colorMultiplier(aWorld, aX, aY, aZ) : gregtech.api.enums.Dyes.MACHINE_METAL.mRGBa[0] << 16 | gregtech.api.enums.Dyes.MACHINE_METAL.mRGBa[1] << 8 | gregtech.api.enums.Dyes.MACHINE_METAL.mRGBa[2];
    }
}
