package LinkedList;
public class TaskQueueMain {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        TaskQueue queue = new TaskQueue();

        System.out.println("Before Deletion:");
        queue.display(head);

        head = queue.removeTask(head, 30);

        System.out.println("After Deletion:");
        queue.display(head);
    }
}