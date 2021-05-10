package com.algoexp.arrays;

/**
 * Monotonic :
 */
public class ArrayP8 {
    //This one fails for if duplicate values are present
    public static boolean isMonotonic_failed(int[] array) {
        //Note find the type of behaviour first with intial 2 elements
        // 			then same behaviour should be present for the the next ones
        int len = array.length;
        if(len <= 2)
            return true;
        boolean returnValue = true;
        if(array[0]<array[1]){
            for(int i = 1,j=i+1;i<len-1;i++,j++){
                if(array[i]>array[j]){
                    returnValue = false;
                    break;
                }
            }
        }else {
            for(int i = 1,j=i+1;i<len-1;i++,j++){
                if(array[i]<array[j]){
                    returnValue = false;
                    break;
                }
            }
        }
        return returnValue;
    }

    public static boolean isMonotonic(int[] array) {
        if(array.length < 2)
            return true;
        boolean increasing = true;
        boolean decreasing = true;
        for(int i = 0 ;i<array.length-1;i++){
            if(array[i] < array[i+1]){
                decreasing = false;
            }
            if(array[i] > array[i+1]){
                increasing = false;
            }
        }
        return increasing || decreasing;
    }

}
