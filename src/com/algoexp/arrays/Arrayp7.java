package com.algoexp.arrays;

import java.util.Arrays;

public class Arrayp7 {
    public static int[] smallestDifference_part1(int[] arrayOne, int[] arrayTwo) {
        int MIN_VALUE = Integer.MAX_VALUE;
        int len1 = arrayOne.length;
        int len2 = arrayTwo.length;
        int[] solution = new int[2];
        for(int i=0;i< len1;i++){
//            boolean isNegative = (arrayOne[i] < 0) ? true : false;
            for(int j=0;j<len2;j++){
//                boolean isNegative2 = (arrayTwo[j] < 0) ? true : false;
                int diff = 0;
//                if(isNegative == isNegative2){
//                    diff = Math.abs(arrayOne[i] - arrayTwo[j]);
//                }else{
                    diff = Math.max(arrayOne[i],arrayTwo[i]) - Math.min(arrayOne[i],arrayTwo[j]);
//                }
                if(diff < MIN_VALUE) {
                    MIN_VALUE = diff;
                    solution[0] = arrayOne[i];
                    solution[1] = arrayTwo[j];
                }
            }
        }
            return solution;
    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int MIN_VALUE = Integer.MAX_VALUE;
        int len1 = arrayOne.length;
        int len2 = arrayTwo.length;
        int[] solution = new int[2];
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        for(int i=0, j=0;i< len1 && j < len2;){
            int diff = Math.max(arrayOne[i],arrayTwo[j]) - Math.min(arrayOne[i],arrayTwo[j]);
            if(diff == 0 || diff < MIN_VALUE) {
                MIN_VALUE = diff;
                solution[0] = arrayOne[i];
                solution[1] = arrayTwo[j];
                if (diff == 0)
                    break;
            }
            int temp = (arrayOne[i] < arrayTwo[j]) ? i++ : j++;
        }
        return solution;
    }
}
