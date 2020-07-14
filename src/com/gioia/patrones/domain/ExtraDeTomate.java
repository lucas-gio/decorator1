package com.gioia.patrones.domain;

public class ExtraDeTomate extends Extras {
    protected Pizza pizza;

    public ExtraDeTomate(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return "Extra de tomate";
    }

    public int getCost(){
        return 20 + (pizza == null ? 0 : pizza.getCost());
    }
}
