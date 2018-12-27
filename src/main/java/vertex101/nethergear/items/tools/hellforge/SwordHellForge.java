package vertex101.nethergear.items.tools.hellforge;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import vertex101.nethergear.ModItems;
import vertex101.nethergear.NetherGear;

public class SwordHellForge extends ItemSword {

    public SwordHellForge(String name, ToolMaterial material) {
        super(material);
        this.setCreativeTab(NetherGear.creativeTab);
        this.setMaxStackSize(1);
        this.setTranslationKey(NetherGear.MODID + "." + name);
        this.setRegistryName(new ResourceLocation(NetherGear.MODID, name));
        this.setMaxDamage(2961);
        this.setDamage(new ItemStack(this),20);
    }
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        ItemStack mat = new ItemStack(ModItems.itemLavaStone);
        return !mat.isEmpty() && OreDictionary.itemMatches(mat, repair, false) || super.getIsRepairable(toRepair, repair);
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
