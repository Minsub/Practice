package com.minsub.dp.prototype;

import java.util.HashMap;

public class Factory {
	private HashMap<String,Unit> hash = new HashMap<String,Unit>();
	
	// ���� ��ü�� ����ϴ� �Լ�
	public void register(String name, Unit unit) {
		hash.put(name, unit);
	}
	
	// Clone(����)�� �ϴ� �Լ�
	public Unit create(String name) {
		Unit unit = hash.get(name);
		return unit.createClone();
	}
}
