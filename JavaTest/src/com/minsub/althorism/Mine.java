package com.minsub.althorism;

import java.util.Scanner;

/**
 * ����ã�� ������ M x N ��Ʈ������ ��ġ�� �ִ� ���ڸ� ã�� �����̴�.

M x N ��Ʈ���� ���� ����(square)�� �����̰ų� ���ڰ� �ƴϴ�.

���� ���ڴ� *�� ǥ���Ѵ�. ���ڰ� �ƴ� ����(square)�� ���ڷ� ǥ���ϸ� �� ���ڴ� ������ �ִ� ������ ���� �ǹ��Ѵ�. (����(sqaure)�� �ִ� 8���� ������ ���ڸ� ���� �� �ִ�.)

������ 4x4 ��Ʈ�������� 2���� ����(*)�� ǥ���ϴ� ����̴�.

ex) 
�Է�
4 4
*...
....
.*..
....

����
*100
2210
1*10
1110

 * @author hmm1115222
 *
 */
public class Mine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		//�迭 �����
		char[][] arr = new char[m][n];
		for (int i = 0; i < m; i++) {
			String tmp = sc.next();
			for (int j=0; j<n;j++) {
				char c = tmp.charAt(j);
				if (c == '*') {
					arr[i][j] = '1';
				} else {
					arr[i][j] = '0';
				}
			}
		}
		
		//��ȭ
		for (int i = 0; i < m; i++) {
			
			for (int j = 0; j < n; j++) {
			
			}
		}
		char[][] arr2 = new char[m][n];
		print(arr2);
		
	}
	
	public static int getNumberForMine(char[][] arr, int i, int j){
		int cnt = 0;
		
		if (j-1 >= 0) {
			if (arr[i-1][j] == '1') cnt++;
		}
		if (j+1 < arr[0].length ) {
			
		}
		
		
		
		return 1;
	}

	public static void print(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j=0; j<arr[0].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
