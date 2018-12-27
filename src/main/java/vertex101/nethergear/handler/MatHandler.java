package vertex101.nethergear.handler;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class MatHandler {
    //Armor
    public static final ItemArmor.ArmorMaterial hellforgeArmorMaterial = EnumHelper.addArmorMaterial("dragonArmorMaterial", "nethergear:hellforge", 200, new int[]{7, 10, 12, 7}, 75, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 20.0F);

    //Tools
    public static final Item.ToolMaterial HFSWORD = EnumHelper.addToolMaterial("hellforgeToolMaterial", 4, 2961, 10.0F, 15.0F, 22);
}
