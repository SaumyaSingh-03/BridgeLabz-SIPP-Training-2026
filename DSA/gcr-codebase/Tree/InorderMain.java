package Tree;

import java.util.*;
public class InorderMain {
    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        Inorder tree = new Inorder();

        List<Integer> sorted = tree.getSortedLeaderboard(root);

        System.out.println("Sorted Leaderboard:");
        for (int score : sorted) {
            System.out.print(score + " ");
        }
    }
}