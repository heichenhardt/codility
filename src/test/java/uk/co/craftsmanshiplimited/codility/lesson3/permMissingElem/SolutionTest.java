package uk.co.craftsmanshiplimited.codility.lesson3.permMissingElem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

/**
 * Created by Henrik on 26/02/2017.
 */
@RunWith(JUnit4.class)
public class SolutionTest {

    public static final int COUNT = 99999;
    private Solution solution = new Solution();

    @Test
    public void testEmpty() throws Exception {
          assertEquals(1, solution.solution(new int[]{}));
    }

    @Test
    public void testElementInFront() throws Exception {
        assertEquals(1, solution.solution(new int[]{2,3}));
    }

    @Test
    public void testElementInBack() throws Exception {
        assertEquals(3, solution.solution(new int[]{1,2}));
    }

    @Test
    public void testElementInMiddle() throws Exception {
        assertEquals(2, solution.solution(new int[]{1,3}));
    }

    @Test
    public void testExample() throws Exception {
        assertEquals(4, solution.solution(new int[]{2,3,1,5}));
    }

}
