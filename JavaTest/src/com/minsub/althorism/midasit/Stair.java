package com.minsub.althorism.midasit;

/**
 * ���̴ٽ� ���̵� �˰��� ����
 * ��� n���� (0~m) ��ŭ �ѹ��� �̵��� �� ������
 * ����� ���� �� �ִ� ����� ���� ���Ͽ���
 *  
 * @author Minsub Ji
 *
 */
public class Stair {
	private int m = 0;
	private int n = 0;
	private int cnt = 0;
	
	public Stair(int n, int m) {
		this.n = n;
		this.m = m;
	}

	public int run() {
//		desc(0);
//		return cnt;
		
		return des(0);
	}
	
	private void desc(int current) {
		if (current == this.n) {
			cnt++;
			System.out.println("CNT++");
			return;
		} else if (current > this.n) {
			return;
		} 
	
		for (int j = 1; j <= m; j++) {
			System.out.println("CURRENT: " + current + ", J: "+ j + ", I+J: " + (current+j));
			desc(current + j);
		} // end for
	}
	
	private int des(int current) {
		int tmp = 0;
		
		if (current == this.n) {
			cnt++;
			System.out.println("CNT++");
			return 1;
		} else if (current > this.n) {
			return 0;
		} 
	
		for (int j = 1; j <= m; j++) {
			System.out.println("CURRENT: " + current + ", J: "+ j + ", I+J: " + (current+j) + ", TMP: " + tmp);
			tmp += des(current + j);
		} // end for
		
		return tmp;
	}
	

	
	// n:10, m:3 = 274
	public static void main(String[] args) {
		int m = 3;
		int n = 10;
		Stair stair = new Stair(n, m);
		int result = stair.run();
		System.out.println("RESULT: " + result);
	} //end main
}
