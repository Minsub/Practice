package com.minsub.dp.decorator;

//���̿��� ���� ���׷��̵�
public class UpgradeOfStorm extends Upgrade{

	public UpgradeOfStorm(Unit unit) {
		super(unit);
	}

	@Override
	public void showAbility() {
		System.out.print("���̿��� ������ �� �� �ִ�, ");
		super.unit.showAbility();
	}
}
