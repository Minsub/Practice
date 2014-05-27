package com.minsub.commonlib.lang;

import org.apache.commons.lang.StringUtils;
/**
 * ���� ��ɵ��� �⺻ String Ŭ������ �޼ҵ�� ���c�Ѵ�.
 * ������, ���� �߿������� NULL�� ���� ó���� ���شٴ°��̴�.
 * �̰� ����Ʈ!!
 * 
 * @author Minsub Ji
 *
 */
public class TestStringUtils {

	public static void main(String[] args) {
		
//		TestStringUtils.defaultMethod();
		TestStringUtils.additionalMethod();
	}

	
	public static void defaultMethod() {
		String str = null;
		str = "Hello World";
		
		boolean b = StringUtils.contains(str, "World");
		System.out.println(b);
		
		String str2 = StringUtils.defaultString(null);
		System.out.println("str2: " +str2);
		
//		StringUtils.indexOf(seq, searchSeq);
//		StringUtils.equals(cs1, cs2)
//		StringUtils.isEmpty(cs)
		String[] str3 = {"java", "javascript", "jQuery", "json"};
        String str1 = " | ";
        String s = StringUtils.join(str3, str1);
        System.out.println("join : " + s);
        
        str1 = StringUtils.reverse(str);
        System.out.println("Hello World Reverse : " + str1);
	}
	
	public static void additionalMethod() {
		//abbreviate
		String str = "Hello World!";
		System.out.println("abbreviate: "+StringUtils.abbreviate(str,8, 10));

		//�빮��
		str = "hi everyone. i am minsub";
		System.out.println("capitalize: " + StringUtils.capitalize(str));
		
		//center
		str = "Minsub";
		System.out.println("center: " + StringUtils.center(str, 20, '*'));
		
		//countMatches
		str = "Minsub Ji";
		System.out.println("countMatches: " + StringUtils.countMatches(str, "i"));
		
		//left
		str = "Minsub Ji";
		System.out.println("left: " + StringUtils.left(str, 3));
		System.out.println("right: " + StringUtils.right(str, 4));		
		System.out.println("mid: " + StringUtils.mid(str, 3,2));		
		
		//substringBefore/after
		System.out.println("substringBefore: " + StringUtils.substringBefore(str, "i"));
		System.out.println("substringAfter: " + StringUtils.substringAfter(str, "i"));
		System.out.println("substringBetween: " + StringUtils.substringBetween(str, "i"));
		str = "<head>Title name is Title</head>";
		System.out.println("substringBetween2: " + StringUtils.substringBetween(str, "<head>","</head>"));
		
		
		
		
		
		
		
		
	}
	
}
