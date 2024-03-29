package com.leetcode.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberofCandies {

	public static void main(String[] args) {
		int[] arr = {4,2,1,1,3};
		GreatestNumberofCandies candies = new GreatestNumberofCandies();
		System.out.println(candies.kidsWithCandies(arr, 1));
	}
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> highList = new ArrayList<>();
		int max = 0;
		for (int i = 0; i < candies.length; i++){
			if (candies[i] > max){
				max = candies[i];
			}
		}
		System.out.println(max);
		int highestSum = 0;
		for (int i = 0; i < candies.length; i++){
			highestSum = candies[i]+extraCandies;
			if(highestSum >= max){
				highList.add(true);
			}
			else{
				highList.add(false);
			}
		}
		return highList;
	}
}
