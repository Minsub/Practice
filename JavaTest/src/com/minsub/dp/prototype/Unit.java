package com.minsub.dp.prototype;

// Cloneable�� ��ӹ��� �⺻ Unit Abstraction
public abstract class Unit implements Cloneable{

	public abstract void attack();
	public abstract Unit createClone();
}
