package com.minsub;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		String aa = "S001227ABFBPC20140825134611001001";
		String bb = aa.replace("ABFBPC", "ABFBQC");
		
		System.out.println(bb);
		
		
	}

}