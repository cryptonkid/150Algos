package com.algoexp.arrays;

/**
 * Difficulty: space Complexity : Time Complexity
 * medium : O(n) : O(n)
 * Given an array of integers between 1 and n, inclusive, where n is the length of the array, write
 * a function that returns the first integer that appears more than once.(when the array is read from left to right)
 *
 * If no integers are present return -1
 * Note you are allowed to mutate the input array.
 */
public class Array12 {
    public int firstDuplicateValue(int[] array) {
        int len = array.length;
        int value = -1;
        int i = 0;
        for( ;i< len;i++){
            value =  Math.abs(array[i]);
            if(array[value-1] < 0){
                break;
            }else{
                array[value-1] = -1 * array[value-1];
            }
        }
        if(i == len){
            value = -1;
            return value;
        }
        return value;
    }
}
/**
 * It can be solved using mulitple apporches :
 *  1) HashMap etc
 *  2) Array : make the location of the visited not negative. if it becomes +ve or is found to be already negative then that is the first
 *  element which is duplicate when going from left to right.
 */