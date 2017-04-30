package uk.co.craftsmanshiplimited.codility.lesson5.countDiv;

/**
 * Created by Henrik on 19/03/2017.
 */
public class Solution {

    public int solution(int A, int B, int K) {
        int leftSide;
        if(A==0) {
            leftSide = 0;
        } else {
            leftSide = (A-1) / K;
        }
        int result = B / K - leftSide;

        //Zero divided by anything has mod 0
        if(A==0) {
            result++;
        }
        return result;
    }
}
