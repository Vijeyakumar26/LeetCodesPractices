package com.leetcode.arrays.easy;

public class ManyNumbersAreSmallerThantheCurrentNumber {

	public static void main(String[] args) {
		int nums[] = {8,4,2,2,3};
		for(int small :  smallerNumbersThanCurrent(nums)) {
			System.out.print(small + " ");
		}
	}
	
	public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;
        for(int i=0; i<nums.length;i++){
            for(int j=0; j<nums.length;j++){
                if(i!=j){
                    if(nums[j]<nums[i]){
                        count++;
                    }
                }
            }
            result[i]=count;
            count = 0;
        }
        return result;
    }
}
