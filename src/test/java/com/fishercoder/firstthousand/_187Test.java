package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._187;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _187Test {
    private _187.Solution1 solution1;
    private _187.Solution2 solution2;
    private static String s;
    private static List<String> expected;

    @BeforeEach
    public void setup() {
        solution1 = new _187.Solution1();
        solution2 = new _187.Solution2();
    }

    @Test
    public void test1() {
        s = "AAAAAAAAAAA";
        System.out.println(s.length());
        expected = new ArrayList<>(Arrays.asList("AAAAAAAAAA"));
        assertEquals(expected, solution1.findRepeatedDnaSequences(s));
        assertEquals(expected, solution2.findRepeatedDnaSequences(s));
    }

    @Test
    public void test2() {
        s = "AAAAAAAAAAAAA";
        System.out.println(s.length());
        expected = new ArrayList<>(Arrays.asList("AAAAAAAAAA"));
        assertEquals(expected, solution1.findRepeatedDnaSequences(s));
        assertEquals(expected, solution2.findRepeatedDnaSequences(s));
    }
}
