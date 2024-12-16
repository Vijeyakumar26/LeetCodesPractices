package com.neeve;

public class SubstringOfString {

	public static void main(String[] args) {
		String str = "Developed search and analytics capabilities with Elasticsearch, improving application response times for complex queries sentance contains find me string";
		System.out.println(str);
		// find word in String
		String find = "improving application";
		int i = str.indexOf(find);
		if (i > 0)
			System.out.println(str.substring(i, i + find.length()));
		else
			System.out.println("string not found");
	}
}
