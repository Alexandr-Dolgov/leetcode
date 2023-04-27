package com.github.alexandr_dolgov.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2236RootEqualsSumOfChildrenTest extends Problem2236RootEqualsSumOfChildren {

    @Test
    void checkTree_10_4_6() {
        assertTrue(checkTree(new TreeNode(10, new TreeNode(4), new TreeNode(6))));
    }

    @Test
    void checkTree_5_3_1() {
        assertFalse(checkTree(new TreeNode(5, new TreeNode(3), new TreeNode(1))));
    }
}