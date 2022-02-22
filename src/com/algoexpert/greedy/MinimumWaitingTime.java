package com.algoexpert.greedy;
import java.util.*;

public class MinimumWaitingTime {
    public int minimumWaitingTime(int[] queries) {
        Arrays.sort(queries);
        int minimumWaitingTime = 0;
        int n = queries.length;
        int count = n-1;
        for(int i=0;i<n-1;i++)
        {
            minimumWaitingTime += queries[i]*count;
            count--;
        }
        return minimumWaitingTime;
    }
}
