package com.shrajan.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class DepartmentComposite implements Component{

	public List<Component> childrens;
	
	public DepartmentComposite() {
		childrens = new ArrayList<Component>();
	}
	
	public void addComponent(Component comp) {
		childrens.add(comp);
	}
	
	

	@Override
	public int getTotalPoints() {
		
		return childrens.stream().map(c-> c.getTotalPoints()).reduce(0, Integer::sum);
	}
	
	
	
}
