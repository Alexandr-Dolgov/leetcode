package com.github.alexandr_dolgov.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem1672RichestCustomerWealthTest extends Problem1672RichestCustomerWealth {

    @Test
    void test0() {
        var a1 = new int[][]{{0,1}, {1,2}};
        int res = this.maximumWealth(a1);
        assertEquals(3, res);
    }

    @Test
    void test1() {
        var a = new int[][]{{1,2,3},{3,2,1}};
        int res = this.maximumWealth(a);
        assertEquals(6, res);
    }

    @Test
    void test2() {
        var a = new int[][]{{1,5},{7,3},{3,5}};
        int res = this.maximumWealth(a);
        assertEquals(10, res);
    }

    @Test
    void test3() {
        var a = new int[][]{{2,8,7},{7,1,3},{1,9,5}};
        int res = this.maximumWealth(a);
        assertEquals(17, res);
    }

}
