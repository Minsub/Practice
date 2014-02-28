package com.minsub.althorism;

import java.util.Scanner;

/**
 * �ʺ� ���� N���� ���� ���ڸ� �ٿ� ���� ��Ÿ���� �ֽ��ϴ�. �ð��� ������ ���� ���ڵ��� �η����ų� ������ ���̰� �� �޶��� �����
 * ��Ÿ���� ��°�� ��ü�ϱ�� �߽��ϴ�. �� �� ������ ��Ÿ���� �Ϻθ� ���簢������ �߶� ��Ȱ���ϰ� �ͽ��ϴ�. �׸� (b)�� (a)��
 * ��Ÿ������ �߶� �� �ִ� ���� ���簢�� �� ���� ���� ���簢���� �����ݴϴ�. ��Ÿ���� �����ϴ� �� ������ ���̰� �־��� ��, �߶� ��
 * �ִ� ���簢���� �ִ� ũ�⸦ ����ϴ� ���α׷��� �ۼ��ϼ���. �� (c)ó�� ���簢���� �񽺵��� �߶� ���� �����ϴ�.
 * 
 * ������ �ʺ�� ��� 1�̶�� �����մϴ�.
 * 
 * URL : http://algospot.com/judge/problem/read/FENCE
 * 
 * 
    [���� �Է�]
	3
	7
	7 1 5 9 6 7 3
	7
	1 4 4 4 4 1 1
	4
	1 8 2 2
	
	[���� ���]
	20
	16
	8
 * 
 * @author minsub ji
 * 
 */
public class Fence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nCnt = sc.nextInt();
		
		if (nCnt > 50 || nCnt <=0) {
			return;
		}
		
		int nFenceCnt;	//Fence ����
		int[] arrFence; //�� Fence ���̰� ����� �迭 
		for (int i = 0; i < nCnt; i++) {
			nFenceCnt = sc.nextInt();
			arrFence = new int[nFenceCnt];
			for (int j = 0; j < nFenceCnt; j++) {
				arrFence[j] = sc.nextInt();
			}
			
			System.out.println(getArea(nFenceCnt, arrFence));
		}
	}
	
	/**
	 * @param length fence�� ���� 
	 * @param arr int[]�� fence�� ��� ���� 
	 * @return �ִ� �簢���� ���� 
	 */
	public static int getArea(int length, int[] arr) {
		
		return 0;
	}

}
