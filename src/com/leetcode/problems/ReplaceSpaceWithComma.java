package com.leetcode.problems;

public class ReplaceSpaceWithComma {

	public static void main(String[] args) {
		String str = "ab  cf er";
		str = str.replaceAll("\\s+", ",");
		System.out.println(str);
	}

}
