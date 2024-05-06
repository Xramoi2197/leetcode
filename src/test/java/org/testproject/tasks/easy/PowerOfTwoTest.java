package org.testproject.tasks.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PowerOfTwoTest {
    @Test
    void isPowerOfTwoZeroDegree() {
        var result = PowerOfTwo.isPowerOfTwo(1);
        assertTrue(result);
    }

    @Test
    void isPowerOfTwoFourthDegree() {
        var result = PowerOfTwo.isPowerOfTwo(16);
        assertTrue(result);
    }

    @Test
    void isPowerOfTwoFalse() {
        var result = PowerOfTwo.isPowerOfTwo(3);
        assertFalse(result);
    }
}