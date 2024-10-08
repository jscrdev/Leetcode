package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._222;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _222Test {
    private _222.Solution1 solution1;
    private _222.Solution2 solution2;
    private static int expected;
    private static TreeNode root;

    @BeforeEach
    public void setup() {
        solution1 = new _222.Solution1();
        solution2 = new _222.Solution2();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3));
        TreeUtils.printBinaryTree(root);
        expected = 3;
        assertEquals(expected, solution1.countNodes(root));
        assertEquals(expected, solution2.countNodes(root));
    }

    @Test
    public void test2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, 5, 6));
        TreeUtils.printBinaryTree(root);
        expected = 6;
        assertEquals(expected, solution1.countNodes(root));
        assertEquals(expected, solution2.countNodes(root));
    }

    @Test
    public void test3() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(0));
        TreeUtils.printBinaryTree(root);
        expected = 1;
        assertEquals(expected, solution1.countNodes(root));
        assertEquals(expected, solution2.countNodes(root));
    }
}
