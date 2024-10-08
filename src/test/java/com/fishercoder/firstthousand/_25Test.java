package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.ListNode;
import com.fishercoder.common.utils.LinkedListUtils;
import com.fishercoder.solutions.firstthousand._25;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _25Test {
    private _25.Solution1 solution1;
    private _25.Solution2 solution2;
    private _25.Solution3 solution3;
    private static ListNode expected;
    private static ListNode head;
    private static int k;

    @BeforeEach
    public void setup() {
        solution1 = new _25.Solution1();
        solution2 = new _25.Solution2();
        solution3 = new _25.Solution3();
    }

    @Test
    public void test1() {
        head = LinkedListUtils.contructLinkedList(new int[] {1, 2, 3, 4, 5});
        k = 2;
        expected = LinkedListUtils.contructLinkedList(new int[] {2, 1, 4, 3, 5});
        assertEquals(expected, solution1.reverseKGroup(head, k));
    }

    @Test
    public void test2() {
        head = LinkedListUtils.contructLinkedList(new int[] {1, 2, 3, 4, 5, 6, 7});
        expected = LinkedListUtils.contructLinkedList(new int[] {4, 3, 2, 1, 5, 6, 7});
        assertEquals(expected, solution2.reverseKGroup(head, 4));
    }

    @Test
    public void test3() {
        head = LinkedListUtils.contructLinkedList(new int[] {1, 2, 3, 4, 5, 6, 7});
        expected = LinkedListUtils.contructLinkedList(new int[] {4, 3, 2, 1, 5, 6, 7});
        assertEquals(expected, solution3.reverseKGroup(head, 4));
    }
}
