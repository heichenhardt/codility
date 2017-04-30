package uk.co.craftsmanshiplimited.codility.lesson5.genomicRangeQuery;

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
    public void testOneElementA() throws Exception {
        assertThat(solution.solution("A", new int[]{0}, new int[]{0}), is( new int[]{1}));
    }

    @Test
    public void testOneElementC() throws Exception {
        assertThat(solution.solution("C", new int[]{0}, new int[]{0}), is( new int[]{2}));
    }

    @Test
    public void testOneElementG() throws Exception {
        assertThat(solution.solution("G", new int[]{0}, new int[]{0}), is( new int[]{3}));
    }

    @Test
    public void testOneElementT() throws Exception {
        assertThat(solution.solution("T", new int[]{0}, new int[]{0}), is( new int[]{4}));
    }

    @Test
    public void testAllElementLengthOne() throws Exception {
        assertThat(solution.solution("ACGT", new int[]{0,1,2,3}, new int[]{0,1,2,3}), is( new int[]{1,2,3,4}));
    }

    @Test
    public void testLengthTwo() throws Exception {
        assertThat(solution.solution("ACGT", new int[]{0,1,2}, new int[]{1,2,3}), is( new int[]{1,2,3}));
    }

    @Test
    public void testExample() throws Exception {
        assertThat(solution.solution("CAGCCTA", new int[]{2,5,0}, new int[]{4,5,6}), is( new int[]{2,4,1}));
    }
}
