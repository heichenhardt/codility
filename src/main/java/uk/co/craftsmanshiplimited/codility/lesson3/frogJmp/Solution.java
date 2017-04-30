package uk.co.craftsmanshiplimited.codility.lesson3.frogJmp;

/**
 * Created by Henrik on 26/02/2017.
 */
public class Solution {
    public int solution(int X, int Y, int D) {
        int distance = Y - X;
        if(distance % D == 0) {
            return distance / D;
        } else {
           return (distance / D) + 1;
        }
    }
}
