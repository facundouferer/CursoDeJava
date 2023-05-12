package CursoJava.Secuencias;

import java.util.HashSet;

public class UnionListas {
    public static void main(String[] args) {
        int[] lista1 = {1, 2, 3,3, 4};
        int[] lista2 = {5, 6, 7, 3,8};

        HashSet<Integer> conjuntoUnion = new HashSet<>();

        for (int i = 0; i < lista1.length; i++) {
            conjuntoUnion.add(lista1[i]);
        }

        for (int i = 0; i < lista2.length; i++) {
            conjuntoUnion.add(lista2[i]);
        }

        System.out.println("Lista de unión sin números repetidos: ");
        for (Integer num : conjuntoUnion) {
            System.out.print(num + " ");
        }
    }
}
