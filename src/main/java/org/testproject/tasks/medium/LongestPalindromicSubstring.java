/*
5. Longest Palindromic Substring

Given a string s, return the longest palindromic substring in s.

*/
package org.testproject.tasks.medium;

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        char[] letters = s.toCharArray();
        String res = "" + letters[0];
        String odd = findOdd(s, letters);
        String even = findEven(s, letters);
        String max = getMax(odd, even);
        res = getMax(max, res);
        return res;
    }

    public static String findOdd(String s, char[] letters) {
        String res = "" + letters[0];
        for (int indMiddle = 0; indMiddle < s.length(); ++indMiddle) {
            int leftBorder = indMiddle - 1, rightBorder = indMiddle + 1;
            res = findPal(s, letters, leftBorder, rightBorder, res);
        }
        return res;
    }

    public static String findEven(String s, char[] letters) {
        String res = "" + letters[0];
        for (int indMiddle = 0; indMiddle < s.length(); ++indMiddle) {
            int leftBorder = indMiddle, rightBorder = indMiddle + 1;
            res = findPal(s, letters, leftBorder, rightBorder, res);
        }
        return res;
    }

    public static String findPal(String s, char[] letters, int leftBorder, int rightBorder, String res) {
        while (leftBorder >= 0 && rightBorder < s.length() && letters[leftBorder] == letters[rightBorder]) {
            if (res.length() <= rightBorder - leftBorder) {
                res = s.substring(leftBorder, rightBorder + 1);
            }
            leftBorder--;
            rightBorder++;
        }
        return res;
    }

    public static String getMax(String first, String second) {
        if (first.length() > second.length()) {
            return first;
        }
        return second;
    }
}
