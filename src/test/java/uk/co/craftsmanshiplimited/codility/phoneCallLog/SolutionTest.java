package uk.co.craftsmanshiplimited.codility.phoneCallLog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import uk.co.craftsmanshiplimited.codility.pairsOfIndices.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Henrik on 19/02/2017.
 */
@RunWith(JUnit4.class)
public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testEmtptyString() throws Exception {
        assertEquals(0, solution.solution(null));
        assertEquals(0, solution.solution(""));
    }

    @Test
    public void testOneCallLessThan5Minutes() throws Exception {
        assertEquals(0, solution.solution("00:01:07,123-123-123"));
    }

    @Test
    public void testOneCall5Minutes() throws Exception {
        assertEquals(0, solution.solution("00:05:00,123-123-123"));
    }

    @Test
    public void testOneCallLessMoreThan5Minutes() throws Exception {
        assertEquals(0, solution.solution("00:05:01,123-123-123"));
    }

    @Test
    public void testTwoCallSameNumber() throws Exception {
        assertEquals(0, solution.solution("00:05:01,123-123-123"+Character.toString((char)10)+"00:05:01,123-123-123"));
    }

    @Test
    public void testTwoCallDifferentNumber() throws Exception {
        assertEquals(900, solution.solution("00:05:01,123-123-123"+Character.toString((char)10)+"00:05:01,123-123-124"));
    }

    @Test
    public void testFilterOutCostsForMostCalledNumber() throws Exception {
        assertEquals(750, solution.solution("00:05:01,123-123-123"+Character.toString((char)10)+"00:05:00,123-123-124"));
    }

    @Test
    public void testFilterOutCostsForMostCalledNumberDraw() throws Exception {
        assertEquals(900, solution.solution("00:03:00,123-123-123"+Character.toString((char)10)+"00:03:00,123-123-123"+Character.toString((char)10)+"00:06:00,123-123-124"));
    }

    @Test
    public void testXXX() throws Exception {
        final List<String> c1 = new ArrayList<String>();
        c1.add("foo");
        final List<String> c2 = Collections.unmodifiableList(c1);
        c1.add("bar");
        System.out.println(c2);
    }
}