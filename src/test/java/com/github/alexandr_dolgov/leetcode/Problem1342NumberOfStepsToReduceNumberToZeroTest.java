package com.github.alexandr_dolgov.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem1342NumberOfStepsToReduceNumberToZeroTest extends Problem1342NumberOfStepsToReduceNumberToZero {

    @Test
    void test1() {
        assertEquals(6, this.numberOfSteps(14));
    }

    @Test
    void test2() {
        assertEquals(4, this.numberOfSteps(8));
    }

    @Test
    void test3() {
        assertEquals(12, this.numberOfSteps(123));
    }

}
