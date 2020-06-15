package com.gioia.patrones.domain;

public class Muzzarella extends Pizza{

    @Override
    public String getDescription() {
        return "Pizza de muzzarella";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
