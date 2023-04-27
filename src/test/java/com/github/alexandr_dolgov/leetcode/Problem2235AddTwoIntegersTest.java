package com.github.alexandr_dolgov.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2235AddTwoIntegersTest extends Problem2235AddTwoIntegers {

    @Test
    void sum_12_and_5() {
        assertEquals(17, sum(12, 5));
    }

    @Test
    void sum_minus100_and_minus100() {
        assertEquals(-200, sum(-100, -100));
    }

    @Test
    void sum_100_and_100() {
        assertEquals(200, sum(100, 100));
    }

    @Test
    void sum_0_and_0() {
        assertEquals(0, sum(0, 0));
    }
}