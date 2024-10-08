package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.firstthousand._167;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _167Test {
    private _167.Solution1 solution1;
    private _167.Solution2 solution2;
    private _167.Solution3 solution3;
    private static int[] numbers;
    private static int[] expected;
    private int target;

    @BeforeEach
    public void setup() {
        solution1 = new _167.Solution1();
        solution2 = new _167.Solution2();
        solution3 = new _167.Solution3();
    }

    @Test
    public void test1() {
        numbers = new int[] {-3, 3, 4, 90};
        expected = new int[] {1, 2};
        target = 0;
        assertArrayEquals(expected, solution1.twoSum(numbers, target));
        assertArrayEquals(expected, solution2.twoSum(numbers, target));
        assertArrayEquals(expected, solution3.twoSum(numbers, target));
    }

    @Test
    public void test2() {
        expected = new int[] {2, 3};
        target = 100;
        assertArrayEquals(expected, solution1.twoSum(new int[] {5, 25, 75}, target));
        assertArrayEquals(expected, solution2.twoSum(new int[] {5, 25, 75}, target));
        assertArrayEquals(expected, solution3.twoSum(new int[] {5, 25, 75}, target));
    }

    @Test
    public void test3() {
        numbers = new int[] {1, 2, 3, 4, 4, 9, 56, 90};
        expected = new int[] {4, 5};
        target = 8;
        assertArrayEquals(expected, solution1.twoSum(numbers, target));
        assertArrayEquals(expected, solution2.twoSum(numbers, target));
        assertArrayEquals(expected, solution3.twoSum(numbers, target));
    }

    @Test
    public void test4() {
        numbers = new int[] {2, 3, 4};
        expected = new int[] {1, 3};
        target = 6;
        assertArrayEquals(expected, solution1.twoSum(numbers, target));
        assertArrayEquals(expected, solution2.twoSum(numbers, target));
        assertArrayEquals(expected, solution3.twoSum(numbers, target));
    }
}
