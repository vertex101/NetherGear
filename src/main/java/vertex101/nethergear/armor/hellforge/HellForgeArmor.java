package vertex101.nethergear.armor.hellforge;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import vertex101.nethergear.ModItems;
import vertex101.nethergear.NetherGear;
import vertex101.nethergear.handler.ArmorHandler;

public class HellForgeArmor extends ItemArmor {

    public HellForgeArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.setMaxStackSize(1);
        this.setCreativeTab(NetherGear.creativeTab);
        this.setTranslationKey(NetherGear.MODID + "." + name);
        this.setRegistryName(new ResourceLocation(NetherGear.MODID, name));
    }

    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        ItemStack mat = new ItemStack(ModItems.itemLavaStone);
        return !mat.isEmpty() && OreDictionary.itemMatches(mat, repair, false) || super.getIsRepairable(toRepair, repair);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
        ItemStack chest = entity.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
        ItemStack feet = entity.getItemStackFromSlot(EntityEquipmentSlot.FEET);
        ItemStack head = entity.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
        ItemStack legs = entity.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
        if (((!head.isEmpty()) && (head.getItem() == HFArmor.hellforge_helmet) &&
                (!chest.isEmpty()) && (chest.getItem() == HFArmor.hellforge_chestplate) &&
                (!legs.isEmpty()) && (legs.getItem() == HFArmor.hellforge_leggings) &&
                (!feet.isEmpty()) && (feet.getItem() == HFArmor.hellforge_boots)) ||
                (entity.capabilities.isCreativeMode) || (entity.isSpectator())) {
            if (ArmorHandler.hellforge_armor && ArmorHandler.hellforge_resistance) {
                entity.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 180, ArmorHandler.hellforge_resistance_lvl, false, false));
            }
            if (ArmorHandler.hellforge_armor && ArmorHandler.hellforge_fire) {
                entity.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 180, ArmorHandler.hellforge_fire_lvl, false, false));
            }
            if (ArmorHandler.hellforge_armor && ArmorHandler.hellforge_strength) {
                entity.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 180, ArmorHandler.hellforge_strength_lvl, false, false));
            }
            if (ArmorHandler.hellforge_armor && ArmorHandler.hellforge_fly) {
                entity.capabilities.allowFlying = true;
            }
        } else {
            entity.capabilities.allowFlying = false;
            entity.capabilities.isFlying = false;
        }
    }
}
