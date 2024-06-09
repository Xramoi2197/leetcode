package org.testproject.tasks.easy;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstUniqueCharTest {
    @Test
    public void testFirstUniqCharFirstChar() {
        var result = FirstUniqueChar.firstUniqChar("leetcode");
        assertEquals(result, 0);

    }

    @Test
    public void testFirstUniqCharThirdChar() {
        var result = FirstUniqueChar.firstUniqChar("loveleetcode");
        assertEquals(result, 2);

    }

    @Test
    public void testFirstUniqCharNoChar() {
        var result = FirstUniqueChar.firstUniqChar("aabb");
        assertEquals(result, -1);

    }
}