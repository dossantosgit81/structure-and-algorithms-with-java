package org.example.reucursion;

public class Recursion {

    public int fibIterative(int n){
        if(n < 1)
            return 0;
        if(n <= 2)
            return 1;
        int fibMinus2 = 0;
        int fibMinus1 = 1;
        int fibN = n;
        for (int i = 2; i<=n; i++ ){
            fibN = fibMinus1 + fibMinus2;
            fibMinus2 = fibMinus1;
            fibMinus1 = fibN;
        }
        return fibN;
    }
}
