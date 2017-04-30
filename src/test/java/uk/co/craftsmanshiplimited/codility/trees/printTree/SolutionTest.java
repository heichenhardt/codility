package uk.co.craftsmanshiplimited.codility.trees.printTree;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Henrik on 19/03/2017.
 */
@RunWith(JUnit4.class)
public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testEmpty() throws Exception {
        Node root = Node.of(null, null, null);
        assertThat(solution.solution(root), is("[]"));
    }

    @Test
    public void testOneElement() throws Exception {
        Node root = Node.of(null, null, 1);
        assertThat(solution.solution(root), is("[1 ]"));
    }

    @Test
    public void testThreeElement() throws Exception {
        Node root = Node.of(Node.of(null, null, 1), Node.of(null, null, 3), 2);
        assertThat(solution.solution(root), is("[1 2 3 ]"));
    }
}
