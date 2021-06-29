package com.algoexp.arrays;

import org.junit.Test;

import junit.framework.Assert;

import java.util.*;
/**
 * Sprial Traversal :
 * Difficulty : Space Complexity : Time Complexity
 * medium :
 * input : [
 *   [1, 2, 3, 4],
 *   [12, 13, 14, 5],
 *   [11, 16, 15, 6],
 *   [10, 9, 8, 7]
 * ]
 *
 * output : [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16]
 */
public class ArrayP9 {
    @Test
    public void TestCase1() {
        var input =
                new int[][] {
                        {1, 2, 3, 4},
                        {12, 13, 14, 5},
                        {11, 16, 15, 6},
                        {10, 9, 8, 7},
                };
        var expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        var actual = ArrayP9.spiralTraverse(input);
        Assert.assertEquals(expected,Arrays.asList(actual));
    }
    public static List<Integer> spiralTraverse(int[][] array) {
        ArrayList<Integer> input = new ArrayList<Integer>();
        int row = array.length;
        int col = array[0].length;
        for(int count = 0;  count < row*col; count++){

        }
        return input;
    }
}
