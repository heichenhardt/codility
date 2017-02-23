package uk.co.craftsmanshiplimited.codility.lesson2.CyclicRotation;

/**
 * Created by Henrik on 19/02/2017.
 */
public class Solution {

    public int[] solution(int[] A, int K) {
        if(A.length <= 1 || K == 0) {
            return A;
        }
        int length = A.length;
        int[] result = new int[length];
        for(int index=0; index<length; index++) {
            result[(index + K) % length ] = A[index];
        }
        return result;
    }
}
