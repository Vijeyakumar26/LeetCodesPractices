package com.leetcode.arrays.easy;

public class SecondLargestAndSecondSmallest {

	public static void main(String[] args) {
		int[] nums = {2,3,1,6,8,5,9,0};
		for(int i : getSecondOrderElements(nums, nums.length)) {
			System.out.print(i+ " ");
		}
	}
	public static int[] getSecondOrderElements(int []a, int n) {
        int[] highLow = new int[2];
        int temp = 0;
        for(int i=0 ; i < n; i++){
            for(int j = 0; j<n; j++){
                if(a[i] < a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        highLow[0] = a[n-2];
        highLow[1] = a[1];
        return highLow;
    }
}
