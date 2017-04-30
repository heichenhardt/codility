package uk.co.craftsmanshiplimited.codility.linkedList;

/**
 * Created by Henrik on 19/03/2017.
 */
public class Solution {
    public void reverse(Node list) {

        Node reverse = null;
        Node node = list;
        while(node != null) {
            Node next = node.next;
            node.next = reverse;
            reverse = node;
            node = next;
        }
        Node printNode = reverse;
        while (printNode != null) {
            System.out.print(printNode.value + " ");
            printNode = printNode.next;
        }
    }
}
