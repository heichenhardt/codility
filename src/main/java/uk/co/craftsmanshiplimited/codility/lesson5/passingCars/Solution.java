package uk.co.craftsmanshiplimited.codility.lesson5.passingCars;

import java.util.Arrays;

/**
 * Created by Henrik on 19/03/2017.
 */
public class Solution {

    public int solution(int[] A) {
        int west = (int)Arrays.stream(A).filter(x-> x==1).count();
        int count = 0;
        for(int index=0; index<A.length; index++) {
            if(A[index] == 1) {
                west--;
            } else if(A[index] == 0) {
                count+=west;
                if(count > 1_000_000_000) {
                    return -1;
                }
            }
        }
        return count;
    }
}
