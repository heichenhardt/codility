package uk.co.craftsmanshiplimited.codility.lesson5.countDiv;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Henrik on 19/03/2017.
 */
@RunWith(JUnit4.class)
public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testAllEquals() throws Exception {
        assertThat(solution.solution(1, 1, 1), is(1));
    }

    @Test
    public void testEmpty() throws Exception {
        assertThat(solution.solution(0, 0, 1), is(1));
    }

    @Test
    public void testRangeOfOneZeroBased() throws Exception {
        assertThat(solution.solution(0, 1, 1), is(2));
    }

    @Test
    public void testRangeOfOneOffsetOne() throws Exception {
        assertThat(solution.solution(1, 2, 1), is(2));
    }

    @Test
    public void testRangeOfTwoZeroBased() throws Exception {
        assertThat(solution.solution(0, 2, 1), is(3));
    }

    @Test
    public void testRangeOfTwoOffsetOne() throws Exception {
        assertThat(solution.solution(1, 3, 1), is(3));
    }

    @Test
    public void testKisBetweenAandB() throws Exception {
        assertThat(solution.solution(1, 3, 2), is(1));
    }

    @Test
    public void testExtreme1() throws Exception {
        assertThat(solution.solution(2_000_000_000, 2_000_000_000, 1), is(1));
    }

    @Test
    public void testExtreme2() throws Exception {
        assertThat(solution.solution(2_000_000_000, 2_000_000_000, 2_000_000_000), is(1));
    }

    @Test
    public void testExtreme3() throws Exception {
        assertThat(solution.solution(0, 2_000_000_000, 2_000_000_000), is(2));
    }

    @Test
    public void testExtreme4() throws Exception {
        assertThat(solution.solution(0, 2_000_000_000, 1), is(2_000_000_001));
    }

    @Test
    public void testTestExample() throws Exception {
        assertThat(0 % 11, is(0));
        assertThat(1 % 11, is(1));
        //assertThat(solution.solution(0, 1, 11), is(1));
    }

}
