package com.shrajan.creational.prototype;

public class ProtoTypeTest {

	public static void main(String[] args) throws Throwable {
		Prototype proto =  new Prototype();
		
		Prototype another = proto.clone();
System.out.println(another);
	}

}
