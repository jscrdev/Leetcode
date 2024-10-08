package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1143;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1143Test {
    private _1143.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1143.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.longestCommonSubsequence("abc", "abc"));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.longestCommonSubsequence("abc", "def"));
    }

    @Test
    public void test4() {
        assertEquals(2, solution1.longestCommonSubsequence("ezupkr", "ubmrapg"));
    }
}
