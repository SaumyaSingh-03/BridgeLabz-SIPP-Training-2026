package LinkedList;

public class TaskQueue {

    public Node removeTask(Node head, int taskId) {

        if (head == null) {
            return null;
        }

        if (head.data == taskId) {
            return head.next;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.data != taskId) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null) {
            prev.next = curr.next;
        }

        return head;
    }

    public void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}