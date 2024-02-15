package com.laelioa.cbmod;

import com.laelioa.cbmod.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class ComfortBox {
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
    public static CommonProxy proxy;

    public static CreativeTabs roadTab = new CbTab("road");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }
}
