package com.ram.patterns.singleton;

import java.io.Serializable;

public class Logger implements Serializable,Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String message;
	public static volatile Logger log;
	
	static {
		log = new Logger(); 
	}
	private  Logger()
	{
		
	}
	
	public static void log()
	{
		if(log == null)
			synchronized (Logger.class) {
				System.out.println(message);
			}
	}
	
	private Object readResolve()
	{
		return log;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
