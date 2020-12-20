package com.allan.allansmod.blocks;

import com.allan.allansmod.items.ItemWrapper;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;


public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(ItemWrapper.ALLANS_ITEM_GROUP));
    }
}
