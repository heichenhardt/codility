package uk.co.craftsmanshiplimited.codility.lesson4.maxCounter;

import java.util.Arrays;

/**
 * Created by Henrik on 18/03/2017.
 */
public class Solution {

    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        for(int index=0; index<A.length; index++) {
            if(A[index] <= N) {
                counters[A[index]-1]++;
            } else if(index > 0 && A[index-1] == N) {
                continue;
            } else {
                int max = Arrays.stream(counters).max().orElse(0);
                Arrays.setAll(counters, x-> max);
            }
        }
        return counters;
    }
}
