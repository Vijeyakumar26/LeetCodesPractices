package com.leetcode.arrays.easy;

public class LargestElementInArray {

	public static void main(String[] args) {
		int[] nums = {2,3,1,6,8,5,9};
		System.out.println(largestElement(nums, nums.length));
	}
	static int largestElement(int[] arr, int n) {
        int highest = arr[0];
        for(int i = 1; i<n; i++){
            if(arr[i] > highest){
                highest = arr[i];
            }
        }
        return highest;
    }
}
