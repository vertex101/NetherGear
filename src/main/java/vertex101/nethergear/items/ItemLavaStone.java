package vertex101.nethergear.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vertex101.nethergear.NetherGear;

public class ItemLavaStone extends Item {

    public ItemLavaStone() {
        setTranslationKey(NetherGear.MODID + ".lavastone");
        setRegistryName(new ResourceLocation(NetherGear.MODID, "lavastone"));
        setCreativeTab(NetherGear.creativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
