package com.fishercoder.solutions.firstthousand;

import com.fishercoder.common.classes.ListNode;
import java.util.PriorityQueue;

public class _23 {
    public static class Solution1 {
        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> a.val - b.val);

            for (ListNode node : lists) {
                if (node != null) {
                    heap.offer(node);
                }
            }

            ListNode pre = new ListNode(-1);
            ListNode temp = pre;
            while (!heap.isEmpty()) {
                ListNode curr = heap.poll();
                temp.next = new ListNode(curr.val);
                temp = temp.next;
                if (curr.next != null) {
                    heap.offer(curr.next);
                }
            }
            return pre.next;
        }
    }
}
