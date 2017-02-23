package uk.co.craftsmanshiplimited.codility.lesson2.OddOccurrencesInArray;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

/**
 * Created by Henrik on 19/02/2017.
 */
@RunWith(JUnit4.class)
public class SolutionTest {

    private Solution solution;

    @Before
    public void setup() throws Exception {
        this.solution = new Solution();
    }

    @Test
    public void testArrayWithOneElement() {
        assertEquals(1, this.solution.solution(new int[]{1}));
    }

    @Test
    public void testArrayWithThreeElementOddOneAtTheEnd() {
        assertEquals(3, this.solution.solution(new int[]{1,1,3}));
    }

    @Test
    public void testArrayWithThreeElementOddOneAtTheBeginning() {
        assertEquals(3, this.solution.solution(new int[]{3,1,1}));
    }

    @Test
    public void testArrayWithFiveElementOddOneInTheBeginning() {
        assertEquals(2, this.solution.solution(new int[]{1,1,2,3,3}));
    }

    @Test
    public void testArrayWithFiveElementUnsorted() {
        assertEquals(7, this.solution.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }



}
