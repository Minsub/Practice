package com.minsub.jdbc;

/**
 * JDBC ��ü�� �����ϴ� ������ Factory
 * ������ Ŭ���� �̸��� ���� �������� ��ü�� �����Ѵ�. 
 * @author Minsub ji
 */
public class FactoryJDBC {
	/**
	 * 
	 * @param className for creating dynamic class
	 * @return
	 */
	public static JDBC createJDBC(String className) {
		try {
			Object obj = Class.forName(className).newInstance();
			JDBC jdbc = (JDBC)obj;
			jdbc.createConnection();
			
			return jdbc;
		} catch (InstantiationException e) {
			e.printStackTrace();
			return null;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
}
