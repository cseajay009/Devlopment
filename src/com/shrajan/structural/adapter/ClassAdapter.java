package com.shrajan.structural.adapter;

public class ClassAdapter extends Adaptee implements Target {

		@Override
		public String generateReport() {
	
		return convertXMLToJson(xmlFormatReport());
		}
		
		public String convertXMLToJson(String xml) {
			return "JSON";
		}
}
