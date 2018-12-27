package vertex101.nethergear.items.tools.hellforge;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import vertex101.nethergear.handler.MatHandler;

public class SwordHF {
    public static ItemSword hellforge_sword;

    public static void init() {
        hellforge_sword = new SwordHellForge("hellforge_sword", MatHandler.HFSWORD);
    }

    public static void register(IForgeRegistry<Item> registry) {
        registry.register(hellforge_sword);
    }

    @SideOnly(Side.CLIENT)
    public static void initModel() {
        ModelLoader.setCustomModelResourceLocation(hellforge_sword, 0, new ModelResourceLocation(hellforge_sword.getRegistryName(), "inventory"));
    }
}
