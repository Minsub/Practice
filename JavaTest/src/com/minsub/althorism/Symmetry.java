package com.minsub.althorism;

import java.text.SimpleDateFormat;


/**
 * �յڰ� ���� ���� �ٷ� �� ���� �Ųٷ� �� ���� ���� ���̴�. ������ ���� ���� �� �� �ִ�.
	
	1
	44
	101
	2002
	8972798
	1111111111111
	0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, ... �� ����,
	0 �̻��� �յڰ� ���� ���� ũ�� ������ ������ ��, n ��° ���� ����ϴ� ���α׷��� �ۼ��϶�.
	n�� 1���� �����ϸ� ũ�⿡�� ������ ����.
	
	
	����¿�
	�� 1) 1 => 0
	�� 2) 4 => 3
	�� 3) 30 => 202
	�� 4) 100 => 909
	�� 5) 30000 => 200000002
	�� 6) 1000000 => 90000000009
 * @author Minsub Ji
 *
 */
public class Symmetry {

	/**
	 * ���� ������ �ʹ� ����!!! ����
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 1000;
		
		long lStartTime = System.currentTimeMillis();
		System.out.println(a+ " => " + getIndexofSymetry(a));
		
		long time = System.currentTimeMillis() - lStartTime;
		
		System.out.println(time);
		System.out.println(miliToHHMMSS(time));
		
	}
	
	static public String miliToHHMMSS(long time) {
		StringBuilder sb = new StringBuilder();
		sb.append(time / (60 * 60 * 1000));
		sb.append(":");
		sb.append(time / (60 * 1000));
		sb.append(":");
		sb.append(time / 1000);
		return sb.toString();
	}

	static public long getIndexofSymetry(int value) {
		long i = 0;
		int cnt = 0;
		while (i <= Integer.MAX_VALUE) {
			if (checkSymetry(i)) {
				cnt++;
				if (cnt == value) {
					return i;
				}
			}
			
			i++;
		}
		
		return -1;
	}
	
	/**
	 * �Է¹��� n�� �¿� ��Ī�ΰ��� true/false�� ��ȯ 
	 * @param n
	 * @return ������ true, �ٸ��� false
	 */
	static public boolean checkSymetry(long n) {
		if (n < 10 && n>=0) {
			return true;
		}
		
		int nDigit = getDigit(n);
		
		int nHead = nDigit;
		int nTail = 1;
		for (int i = 0; i < (nDigit/2); i++) {
			if (n / get10(nHead) % 10 != n / get10(nTail) % 10) {
				return false;
			}
			nHead--;
			nTail++;
		}
		return true;
	}
	
	/**
	 * �Է¹��� digit�ڸ�����ŭ 10^���� ǥ�� 
	 * @param digit
	 * @return 10^digit
	 */
	static public long get10(long digit) {
		if (digit == 1) {
			return 1;
		} else {
			int result = 1;
			for (int i = 1; i < digit; i++) {
				result *= 10;
			}
			return result;
		}
	}
	
	/**
	 * �Է¹��� n�� �ڸ����� int������ ��ȯ 
	 * @param n 
	 * @return �ڸ���
	 */
	public static int getDigit(long n) {
		int digit = 1;
		while (n >= 10) {
			n /= 10;
			digit++;
		}
		return digit;
	}
}
