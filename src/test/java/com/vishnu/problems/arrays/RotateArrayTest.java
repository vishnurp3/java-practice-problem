package com.vishnu.problems.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateArrayTest {

    private static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{new int[]{1, 2, 3, 4, 5, 6, 7}, 3, new int[]{5, 6, 7, 1, 2, 3, 4}},
                new Object[]{new int[]{-1, -100, 3, 99}, 2, new int[]{3, 99, -1, -100}},
                new Object[]{new int[]{1}, 1, new int[]{1}},
                new Object[]{new int[]{}, 5, new int[]{}},
                new Object[]{new int[]{1, 2}, 3, new int[]{2, 1}},
                new Object[]{new int[]{1, 2, 3, 4, 5}, 0, new int[]{1, 2, 3, 4, 5}}
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    @DisplayName("Rotate Array Tests")
    void testRotateArray(int[] nums, int k, int[] expected) {
        RotateArray solution = new RotateArray();
        solution.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }
}
