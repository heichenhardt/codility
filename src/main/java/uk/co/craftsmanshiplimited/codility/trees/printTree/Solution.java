package uk.co.craftsmanshiplimited.codility.trees.printTree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by Henrik on 19/03/2017.
 */
public class Solution {

    public String solution(final Node root) {
        final StringBuilder result = new StringBuilder("[");
        final Deque<Node> stack = new ArrayDeque<>();
        Node node = root;
        while(node != null) {
            stack.push(node);
            node = node.getLeftChild();
        }

        while(!stack.isEmpty()) {
            Node element = stack.pop();
            if(element.getValue() != null) {
                result.append(element.getValue());
                result.append(" ");
            }

            if(element.getRightChild() != null) {
                node = element.getRightChild();
                //Find the leftmost child again
                while(node != null) {
                    stack.push(node);
                    node = node.getLeftChild();
                }
            }
        }
        result.append("]");

        return result.toString();
    }



}
