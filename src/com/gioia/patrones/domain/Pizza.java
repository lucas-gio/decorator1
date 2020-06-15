package com.gioia.patrones.domain;

public abstract class Pizza {
    protected String name = "";
    protected String description = "";

    public abstract String getDescription();
    public abstract int getCost();
}
