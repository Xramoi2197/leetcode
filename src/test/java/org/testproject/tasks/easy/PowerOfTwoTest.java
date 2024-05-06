package org.testproject.tasks.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfTwoTest {
    private PowerOfTwo powerOfTwo = new PowerOfTwo();

    @Test
    void isPowerOfTwoZeroDegree() {
        var result = powerOfTwo.isPowerOfTwo(1);
        assertTrue(result);
    }

    @Test
    void isPowerOfTwoFourthDegree() {
        var result = powerOfTwo.isPowerOfTwo(16);
        assertTrue(result);
    }

    @Test
    void isPowerOfTwoFalse() {
        var result = powerOfTwo.isPowerOfTwo(3);
        assertFalse(result);
    }
}