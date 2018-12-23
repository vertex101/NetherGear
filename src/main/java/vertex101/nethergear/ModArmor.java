package vertex101.nethergear;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import vertex101.nethergear.armor.hellforge.HellForgeChest;

public class ModArmor {
    @GameRegistry.ObjectHolder("nethergear:hellforge_chest")
    public static HellForgeChest hellforge_chest;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        hellforge_chest.initModel();
    }

    public static void register(IForgeRegistry<Item> registry) {
        registry.register(new HellForgeChest(HellForgeChest.hellforgeArmorMaterial, 1, EntityEquipmentSlot.CHEST));
    }
}
