package com.fishercoder.firstthousand;

import static org.assertj.core.api.Assertions.assertThat;

import com.fishercoder.solutions.firstthousand._784;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _784Test {
    private _784.Solution1 solution1;
    private _784.Solution2 solution2;
    private static List<String> expected;

    @BeforeEach
    public void setup() {
        solution1 = new _784.Solution1();
        solution2 = new _784.Solution2();
    }

    @Test
    public void test1() {
        expected = Arrays.asList("a1b2", "a1B2", "A1b2", "A1B2");
        assertThat(expected).hasSameElementsAs(solution1.letterCasePermutation("a1b2"));
        assertThat(expected).hasSameElementsAs(solution2.letterCasePermutation("a1b2"));
    }

    @Test
    public void test2() {
        expected = Arrays.asList("3z4", "3Z4");
        assertThat(expected).hasSameElementsAs(solution1.letterCasePermutation("3z4"));
        assertThat(expected).hasSameElementsAs(solution2.letterCasePermutation("3z4"));
    }

    @Test
    public void test3() {
        expected = Arrays.asList("12345");
        assertThat(expected).hasSameElementsAs(solution1.letterCasePermutation("12345"));
        assertThat(expected).hasSameElementsAs(solution2.letterCasePermutation("12345"));
    }
}
