package com.dynamicprogramming;

import java.util.Arrays;

//Knap sack problem.
//Recursion
public class Lab10 {
    public static int knapSack(int[] weights,int [] dollars,int n,int maxWeight) {
        if (maxWeight==0||n==0) {
            return 0;
        }
        if (weights[n-1]>maxWeight) {
            return knapSack(weights,dollars,n-1,maxWeight);
        } else {
            int exclude = knapSack(weights,dollars,n-1,maxWeight);
            int include = dollars[n-1]+knapSack(weights,dollars,n-1,maxWeight-weights[n-1]);
            return Math.max(exclude,include);
        }
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

        System.out.println(
                knapSack(weights,dollars,n,maxWeight));
    }


}
