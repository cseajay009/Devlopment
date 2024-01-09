package com.shrajan.structural.decorator;

public class PizzaOrderingSystem {

	public static void main(String[] args) {
		
		Pizza basePizza = new BasePizza("Thin Crust Pizza", 8.0);

        
        Pizza pizzaWithVeggies = new VeggieConcreateDecorator(basePizza, 2.0);
       
        System.out.println(pizzaWithVeggies.getCost()+"   "+pizzaWithVeggies.getDescription());
       
	}

}
