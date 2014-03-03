package com.minsub.dp.bridge;

public class Main {

	public static void main(String[] args) {
		Weapon weaponNone = new WeaponNone();
		Weapon weaponRazer = new WeaponRazer();
		
		// ���̽�, ����� ���� 
		Unit wraith = new Wraith(weaponRazer);
		Unit dropship = new Dropship(weaponNone);
		
		// ����!!
		wraith.attack();
		dropship.attack();
		
		// ���̽����� ������ �� ���� Weapon ����, ��������� ���� Weapon 
		wraith.setWeapon(weaponNone);
		dropship.setWeapon(weaponRazer);
		
		wraith.attack();
		dropship.attack();
	}
}
