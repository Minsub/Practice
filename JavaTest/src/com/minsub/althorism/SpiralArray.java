package com.minsub.althorism;

import java.util.Scanner;

/**
���� n ��ŭ�� n x n array�� �����ǰ� �ش� �迭�� Spiral���·� ���ڰ� �Էµȴ�.
n�� �ִ� 5 < n 20


[����]
6 6

  0   1   2   3   4   5
 19  20  21  22  23   6
 18  31  32  33  24   7
 17  30  35  34  25   8
 16  29  28  27  26   9
 15  14  13  12  11  10
��ó�� 6 6�̶�� �Է��� �ָ� 6 X 6 ��Ʈ������ ������ ȸ���� �� ���� ����ؾ� �Ѵ�

 * @author minsub ji
 *
 */
public class SpiralArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int[][] arr;
			
		int nLength, nLengthCnt, nTmp;
		
		while ( (n = sc.nextInt()) != 0) {
			int nCnt = 0;
			int i = 0, j = 0;
			arr = new int[n][n];
			
			Direction dr = Direction.SOUTH;	//���� ������ ���� 
			nLength = n - 1; // �ѹ��� ���ӵǴ� ������ ����
			nTmp = nLength;
			nLengthCnt = 2; //5�� �̵� x2, 4�� �̵� x2, ����, ���� 2���� ī��Ʈ �ϴ� ���� 
			
			while(nCnt < n*n) {
				if (nCnt < n) {	//ù��° to WEST �� �ϴ� �ѹ��ϰ� ����.
					j=nCnt;
					arr[i][j] = nCnt;
				} else {
					// ������ �����ߴ°��� üũ 					
					if (nTmp <= 0 ) {
						dr = getNextDirection(dr);
						nLengthCnt--;
						nTmp = nLength;
					}
					//nLength�� �� �پ����� üũ 
					if (nLengthCnt == 0) {
						nLength--;
						nTmp = nLength;
						nLengthCnt = 2;
					}
					
					switch(dr) {
						case EAST: j--;
							break;
						case WEST: j++;
							break;
						case SOUTH: i++;
							break;
						case NORTH: i--;
							break;
					}
					arr[i][j] = nCnt;

					
					nTmp--;
				}
				nCnt++;
			}
			print(arr);
		}
		
		System.out.println("<<END>>");
	}

	public static Direction getNextDirection(Direction dr) {
		switch(dr) {
			case EAST:
				return Direction.NORTH;
			case WEST:
				return Direction.SOUTH;
			case SOUTH:
				return Direction.EAST;
			case NORTH:
				return Direction.WEST;
		}
		return dr;
	}
	
	public static String convertBy2Digit(int n) {
		if (n < 10) {
			return "0" + n;
		} else {
			return String.valueOf(n);
		}
	}
	
	public static void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(convertBy2Digit(arr[i][j]) + " ");
			}
			System.out.println();
		}
	}
	
	enum Direction {
		EAST,
		WEST,
		SOUTH,
		NORTH;
	}
}
