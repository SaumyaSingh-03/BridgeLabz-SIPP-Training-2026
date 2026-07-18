package BST;

public class SearchBST {

    public boolean search(Node root, int target) {

        Node current = root;

        while (current != null) {

            if (target == current.data) {
                return true;
            }

            if (target < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return false;
    }
}