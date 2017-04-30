package uk.co.craftsmanshiplimited.codility.trees.printTree;

/**
 * Created by Henrik on 19/03/2017.
 */
public class Node {

    private final Integer value;
    private final Node leftChild;
    private final Node rightChild;

    private Node(final Integer value, final Node leftChild, final Node rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public static Node of(final Node leftChild, final Node rightChild, final Integer value) {
        return new Node(value, leftChild, rightChild);
    }

    public Integer getValue() {
        return value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }
}
