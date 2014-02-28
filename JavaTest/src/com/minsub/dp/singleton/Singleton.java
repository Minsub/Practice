package com.minsub.dp.singleton;

public class Singleton {
	private volatile static Singleton instance = null;
	
	// Closed Constructor
	private Singleton() {};
	
	// Singleton Constructor
	public static Singleton getInstance() {
		if (instance == null) {
			
			// ó�� �ѹ��� �ν��Ͻ��� ���� 
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}	
}
