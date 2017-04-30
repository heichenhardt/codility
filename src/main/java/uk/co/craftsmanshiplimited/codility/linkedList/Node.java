package uk.co.craftsmanshiplimited.codility.linkedList;

/**
 * Created by Henrik on 19/03/2017.
 */
public class Node {
    int value;
    Node next;

    private Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public static Node of(int value, Node next) {
        return new Node(value, next);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
