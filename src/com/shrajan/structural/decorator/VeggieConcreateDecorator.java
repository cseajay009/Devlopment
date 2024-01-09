package com.shrajan.structural.decorator;

public class VeggieConcreateDecorator extends PizzaDecorator {

	
	
	private double veggieCost;

    public VeggieConcreateDecorator(Pizza decoratedPizza, double veggieCost) {
        super(decoratedPizza);
        this.veggieCost = veggieCost;
    }

    public String getDescription() {
        return super.getDescription() + ", with Veggies";
    }

    public double getCost() {
        return super.getCost() + veggieCost;
    }
	
	
	
	
}
