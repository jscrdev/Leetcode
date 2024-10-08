package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1936;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1936Test {
    private _1936.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1936.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.addRungs(new int[] {3}, 1));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.addRungs(new int[] {1, 3, 5, 10}, 2));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.addRungs(new int[] {3, 6, 8, 10}, 3));
    }

    @Test
    public void test4() {
        assertEquals(1, solution1.addRungs(new int[] {3, 4, 6, 7}, 2));
    }

    @Test
    public void test5() {
        assertEquals(0, solution1.addRungs(new int[] {5}, 10));
    }
}
