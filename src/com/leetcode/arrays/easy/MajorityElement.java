package com.leetcode.arrays.easy;

public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = {2,2,1,1,1,1,2,2};
		System.out.println(majorityElement(nums));
	}
	
	public static int majorityElement(int[] nums) {
        int majorityElement = 0;
        int counter = 0;
        for(int i = 1; i<nums.length; i++){
            counter = nums[majorityElement] == nums[i] ? counter + 1 : counter -1;
            if(counter < 0){
                counter = 0;
                majorityElement = i;
            }
        }
        return nums[majorityElement];
    }
}
