package Parciales.Parcial2ProgII;

public class BinaryTreeSearch {
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


    boolean metodo(Node node, int key) {
        if (node == null) return false;
        if (node.value == key) return true;
        if (key < node.value) {
            return metodo(node.left, key);
        }
        return metodo(node.right, key);
    }

    public static void main(String[] args) {
        BinaryTreeSearch tree = new BinaryTreeSearch();

        // Crear el árbol binario
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);

        // Valores a buscar
        int[] keysToSearch = {7, 12, 1, 10};

        // Buscar cada valor en el árbol
        for (int key : keysToSearch) {
            if (tree.metodo(root, key)) {
                System.out.println("El valor " + key + " se encuentra en el árbol.");
            } else {
                System.out.println("El valor " + key + " NO se encuentra en el árbol.");
            }
        }
    }
}
