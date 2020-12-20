package com.allan.allansmod.util;


import com.allan.allansmod.ModName;
import com.allan.allansmod.blocks.AllanBlock;
import com.allan.allansmod.blocks.BlockItemBase;
import com.allan.allansmod.blocks.FloresBlock;
import com.allan.allansmod.items.ItemWrapper;
import com.allan.allansmod.items.Red_Sword;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.TieredItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ModName.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<Block>(ForgeRegistries.BLOCKS, ModName.MOD_ID );

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //items
    public static final RegistryObject<Item> BASIC_ITEM = ITEMS.register("basic_item", ItemWrapper::new);
    public static final RegistryObject<Item> RED_SWORD = ITEMS.register("red_sword", Red_Sword::new);


    //blocks
    public static final RegistryObject<Block> ALLAN_BLOCK = BLOCKS.register("allan_block", AllanBlock::new);

    public static final RegistryObject<Block> FLORES_BLOCK = BLOCKS.register("flores_block", FloresBlock::new);

    //block Items
    public static final RegistryObject<Item> ALLAN_BLOCK_ITEM = ITEMS.register("allan_block", ()->new BlockItemBase(ALLAN_BLOCK.get()));

    public static final RegistryObject<Item> FLORES_BLOCK_ITEM = ITEMS.register("flores_block", ()->new BlockItemBase(FLORES_BLOCK.get()));






}
