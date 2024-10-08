package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.secondthousand._1105;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1105Test {
    private _1105.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1105.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                6,
                solution1.minHeightShelves(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[1,1],[2,3],[2,3],[1,1],[1,1],[1,1],[1,2]"),
                        4));
    }
}
