package com.shrajan.creational.factory;

public class CarFactory implements VehicleFactory {

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Car();
	}

}
