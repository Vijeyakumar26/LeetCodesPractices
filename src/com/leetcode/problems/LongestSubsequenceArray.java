package com.leetcode.problems;

import java.util.Arrays;

public class LongestSubsequenceArray {

	public static void main(String[] args) {
		int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 22, 68, 90};
		System.out.println(longSubsequentArray(arr));
	}
	//counttestdevices
	public static int longSubsequentArray(int[] arr) {
		int max = 0;
		int count = 0;
        int tempMax = 0;;
        for(int i=0;i<=arr.length-1;i++){
            for(int j = i+1 ; j<=arr.length-1 ; j++){
                if(arr[j]>arr[i]){
                	
                	count++;
                }else {
                	continue;
                }
            }
            if(count>max) {
            	max = count;
            }
            count = 0;
        }
        return max;
    }
	public static int longSubsequentArray2(int[] arr) {
		if (arr == null || arr.length == 0) {
            return 0;
        }
        int n = arr.length;
        int[] dp = new int[n]; 
        for (int i = 0; i < n; i++) {
            dp[i] = 1; 
        }
        int maxLength = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if (dp[i] > maxLength) { 
                maxLength = dp[i];
            }
        }
        return maxLength;
    }
}


