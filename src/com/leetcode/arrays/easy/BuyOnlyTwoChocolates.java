package com.leetcode.arrays.easy;

public class BuyOnlyTwoChocolates {

	public static void main(String[] args) {
		int[] prices = {98,54,6,34,66,63,52,39}; 
		int	money = 62;
		System.out.println(buyChoco(prices, money));
	}
	public static int buyChoco(int[] prices, int money) {
        for(int i = 0; i<prices.length;i++){
            if(money>prices[i]){
                for(int j = i +1; j < prices.length; j++){
                    if(prices[i]+prices[j]<=money){
                        money = money - (prices[i]+prices[j]);
                    }
                }
            }
        }
        return money;
    }
}
