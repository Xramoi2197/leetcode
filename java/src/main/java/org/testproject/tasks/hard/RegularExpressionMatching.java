/*
10. Regular Expression Matching

Given an input string s and a pattern p, implement regular expression
matching with support for '.' and '*' where:
 '.' Matches any single character.
 '*' Matches zero or more of the preceding element.
The matching should cover the entire input string (not partial).

*/

package org.testproject.tasks.hard;

public class RegularExpressionMatching {
    public static boolean isMatch(String string, String pattern) {
        if (pattern.isEmpty()) return string.isEmpty();
        var firstMatch = (!string.isEmpty() && ((string.charAt(0) == pattern.charAt(0)) || (pattern.charAt(0) == '.')));
        if (pattern.length() >= 2 && pattern.charAt(1) == '*' && !string.isEmpty()) {
            return isMatch(string.substring(1), pattern.substring(2)) || (firstMatch && isMatch(string.substring(1), pattern));
        }
        return firstMatch && isMatch(string.substring(1), pattern.substring(1));
    }
}
