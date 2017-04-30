package uk.co.craftsmanshiplimited.codility.lesson5.passingCars;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/**
 * Created by Henrik on 19/03/2017.
 */
@RunWith(JUnit4.class)
public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testEmpty() throws Exception {
        assertEquals(0, solution.solution(new int[]{1}));
        assertEquals(0, solution.solution(new int[]{0}));
        assertEquals(0, solution.solution(new int[]{1,0}));
    }

    @Test
    public void testOneCarPassing() throws Exception {
        assertEquals(1, solution.solution(new int[]{0,1}));
    }

    @Test
    public void testTwoCarPassing() throws Exception {
        assertEquals(2, solution.solution(new int[]{0,1,1}));
    }

    @Test
    public void testTwoCarPassing2() throws Exception {
        assertEquals(2, solution.solution(new int[]{0,0,1}));
    }

    @Test
    public void testIgnoreLeadingWestGoingCars() throws Exception {
        assertEquals(2, solution.solution(new int[]{1,0,0,1}));
    }

    @Test
    public void testExample() throws Exception {
        assertEquals(5, solution.solution(new int[]{0,1,0,1,1}));
    }

    @Test
    public void testExtreme() throws Exception {
        int[] input = new int[100_000];
        Arrays.setAll(input, x-> x % 2 );
        assertEquals(-1, solution.solution(input));
    }
}
