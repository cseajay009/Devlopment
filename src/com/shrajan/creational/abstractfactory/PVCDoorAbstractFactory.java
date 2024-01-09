package com.shrajan.creational.abstractfactory;

public class PVCDoorAbstractFactory implements DoorAbstractFactory {

	@Override
	public Door createDoor() {
		// TODO Auto-generated method stub
		return new PVCDoor(DoorTypes.PVC);
	}

}
