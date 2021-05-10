package com.algoexp.arrays;

/**
 * Non-Constructable Change
 * Difficulty : Category : Best Solution Complexity
 * Easy : Arrays : O(nlogn) space :O(1)
 */

import java.util.Arrays;

/**
 * Find minimum non constructable coin
 * sample
 * i/p : [87]    o/p : 1
 * i/p : [1,2,4] o/p : 8
 * i/p : [2,4,6] o/p : 1
 */
public class ArrayP5 {
    public int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int sum = 0;
        for (int value : coins) {
            if (value > sum + 1) {
                return sum + 1;
            }
            sum = sum + value;
        }
        return sum + 1;
    }
}
