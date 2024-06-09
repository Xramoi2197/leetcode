/*
231. Power of Two

Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x.

*/

package org.testproject.tasks.easy;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        while (!(n == 2 || n == 1)) {
            if (n < 1 || n % 2 == 1) return false;
            n >>= 1;
        }
        return true;
    }
}