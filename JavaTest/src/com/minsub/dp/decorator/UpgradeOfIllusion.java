package com.minsub.dp.decorator;

// ȯ�� ���׷��̵�
public class UpgradeOfIllusion extends Upgrade{

	public UpgradeOfIllusion(Unit unit) {
		super(unit);
	}

	@Override
	public void showAbility() {
		System.out.print("ȯ���� �� �� �ִ�, ");
		super.unit.showAbility();
	}
}
