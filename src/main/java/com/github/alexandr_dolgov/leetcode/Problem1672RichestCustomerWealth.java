package com.github.alexandr_dolgov.leetcode;

public class Problem1672RichestCustomerWealth {
    // https://leetcode.com/problems/richest-customer-wealth/description/
    public int maximumWealth(int[][] accounts) {
        int wealth;
        int biggestWealth = 0;

        for(int i = 0; i < accounts.length; i++) {
            wealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            if (wealth > biggestWealth) {
                biggestWealth = wealth;
            }
        }
        return biggestWealth;
    }
}
