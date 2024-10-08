package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._48;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _48Test {
    private _48.Solution1 solution1;
    private _48.Solution2 solution2;
    private _48.Solution3 solution3;
    private static int[][] matrix;

    @BeforeEach
    public void setup() {
        solution1 = new _48.Solution1();
        solution2 = new _48.Solution2();
        solution3 = new _48.Solution3();
    }

    @Test
    public void test1() {
        matrix =
                new int[][] {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9},
                };
        solution1.rotate(matrix);
        CommonUtils.print2DIntArray(matrix);
    }

    @Test
    public void test2() {
        matrix =
                new int[][] {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9},
                };
        solution2.rotate(matrix);
        CommonUtils.print2DIntArray(matrix);
    }

    @Test
    public void test3() {
        matrix =
                new int[][] {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
                };
        solution2.rotate(matrix);
        CommonUtils.print2DIntArray(matrix);
    }

    @Test
    public void test4() {
        matrix =
                new int[][] {
                    {1, 2},
                    {3, 4}
                };
        solution1.rotate(matrix);
        CommonUtils.print2DIntArray(matrix);
    }

    @Test
    public void test5() {
        matrix =
                new int[][] {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
                };
        CommonUtils.print2DIntArray(matrix);
        solution3.rotate(matrix);
        CommonUtils.print2DIntArray(matrix);
    }

    @Test
    public void test6() {
        matrix =
                new int[][] {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
                };
        solution1.rotate(matrix);
        CommonUtils.print2DIntArray(matrix);
    }
}
