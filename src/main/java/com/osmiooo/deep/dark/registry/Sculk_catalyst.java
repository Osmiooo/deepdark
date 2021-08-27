package com.osmiooo.deep.dark.registry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Property;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Sculk_catalyst extends Block {
    public static final BooleanProperty BLOOM = BooleanProperty.of("bloom");
    public Sculk_catalyst(Settings settings) {
        super(settings);
        setDefaultState(getStateManager().getDefaultState().with(BLOOM, false));
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(BLOOM);
    }
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        world.setBlockState(pos, state.with(BLOOM, true));
        return ActionResult.SUCCESS;
    }
    }
