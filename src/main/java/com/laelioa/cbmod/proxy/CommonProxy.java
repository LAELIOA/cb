package com.laelioa.cbmod.proxy;

public abstract class CommonProxy {
    public void preInit() {}

    public void init() {}

    public void postInit() {}

    abstract public void registerBlockModels();
}
