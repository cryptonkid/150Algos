package com.algoexp.arrays;

/**
 * Given an array of sorted integers return
 * sorted array of square matrix.
 * ex: [-4,-1,3,5]
 * o/p: [1,9,16,25]
 *
 * NOTE: sotring of the final array is not allowed.
 */

public class P3SortedSquareArray {
    /**
     * Trick: 2 pointer Approach
     * IS Compare first and last absolute value and
     * then add the sqyare of the maximum in the array.
     */
    public int[] sortedSquaredArray(int[] array) {
        int output[] = new int[array.length];
        int i = 0, j = array.length-1, k = array.length-1 ;
        while(i <= j)
        {
            if(Math.abs(array[i]) <= (Math.abs(array[j]))){
                int square = array[j]*array[j];
                output[k--] = square;
                j--;
            }else{
                int square = array[i]*array[i];
                output[k--] = square;
                i++;
            }
        }
        return output;
    }
}
