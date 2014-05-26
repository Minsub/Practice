package com.minsub.api;

import java.io.File;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;


public class DomPaser {

	public static void main(String[] args) {
		try {
		   SAXBuilder builder = new SAXBuilder();
		   Document doc = builder.build(new File("nations.xml"));
		   Element root = doc.getRootElement();
		   
		   System.out.println(root.getAttribute("email").getValue());
		   
		   List<Element> list = root.getChildren();
		   
		   for(Element item: list) {
			   if (item.getName().equalsIgnoreCase("name")) {
				   System.out.println(item.getText());
			   }
		   }
		   
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
