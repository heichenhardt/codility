package uk.co.craftsmanshiplimited.codility.pairsOfIndices;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import uk.co.craftsmanshiplimited.codility.lesson2.OddOccurrencesInArray.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by Henrik on 19/02/2017.
 */
@RunWith(JUnit4.class)
public class SolutionTest {
    private SolutionEfficient solution = new SolutionEfficient();


    @Test
    public void testEmptyArray() throws Exception {
        assertEquals(0, solution.solution(new int[]{}));
    }

    @Test
    public void testArrayOneElement() throws Exception {
        assertEquals(0, solution.solution(new int[]{1}));
    }

    @Test
    public void testArrayTwoElementNoMatch() throws Exception {
        assertEquals(0, solution.solution(new int[]{1,2}));
    }

    @Test
    public void testArrayTwoElementOneMatch() throws Exception {
        assertEquals(1, solution.solution(new int[]{1,1}));
    }

    @Test
    public void testArrayThreeElementThreeMatch() throws Exception {
        assertEquals(3, solution.solution(new int[]{1,1,1}));
    }

    @Test
    public void testArraySixElementFourMatch() throws Exception {
        assertEquals(4, solution.solution(new int[]{3,5,6,3,3,5}));
    }

}
