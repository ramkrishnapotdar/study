package com.ram.patterns.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		DateUtil dateutil1 = DateUtil.getInstance();
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\rajaramkrishna_p\\Desktop\\PDEA\\designPatterns\\dateutil.txt")));
		oos.writeObject(dateutil1);
		
		DateUtil dateutil2 = null;
		FileInputStream ooi =  new FileInputStream(new File("C:\\Users\\rajaramkrishna_p\\Desktop\\PDEA\\designPatterns\\dateutil.txt"));
		dateutil2 = (DateUtil) new ObjectInputStream(ooi).readObject();
	
		oos.close();
		ooi.close();
		System.out.println(dateutil1 == dateutil2);
	}
}
