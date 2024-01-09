package com.shrajan.structural.bridge;

public class BridgeTest {

	public static void main(String[] args) {
		Shape redSquare =  new Square(new Red(),ShapeTypes.Square);
		Shape greenSquare = new Square(new Green(),ShapeTypes.Square);
		
		Shape redTriangle = new Triangle(new Red(),ShapeTypes.Triangle);
		Shape greenTriangle =  new Triangle(new Green(),ShapeTypes.Triangle);
	
		
		System.out.println("Shape is : "+redSquare.shapeType+" Color is :  "+redSquare.color.getHexCode());
		System.out.println("Shape is : "+greenSquare.shapeType+" Color is :  "+greenSquare.color.getHexCode());
		
		
		System.out.println("Shape is : "+redTriangle.shapeType+" Color is :  "+redTriangle.color.getHexCode());
		System.out.println("Shape is : "+greenTriangle.shapeType+" Color is :  "+greenTriangle.color.getHexCode());

	}

}
