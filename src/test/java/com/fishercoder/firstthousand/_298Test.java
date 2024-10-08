package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._298;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class _298Test {
    private _298.Solution1 solution1;
    private _298.Solution2 solution2;

    @Test
    public void test1() {
        solution1 = new _298.Solution1();
        solution2 = new _298.Solution2();
        TreeNode root =
                TreeUtils.constructBinaryTree(Arrays.asList(1, null, 3, 2, 4, null, null, null, 5));
        assertEquals(3, solution1.longestConsecutive(root));
        assertEquals(3, solution2.longestConsecutive(root));
    }

    @Test
    public void test2() {
        solution1 = new _298.Solution1();
        solution2 = new _298.Solution2();
        TreeNode root = TreeUtils.constructBinaryTree(Arrays.asList(2, null, 3, 2, null, 1));
        TreeUtils.printBinaryTree(root);
        assertEquals(2, solution1.longestConsecutive(root));
        assertEquals(2, solution2.longestConsecutive(root));
    }

    @Test
    public void test3() {
        solution1 = new _298.Solution1();
        solution2 = new _298.Solution2();
        TreeNode root =
                TreeUtils.constructBinaryTree(
                        Arrays.asList(1, 2, 3, null, null, 4, 4, null, 5, null, null, 6));
        TreeUtils.printBinaryTree(root);
        assertEquals(4, solution1.longestConsecutive(root));
        assertEquals(4, solution2.longestConsecutive(root));
    }
}
