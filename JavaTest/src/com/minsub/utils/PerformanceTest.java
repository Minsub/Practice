package com.minsub.utils;


/**
 * �������� �Լ�
 * @author hmm1115222
 *
 */
public class PerformanceTest {
	private static long time = 0; 
	private static boolean isStart = false;
	public static void start(){
		time = System.currentTimeMillis();
		isStart = true;
	}
	
	public static double end() {
		if (isStart) {
			long result = System.currentTimeMillis() - time;
			isStart = false;
			return (double)result / 1000f;
		} else {
			return -1;
		}
	}
	
	/**
	 * �������̽��� ����� �ӵ� ����
	 * @param TestMethod�� ������ excute()�� �׽�Ʈ�� �Լ��� �ִ´�.
	 * @return �ʴ����� �ӵ����� ��
	 */
	public static double excute(TestMethod method) {
		PerformanceTest.start();
		method.excute();
		return PerformanceTest.end();
	}
	
	public interface TestMethod {
		public void excute();
	}
}
