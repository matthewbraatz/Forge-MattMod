package org.braatz.mattmod.init;

import net.minecraftforge.common.MinecraftForge;
import org.braatz.mattmod.events.BiggerTNTExplosion;
import org.braatz.mattmod.events.DiamondOreTrap;
import org.braatz.mattmod.events.ExplodingMinecart;
import org.braatz.mattmod.events.PigsDroppingDiamonds;

/**
 * Created by matthewbraatz on 4/21/17.
 */
public class ModEvents {

    public static void init(){


       // MinecraftForge.EVENT_BUS.register(new BlockBreakMessage());
        MinecraftForge.EVENT_BUS.register(new ExplodingMinecart());
        MinecraftForge.EVENT_BUS.register(new DiamondOreTrap());
        MinecraftForge.EVENT_BUS.register(new BiggerTNTExplosion());
        MinecraftForge.EVENT_BUS.register(new PigsDroppingDiamonds());

    }

}
