package com.algoexp.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayP6 {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        int len = array.length;
        List<Integer[]> list = new ArrayList<>();
        Arrays.sort(array);
        for(int i = 0; i < len-2; i++){
            // j : left pointer after i
            // k : right pointer of the array
            for(int j = i+1,k=len-1;j<k;) {
                int sum = array[i] + array[j] + array[k];
                if (targetSum == sum) {
                    Integer[] subList = new Integer[3];
                    subList[0] = array[i];
                    subList[1] = array[j];
                    subList[2] = array[k];
                    list.add(subList);
                    j++;k--;
                } else if(targetSum > sum){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return list;
    }
}
/**
 * difficulty : Time complexity :
 * medium : 0(n^2)  : O(n)
 * Write a function that takes in a non empty array of distinct intergers represnting a target sum.
 * The function should fina all the triplets in the array that sum up to the target sum and return a
 * two-dimensional array of all these triplets.
 * The number in each triplet should be ordered in ascending order.
 * If there is no three numbers sum up to the target sum, the fucntion should return an empty array.
 */