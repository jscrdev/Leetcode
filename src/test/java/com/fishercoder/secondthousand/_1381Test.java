package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1381;
import org.junit.jupiter.api.Test;

public class _1381Test {
    private _1381.Solution1.CustomStack customStack;
    private _1381.Solution2.CustomStack customStack2;

    @Test
    public void test1() {
        customStack = new _1381.Solution1.CustomStack(3);
        customStack.push(1);
        customStack.push(2);
        assertEquals(2, customStack.pop());
        customStack.push(2);
        customStack.push(3);
        customStack.push(4);
        customStack.increment(5, 100);
        customStack.increment(2, 100);
        assertEquals(103, customStack.pop());
        assertEquals(202, customStack.pop());
        assertEquals(201, customStack.pop());
        assertEquals(-1, customStack.pop());
    }

    @Test
    public void test2() {
        customStack2 = new _1381.Solution2.CustomStack(3);
        customStack2.push(-1);
        customStack2.push(20);
        assertEquals(20, customStack2.pop());
        customStack2.push(30);
        customStack2.push(40);
        customStack2.push(50);
        customStack2.increment(5, 100);
        assertEquals(140, customStack2.pop());
        assertEquals(130, customStack2.pop());
        assertEquals(99, customStack2.pop());
    }
}
