package vertex101.nethergear;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import vertex101.nethergear.handler.MatHandler;
import vertex101.nethergear.items.ItemArmorCharm;
import vertex101.nethergear.items.ItemLavaStone;
import vertex101.nethergear.items.ItemSwordCharm;
import vertex101.nethergear.items.ItemToolRod;
import vertex101.nethergear.items.tools.hellforge.SwordHellForge;

public class ModItems {
    @GameRegistry.ObjectHolder("nethergear:lavastone")
    public static ItemLavaStone itemLavaStone;
    @GameRegistry.ObjectHolder("nethergear:armor_charm")
    public static ItemArmorCharm itemArmorCharm;
    @GameRegistry.ObjectHolder("nethergear:toolrod")
    public static ItemToolRod itemToolRod;
    @GameRegistry.ObjectHolder("nethergear:sword_charm")
    public static ItemSwordCharm itemSwordCharm;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        itemLavaStone.initModel();
        itemArmorCharm.initModel();
        itemSwordCharm.initModel();
        itemToolRod.initModel();
    }

    public static void register(IForgeRegistry<Item> registry) {
        registry.register(new ItemLavaStone());
        registry.register(new ItemArmorCharm());
        registry.register(new ItemSwordCharm());
        registry.register(new ItemToolRod());
    }
}
