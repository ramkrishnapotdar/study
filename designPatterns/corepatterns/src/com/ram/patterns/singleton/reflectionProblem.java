package com.ram.patterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class reflectionProblem {
	public static void main(String args[]) throws NoSuchMethodException, SecurityException {
		DateUtil instance = DateUtil.getInstance();
		DateUtil instance2 = null;

		Constructor[] constructors = DateUtil.class.getDeclaredConstructors();

		for (Constructor constructor : constructors) {

			constructor.setAccessible(true);
			try {
				instance2 = (DateUtil) constructor.newInstance();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());

	}

}
