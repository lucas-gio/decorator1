package com.gioia.patrones.domain;

public class ExtraDeFaina extends Extras {
    protected Pizza pizza;

    public ExtraDeFaina(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return "Extra de faina";
    }

    public int getCost(){
        return 15 + (pizza == null ? 0 : pizza.getCost());
    }
}
