package com.shrajan.structural.composite;

public class ClientCode {

	
	public static void main(String args[]) {
		
		DepartmentComposite onecomposite = new DepartmentComposite();
		onecomposite.addComponent(new EmployeeLeaf(100));
		onecomposite.addComponent(new EmployeeLeaf(900));
		onecomposite.addComponent(new EmployeeLeaf(700));
		onecomposite.addComponent(new EmployeeLeaf(100));
		onecomposite.addComponent(new EmployeeLeaf(300));
		onecomposite.addComponent(new EmployeeLeaf(100));
		
		
		DepartmentComposite wrappercomposite = new DepartmentComposite();
		wrappercomposite.addComponent(onecomposite);
		
		
		DepartmentComposite twocomposite = new DepartmentComposite();
		onecomposite.addComponent(new EmployeeLeaf(10));
		onecomposite.addComponent(new EmployeeLeaf(90));
		onecomposite.addComponent(new EmployeeLeaf(600));
		onecomposite.addComponent(new EmployeeLeaf(800));
		onecomposite.addComponent(new EmployeeLeaf(90));
		onecomposite.addComponent(new EmployeeLeaf(100));
		
		
		wrappercomposite.addComponent(twocomposite);
		
		
		System.out.println(wrappercomposite.getTotalPoints());
		
		
		
		
		
		
		
	}
}
