package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.secondthousand._1448;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class _1448Test {
    private _1448.Solution1 solution1;
    private static TreeNode root;

    @Test
    public void test1() {
        solution1 = new _1448.Solution1();
        root = TreeUtils.constructBinaryTree(Arrays.asList(3, 1, 4, 3, null, 1, 5));
        assertEquals(4, solution1.goodNodes(root));
    }

    @Test
    public void test2() {
        solution1 = new _1448.Solution1();
        root = TreeUtils.constructBinaryTree(Arrays.asList(3, 3, null, 4, 2));
        assertEquals(3, solution1.goodNodes(root));
    }

    @Test
    public void test3() {
        solution1 = new _1448.Solution1();
        root = TreeUtils.constructBinaryTree(Arrays.asList(1));
        assertEquals(1, solution1.goodNodes(root));
    }

    @Test
    public void test4() {
        solution1 = new _1448.Solution1();
        root = TreeUtils.constructBinaryTree(Arrays.asList(2, null, 4, 10, 8, null, null, 4));
        assertEquals(4, solution1.goodNodes(root));
    }

    @Test
    public void test5() {
        solution1 = new _1448.Solution1();
        root = TreeUtils.constructBinaryTree(Arrays.asList(9, null, 3, 6));
        assertEquals(1, solution1.goodNodes(root));
    }
}
