package uk.co.craftsmanshiplimited.codility.lesson3.permMissingElem;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Henrik on 26/02/2017.
 */
public class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        for(int index=0; index<A.length; index++) {
            if(A[index] != index+1) {
                return index+1;
            }
        }
        return A.length+1;
    }
}
