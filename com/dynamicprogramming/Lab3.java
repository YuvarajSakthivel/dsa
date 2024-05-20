package com.dynamicprogramming;

// Find nth fibonacci problem with dynamic programming - tabulation approach
public class Lab3 {
    public static int fib(int n) {
        int f[] = new int[n+1];
        f[0]=0;
        f[1]=1;
        for(int i=2;i<=n;i++) {
            f[i] = f[i-1]+ f[i-2];
        }
        return f[n];
    }
    public static void main(String[] args) {
        System.out.println(fib(50));
    }


}
