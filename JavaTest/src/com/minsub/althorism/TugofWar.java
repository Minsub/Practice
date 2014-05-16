package com.minsub.althorism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * ����

ȸ�� ����ȸ���� �ٴٸ��⸦ �ϱ�� �ߴ�. ����ȸ�� ������ ������� �� ������ �����ϰ� ������. ��� ������� �� �� �� �� �����ؾ� �ϸ�, �� ���� ��� ���� �� ���� �Ѱ� ���̰� ���� �� �ȴ�. �׸��� �� �� ���� ����� ü���� ���� ���� �ּ������� �ٿ��� �Ѵ�.

�Է�

ù��° ������ �ٴٸ��⿡ �����ϴ� ��� ����� ��(n��)�� ��Ÿ����. ������ ����� ����ŭ n���� ������ ����´�. n���� ������ ������� 1��° ����� �����Ժ��� n��° ����� �����Ը� ��Ÿ����. �����Դ� 1~450 ������ ���ڿ��� �Ѵ�. �ٴٸ����� �����ڴ� �ִ� 100�����(n<=100)�̴�.

���

��°��� �� �ٷ� ǥ���ϸ� 2���� ���ڸ� �־�� �Ѵ�. 2���� ���ڴ� �� ���� �� �����Կ� �ٸ� ������ �� �����Ը� �ǹ��Ѵ�. ���� �ΰ��� ���ڰ� �ٸ� ��� ���� ���ڸ� �տ� ǥ���Ѵ�.

�Է� ��

3
100
90
200
��� ��

190 200
 * @author hmm1115222
 *
 */
public class TugofWar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < cnt; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		
		int nLeft = list.get(list.size()-1);
		int nRight = 0;
		
		for (int i = list.size()-2; i >= 0; i--) { 
			if (nLeft <= nRight) {
				nLeft += list.get(i);
			} else {
				nRight += list.get(i);
			}
		}
		
		System.out.println(nLeft + " " + nRight);
	}

}
