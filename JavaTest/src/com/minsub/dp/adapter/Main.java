package com.minsub.dp.adapter;

/**
 -Client���� �䱸�ϴ� �԰��� ���߱� ���� ��ü�� ������
 - ��ɰ�ü�� ����ϰ� Client�� �䱸�԰ݿ� �´� Interface�� implements��
 - ���� ���� �������� CLASS A�� �ִ�. �ٵ� �ٸ� Ŭ�������� �������̽��� ���� INTERFACE B�� �����, �� �԰ݿ� ���߱� ���� extends A implements B�� �� class C�� �����. ����� A�� ����� ����ؼ� ����ϰ�, �԰ݸ� B�� �ٽ� ������ �ϴ� ���̴�. Class C���� �ٽ� �����ϴ� �������� ����.

http://gyrfalcon.tistory.com/entry/Design-Pattern-Adapter

 * @author hmm1115222
 *
 */
public class Main {

	public static void main(String[] args) {
		Adapter adapter = new AdapterBanana("Banana");
		adapter.print();
	}

}
