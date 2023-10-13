package com.leetcode.arrays.easy;

public class PrefixCount {

	public static void main(String[] args) {
		String[] arr = {"agn","asdsa","carraces","cargame","cars","cas"};
		String pref = "car";
		System.out.println(prefixCount(arr,pref));
	}
	public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String s : words){
             if(s.startsWith(pref)){
                 count++;
                 }
            }
        return count;
    }
}
