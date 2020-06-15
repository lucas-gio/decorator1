package com.gioia.patrones.domain;

public class ExtraDeAnana extends Extras {
    protected Pizza pizza;

    public ExtraDeAnana(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return "Extra de ananá";
    }

    public int getCost(){
        return 10 + (pizza == null ? 0 : pizza.getCost());
    }
}
