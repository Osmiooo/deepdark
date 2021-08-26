package com.osmiooo.deep.dark;

import com.osmiooo.deep.dark.registry.ModBlocks;
import net.fabricmc.api.ModInitializer;

public class DeepDark implements ModInitializer {

    public static final String MOD_ID = "deepdark";

    @Override
    public void onInitialize() {
        ModBlocks.RegisterBlocks();
    }
}
