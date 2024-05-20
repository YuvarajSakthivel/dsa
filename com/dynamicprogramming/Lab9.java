package com.dynamicprogramming;

import java.util.Arrays;

//Coin change problem.
//DP -Solution - Tabulation.
public class Lab9 {
    static int  memo[][];
    public static int coinsCountSumCombination(int coins[],int length,int sum) {

        // DO THE ASSIGNMENT
//        if(sum ==0 ){
//            memo[length][sum] = 1;
//            return memo[length][sum];
//        }
//        if(sum<0||length==0) {
//            return 0;
//        }
//        if (memo[length][sum]!=-1) {
//            return memo[length][sum];
//        }
//        int include = coinsCountSumCombination(coins,length,sum-coins[length-1]);
//        int exclude = coinsCountSumCombination(coins,length-1,sum);
//        memo[length][sum] = include+exclude;
        return memo[length][sum];
    }
    public static void main(String[] args) {
        int coins[] = {1,2};
        int length = coins.length;
        int sum = 5;
        memo = new int[length+1][sum+1];
        for (int[] x : memo) {
            Arrays.fill(x,-1);
        }
        //sum =3 because we need to find howmany combination that makes the sum 3 in given array coins.
        //example 1,1,1 and 1,2 makes 3 so output must be 2 as 2 pairs found which sum is 3
        System.out.println(
                coinsCountSumCombination(coins,length,sum));
    }


}
