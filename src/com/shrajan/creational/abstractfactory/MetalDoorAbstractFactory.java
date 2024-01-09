package com.shrajan.creational.abstractfactory;

public class MetalDoorAbstractFactory implements DoorAbstractFactory {

	@Override
	public Door createDoor() {
		// TODO Auto-generated method stub
		return new MetalDoor(DoorTypes.Metal);
	}

}
