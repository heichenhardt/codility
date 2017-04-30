package uk.co.craftsmanshiplimited.codility.lesson3.frogJmp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

/**
 * Created by Henrik on 26/02/2017.
 */
@RunWith(JUnit4.class)
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void testNoJump() throws Exception {
        assertEquals(0, solution.solution(1,1,1));
    }

    @Test
    public void testOneJump() throws Exception {
        assertEquals(1, solution.solution(1,2,1));
    }

    @Test
    public void testTwoJump() throws Exception {
        assertEquals(2, solution.solution(1,3,1));
    }

    @Test
    public void testJumpOver() throws Exception {
        assertEquals(2, solution.solution(1,4,2));
    }

    @Test
    public void testExample() throws Exception {
        assertEquals(3, solution.solution(10,85,30));
    }
}
