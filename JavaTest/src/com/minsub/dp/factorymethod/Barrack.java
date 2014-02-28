package com.minsub.dp.factorymethod;

public class Barrack {

	public static Unit createUnit(String unitName)  {
		try {
			// IF������ ó���� �� ������, Reflection�� ����غô�.  
			Class cls = Class.forName(unitName);
			Object obj = cls.newInstance();
			return (Unit)obj;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
