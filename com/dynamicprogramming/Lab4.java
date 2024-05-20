package com.dynamicprogramming;

// Find Longest common subsequences (LCS) of given strings.
//Recursion approach.
public class Lab4 {
    public static int lcs(char[] str1,char[] str2,int str1Length,int str2Length) {

        if(str1Length==0 || str2Length==0) {
            return 0;
        }
        if(str1[str1Length-1] == str2[str2Length-1]) {
          return 1+lcs(str1,str2,str1Length-1,str2Length-1);
        } else {
           return Math.max(lcs(str1,str2,str1Length-1,str2Length),
                   lcs(str1,str2,str1Length,str2Length-1));
        }
    }
    public static void main(String[] args) {
        String str1="AXYZ";
        String str2="BAZ";
        int m=str1.length();
        int n=str2.length();
        System.out.println(
                lcs(str1.toCharArray(),str2.toCharArray(),m,n));
    }


}
