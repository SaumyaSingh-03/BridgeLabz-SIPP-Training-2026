package BST;

public class SearchBSTMain {

    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        SearchBST tree = new SearchBST();

        int target = 60;

        if (tree.search(root, target)) {
            System.out.println(target + " found in BST.");
        } else {
            System.out.println(target + " not found in BST.");
        }
    }
}