package com.algoexp.arrays;

/**
 * Array of products : write a function that takes non empty array of integers
 * and returns an array of the same length, where each element in the output array is
 * an product of every other number in the input array.
 *
 */
public class Array11 {
    public int[] arrayOfProducts(int[] array) {
        //input in array can be zero
        int len = array.length;
        int max_product = 1;
        int zeroCount = 0;
        for(int i=0;i<len;i++){
            if(array[i] == 0 ){
                zeroCount++;
                continue;
            }
            max_product = max_product * array[i];
        }
        for(int i=0;i<len;i++){
            //If continas one or more zero
            if(zeroCount > 0){
                if(zeroCount > 1){
                    array[i] = 0;
                    continue;
                }else{
                    if(array[i] == 0){
                        array[i] = max_product;
                        continue;
                    }else {
                        array[i] = 0;
                    }
                }
            }else{
                array[i] =  max_product / array[i];
            }

        }
        return array;
    }

    //Better and cleaner approach: same complexity but clean algo
    //Using 2 pointer thinking
    public int[] arrayOfProducts_2(int[] array) {
        int products[] = new int[array.length];

        //left traversal
        int leftRunningProduct = 1;
        for(int i=0;i<array.length;i++){
            products[i] = leftRunningProduct ;
            leftRunningProduct = leftRunningProduct * array[i];
        }

        //right traversal
        int rightRunningProduct = 1;
        for(int i=array.length-1;i>=0;i--){
            products[i] = products[i]* rightRunningProduct;
            rightRunningProduct = rightRunningProduct * array[i];
        }

        return products;
    }

    public static void main(String[] args) {
        System.out.println(new Array11().arrayOfProducts(new int[]{0,1,2}));
    }
}
