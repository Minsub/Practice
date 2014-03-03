package com.minsub.dp.bridge;

// weaopn �������̽��� ������ �ִ� Unit Abstraction
public abstract class Unit {
	private Weapon weapon = null;
	
	public Unit(Weapon weapon){
		this.weapon = weapon;
	}
	
	public void attack() {
		weapon.attack();
	}
	
	public void setWeapon(Weapon weapon){
		this.weapon = weapon;
	}
}
