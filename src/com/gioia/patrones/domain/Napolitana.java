package com.gioia.patrones.domain;

public class Napolitana extends Pizza{
    @Override
    public String getDescription() {
        return "Pizza napolitana";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
