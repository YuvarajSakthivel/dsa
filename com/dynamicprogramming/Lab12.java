package com.dynamicprogramming;

import java.util.Arrays;

//Knap sack problem.
//DP -Solution - Tabulation
public class Lab12 {
    static int memo[][];
    public static int knapSack(int[] weights,int [] dollars,int n,int maxWeight) {
        // DO ASSIGNMENT
//        if (maxWeight==0||n==0) {
//            memo[n][maxWeight] = 0;
//            return memo[n][maxWeight];
//        }
//
//        if (memo[n][maxWeight] != -1) {
//            return memo[n][maxWeight];
//        }
//
//        if (weights[n-1]>maxWeight) {
//            memo[n][maxWeight] = knapSack(weights,dollars,n-1,maxWeight);
//        } else {
//            int exclude = knapSack(weights,dollars,n-1,maxWeight);
//            int include = dollars[n-1]+knapSack(weights,dollars,n-1,maxWeight-weights[n-1]);
//            memo[n][maxWeight] = Math.max(exclude,include);
//        }
        return memo[n][maxWeight];
    }

    public static void main(String[] args) {
        int weights[] = {5,6,4,3};
        int dollars[] = {10,40,30,50};
        int n = weights.length;
        int maxWeight = 10;
        // You need to find the make what is dollars we will get if you put the weights.
        // example - maxWeight of the bag is 10kg, so i can put only up to 10kg in the bag. there are weights 5,6,4,3
        // and corresponding dollar values are 10,40,30,50 respectively. since bag max capacity is 10, I can include 6,3 which
        // dollar values are 40,50 , total 90 dollar which is max i can get.

        memo = new int[n+1][maxWeight+1];
        for (int[] x: memo) {
            Arrays.fill(x,-1);
        }
        System.out.println(
                knapSack(weights,dollars,n,maxWeight));
    }


}
