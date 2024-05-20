package com.dynamicprogramming;

// Find nth fibonacci problem with dynamic programming - momoization approach
public class Lab2 {

    static int momo[] = {-1,-1,-1,-1,-1,-1};
    public static int fib(int n) {

        if (momo[n] == -1) {
            if (n == 0 || n == 1) {
                momo[n]=n;
            } else {
                momo[n]=fib(n - 1) + fib(n - 2);
            }
        }
        return momo[n];
    }
    public static void main(String[] args) {
        System.out.println(fib(5));
    }


}
