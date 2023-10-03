package com.leetcode.arrays.easy;

public class CountNegativeNumbersSortedMatrix {
	public static void main(String[] args) {
		int[][] arr = {{5,1,0},{-5,-5,-5}};
		System.out.println(countNegatives(arr));
	}
	public static int countNegatives(int[][] grid) {
        int count=0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    }
	//Runtime: 1 ms, faster than 54.17% of Java online submissions for Count Negative Numbers in a Sorted Matrix.
	//Memory Usage: 44.2 MB, less than 20.58% of Java online submissions for Count Negative Numbers in a Sorted Matrix.
}
