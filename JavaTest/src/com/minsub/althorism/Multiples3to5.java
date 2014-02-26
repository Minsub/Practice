package com.minsub.althorism;

/**
 * [����] If we list all the natural numbers below 10 that are multiples of 3 or
 * 5, we get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of
 * all the multiples of 3 or 5 below 1000.
 * 
 * [����] 10�̸��� �ڿ������� 3�� 5�� ����� ���ϸ� 3,5,6,9�̴�. �̵��� ������ 23�̴�.
 * 1000�̸��� �ڿ������� 3,5�� ����� ������ ���϶�.
 * 
 * @author hmm1115222
 * 
 */
public class Multiples3to5 {

	public static void main(String[] args) {
		
		 System.out.println(getSum3to5(1000));
		
	}
	
	static int getSum3to5(int max) {
		int tmp = 0;
		for (int i = 3; i < max; i += 3){
			tmp += i;
		}
		
		for (int i = 5; i < max; i += 5){
			tmp += i;
		}
		
		for (int i = 15; i < max; i += 15){
			tmp -= i;
		}
		return tmp;
	}

}
