package com.leetcode.arrays.easy;

public class GoodIdenticalPairs {

	public static void main(String[] args) {
		int[] arr = {1,2,5,1,1,3};
		System.out.println(numIdenticalPairs(arr));
	}
	public static int numIdenticalPairs(int[] nums) {
		int goodPairs = 0;
		for(int i = 0; i < nums.length; i++){
			for(int j = 1; j < nums.length; j++) {
				if(nums[i]==nums[j]||nums[i]<nums[j]){
					goodPairs++;
				}
			}
		}
		return goodPairs;
	}
}
