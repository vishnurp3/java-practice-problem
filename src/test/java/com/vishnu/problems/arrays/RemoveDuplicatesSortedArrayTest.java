package com.vishnu.problems.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesSortedArrayTest {
    private final RemoveDuplicatesSortedArray solution = new RemoveDuplicatesSortedArray();

    static Stream<TestCase> testCases() {
        return Stream.of(
                new TestCase(new int[]{1, 1, 2}, 2, new int[]{1, 2}),
                new TestCase(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 5, new int[]{0, 1, 2, 3, 4}),
                new TestCase(new int[]{}, 0, new int[]{}),
                new TestCase(new int[]{1}, 1, new int[]{1}),
                new TestCase(new int[]{1, 2, 3, 4, 5}, 5, new int[]{1, 2, 3, 4, 5})
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    @DisplayName("Test Remove Duplicates from Sorted Array")
    void testRemoveDuplicates(TestCase testCase) {
        int[] nums = testCase.input.clone();
        int length = solution.removeDuplicates(nums);

        assertEquals(testCase.expectedLength, length);
        for (int i = 0; i < length; i++) {
            assertEquals(testCase.expected[i], nums[i]);
        }
    }

    private record TestCase(int[] input, int expectedLength, int[] expected) {
    }
}
