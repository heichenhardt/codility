package uk.co.craftsmanshiplimited.codility.lesson4.frogriverone;

/**
 * Created by Henrik on 18/03/2017.
 */
public class Solution {
    public int solution(int X, int[] A) {
        final boolean[] steps = new boolean[X];
        for(int index=0; index<A.length; index++) {
            boolean hasLeaf = steps[A[index]-1];
            if(!hasLeaf) {
                steps[A[index]-1] = true;
                X--;
                if(X==0) {
                    return index;
                }
            }
        }
        return -1;
    }
}
