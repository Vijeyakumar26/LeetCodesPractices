package com.leetcode.arrays.easy;

public class MaximumNumberofWordsFoundinSentences {

	public static void main(String[] args) {
		String sentences[] = {"The quick browmn", "fox jumps over the", "lazy river"};
		System.out.print(mostWordsFound(sentences));
	}

	public static int mostWordsFound(String[] sentences) {
		int max = 0;
		for(String s: sentences){
			int length = 0;
			String[] splitString = s.split(" ");
			length = splitString.length;
			if(length>max)
				max = length;
		}
		return max;
	}
}
