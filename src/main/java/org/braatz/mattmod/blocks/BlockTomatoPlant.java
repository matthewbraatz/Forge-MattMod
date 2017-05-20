package org.braatz.mattmod.blocks;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import org.braatz.mattmod.Reference;
import org.braatz.mattmod.init.ModItems;

/**
 * Created by matthewbraatz on 4/24/17.
 */
public class BlockTomatoPlant extends BlockCrops {

    public BlockTomatoPlant() {

        setUnlocalizedName(Reference.MattModBlocks.TOMATOPLANT.getunlocalizedName());
        setRegistryName(Reference.MattModBlocks.TOMATOPLANT.getRegistryName());


    }


    @Override
    protected Item getSeed() {
        return ModItems.tomatoseeds;
    }


    @Override
    protected Item getCrop() {
        return ModItems.tomato;

    }
}
