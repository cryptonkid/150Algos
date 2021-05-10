package com.algoexp.arrays;

public class ArrayP3 {
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
