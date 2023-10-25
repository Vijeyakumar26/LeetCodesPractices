package com.leetcode.arrays.easy;

public class VowelString {
	public static void main(String[] args) {
		String[] arr = {"are","amy","u"};
		System.out.println(vowelStrings(arr,0,2));
	}
	public static int vowelStrings(String[] words, int left, int right) {
		int count = 0;
        String vowels = "aeiou";
        for(int i=left; i<=right; i++){
            if(vowels.contains(words[i].charAt(0)+"") && vowels.contains(words[i].charAt(words[i].length()-1)+"")){
                count++;
            }
        }
        return count;
    }
}
