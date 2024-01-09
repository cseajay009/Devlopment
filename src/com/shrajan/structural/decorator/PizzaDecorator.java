package com.shrajan.structural.decorator;

public abstract class PizzaDecorator implements Pizza {

	protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    public String getDescription() {
        return decoratedPizza.getDescription();
    }

    public double getCost() {
        return decoratedPizza.getCost();
    }
}
