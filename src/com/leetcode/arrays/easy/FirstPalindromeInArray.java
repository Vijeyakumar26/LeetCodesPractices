package com.leetcode.arrays.easy;

public class FirstPalindromeInArray {

	public static void main(String[] args) {
		String[] arr = {"agn","adsa","racecar"};
		System.out.println(firstPalindrome(arr));
	}
	public static String firstPalindrome(String[] words) {
		for(String wrd:words){
			String tempWord = "";
			for(int i=wrd.length()-1; i>=0; i--){
				tempWord = tempWord + wrd.charAt(i);
				if(wrd.equalsIgnoreCase(tempWord)){
					return wrd;
				}
			}
		}
		return "";
	}
}
