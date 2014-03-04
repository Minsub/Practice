package com.minsub;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {

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
		
		Boolean a = Boolean.valueOf(true);
		Boolean b = Boolean.valueOf(true);
		
		String aa = String.valueOf("aaa");
		String bb = new String("aaa");
		
		
		if (aa == bb){
			System.out.println("TRE");
		}
		
		String aaa = new String("AAA");
		aa(aaa);
		System.out.println(aaa);
		
	}
	
	static void aa(String aaa) {
		aaa = "asdasd";
	}

}