package org.braatz.mattmod.items;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import org.braatz.mattmod.Reference;
import org.braatz.mattmod.init.ModBlocks;

/**
 * Created by matthewbraatz on 4/25/17.
 */
public class ItemTomatoseeds extends ItemSeeds {


    public ItemTomatoseeds() {
        super(ModBlocks.tomatoplant, Blocks.FARMLAND);
        setUnlocalizedName(Reference.MattModItems.TOMATOSEEDS.getunlocalizedName());
        setRegistryName(Reference.MattModItems.TOMATOSEEDS.getRegistryName());


    }
}
