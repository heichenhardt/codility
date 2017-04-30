package uk.co.craftsmanshiplimited.codility.lesson4.frogriverone;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Henrik on 18/03/2017.
 */
@RunWith(JUnit4.class)
public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testOneStep() throws Exception {
        assertThat(solution.solution(1, new int[]{1}), is(0));
    }

    @Test
    public void testTwoStep() throws Exception {
        assertThat(solution.solution(2, new int[]{1,2}), is(1));
    }

    @Test
    public void testTwoStepWithDuplicates() throws Exception {
        assertThat(solution.solution(2, new int[]{1,1,2}), is(2));
    }

    @Test
    public void testTwoStepNoJump() throws Exception {
        assertThat(solution.solution(2, new int[]{1,1,1}), is(-1));
    }
}
