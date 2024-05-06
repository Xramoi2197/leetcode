package org.testproject.tasks.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversePrefixOfWordTest {
    @Test
    void reversePrefixFirst() {
        var result = ReversePrefixOfWord.reversePrefix("abcdefd", 'd');
        assertEquals(result, "dcbaefd");
    }

    @Test
    void reversePrefixSecond() {
        var result = ReversePrefixOfWord.reversePrefix("xyxzxe", 'z');
        assertEquals(result, "zxyxxe");
    }

    @Test
    void reversePrefixLetterNotFound() {
        var result = ReversePrefixOfWord.reversePrefix("abcd", 'z');
        assertEquals(result, "abcd");
    }
}