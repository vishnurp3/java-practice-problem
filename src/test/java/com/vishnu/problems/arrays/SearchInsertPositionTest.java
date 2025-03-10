package com.vishnu.problems.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInsertPositionTest {

    static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{new int[]{1, 3, 5, 6}, 5, 2},
                new Object[]{new int[]{1, 3, 5, 6}, 2, 1},
                new Object[]{new int[]{1, 3, 5, 6}, 7, 4},
                new Object[]{new int[]{1, 3, 5, 6}, 0, 0},
                new Object[]{new int[]{1}, 0, 0},
                new Object[]{new int[]{1}, 2, 1}
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    @DisplayName("Search Insert Position Test")
    void testSearchInsert(int[] nums, int target, int expected) {
        SearchInsertPosition solution = new SearchInsertPosition();
        assertEquals(expected, solution.searchInsert(nums, target));
    }
}
