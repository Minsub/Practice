package com.minsub.dp.decorator;

public class Main {

	public static void main(String[] args) {
		// ���÷��� ����
		Unit highTempler = new HighTempler();
		// ���� �ɷ��� ������? ��� �ƹ��͵� �����Ф� �� �������÷�
		highTempler.showAbility();

		// ���׷��̵� ���ڷ�����!!
		Unit upgradedHT;
		upgradedHT = new UpgradeOfStorm(new UpgradeOfMana(new UpgradeOfIllusion(highTempler), 100));
		upgradedHT.showAbility();

	}
}
