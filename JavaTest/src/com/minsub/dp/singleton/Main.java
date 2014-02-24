package com.minsub.dp.singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 싱글톤으로 객체 S를 생성하고 10을 할당 
		Singleton s = Singleton.getInstance();
		s.setA(100);
		System.out.println("s.a is " + s.getA());
		
		// 다시 객체 s2를 생성하고 set을 사용하지 않음 
		Singleton s2 = Singleton.getInstance();
		System.out.println("s2.a is " + s2.getA());
		
		
		s2.setA(5);
		System.out.println("s.a is " + s.getA());
	}

}
