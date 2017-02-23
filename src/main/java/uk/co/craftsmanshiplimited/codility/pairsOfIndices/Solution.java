package uk.co.craftsmanshiplimited.codility.pairsOfIndices;

/**
 * Created by Henrik on 19/02/2017.
 */
public class Solution {

    public static final int MAX = 1_000_000_000;

    public int solution(int[] A) {
        if(A.length <= 1) {
            return 0;
        }
        int count = 0;
        for(int indexLeft=0; indexLeft<A.length; indexLeft++) {
            int current = A[indexLeft];
            if(indexLeft+1<A.length) {
                for(int indexRight = indexLeft+1; indexRight<A.length; indexRight++) {
                    if(current == A[indexRight]) {
                        count++;
                        if(count > MAX) {
                            return MAX;
                        }
                    }
                }
            }
        }
        return count;
    }
}
