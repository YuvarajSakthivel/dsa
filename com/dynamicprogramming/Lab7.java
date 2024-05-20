package com.dynamicprogramming;

//Coin change problem
//Recursion approach
public class Lab7 {
    public static int coinsCountSumCombination(int coins[],int length,int sum) {

        if(sum ==0 ){
            return 1;
        }
        if(sum<0||length==0) {
            return 0;
        }

        int include = coinsCountSumCombination(coins,length,sum-coins[length-1]);
        int exclude = coinsCountSumCombination(coins,length-1,sum);
        return include+exclude;
    }
    public static void main(String[] args) {
        int coins[] = {1,2};
        int length = coins.length;
        int sum = 5;
        //sum =3 because we need to find howmany combination that makes the sum 3 in given array coins.
        //example 1,1,1 and 1,2 makes 3 so output must be 2 as 2 pairs found which sum is 3
        System.out.println(
                coinsCountSumCombination(coins,length,sum));
    }


}
