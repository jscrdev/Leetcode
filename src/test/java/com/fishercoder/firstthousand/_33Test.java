package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._33;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _33Test {
    private _33.Solution1 solution1;
    private static int[] nums;
    private static int expected;
    private static int target;

    @BeforeEach
    public void setup() {
        solution1 = new _33.Solution1();
    }

    @Test
    public void test1() {
        nums = new int[] {4, 5, 6, 7, 0, 1, 2};
        expected = 3;
        target = 7;
        assertEquals(expected, solution1.search(nums, target));
    }

    @Test
    public void test2() {
        nums = new int[] {4, 5, 6, 7, 0, 1, 2};
        expected = 4;
        target = 0;
        assertEquals(expected, solution1.search(nums, target));
    }

    @Test
    public void test3() {
        nums = new int[] {4, 5, 6, 7, 0, 1, 2};
        expected = 1;
        target = 5;
        assertEquals(expected, solution1.search(nums, target));
    }

    @Test
    public void test4() {
        nums = new int[] {4, 5, 6, 7, 0, 1, 2};
        expected = -1;
        target = 3;
        assertEquals(expected, solution1.search(nums, target));
    }

    @Test
    public void test5() {
        nums = new int[] {1};
        expected = -1;
        target = 0;
        assertEquals(expected, solution1.search(nums, target));
    }

    @Test
    public void test6() {
        nums = new int[] {1, 3, 5};
        expected = -1;
        target = 4;
        assertEquals(expected, solution1.search(nums, target));
    }

    @Test
    public void test7() {
        nums = new int[] {1, 3, 5};
        expected = -1;
        target = 6;
        assertEquals(expected, solution1.search(nums, target));
    }

    @Test
    public void test8() {
        nums = new int[] {1, 3, 5};
        expected = -1;
        target = 2;
        assertEquals(expected, solution1.search(nums, target));
    }

    @Test
    public void test9() {
        nums = new int[] {5, 1, 3};
        expected = -1;
        target = 4;
        assertEquals(expected, solution1.search(nums, target));
    }

    @Test
    public void test10() {
        nums = new int[] {1, 2, 3, 4, 5, 6};
        expected = 3;
        target = 4;
        assertEquals(expected, solution1.search(nums, target));
    }

    @Test
    public void test11() {
        nums = new int[] {5, 1, 2, 3, 4};
        expected = 1;
        target = 1;
        assertEquals(expected, solution1.search(nums, target));
    }

    @Test
    public void test12() {
        nums = new int[] {8, 9, 2, 3, 4};
        expected = 1;
        target = 9;
        assertEquals(expected, solution1.search(nums, target));
    }

    @Test
    public void test13() {
        nums = new int[] {4, 5, 6, 7, 8, 1, 2, 3};
        expected = 4;
        target = 8;
        assertEquals(expected, solution1.search(nums, target));
    }
}
