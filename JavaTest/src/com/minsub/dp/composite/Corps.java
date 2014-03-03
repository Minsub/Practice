package com.minsub.dp.composite;

import java.util.ArrayList;

import com.minsub.dp.factorymethod.Unit;

/**
 * �δ����� Ŭ����
 * com.minsub.dp.factorymethod���� ����� Ŭ������ �̿�
 * 
 * @author Minsub ji
 *
 */
public class Corps extends Unit{

	private ArrayList<Unit> list = new ArrayList<Unit>();
	
	@Override
	public void attack() {
		System.out.println("Corps1 Attack!!");
		for (Unit unit: list) {
			unit.attack();
		}
	}
	
	public void add(Unit unit){
		list.add(unit);
	}
	
	public void remove(Unit unit) {
		list.remove(unit);
	}

}
