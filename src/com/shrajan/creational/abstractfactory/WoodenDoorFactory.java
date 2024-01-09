package com.shrajan.creational.abstractfactory;

public class WoodenDoorFactory implements DoorAbstractFactory {

	@Override
	public Door createDoor() {
		// TODO Auto-generated method stub
		return new WoodenDoor(DoorTypes.Wooden);
	}

}
