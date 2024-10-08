package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.utils.TreeUtils;
import com.fishercoder.solutions.firstthousand._617;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _617Test {
    private _617.Solution1 solution1;
    private _617.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _617.Solution1();
        solution2 = new _617.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(
                TreeUtils.constructBinaryTree(Arrays.asList(3, 4, 5, 5, 4, null, 7)),
                solution1.mergeTrees(
                        TreeUtils.constructBinaryTree(Arrays.asList(1, 3, 2, 5)),
                        TreeUtils.constructBinaryTree(Arrays.asList(2, 1, 3, null, 4, null, 7))));
    }

    @Test
    public void test2() {
        assertEquals(
                TreeUtils.constructBinaryTree(Arrays.asList(3, 4, 5, 5, 4, null, 7)),
                solution2.mergeTrees(
                        TreeUtils.constructBinaryTree(Arrays.asList(1, 3, 2, 5)),
                        TreeUtils.constructBinaryTree(Arrays.asList(2, 1, 3, null, 4, null, 7))));
    }
}
