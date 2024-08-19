package com.leetcode.arrays.medium;

public class RemoveDuplicatesFromSortedArray2 {

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,4,4,5,5};
		System.out.println(removeDuplicates(nums));
		for(int num : nums) {
			System.out.print(num + " ");
		}
	}
	public static int removeDuplicates(int[] nums) {
		int i = 0;
		for(int j=i+2; j<nums.length; j++){
			if(nums[i] != nums[j]){
				nums[i+2] = nums[j];
				i++;
			}
		}
		return i+2;
	}
}
