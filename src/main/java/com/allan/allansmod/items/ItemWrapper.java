package com.allan.allansmod.items;

import com.allan.allansmod.util.RegistryHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemWrapper extends Item {
    public static final ItemGroup ALLANS_ITEM_GROUP = new ItemGroup("allans_item_group") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.RED_SWORD.get());
        }
    };
    public ItemWrapper() {
        super(new Item.Properties().group(ALLANS_ITEM_GROUP));
    }
}
