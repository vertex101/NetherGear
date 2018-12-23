package vertex101.nethergear;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import vertex101.nethergear.items.ItemLavaStone;

public class ModItems {
    @GameRegistry.ObjectHolder("nethergear:lavastone")
    public static ItemLavaStone itemLavaStone;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        itemLavaStone.initModel();
    }

    public static void register(IForgeRegistry<Item> registry) {
        registry.register(new ItemLavaStone());
    }
}
