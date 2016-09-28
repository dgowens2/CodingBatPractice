package com.tiy;

/**
 * Created by DTG2 on 09/21/16.
 */
public class CloseFar {
//   Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
//   while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes
//   the absolute value of a number.
//
//    closeFar(1, 2, 10) → true
//    closeFar(1, 2, 3) → false
//    closeFar(4, 1, 3) → true

    public static void main(String[] args) {
        System.out.println("Testing, testing");
    }

    public boolean closeFar (int a, int b, int c) {
        int bMinusA = Math.abs(a - b);
        int cMinusA = Math.abs(a - c);
        int cMinusB = Math.abs(b - c);
        boolean result = false;

        if (bMinusA < 2 || cMinusA < 2) {
            if (bMinusA >= 2 && cMinusB >= 2) {
                result = true;
            } else if (cMinusA >= 2 && cMinusB >= 2) {
                result = true;
            }
        }

        return result;

    }

}
