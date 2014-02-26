package com.minsub;

public class Test {

	public static void main(String[] args) {

		TestAbstract abs;
		TestInterface inf;
		
		abs = new Child(3);
		inf = new Child();
		
		abs.test1();
		
		abs.test2();
		
		
		int tmp = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.print(tmp + " x " + i + " = " );
			tmp = tmp * i;
			System.out.println(tmp);
		}
		System.out.println("result: " + tmp);
		
	}

}