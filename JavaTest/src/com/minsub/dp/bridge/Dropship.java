package com.minsub.dp.bridge;

//����� (�� ���ݱ�� ���� �Ф�)
public class Dropship extends Unit {

	public Dropship(Weapon weapon) {
		super(weapon);
	}
	
	@Override
	public void attack() {
		System.out.print("Dropship Attck: ");
		super.attack();
	}
}
