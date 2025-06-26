package Parciales.Parcial2ProgII;

public class BinaryTreeInOrder {
    // Definición de la clase Node
    static class Node {
        int value;
        Node left, right;

        // Constructor del nodo
        public Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    // Método para recorrer el árbol en inOrder (en orden)
    void inOrder(Node node) {
        if (node == null) return;

        // Recorrer el subárbol izquierdo
        inOrder(node.left);

        // Procesar el nodo actual
        System.out.print(node.value + " ");

        // Recorrer el subárbol derecho
        inOrder(node.right);
    }

    public static void main(String[] args) {
        BinaryTreeInOrder tree = new BinaryTreeInOrder();

        // Crear el árbol binario
        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.left.right = new Node(15);

        // Realizar el recorrido inOrder
        System.out.println("Recorrido en orden (inOrder):");
        tree.inOrder(root);
    }
}
