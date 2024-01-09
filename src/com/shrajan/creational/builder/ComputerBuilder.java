package com.shrajan.creational.builder;

public  class ComputerBuilder {
	// required parameters
			public static String HDD;
			public static String RAM;

			// optional parameters
			public static boolean isGraphicsCardEnabled;
			public static boolean isBluetoothEnabled;
			
			public ComputerBuilder(String hdd, String ram){
				this.HDD=hdd;
				this.RAM=ram;
			}

			public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
				this.isGraphicsCardEnabled = isGraphicsCardEnabled;
				return this;
			}

			public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
				this.isBluetoothEnabled = isBluetoothEnabled;
				return this;
			}
			
			public Computer build(){
				return new Computer(new ComputerBuilder(HDD, RAM));
			}
}
