package com.algoexp.arrays;

import java.util.HashMap;
import java.util.List;

/**
 * Difficulty : Category : Solution Complexity
 * Easy :
 * VALIDATE SEQUENCE
 * Given two non-Empty arrays of integers, write a function that determines whether the second array
 * is a sequence of the first one
 * A sequence of numbers is a set of number that aren't necessarily adjacent in the array but that are
 * in the same order as they appear in the array. For instance, the numbers [1,3,4] from a subsequence of
 * array [1,2,3,4], and so do the numbers [2,4].
 * Note that a single number in an array and the array itself are both valid sequences of the the array.
 *
 */
public class P2ValidSubSequence {
    //not working fails for duplicate values cases etc.
    public static boolean isValidSubsequence1(List<Integer> array, List<Integer> sequence) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        for(int a: array){
            map.put(a,i);
            i++;
        }
        boolean result = true;
        for(int j = 0;j < sequence.size(); j++){
            if(map.containsKey(sequence.get(j))){
                int locationInpreviousList = map.get(sequence.get(j));
                if(j<=locationInpreviousList)
                    continue;
                else {
                    result = false;
                    break;
                }
            }
            else{
                //when element does not exists.
                result = false;
            }
        }
        return result;
    }
    public static boolean isValidSubsequence2(List<Integer> array, List<Integer> sequence) {
        int i=0 , j=0 ;
        while(i < array.size() && j < sequence.size()){
            if(sequence.get(j) != array.get(i)){
                i++;
            }else{
                j++;
            }
        }
        return j == sequence.size();
    }

    /**
     * Without Extra Memory
     *
     */

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int i = 0, j = 0;
        while (i < array.size() && j < sequence.size()) {
            if (sequence.get(j) == array.get(i)) {
                j++;
            }
            i++;
        }
        return j == sequence.size();
    }

}
