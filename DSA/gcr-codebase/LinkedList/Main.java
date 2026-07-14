package LinkedList;

public class Main {
    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        LinkedList1 list = new LinkedList1();

        list.insertAfter(head.next, 25);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}