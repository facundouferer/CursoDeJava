package CursoJava.finales_ejemplo;

import java.util.ArrayList;
import java.util.List;

/*
 * Final de ejemplo 02 – Estructuras de datos y algoritmia
 *
 * Enunciado:
 * 1. Implemente una lista enlazada genérica ListaEnlazada<T> con agregar, eliminar e iterador.
 * 2. Implemente una Pila<T> y una Cola<T> sobre esa lista. Use la pila para verificar si una
 *    expresión tiene los paréntesis balanceados y la cola para simular una fila de atención.
 * 3. Implemente un árbol binario de búsqueda (ABB) de enteros con insertar, buscar,
 *    recorrido inorden y altura.
 * 4. Implemente un árbol n-ario de carpetas con una operación recursiva que cuente nodos
 *    y calcule la profundidad.
 * 5. Ordene un arreglo con burbuja y con mezcla (merge sort) contando las comparaciones, y
 *    compare empíricamente O(n^2) contra O(n log n).
 *
 * Unidades cubiertas: l13, l14, l15, l16, l17, l23 y l26 (ver README.md).
 */
public class Final02EstructurasDeDatos {

    // ---- l13 + l15: lista enlazada genérica con Iterable ----
    static class ListaEnlazada<T> implements Iterable<T> {
        private static class Nodo<T> {
            T dato;
            Nodo<T> siguiente;

            Nodo(T dato) {
                this.dato = dato;
            }
        }

        private Nodo<T> primero;
        private Nodo<T> ultimo;
        private int tamanio;

        void agregarAlFinal(T dato) {
            Nodo<T> nuevo = new Nodo<>(dato);
            if (primero == null) {
                primero = nuevo;
            } else {
                ultimo.siguiente = nuevo;
            }
            ultimo = nuevo;
            tamanio++;
        }

        T eliminarPrimero() {
            if (primero == null) {
                throw new IllegalStateException("Lista vacía");
            }
            T dato = primero.dato;
            primero = primero.siguiente;
            if (primero == null) {
                ultimo = null;
            }
            tamanio--;
            return dato;
        }

        T eliminarUltimo() {
            if (primero == null) {
                throw new IllegalStateException("Lista vacía");
            }
            if (primero == ultimo) {
                return eliminarPrimero();
            }
            Nodo<T> actual = primero;
            while (actual.siguiente != ultimo) {
                actual = actual.siguiente;
            }
            T dato = ultimo.dato;
            actual.siguiente = null;
            ultimo = actual;
            tamanio--;
            return dato;
        }

        int tamanio() {
            return tamanio;
        }

        boolean estaVacia() {
            return tamanio == 0;
        }

        // l16: iterador propio
        @Override
        public java.util.Iterator<T> iterator() {
            return new java.util.Iterator<T>() {
                private Nodo<T> actual = primero;

                @Override
                public boolean hasNext() {
                    return actual != null;
                }

                @Override
                public T next() {
                    T dato = actual.dato;
                    actual = actual.siguiente;
                    return dato;
                }
            };
        }
    }

    // ---- l14: pila (LIFO) y cola (FIFO) ----
    static class Pila<T> {
        private final ListaEnlazada<T> datos = new ListaEnlazada<>();

        void apilar(T dato) {
            datos.agregarAlFinal(dato);
        }

        T desapilar() {
            return datos.eliminarUltimo();
        }

        boolean estaVacia() {
            return datos.estaVacia();
        }
    }

    static class Cola<T> {
        private final ListaEnlazada<T> datos = new ListaEnlazada<>();

        void encolar(T dato) {
            datos.agregarAlFinal(dato);
        }

        T desencolar() {
            return datos.eliminarPrimero();
        }

        boolean estaVacia() {
            return datos.estaVacia();
        }
    }

    static boolean parentesisBalanceados(String expresion) {
        Pila<Character> pila = new Pila<>();
        for (char c : expresion.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pila.apilar(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.estaVacia()) {
                    return false;
                }
                char abierto = pila.desapilar();
                boolean coincide = (abierto == '(' && c == ')')
                        || (abierto == '[' && c == ']')
                        || (abierto == '{' && c == '}');
                if (!coincide) {
                    return false;
                }
            }
        }
        return pila.estaVacia();
    }

    // ---- l17: árbol binario de búsqueda ----
    static class Abb {
        private static class Nodo {
            int valor;
            Nodo izq;
            Nodo der;

            Nodo(int valor) {
                this.valor = valor;
            }
        }

        private Nodo raiz;

        void insertar(int valor) {
            raiz = insertar(raiz, valor);
        }

        private Nodo insertar(Nodo nodo, int valor) {
            if (nodo == null) {
                return new Nodo(valor);
            }
            if (valor < nodo.valor) {
                nodo.izq = insertar(nodo.izq, valor);
            } else if (valor > nodo.valor) {
                nodo.der = insertar(nodo.der, valor);
            }
            return nodo;
        }

        boolean buscar(int valor) {
            Nodo actual = raiz;
            while (actual != null) {
                if (valor == actual.valor) {
                    return true;
                }
                actual = valor < actual.valor ? actual.izq : actual.der;
            }
            return false;
        }

        List<Integer> inorden() {
            List<Integer> resultado = new ArrayList<>();
            inorden(raiz, resultado);
            return resultado;
        }

        private void inorden(Nodo nodo, List<Integer> salida) {
            if (nodo == null) {
                return;
            }
            inorden(nodo.izq, salida);
            salida.add(nodo.valor);
            inorden(nodo.der, salida);
        }

        int altura() {
            return altura(raiz);
        }

        private int altura(Nodo nodo) {
            return nodo == null ? 0 : 1 + Math.max(altura(nodo.izq), altura(nodo.der));
        }
    }

    // ---- l26: árbol n-ario de carpetas ----
    static class Carpeta {
        final String nombre;
        final List<Carpeta> hijas = new ArrayList<>();

        Carpeta(String nombre) {
            this.nombre = nombre;
        }

        Carpeta agregar(Carpeta hija) {
            hijas.add(hija);
            return this;
        }

        int contar() {
            int total = 1;
            for (Carpeta hija : hijas) {
                total += hija.contar();
            }
            return total;
        }

        int profundidad() {
            int mayor = 0;
            for (Carpeta hija : hijas) {
                mayor = Math.max(mayor, hija.profundidad());
            }
            return 1 + mayor;
        }

        void imprimir(String sangria) {
            System.out.println(sangria + nombre);
            for (Carpeta hija : hijas) {
                hija.imprimir(sangria + "  ");
            }
        }
    }

    // ---- l23: ordenamientos y conteo de comparaciones ----
    static long comparaciones;

    static void burbuja(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                comparaciones++;
                if (a[j] > a[j + 1]) {
                    int aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }
    }

    static void mezcla(int[] a) {
        if (a.length < 2) {
            return;
        }
        int medio = a.length / 2;
        int[] izq = java.util.Arrays.copyOfRange(a, 0, medio);
        int[] der = java.util.Arrays.copyOfRange(a, medio, a.length);
        mezcla(izq);
        mezcla(der);
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < izq.length && j < der.length) {
            comparaciones++;
            a[k++] = izq[i] <= der[j] ? izq[i++] : der[j++];
        }
        while (i < izq.length) {
            a[k++] = izq[i++];
        }
        while (j < der.length) {
            a[k++] = der[j++];
        }
    }

    static int[] datosPseudoaleatorios(int n) {
        int[] datos = new int[n];
        long semilla = 42;
        for (int i = 0; i < n; i++) {
            semilla = (semilla * 1103515245L + 12345L) & 0x7fffffffL;
            datos[i] = (int) (semilla % 10000);
        }
        return datos;
    }

    public static void main(String[] args) {
        System.out.println("(a[b]{c}) balanceada: " + parentesisBalanceados("(a[b]{c})"));
        System.out.println("(a[b)] balanceada: " + parentesisBalanceados("(a[b)]"));

        Cola<String> fila = new Cola<>();
        fila.encolar("Ana");
        fila.encolar("Luis");
        fila.encolar("Eva");
        System.out.print("Atención en orden:");
        while (!fila.estaVacia()) {
            System.out.print(" " + fila.desencolar());
        }
        System.out.println();

        ListaEnlazada<Integer> lista = new ListaEnlazada<>();
        for (int v : new int[] {3, 1, 2}) {
            lista.agregarAlFinal(v);
        }
        int suma = 0;
        for (int v : lista) {
            suma += v;
        }
        System.out.println("Suma de la lista: " + suma + " (tamaño " + lista.tamanio() + ")");

        Abb abb = new Abb();
        for (int v : new int[] {50, 30, 70, 20, 40, 60, 80, 30}) {
            abb.insertar(v);
        }
        System.out.println("Inorden: " + abb.inorden() + ", altura " + abb.altura());
        System.out.println("Busca 60: " + abb.buscar(60) + ", busca 65: " + abb.buscar(65));

        Carpeta raiz = new Carpeta("src")
                .agregar(new Carpeta("main").agregar(new Carpeta("java")).agregar(new Carpeta("resources")))
                .agregar(new Carpeta("test"));
        raiz.imprimir("");
        System.out.println("Carpetas: " + raiz.contar() + ", profundidad: " + raiz.profundidad());

        for (int n : new int[] {100, 1000}) {
            int[] a = datosPseudoaleatorios(n);
            int[] b = a.clone();
            comparaciones = 0;
            burbuja(a);
            long burb = comparaciones;
            comparaciones = 0;
            mezcla(b);
            System.out.println("n=" + n + " -> burbuja: " + burb + " comparaciones, mezcla: " + comparaciones);
        }
    }
}
