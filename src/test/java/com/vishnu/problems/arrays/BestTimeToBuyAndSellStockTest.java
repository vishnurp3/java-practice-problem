package com.vishnu.problems.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockTest {

    @DisplayName("Test maxProfit")
    @ParameterizedTest
    @MethodSource("provideTestArguments")
    void testMaxProfit(int[] prices, int expected) {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        assertEquals(expected, solution.maxProfit(prices));
    }

    private static Stream<Arguments> provideTestArguments() {
        return Stream.of(
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 5),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 4),
                Arguments.of(new int[]{7}, 0),
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{3, 3, 3, 3, 3}, 0)
        );
    }
}
