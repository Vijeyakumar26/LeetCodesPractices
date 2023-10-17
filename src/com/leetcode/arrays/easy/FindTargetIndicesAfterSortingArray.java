package com.leetcode.arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTargetIndicesAfterSortingArray {

	public static void main(String[] args) {
		int[] arr = {1,5,2,4,4,1};
		System.out.println(targetIndices(arr,4));
	}
	public static List<Integer> targetIndices(int[] nums, int target) {
		List<Integer> output = new ArrayList<>(); 
		List<Integer> numbers = Arrays.stream(nums)
			      .boxed()
			      .sorted()
			      .collect(Collectors.toList());
	  for(int i=0;i<numbers.size();i++) {
		  if(numbers.get(i)==target) {
			  output.add(i);
		  }
	  }
		return output;
	}
}
