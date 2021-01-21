package ru.betterend.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.MaterialColor;
import ru.betterend.blocks.basis.BlockBase;

public class AmberBlock extends BlockBase {
	public AmberBlock() {
		super(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).materialColor(MaterialColor.YELLOW));
	}
}
