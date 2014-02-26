package com.minsub.althorism;

/**
 * � �ڿ��� n�� ���� ��, d(n)�� n�� �� �ڸ��� ���ڵ�� n �ڽ��� ���� ���ڶ�� ��������.
 * 
 * ���� ��� [d(91) = 9 + 1 + 91 = 101] �� ��, n�� d(n)�� ���׷�����(generator)��� �Ѵ�.
 * ���� ������ 91�� 101�� ���׷������̴�.
 * 
 * � ���ڵ��� �ϳ� �̻��� ���׷����͸� ������ �ִµ�, 101�� ���׷����ʹ� 91 �� �ƴ϶� 100�� �ִ�. �׷��� �ݴ��, ���׷����Ͱ�
 * ���� ���ڵ鵵 ������, �̷� ���ڸ� �ε��� ������ Kaprekar�� ���� �ѹ�(self-number)�� �̸� �ٿ���. ���� ���
 * 1,3,5,7,9,20,31 �� ���� �ѹ� ���̴�.
 * 
 * 1 �̻��̰� 5000 ���� ���� ��� ���� �ѹ����� ���� ���϶�.
 * 
 * @author Minsub Ji
 * 
 */

public class QuestionByNexon {

	public static void main(String[] args) {
		System.out.println(getSum(5000));
	}
	
	/**
	 * 1 - amx������ ��� ���� �ѹ����� ��
	 * @param max 
	 * @return ���� �ѹ����� ��
	 */
	static int getSum(int max) {
		// 1~max������ ���ڸ� �� ���ϰ� self-number�� �ƴ� ���� ���� ����� ��� 
		int total = 0;
		// max��ŭ�� boolean �迭�� ����� self-number�� �ƴ� ������ ��� ǥ�� 
		boolean arrChk[]= new boolean[max];
		for (int i = 1; i <= max; i++) {
			arrChk[i-1] = true;
			total += i;
		}
		
		int tmp = 0;
		for (int i = 1; i <= max; i++) {
			tmp = d(i);
			if (tmp <= max) {
				if (arrChk[tmp-1]) {
					total -= tmp;
					arrChk[tmp-1] = false;
				}
			}
		}
		
		return total;
	}
	
	/**
	 * d(91) = 9 + 1 + 91 = 101 �� ��, n�� d(n)�� ���׷�����(generator)��� �Ѵ�.
	 * 
	 * �̸� ����
	 * 
	 * @param n
	 * @return ���׷����� �� 
	 */
	static int d(int n) {
		int result = n;
		
		do {
			result += (n % 10);
		} while ( (n /= 10) > 0); 
		
		return result;
	}
}
