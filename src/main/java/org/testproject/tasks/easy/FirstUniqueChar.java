/*
387. First Unique Character in a String

Given a string s, find the first non-repeating
character in it and return its index.
If it does not exist, return -1.

*/
package org.testproject.tasks.easy;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {
    public static int firstUniqChar(String s) {
        int res = s.length() + 1;
        HashMap<Character, int[]> lib = new HashMap<>();
        int[] arr;
        for (int i = 0; i < s.length(); i++) {
            Character curChar = (Character) s.charAt(i);
            if (lib.containsKey(curChar)) {
                arr = lib.get(curChar);
                arr[1] += 1;
                continue;
            }
            arr = new int[2];
            arr[0] = i;
            arr[1] = 1;
            lib.put(curChar, arr);
        }
        for (Map.Entry<Character, int[]> entry : lib.entrySet()) {
            arr = entry.getValue();
            if (arr[1] == 1 && res > arr[0]) {
                res = arr[0];
            }
        }
        if (res == s.length() + 1) {
            res = -1;
        }
        return res;
    }
}
