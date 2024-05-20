package com.dynamicprogramming;

import java.util.Arrays;

// Find Longest common subsequences (LCS) of given strings.
//Memoization - DP - Dynamic programming.
public class Lab5 {
    static int memo[][];
    public static int lcs(String str1,String str2,int str1Length,int str2Length) {


        if(memo[str1Length][str2Length]!=-1) {
            return memo[str1Length][str2Length];
        }
        if(str1Length==0 || str2Length==0) {
            memo[str1Length][str2Length] = 0;
            return memo[str1Length][str2Length];
        }
        if(str1.charAt(str1Length-1) == str2.charAt(str2Length-1)) {
            memo[str1Length][str2Length] = 1+lcs(str1,str2,str1Length-1,str2Length-1);
        } else {
            memo[str1Length][str2Length] = Math.max(lcs(str1,str2,str1Length-1,str2Length),
                   lcs(str1,str2,str1Length,str2Length-1));
        }
        return memo[str1Length][str2Length];
    }
    public static void main(String[] args) {
        String str1="AXYZ";
        String str2="BAZ";
        int m=str1.length();
        int n=str2.length();
        memo = new int[m+1][n+1];
        for (int[] x:memo) {
            Arrays.fill(x,-1);
        }
        System.out.println(lcs(str1,str2,m,n));
    }


}
