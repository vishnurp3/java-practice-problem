package com.vishnu.problems.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    @DisplayName("Test Two Sum")
    @ParameterizedTest
    @MethodSource("provideTestArguments")
    void testTwoSum(int[] nums, int target, int[] expected) {
        TwoSum solution = new TwoSum();
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    private static Stream<Arguments> provideTestArguments() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1}),
                Arguments.of(new int[]{5}, 5, new int[]{}),
                Arguments.of(new int[]{}, 10, new int[]{}),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6}, 100, new int[]{})
        );
    }
}
