package org.testproject.tasks.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionMatchingTest {

    @Test
    void isMatch() {
        assertAll(
                () -> assertTrue(RegularExpressionMatching.isMatch("a", "a")),
                () -> assertFalse(RegularExpressionMatching.isMatch("aa", "a")),
                () -> assertTrue(RegularExpressionMatching.isMatch("aa", "a*")),
                () -> assertTrue(RegularExpressionMatching.isMatch("aa", "a.")),
                () -> assertTrue(RegularExpressionMatching.isMatch("aa", ".*")),
                () -> assertTrue(RegularExpressionMatching.isMatch("aabb", "a.*")),
                () -> assertTrue(RegularExpressionMatching.isMatch("aabb", "a.b.")),
                () -> assertTrue(RegularExpressionMatching.isMatch("aabb", "a*b*")),
                () -> assertTrue(RegularExpressionMatching.isMatch("aabb", ".*b")),
                () -> assertTrue(RegularExpressionMatching.isMatch("aabb", ".*b*")),
                () -> assertFalse(RegularExpressionMatching.isMatch("aabb", ".*c")),
                () -> assertTrue(RegularExpressionMatching.isMatch("a", ".*")),
                () -> assertFalse(RegularExpressionMatching.isMatch("mississippi", "mis*is*p*."))
        );
    }
}