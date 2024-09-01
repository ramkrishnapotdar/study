package com.ram.patterns.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable{
	
	private static final long serialVersionUID = 1L;
	private static volatile DateUtil instance; // = new DateUtil();
	
	static {
		instance = new DateUtil();
	}
	
	private DateUtil()
	{
		
	}

	public static DateUtil getInstance() {
		if (instance == null) {
			synchronized (DateUtil.class) {
				if ((boolean) (instance == null))
					instance = new DateUtil();
			}
		}
		return instance;
	}
	
	private Object readResolve() {
		
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
