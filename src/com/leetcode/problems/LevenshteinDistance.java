package com.leetcode.problems;

public class LevenshteinDistance {

	public static void main(String[] args) {
		String str1 = "flaw";
		String str2 = "lawn";
		int count = 0;
		for(int i = 0; i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				count++;
				str2.charAt(str1.charAt(i));
			}
		}
		System.out.println(str2);
	}

}
