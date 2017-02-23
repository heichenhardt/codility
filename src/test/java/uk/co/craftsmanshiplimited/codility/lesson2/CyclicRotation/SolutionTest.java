package uk.co.craftsmanshiplimited.codility.lesson2.CyclicRotation;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    public void testEmptyArrayNoRotation() throws Exception {
        assertTrue(arrayEquals(new int[]{}, this.solution.solution(new int[]{},0)));
    }

    @Test
    public void testEmptyArrayWithRotation() throws Exception {
        assertTrue(arrayEquals(new int[]{}, this.solution.solution(new int[]{},1)));
    }

    @Test
    public void testArrayOneElementNoRotation() throws Exception {
        assertTrue(arrayEquals(new int[]{1}, this.solution.solution(new int[]{1},0)));
    }

    @Test
    public void testArrayOneElementWithRotation() throws Exception {
        assertTrue(arrayEquals(new int[]{1}, this.solution.solution(new int[]{1},1)));
    }

    @Test
    public void testArrayTwoElementNoRotation() throws Exception {
        assertTrue(arrayEquals(new int[]{1,2}, this.solution.solution(new int[]{1,2},0)));
    }

    @Test
    public void testArrayTwoElementWithRotation() throws Exception {
        assertTrue(arrayEquals(new int[]{2,1}, this.solution.solution(new int[]{1,2},1)));
    }

    @Test
    public void testArrayTwoElementTwoRotation() throws Exception {
        assertTrue(arrayEquals(new int[]{1,2}, this.solution.solution(new int[]{1,2},2)));
    }

    @Test
    public void testArrayTwoElementThreeRotation() throws Exception {
        assertTrue(arrayEquals(new int[]{2,1}, this.solution.solution(new int[]{1,2},3)));
    }

    @Test
    public void testArrayThreeElementWithRotation() throws Exception {
        assertTrue(arrayEquals(new int[]{3,1,2}, this.solution.solution(new int[]{1,2,3},1)));
    }

    @Test
    public void testArray1() throws Exception {
        assertTrue(arrayEquals(new int[]{6, 3, 8, 9, 7}, this.solution.solution(new int[]{3, 8, 9, 7, 6},1)));
    }

    @Test
    public void testArray2() throws Exception {
        assertTrue(arrayEquals(new int[]{9, 7, 6, 3, 8}, this.solution.solution(new int[]{3, 8, 9, 7, 6},3)));
    }



    private boolean arrayEquals(int[] a, int[] b) {
        if(a.length != b.length) {
            return false;
        }
        for(int index=0; index<a.length; index++) {
            if(a[index] != b[index]) {
                printArray(b);
                return false;
            }
        }
        return true;
    }

    private void printArray(int[] a) {
        System.out.println("["+Arrays.stream(a).mapToObj(x->String.valueOf(x)).collect(Collectors.joining(","))+"]");
    }
}
