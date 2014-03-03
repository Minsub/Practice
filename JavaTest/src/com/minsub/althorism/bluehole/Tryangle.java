package com.minsub.althorism.bluehole;

/**
 * [Althorism for test of new Empolyee in Bluehole Studio]
 * 
 * ���ڸ� �Է¹�����, 1���� �Է¹��� ���ڱ���
 * ù���� -> �������� ���ڰ� �����ϰ� �������� <- �ٷ� ���ڰ� �����ϵ��� ���ڸ� Console�� ������ �Ͻÿ�. 
 * ---[Sample]----
 * intput: 15
 * 1
 * 3 2
 * 4 5 6
 * 10 9 8 7
 * 11 12 13 14 15
 * ----------------
 * @author Minsub Ji
 */
public class Tryangle {

	public static void make(int n) {
		int lineCnt = 1;
		int lineMax = 1;
		boolean check = true;

		while (lineMax <= n) {
			if (check) {
				for (int i = lineMax - lineCnt + 1; i <= lineMax; i++) {
					System.out.print(i + " ");
				}
			} else {
				for (int i = lineMax; i >= lineMax - lineCnt + 1; i--) {
					System.out.print(i + " ");
				}
			}
			System.out.println();

			check = !check;

			lineCnt += 1;
			lineMax += lineCnt;
		}

	}

	public static void main(String[] args) {

		Tryangle.make(15);

	}
}
