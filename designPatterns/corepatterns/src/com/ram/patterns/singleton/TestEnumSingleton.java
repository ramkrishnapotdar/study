package com.ram.patterns.singleton;

public class TestEnumSingleton {

	public static void main(String[] args) {
		
		EnumSingleTonDemo instance = EnumSingleTonDemo.INSTANCE;
		System.out.println(instance.getName());
		
		instance.setName("obj1");
		System.out.println(instance.getName());

	}

}
