package Tree;

import java.util.*;

public class LevelOrderMain {

    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        LevelOrder tree = new LevelOrder();

        List<List<Integer>> levels = tree.broadcastByLevel(root);

        System.out.println("Level Order Traversal:");

        for (List<Integer> level : levels) {
            System.out.println(level);
        }
    }
}