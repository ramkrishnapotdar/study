package com.ram.patterns.singleton;

public enum EnumSingleTonDemo {
	INSTANCE;
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
