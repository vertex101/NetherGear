package vertex101.nethergear.armor.hellforge;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import vertex101.nethergear.NetherGear;
import vertex101.nethergear.items.ItemLavaStone;

public class HFArmor {
    //HellForge
    public static ItemArmor hellforge_helmet;
    public static ItemArmor hellforge_chestplate;
    public static ItemArmor hellforge_leggings;
    public static ItemArmor hellforge_boots;

    public static void init() {
        // HellForge
        hellforge_helmet = new HellForgeArmor("hellforge_helmet", NetherGear.hellforgeArmorMaterial, 1, EntityEquipmentSlot.HEAD);
        hellforge_chestplate = new HellForgeArmor("hellforge_chestplate", NetherGear.hellforgeArmorMaterial, 1, EntityEquipmentSlot.CHEST);
        hellforge_leggings = new HellForgeArmor("hellforge_leggings", NetherGear.hellforgeArmorMaterial, 2, EntityEquipmentSlot.LEGS);
        hellforge_boots = new HellForgeArmor("hellforge_boots", NetherGear.hellforgeArmorMaterial, 1, EntityEquipmentSlot.FEET);
    }

    public static void register(IForgeRegistry<Item> registry) {
        registry.register(hellforge_boots);
        registry.register(hellforge_helmet);
        registry.register(hellforge_leggings);
        registry.register(hellforge_chestplate);
    }

    @SideOnly(Side.CLIENT)
    public static void initModel() {
        ModelLoader.setCustomModelResourceLocation(hellforge_boots, 0, new ModelResourceLocation(hellforge_boots.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(hellforge_leggings, 0, new ModelResourceLocation(hellforge_leggings.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(hellforge_chestplate, 0, new ModelResourceLocation(hellforge_chestplate.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(hellforge_helmet, 0, new ModelResourceLocation(hellforge_helmet.getRegistryName(), "inventory"));
    }

}
