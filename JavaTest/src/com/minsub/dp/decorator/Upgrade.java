package com.minsub.dp.decorator;

// Decorate�� Upgrade �߻� Ŭ����
public abstract class Upgrade extends Unit {
	protected Unit unit;
	public Upgrade(Unit unit) {
		this.unit = unit;
	}
	
	public abstract void showAbility();
}
