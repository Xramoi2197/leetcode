package org.testproject.tasks.easy;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FirstUniqueCharTest {
    private FirstUniqueChar firstUniqueChar = new FirstUniqueChar();

    @Test
    public void testFirstUniqCharFirstChar() {
        var result = this.firstUniqueChar.firstUniqChar("leetcode");
        assertEquals(result, 0);

    }

    @Test
    public void testFirstUniqCharThirdChar() {
        var result = this.firstUniqueChar.firstUniqChar("loveleetcode");
        assertEquals(result, 2);

    }

    @Test
    public void testFirstUniqCharNoChar() {
        var result = this.firstUniqueChar.firstUniqChar("aabb");
        assertEquals(result, -1);

    }
}