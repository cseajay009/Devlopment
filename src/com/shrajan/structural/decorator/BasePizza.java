package com.shrajan.structural.decorator;

public class BasePizza implements Pizza {

	private String description;
    private double cost;

    public BasePizza(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

}
