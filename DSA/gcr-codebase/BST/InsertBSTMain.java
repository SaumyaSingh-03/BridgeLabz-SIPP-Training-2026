package BST;

public class InsertBSTMain {

    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        InsertBST tree = new InsertBST();

        root = tree.insert(root, 65);

        System.out.println("BST after insertion (Inorder Traversal):");
        tree.inorder(root);
    }
}