package com.leetcode.arrays.easy;

public class MinimumOperationsForStrictlyIncreasing {

	public static void main(String[] args) {
		int[] arr = {1,5,2,4,1};
		System.out.println(minOperations(arr));
	}

	public static int minOperations(int[] nums) {
		int count = 0;
		if(nums.length>1) {
			int current = nums[0];
			for(int i=1;i<nums.length;i++) {
				if(current>nums[i]) {
					current++;
					count = count + current - nums[i];
				}
				else if(current==nums[i]) {
					current++;
					count++;
				}
				else {
					current = nums[i];
				}
			}
		}			
		return count;
	} 
}
