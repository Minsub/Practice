package com.minsub.dp.adapter;

public class AdapterBanana extends Banana implements Adapter{

	public AdapterBanana(String name) {
		super(name);
	}

	@Override
	public void print() {
		super.show(); // �θ� Banana Ŭ������ show() �Լ��� �ܼ��� ȣ�� 
	}

}
