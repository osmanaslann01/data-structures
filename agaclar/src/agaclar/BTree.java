package agaclar;

class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BTree {

    Node root;

    public BTree() { // 
        root = null;   // construckter
    }                //

    Node newNode(int data) {

        root = new Node(data);

        System.out.println(data + " agaca eklendi");

        return root;
    }

    Node insert(Node root, int data) {

        if (root != null) {

            if (data < root.data) {

                root.left = insert(root.left, data);

            } else {

                root.right = insert(root.right, data);
            }
        } else {
            root = newNode(data);
        }
        return root;
    }

}
