package com.minsub.althorism.midasit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * ������ ���� �ٸ� ������ �ִ�. ������ ����(p)�� ����(w)�� ���� �� �ٸ���.
 * ��(m)�� ������ ���� ��Ҹ� ���� �� �ִ� �����?
 * 
 * @author Minsub Ji
 */
public class Bread {

	ArrayList<Item> arr;

	public Bread() {
		arr = new ArrayList<Bread.Item>();
	}

	public void addBread(int p, int w) {
		Item item = new Item();
		item.price = p;
		item.weight = w;

		BigDecimal decimal = new BigDecimal(w);
		item.value = (decimal.divide(new BigDecimal(p), 10,
				BigDecimal.ROUND_CEILING)).floatValue();

		arr.add(item);
	}

	public ArrayList getArray() {
		Collections.sort(arr, new Comparator<Bread.Item>() {
			public int compare(Bread.Item o1, Bread.Item o2) {
				return o1.value > o2.value ? -1
						: (o1.value == o2.value ? 0 : 1);
			};
		});

		return arr;
	}

	public static void main(String[] args) {

		Bread bread = new Bread();
		bread.addBread(5, 3);
		bread.addBread(2, 1);
		bread.addBread(3, 1);
		bread.addBread(3, 2);
		bread.addBread(4, 3);

		ArrayList arr = bread.getArray();
		Iterator<Item> it = arr.iterator();
		while (it.hasNext()) {
			Item item = it.next();
			System.out.println("V: " + item.value + ", P: " + item.price
					+ ", W" + item.weight);
		}
	}

	public static class Item {
		float value;
		int price;
		int weight;
	}
}
