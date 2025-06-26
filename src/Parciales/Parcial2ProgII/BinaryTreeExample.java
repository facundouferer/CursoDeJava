package Parciales.Parcial2ProgII;

public class BinaryTreeExample {
    static class Node {
        int value;
        Node left, right;
        public Node(int value) {
            this.value = value;
            left = right = null;
        }
    }
    void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }
    public static void main(String[] args) {
        BinaryTreeExample tree = new BinaryTreeExample();
        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.left.right = new Node(15);
        tree.inOrder(root);
    }
}
