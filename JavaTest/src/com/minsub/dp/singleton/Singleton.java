package com.minsub.dp.singleton;

public class Singleton {
	private static Singleton instance = null;
	
	// Closed Constructor
	private Singleton() {};
	
	// Singleton Constructor
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}	
}
