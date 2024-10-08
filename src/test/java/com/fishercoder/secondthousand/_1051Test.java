package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1051;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1051Test {
    private _1051.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1051.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.heightChecker(new int[] {1, 1, 4, 2, 1, 3}));
    }
}
