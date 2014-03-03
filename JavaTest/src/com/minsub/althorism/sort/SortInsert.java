package com.minsub.althorism.sort;

public class SortInsert {

	public static void sort(int[] arr) {
		if(arr == null) {
			return;
		}
		
		int size = arr.length;
		int tmp;
		for(int i = 1; i < size; i++) {
			tmp = arr[i];
			
			for(int j = 0; j < i; j++) {
				//����� tmp ���� ���� ���� ã���� �޸�ī���� �� �극��ũ 
				if(tmp < arr[j]) {	
					System.arraycopy(arr, j, arr, j+1, i-j);
					arr[j] = tmp;
					break;
				} 
			}
		}
	}
}
