package com.leetcode.arrays.easy;

public class RectanglesFormLargestSquare {

	public static void main(String[] args) {
		int[][] arr = {{5,8},{3,9},{5,12},{16,5}};
		System.out.println(countGoodRectangles(arr));
	}
	public static int countGoodRectangles(int[][] rectangles) {
		int minLength =0;
		int maxLength =0;
		int count=0;
        for(int i =0; i<rectangles.length;i++){
        	minLength = Integer.min(rectangles[i][0], rectangles[i][1]);
            if(maxLength < minLength) {
                maxLength = minLength;
                count = 1;
            } else if(maxLength == minLength) {
                count++;
            }
        }
       return count;
    }
}
