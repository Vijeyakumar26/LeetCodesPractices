package com.leetcode.arrays.easy;

public class RemoveDuplicatesFromSortedArray1 {

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(nums));
		for(int num : nums) {
			System.out.print(num + " ");
		}
	}
	public static int removeDuplicates(int[] nums) {
        int valCount= 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[valCount] = nums[i];
                valCount++;
            }
        }
        return valCount;
    }

}
