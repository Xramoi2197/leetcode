package org.testproject.tasks.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversePrefixOfWordTest {
    private ReversePrefixOfWord reversePrefixOfWord = new ReversePrefixOfWord();

    @Test
    void reversePrefixFirst() {
        var result = reversePrefixOfWord.reversePrefix("abcdefd", 'd');
        assertEquals(result, "dcbaefd");
    }

    @Test
    void reversePrefixSecond() {
        var result = reversePrefixOfWord.reversePrefix("xyxzxe", 'z');
        assertEquals(result, "zxyxxe");
    }

    @Test
    void reversePrefixLetterNotFound() {
        var result = reversePrefixOfWord.reversePrefix("abcd", 'z');
        assertEquals(result, "abcd");
    }
}