package com.shrajan.structural.adapter;
/** Object Adapter uses Composition**/
public class Adapter implements Target {

	private Adaptee adapt = null;
	
	public Adapter() {
		
		adapt =  new Adaptee();
	}
	@Override
	public String generateReport() {
		
		return convertXMLToJson(adapt.xmlFormatReport());
	}
	
	public String convertXMLToJson(String xml) {
		return "JSON";
	}

}
