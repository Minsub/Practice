package com.minsub.dp.prototype;

public class Main {

	public static final String NAME_UNIT_TANK = "tank";
	public static final String NAME_UNIT_GOLIATH = "goliath";
	
	public static void main(String[] args) {
		Factory factory = new Factory();
		Tank tank = new Tank();
		Goliath goliath = new Goliath();

		// ���� Unit ��ü�� Factory�� ���
		factory.register(NAME_UNIT_TANK, tank);
		factory.register(NAME_UNIT_GOLIATH, goliath);
		
		//Factory�� ���� clone
		Unit tank1 = factory.create(NAME_UNIT_TANK);
		tank1.attack();
		
		Unit goliath1 = factory.create(NAME_UNIT_GOLIATH);
		goliath1.attack();
	}
}
