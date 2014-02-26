package com.minsub.althorism;

/**
 * 1���� 10,000���� 8�̶�� ���ڰ� �� ��� �����°�?
 
	8�� ���ԵǾ� �ִ� ������ ������ ī���� �ϴ� ���� �ƴ϶� 8�̶�� ���ڸ� ��� ī���� �ؾ� �Ѵ�.
	(�� ������� 8808�� 3, 8888�� 4�� ī���� �ؾ� ��)
 * @author minsub Ji
 */
public class QuestionByGoogle1 {

	public static void main(String[] args) {
		
		
		System.out.println(getCountOfNumber(10000, 8));
	}

	/**
	 * 
	 * @param max 1���� n������ ���� �� n��
	 * @param targetNumber 0-9������ ������ ī��Ʈ �� Ÿ�� ����
	 * @return ī��Ʈ ��� ��
	 */
	public static int getCountOfNumber(int max, int targetNumber) {
		
		int cnt = 0;
		int tmp = 0;
		
		for (int i = 1; i <= max; i++) {
			tmp = i;
			
			do {
				if (tmp % 10 == 8) {
					cnt++;
				}
			} while ((tmp /= 10) > 0); 
		}
		return cnt;
	}
	
	/*
	 * [�ٸ� �ذ��] 
	 * 0000���� 9999��� �����ϰ� 4�ڸ����ڰ� 10000���̹Ƿ� ����
	 * �����ǰ����� 4���� 0���� 9���� 10���� ���ڰ� ����
	 * ������ ���� 4���� 10���� ������ 4õ!
	 */
}
