package com.osmiooo.deep.dark.registry;

import com.osmiooo.deep.dark.DeepDark;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public abstract class ModBlocks {

    public static final Block SCULK_BLOCK = new Block(FabricBlockSettings.of(Material.SCULK).strength(1.5f).breakByTool(FabricToolTags.HOES).requiresTool().sounds(BlockSoundGroup.SCULK_SENSOR));
    public static final Block SCULK_CATALYST = new Sculk_catalyst(FabricBlockSettings.of(Material.SCULK).strength(1.5f).breakByTool(FabricToolTags.HOES).requiresTool().sounds(BlockSoundGroup.SCULK_SENSOR));
    public static final Block SCULK_SHRIEKER = new Block(FabricBlockSettings.of(Material.SCULK).strength(1.5f).breakByTool(FabricToolTags.HOES).requiresTool().sounds(BlockSoundGroup.SCULK_SENSOR).nonOpaque());
    public static final Block SCULK_VEIN = new Sculk_vein(FabricBlockSettings.of(Material.SCULK).strength(0.1f).breakByTool(FabricToolTags.HOES).sounds(BlockSoundGroup.SCULK_SENSOR).nonOpaque().noCollision());

    public static void RegisterBlocks() {

        Registry.register(Registry.BLOCK, new Identifier(DeepDark.MOD_ID, "sculk_block"), SCULK_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(DeepDark.MOD_ID, "sculk_block"), new BlockItem(SCULK_BLOCK, new FabricItemSettings().group(ItemGroup.REDSTONE)));
        Registry.register(Registry.BLOCK, new Identifier(DeepDark.MOD_ID, "sculk_vein"), SCULK_VEIN);
        Registry.register(Registry.ITEM, new Identifier(DeepDark.MOD_ID, "sculk_vein"), new BlockItem(SCULK_VEIN, new FabricItemSettings().group(ItemGroup.REDSTONE)));
        Registry.register(Registry.BLOCK, new Identifier(DeepDark.MOD_ID, "sculk_catalyst"), SCULK_CATALYST);
        Registry.register(Registry.ITEM, new Identifier(DeepDark.MOD_ID, "sculk_catalyst"), new BlockItem(SCULK_CATALYST, new FabricItemSettings().group(ItemGroup.REDSTONE)));
        Registry.register(Registry.BLOCK, new Identifier(DeepDark.MOD_ID, "sculk_shrieker"), SCULK_SHRIEKER);
        Registry.register(Registry.ITEM, new Identifier(DeepDark.MOD_ID, "sculk_shrieker"), new BlockItem(SCULK_SHRIEKER, new FabricItemSettings().group(ItemGroup.REDSTONE)));
    }
}
