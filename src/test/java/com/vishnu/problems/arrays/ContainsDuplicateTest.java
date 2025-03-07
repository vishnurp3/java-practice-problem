package com.vishnu.problems.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainsDuplicateTest {

    @ParameterizedTest
    @MethodSource("provideTestArguments")
    @DisplayName("Test Contains Duplicate")
    void testContainsDuplicate(int[] input, boolean expected) {
        assertEquals(expected, ContainsDuplicate.containsDuplicate(input));
    }

    private static Stream<Arguments> provideTestArguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, false),
                Arguments.of(new int[]{1, 2, 3, 1}, true),
                Arguments.of(new int[]{1, 1, 1, 1}, true),
                Arguments.of(new int[]{}, false),
                Arguments.of(new int[]{-1, -2, -3, -4}, false),
                Arguments.of(new int[]{1000000, 2000000, 3000000, 1000000}, true),
                Arguments.of(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE}, false)
        );
    }
}
