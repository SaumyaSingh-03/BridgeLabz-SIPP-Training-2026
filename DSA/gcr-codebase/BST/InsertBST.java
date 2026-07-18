package BST;

public class InsertBST {

    public Node insert(Node root, int id) {

        if (root == null) {
            return new Node(id);
        }

        if (id < root.data) {
            root.left = insert(root.left, id);
        } else if (id > root.data) {
            root.right = insert(root.right, id);
        }

        return root;
    }

    public void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}