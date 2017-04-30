package uk.co.craftsmanshiplimited.codility.linkedList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by Henrik on 19/03/2017.
 */
@RunWith(JUnit4.class)
public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testFourElementList() throws Exception {
        Node list = Node.of(1, Node.of(2, Node.of(3, Node.of(4, null))));
        solution.reverse(list);
    }
}
