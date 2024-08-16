package com.leetcode.arrays.easy;

public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = {2,3,3,2};
		System.out.println(removeElement(nums, 2));
	}
	public static int removeElement(int[] nums, int val) {
		int valCount=0;
		for(int i=0; i<nums.length; i++){
			if(nums[i]!=val){
				nums[valCount] = nums[i];
				valCount++;
			}
		}
		return valCount;
	}
}
