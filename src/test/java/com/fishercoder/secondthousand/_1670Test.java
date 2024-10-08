package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1670;
import org.junit.jupiter.api.Test;

public class _1670Test {
    private _1670.Solution1.FrontMiddleBackQueue solution1;

    @Test
    public void test1() {
        solution1 = new _1670.Solution1.FrontMiddleBackQueue();
        solution1.pushFront(1);
        solution1.pushBack(2);
        solution1.pushMiddle(3);
        solution1.pushMiddle(4);
        assertEquals(1, solution1.popFront());
        assertEquals(3, solution1.popMiddle());
        assertEquals(4, solution1.popMiddle());
        assertEquals(2, solution1.popFront());
    }
}
