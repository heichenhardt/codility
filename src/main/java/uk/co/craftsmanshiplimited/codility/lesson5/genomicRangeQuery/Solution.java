package uk.co.craftsmanshiplimited.codility.lesson5.genomicRangeQuery;

/**
 * Created by Henrik on 19/03/2017.
 */
public class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        char[] chars = S.toCharArray();
        int sumA=0;
        int sumC=0;
        int sumG=0;
        int sumT=0;
        int[] sumArrayA = new int[chars.length];
        int[] sumArrayC = new int[chars.length];
        int[] sumArrayG = new int[chars.length];
        int[] sumArrayT = new int[chars.length];
        for(int index=0; index<chars.length; index++) {
            int inputFactor = getInputFactor(chars[index]);
            if(inputFactor == 1) {
                sumA++;
            } else if(inputFactor == 2) {
                sumC++;
            } else if(inputFactor == 3) {
                sumG++;
            } else if(inputFactor == 4) {
                sumT++;
            }
            sumArrayA[index] = sumA;
            sumArrayC[index] = sumC;
            sumArrayG[index] = sumG;
            sumArrayT[index] = sumT;
        }

        for(int index=0; index<P.length; index++) {
            int start = P[index];
            int end = Q[index];

            if(sumArrayA[end] - ((start == 0) ? 0 : sumArrayA[start-1]) > 0) {
                result[index] = 1;
            } else if(sumArrayC[end] - ((start == 0) ? 0 : sumArrayC[start-1]) > 0) {
                result[index] = 2;
            } else if(sumArrayG[end] - ((start == 0) ? 0 : sumArrayG[start-1]) > 0) {
                result[index] = 3;
            } else if(sumArrayT[end] - ((start == 0) ? 0 : sumArrayT[start-1]) > 0) {
                result[index] = 4;
            }
        }
        return result;
    }

    private int getMin(int[] inputFactors, int start, int end) {
        int min = 4;
        for(int index=start; index<=end; index++) {
            min = Math.min(inputFactors[index], min);
            if(min == 1) {
                return min;
            }
        }
        return min;
    }

    private static int getInputFactor(int k) {
        switch (k) {
            case 'A': return 1;
            case 'C': return 2;
            case 'G': return 3;
            case 'T': return 4;
            default: throw new IllegalArgumentException("Character '"+k+"' not recognized");
        }
    }
}
