package com.algoexp.arrays;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * Easy : Array : O(n) | O(n)
 * Write a function that takes in a non empty array of distinct numbers and an integer representing a target sum.
 * If any two numbers in the input array sum up to the target sum, the function should return an array of the numbers in
 * in an array, in any order.
 * If no two numbers sum up to the target sum, the function should return an empty array.
 *
 * example :
 *
 */
public class P1TwoNumberSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        HashSet<Integer> set= new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>(0);
        for (int k : array) {
            if (set.contains(targetSum - k)) {
                result.add(targetSum - k);
                result.add(k);
                break;
            }
            set.add(k);
        }
        return result.stream().mapToInt(j -> j).toArray();
       // System.out.println(Arrays.toString(result.stream().mapToInt(j -> j).toArray()));
    }
}
/**
 * Scracth Pad :
 * non empty Array : So need of null check logic.
 * sum = a + b
 * Approach 1: 2 loops check with every other value : result O(n^2) time complexity : O(1) space complexity solution
 * Approach 2: Sort the array & 2 pointer approach solution.
 *              left = 0..n-1 && right = n..1
 *              currentsum = array[left] + array[right];
 *              Check if the currentsum is more than target sum move right pointer (right--) else left (left++).
 * Approach 3: Store the position n value in map look into the map if the value exist or not.
 */