package vertex101.nethergear;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import vertex101.nethergear.proxy.CommonProxy;

@Mod(modid = NetherGear.MODID, name = NetherGear.MODNAME, version = NetherGear.MODVERSION, dependencies = "required-after:forge@[14.23.5.2796,)", useMetadata = true)
public class NetherGear {

    public static final String MODID = "nethergear";
    public static final String MODNAME = "Nether Gear";
    public static final String MODVERSION= "0.0.1";

    public static final ItemArmor.ArmorMaterial hellforgeArmorMaterial = EnumHelper.addArmorMaterial("dragonArmorMaterial", "nethergear:hellforge", 200, new int[]{7, 10, 12, 7}, 75, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 20.0F);

    @SidedProxy(clientSide = "vertex101.nethergear.proxy.ClientProxy", serverSide = "vertex101.nethergear.proxy.ServerProxy")
    public static CommonProxy proxy;

    public static CreativeTabs creativeTab = new CreativeTabs("nethergear") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.itemLavaStone);
        }
    };

    @Mod.Instance
    public static NetherGear instance;

    //public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
