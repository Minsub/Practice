package com.minsub.althorism.sort;

public class SortBubble {
	
	public static void sort(int[] arr) {
		if(arr == null) {
			return;
		}
		
		int size = arr.length - 1;
		int tmp;
		
		// size�� ��� �ٸ鼭 ���� ������ ������ ���� ū ���� Ȯ���� 
		for(int i = 0; i < size; size--) {
			// tmp�� ���� ū���� �־ ��� �� 
			for(int j = 0; j < size; j++) {
				if(arr[j] > arr[j+1]) {
					
					// ���� j�� j+1�� ���� swap
					tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
}
