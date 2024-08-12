package com.leetcode.arrays.easy;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = {1,6,4,0,0,0};
		int[] nums2 = {2,5,8};
		merge(nums1, 3, nums2, 3);
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		for(int i = m, j=0; i<m+n && j<n  ; i++, j++){
			nums1[i] = nums2[j];
		}
		int temp = 0;
		for(int i = 0; i<m+n; i++){
			for(int j=i+1; j<m+n ;j++){
				if(nums1[i] >= nums1[j]){
					temp = nums1[i];
					nums1[i] = nums1[j];
					nums1[j] = temp;
				}
			}
		}
		for(int a : nums1) {
			System.out.print(a +" ");
		}
	}
}
