package com.github.alexandr_dolgov.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem412FizzBuzz {
    // https://leetcode.com/problems/fizz-buzz/
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            String val;
            if (i % 3 == 0 && i % 5 == 0) {
                val = "FizzBuzz";
            } else if (i % 3 == 0) {
                val = "Fizz";
            } else if (i % 5 == 0) {
                val = "Buzz";
            } else {
                val = "" + i;
            }
            res.add(val);
        }
        return res;
    }

    public List<String> fizzBuzz2(int n) {
        List<String> res = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            boolean devidedBy3 = (i % 3 == 0);
            boolean devidedBy5 = (i % 5 == 0);
            String val = "";
            if (devidedBy3) {
                val += "Fizz";
            }
            if (devidedBy5) {
                val += "Buzz";
            }

            if (val.isEmpty()) {
                val += i;
            }
            res.add(val);
        }
        return res;
    }
}
