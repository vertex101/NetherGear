package vertex101.nethergear.armor.hellforge;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import vertex101.nethergear.ModItems;
import vertex101.nethergear.NetherGear;

public class HellForgeChest extends ItemArmor {

    public static final ArmorMaterial hellforgeArmorMaterial = EnumHelper.addArmorMaterial("hellforgeArmorMaterial", "nethergear:hellforge", 200, new int[]{7, 10, 12, 7}, 75, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 20.0F);

    public HellForgeChest(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn) {
        super(material, renderIndex, equipmentSlotIn);
        this.setMaxStackSize(1);
        this.setCreativeTab(NetherGear.creativeTab);
        this.setTranslationKey(NetherGear.MODID + ".hellforge_chest");
        this.setRegistryName(new ResourceLocation(NetherGear.MODID, "hellforge_chest"));
    }

    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        ItemStack mat = new ItemStack(ModItems.itemLavaStone);
        return !mat.isEmpty() && OreDictionary.itemMatches(mat, repair, false) || super.getIsRepairable(toRepair, repair);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
