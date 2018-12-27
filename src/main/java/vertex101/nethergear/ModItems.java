package vertex101.nethergear;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import vertex101.nethergear.handler.MatHandler;
import vertex101.nethergear.items.ItemArmorCharm;
import vertex101.nethergear.items.ItemLavaStone;
import vertex101.nethergear.items.tools.hellforge.SwordHellForge;

public class ModItems {
    @GameRegistry.ObjectHolder("nethergear:lavastone")
    public static ItemLavaStone itemLavaStone;
    @GameRegistry.ObjectHolder("nethergear:armor_charm")
    public static ItemArmorCharm itemArmorCharm;
    @GameRegistry.ObjectHolder("nethergear:hellforge_sword")
    public static SwordHellForge swordHellForge;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        itemLavaStone.initModel();
        itemArmorCharm.initModel();
    }

    public static void register(IForgeRegistry<Item> registry) {
        registry.register(new ItemLavaStone());
        registry.register(new ItemArmorCharm());
    }
}
