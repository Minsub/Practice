package com.minsub.dp.singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �̱������� ��ü S�� �����ϰ� 10�� �Ҵ� 
		Singleton s = Singleton.getInstance();
		s.setA(100);
		System.out.println("s.a is " + s.getA());
		
		// �ٽ� ��ü s2�� �����ϰ� set�� ������� ���� 
		Singleton s2 = Singleton.getInstance();
		System.out.println("s2.a is " + s2.getA());
		
		
		s2.setA(5);
		System.out.println("s.a is " + s.getA());
	}

}
