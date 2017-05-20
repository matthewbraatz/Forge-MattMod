package org.braatz.mattmod;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


import org.braatz.mattmod.init.ModBlocks;
import org.braatz.mattmod.init.ModEvents;
import org.braatz.mattmod.init.ModItems;




@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.NAME, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Main {

    @Instance
    public static Main instance;

    //@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    //public static CommonProxy proxy;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }


    @EventHandler
    public void init(FMLInitializationEvent event) {

        //proxy.init();
        ModEvents.init();
        ModItems.createRecipies();
        ModBlocks.createRecipies();



    }


    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }


}