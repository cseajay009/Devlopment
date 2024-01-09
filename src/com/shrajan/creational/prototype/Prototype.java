package com.shrajan.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Prototype implements Cloneable{

	
	List<String> content;
	
	public Prototype() {
		content =  new ArrayList<String>();
	}
	public Prototype(List<String> temp) {
		content =  temp;
	}
	void loadData() {
		content.add("A");
		content.add("B");
		content.add("C");
	}
	
	
	List<String> getContent(){
		return content;
	}
	
	@Override
	public Prototype clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getContent()){
				temp.add(s);
			}
			return new Prototype(temp);
	}
	
}
