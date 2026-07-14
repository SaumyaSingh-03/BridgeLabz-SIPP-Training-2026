package LinkedList;
public class LinkedList1 {

    public void insertAfter(Node current, int trackId) {

        if (current == null) {
            System.out.println("Current node cannot be null.");
            return;
        }

        Node newNode = new Node(trackId);

        newNode.next = current.next;

        current.next = newNode;
    }
}