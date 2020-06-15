package com.gioia.patrones.domain;

public class Calabresa extends Pizza {
    @Override
    public String getDescription() {
        return "Pizza calabresa";
    }

    @Override
    public int getCost() {
        return 400;
    }
}
