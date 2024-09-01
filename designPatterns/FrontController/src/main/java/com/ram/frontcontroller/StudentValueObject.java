package com.ram.frontcontroller;

public class StudentValueObject {

	private int id;
	private String Name;
	
	public StudentValueObject(int i, String string) {
		this.id = i;
		this.Name = string;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
