package com.gioia.patrones.domain;

public class ExtraDeAlbahaca extends Extras {
    protected Pizza pizza;

    public ExtraDeAlbahaca(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return "Extra de albahaca";
    }

    public int getCost(){
        return 5 + (pizza == null ? 0 : pizza.getCost());
    }
}
