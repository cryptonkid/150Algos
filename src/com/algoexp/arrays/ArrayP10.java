package com.algoexp.arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Longest Peak :
 *
 *
 * Write a function that takes in an array of integers and returns the "length" of the longest peak in the array.
 *
 * A peak is defined as adjacent integers in the array that are "strictly" increasing until they reach a tip (the highest value in the peak)
 * at which point they become "strictly" decreasing. At least three integers are required to form a peak.
 *
 * For example, the intergers 1,4,10,2 form a peak but the intergers 4,0,10 don't and neither do the intergers 1,2,2,0.
 * Similarly, the integers 1,2,3 dont form a peak because there aren't any strictly decreasing integers after the 3.
 *
 * i/p : [1,2,3,3,4,0,10,6,5,-1,-3,2,3]
 * o/p : 6 // 0,10,6,5,-1,-3
 */
public class ArrayP10 {
    public static void main(String[] args) {
        System.out.println(ArrayP10.longestPeak(new int[]{1,2,3,3,4,0,10,6,5,-1,-3,2,3}));
    }
    //This question is the combination of find the peaks of the array
    //Then find the length of the array.
    public static int longestPeak(int[] array) {
        int peaklength = -1;
        if(array.length<3)
            return peaklength;
        Map<Integer,Integer> peakLoationTracker = new HashMap<>();
        int count = 0;
        for(int i =1;i<array.length;i++){
            if(array[i-1] < array[i] && array[i] < array[i+1])
                peakLoationTracker.put(count++,i);

        }
        return peaklength;
    }
}
