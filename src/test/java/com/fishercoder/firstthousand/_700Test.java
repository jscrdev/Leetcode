package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.classes.TreeNode;
import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._700;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _700Test {
    private _700.Solution1 solution1;
    private static TreeNode root;
    private static TreeNode expected;

    @BeforeEach
    public void setup() {
        solution1 = new _700.Solution1();
    }

    @Test
    public void test1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(4, 2, 7, 1, 3));
        expected = TreeUtils.constructBinaryTree(Arrays.asList(2, 1, 3));
        assertEquals(expected, solution1.searchBST(root, 2));
    }
}
