package com.gioia.patrones.domain;

public class Fugazetta extends Pizza{
    @Override
    public String getDescription() {
        return "Pizza de fugazetta";
    }

    @Override
    public int getCost() {
        return 300;
    }
}
