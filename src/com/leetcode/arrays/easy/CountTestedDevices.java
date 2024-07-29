package com.leetcode.arrays.easy;

public class CountTestedDevices {

	public static void main(String[] args) {
		int[] batteryPercentages = {1,2};
		System.out.println(countTestedDevices(batteryPercentages));
	}
	//counttestdevices
	public static int countTestedDevices(int[] batteryPercentages) {
        int testedDevices = 0;
        int n = batteryPercentages.length;
        for(int i=0;i<=n-1;i++){
            if(batteryPercentages[i]>0){
                testedDevices = testedDevices + 1;
                for(int j = i+1 ; j<=n-1 ; j++){
                    if(batteryPercentages[j]>=0){
                        batteryPercentages[j]=batteryPercentages[j]-1;
                    }
                }
            }
        }
        return testedDevices;
    }
}
