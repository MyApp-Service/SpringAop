package com.aop.tutorial.beans;

public class Laptop {
	
	private String name;
	private String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void setMethod(String name) {
		throw( new RuntimeException());
		//return name.toUpperCase();
	}
	
	

}
