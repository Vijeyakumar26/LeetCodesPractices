package com.leetcode.problems;

public class EvenNumbersTotal {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8,9,1};
		int total = 0;
		for(int num :nums) {
			if(num%2==0) {
				total = total + num;
			}
		}
		System.out.println(total);
	}

}
