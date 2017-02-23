package uk.co.craftsmanshiplimited.codility.lesson2.OddOccurrencesInArray;

import java.util.Arrays;

/**
 * Created by Henrik on 19/02/2017.
 */
public class Solution {

    public int solution(int[] A) {
        Arrays.sort(A);
        for(int index=1; index<A.length+1; index=index+2) {
            int previous = A[index-1];
            if(index == A.length || A[index] != previous) {
                return previous;
            }
        }
        return 0;
    }
}
