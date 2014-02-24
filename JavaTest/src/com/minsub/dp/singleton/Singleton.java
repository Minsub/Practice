package com.minsub.dp.singleton;

public class Singleton {

	private int a = 0;
	
	private static Singleton instance = null;
	
	// Closed Constructor
	private Singleton(){}
	
	// Singleton Constructor
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
}
