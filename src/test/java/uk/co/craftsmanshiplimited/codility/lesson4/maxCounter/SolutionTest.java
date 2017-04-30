package uk.co.craftsmanshiplimited.codility.lesson4.maxCounter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Henrik on 18/03/2017.
 */
@RunWith(JUnit4.class)
public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testOneElementIncrementOnce() throws Exception {
        assertArrayEquals(solution.solution(1, new int[]{1}), new int[]{1});
    }

    @Test
    public void testOneElementIncrementTwice() throws Exception {
        assertArrayEquals(solution.solution(1, new int[]{1,1}), new int[]{2});
    }

    @Test
    public void testTwoElementIncrementFirst() throws Exception {
        assertArrayEquals(solution.solution(2, new int[]{1}), new int[]{1,0});
    }

    @Test
    public void testTwoElementIncrementSecond() throws Exception {
        assertArrayEquals(solution.solution(2, new int[]{2}), new int[]{0,1});
    }

    @Test
    public void testMaxCounterOfOneElement() throws Exception {
        assertArrayEquals(solution.solution(1, new int[]{2}), new int[]{0});
    }

    @Test
    public void testMaxCounterOfTwoElement() throws Exception {
        assertArrayEquals(solution.solution(2, new int[]{1,2}), new int[]{1,1});
    }

    @Test
    public void testExample() throws Exception {
        assertArrayEquals(solution.solution(5, new int[]{3,4,4,6,1,4,4}), new int[]{3,2,2,4,2});
    }

    @Test
    public void testExampleDoubleMaxCounter() throws Exception {
        assertArrayEquals(solution.solution(5, new int[]{3,4,4,6,6,1,4,4}), new int[]{3,2,2,4,2});
    }
}
