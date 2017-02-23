package uk.co.craftsmanshiplimited.codility.pairsOfIndices;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Henrik on 23/02/2017.
 */
public class SolutionEfficient {

    public static final int MAX = 1_000_000_000;

    public int solution(int[] A) {
        final Map<Integer, Long> numberOfPairs =
                Arrays.stream(A)
                        .mapToObj(x -> (Integer) x)
                        .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        long sum = numberOfPairs.values().stream().map(x -> faculaty(x)).mapToLong(x -> (Long) x).sum();

        return sum < 1_000_000_000 ? (int)sum : 1_000_000_000;
    }

    private Long faculaty(Long x) {
        return ((x-1)*x)/2;
    }
}
