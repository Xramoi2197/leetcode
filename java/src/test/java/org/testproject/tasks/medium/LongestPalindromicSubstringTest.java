package org.testproject.tasks.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {
    private final String[] inputs = new String[] {"babad", "cbbd", "mamaamamaramuumar"};

    @Test
    void longestPalindrome() {
        assertAll(
                () -> assertEquals(LongestPalindromicSubstring.longestPalindrome("babad"), "bab"),
                () -> assertEquals(LongestPalindromicSubstring.longestPalindrome("cbbd"), "bb"),
                () -> assertEquals(LongestPalindromicSubstring.longestPalindrome("mamaamamaramuumar"), "mamaamam")
        );
    }

    @Test
    void findOdd() {
        assertAll(
                () -> assertEquals(LongestPalindromicSubstring.findOdd(inputs[0], inputs[0].toCharArray()), "bab"),
                () -> assertEquals(LongestPalindromicSubstring.findOdd(inputs[1], inputs[1].toCharArray()), "c"),
                () -> assertEquals(LongestPalindromicSubstring.findOdd(inputs[2], inputs[2].toCharArray()), "amama")
        );
    }

    @Test
    void findEven() {
        assertAll(
                () -> assertEquals(LongestPalindromicSubstring.findEven(inputs[0], inputs[0].toCharArray()), "b"),
                () -> assertEquals(LongestPalindromicSubstring.findEven(inputs[1], inputs[1].toCharArray()), "bb"),
                () -> assertEquals(LongestPalindromicSubstring.findEven(inputs[2], inputs[2].toCharArray()), "mamaamam")
        );
    }

    @Test
    void findPal() {
        assertAll(
                () -> assertEquals(LongestPalindromicSubstring.findPal(inputs[2], inputs[2].toCharArray(),0, 2, "m"), "mam"),
                () -> assertEquals(LongestPalindromicSubstring.findPal(inputs[2], inputs[2].toCharArray(), 1,3, "maam"), "maam"),
                () -> assertEquals(LongestPalindromicSubstring.findPal(inputs[2], inputs[2].toCharArray(), 2,5,"maam"), "mamaamam")
        );
    }

    @Test
    void getMax() {
        assertAll(
                () -> assertEquals(LongestPalindromicSubstring.getMax("bb", "a"), "bb"),
                () -> assertEquals(LongestPalindromicSubstring.getMax("a", "bb"), "bb"),
                () -> assertEquals(LongestPalindromicSubstring.getMax("aa", "bb"), "bb")
        );
    }
}