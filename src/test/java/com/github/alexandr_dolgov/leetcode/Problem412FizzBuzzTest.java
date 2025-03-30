package com.github.alexandr_dolgov.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;

public class Problem412FizzBuzzTest extends Problem412FizzBuzz {

    @Test
    void test1() {
        var res = this.fizzBuzz(3);
        assertLinesMatch(List.of("1","2","Fizz"), res);
    }

    @Test
    void test2() {
        var res = this.fizzBuzz(5);
        assertLinesMatch(List.of("1","2","Fizz","4","Buzz"), res);
    }

    @Test
    void test3() {
        var res = this.fizzBuzz(15);
        assertLinesMatch(List.of(
                "1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"
                ),
                res
        );
    }

    @Test
    void test1v2() {
        var res = this.fizzBuzz2(3);
        assertLinesMatch(List.of("1","2","Fizz"), res);
    }

    @Test
    void test2v2() {
        var res = this.fizzBuzz2(5);
        assertLinesMatch(List.of("1","2","Fizz","4","Buzz"), res);
    }

    @Test
    void test3v2() {
        var res = this.fizzBuzz2(15);
        assertLinesMatch(List.of(
                        "1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"
                ),
                res
        );
    }

}
