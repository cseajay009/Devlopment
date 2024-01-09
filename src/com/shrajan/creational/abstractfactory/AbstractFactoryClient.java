package com.shrajan.creational.abstractfactory;

public class AbstractFactoryClient {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * Real Life Example. (Easy to remember)
Factory
Imagine you are constructing a house and you approach a carpenter for a door. You give the measurement for the door and your requirements, and he will construct a door for you. In this case, the carpenter is a factory of doors. Your specifications are inputs for the factory, and the door is the output or product from the factory.
Abstract Factory
Now, consider the same example of the door. You can go to a carpenter, or you can go to a plastic door shop or a PVC shop. All of them are door factories. Based on the situation, you decide what kind of factory you need to approach. This is like an Abstract Factory.

		 */
		
		Door metalDoor = DoorFactory.createDoor(new MetalDoorAbstractFactory());
		Door woodenDoor = DoorFactory.createDoor(new WoodenDoorFactory());
		Door pvcDoor =  DoorFactory.createDoor(new PVCDoorAbstractFactory());
		
		
		
		System.out.println(metalDoor.openDoor());
		System.out.println(metalDoor.closeDoor());
		System.out.println(metalDoor.lockDoor());
		System.out.println(metalDoor.unlockDoor());

		
		System.out.println(woodenDoor.openDoor());
		System.out.println(woodenDoor.closeDoor());
		System.out.println(woodenDoor.lockDoor());
		System.out.println(woodenDoor.unlockDoor());
		
		
		
		System.out.println(pvcDoor.openDoor());
		System.out.println(pvcDoor.closeDoor());
		System.out.println(pvcDoor.lockDoor());
		System.out.println(pvcDoor.unlockDoor());
		
		
		
	}

}
