package com.minsub.dp.decorator;

// ���� ���׷��̵�
public class UpgradeOfMana extends Upgrade{
	
	private int mana = 0;
	
	// �⺻ �����ڸ� ����
	private UpgradeOfMana(Unit unit) {
		super(unit);
	}
	
	// �þ ������ �Է¹޴� ������ (�ʼ�)
	public UpgradeOfMana(Unit unit, int mana){
		super(unit);
		this.mana = mana;
	}

	@Override
	public void showAbility() {
		System.out.print("������ +" + mana +"�þ, ");
		super.unit.showAbility();
	}
}
