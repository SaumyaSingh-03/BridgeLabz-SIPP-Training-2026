package Tree;

import java.util.*;

public class Inorder {

    public void inorder(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }

        inorder(root.left, result);
        result.add(root.data);
        inorder(root.right, result);
    }

    public List<Integer> getSortedLeaderboard(Node root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }
}