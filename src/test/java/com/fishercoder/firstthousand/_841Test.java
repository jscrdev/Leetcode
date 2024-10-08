package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._841;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _841Test {
    private _841.Solution1 solution1;
    private _841.Solution2 solution2;
    private _841.Solution3 solution3;
    private static List<List<Integer>> rooms;

    @BeforeEach
    public void setup() {
        solution1 = new _841.Solution1();
        solution2 = new _841.Solution2();
        solution3 = new _841.Solution3();
    }

    @Test
    public void test1() {
        rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1));
        rooms.add(Arrays.asList(2));
        rooms.add(Arrays.asList(3));
        rooms.add(Arrays.asList());
        assertEquals(true, solution1.canVisitAllRooms(rooms));
        assertEquals(true, solution2.canVisitAllRooms(rooms));
        assertEquals(true, solution3.canVisitAllRooms(rooms));
    }

    @Test
    public void test2() {
        rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1, 3));
        rooms.add(Arrays.asList(3, 0, 1));
        rooms.add(Arrays.asList(2));
        rooms.add(Arrays.asList(0));
        assertEquals(false, solution1.canVisitAllRooms(rooms));
        assertEquals(false, solution2.canVisitAllRooms(rooms));
        assertEquals(false, solution3.canVisitAllRooms(rooms));
    }
}
