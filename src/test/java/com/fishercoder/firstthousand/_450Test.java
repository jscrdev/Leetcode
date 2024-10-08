package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._450;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _450Test {
    private _450.Solution1 solution1;
    private _450.Solution2 solution2;
    private _450.Solution3 solution3;
    private static TreeNode expected;
    private static TreeNode root;

    @BeforeEach
    public void setup() {
        solution1 = new _450.Solution1();
        solution2 = new _450.Solution2();
        solution3 = new _450.Solution3();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(5, 3, 6, 2, 4, null, 7));
        TreeUtils.printBinaryTree(root);

        expected = TreeUtils.constructBinaryTree(Arrays.asList(5, 4, 6, 2, null, null, 7));
        TreeUtils.printBinaryTree(expected);
        assertEquals(expected, solution1.deleteNode(root, 3));

        expected = TreeUtils.constructBinaryTree(Arrays.asList(5, 2, 6, null, 4, null, 7));
        TreeUtils.printBinaryTree(expected);
        assertEquals(expected, solution2.deleteNode(root, 3));

        expected = TreeUtils.constructBinaryTree(Arrays.asList(5, 4, 6, 2, null, null, 7));
        assertEquals(expected, solution3.deleteNode(root, 3));
    }
}
