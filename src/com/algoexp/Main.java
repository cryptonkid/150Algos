package com.algoexp;

import com.algoexp.arrays.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main_array_easy(String[] args) {
   //     System.out.println(Arrays.toString(ArrayP1.twoNumberSum(new int[]{3,5,-4,8,11,1,-1,6},6)));
   //     System.out.println(ArrayP2.isValidSubsequence(Arrays.asList(1,2,3,4),Arrays.asList(2,4)));
   //    System.out.println(ArrayP2.isValidSubsequence(Arrays.asList(1,2,3,4),Arrays.asList(4,2)));
   //     System.out.println(ArrayP2.isValidSubsequence(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10),Arrays.asList(5, 1, 22, 22, 6, -1, 8, 10)));
        /**
         * for p4

        ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
        ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("HTML", "C#"));
        ArrayList<String> competition2 = new ArrayList<String>(Arrays.asList("C#", "Python"));
        ArrayList<String> competition3 = new ArrayList<String>(Arrays.asList("Python", "HTML"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 0, 1));
        System.out.println(new ArrayP4().tournamentWinner(competitions,results));
         */

    }

    public static void main_p5(String args[]){
       // Solution for P6
        //List<Integer[]> output = ArrayP6.threeNumberSum(new int[] {12, 3, 1, 2, -6, 5, -8, 6}, 0);
        //List<Integer[]> output = ArrayP6.threeNumberSum(new int[]{1,2,3},6);
        //System.out.println(ArrayP2.isValidSubsequence(Arrays.asList(1,2,3,4),Arrays.asList(4,2)));
    }

    public static void main(String[] args) {
      //  Arrayp7.smallestDifference(new int[] {-1, 5, 10, 20, 28, 3}, new int[] {26, 134, 135, 15, 17});
        ArrayP8.isMonotonic(new int[]{1, 1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 8, 9, 10, 11});
    }
}
