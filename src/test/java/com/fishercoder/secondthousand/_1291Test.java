package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1291;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public class _1291Test {
    private _1291.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1291.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList(), solution1.sequentialDigits(100, 300));
    }
}
