package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1176;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1176Test {
    private _1176.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1176.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(0, solution1.dietPlanPerformance(new int[] {1, 2, 3, 4, 5}, 1, 3, 3));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.dietPlanPerformance(new int[] {3, 2}, 2, 0, 1));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.dietPlanPerformance(new int[] {6, 5, 0, 0}, 2, 1, 5));
    }
}
