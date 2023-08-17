package CursoJava.Recursion;

public class StackOverflowExample {
    public static void main(String[] args) {
        recursiveFunction(1);
    }

    public static void recursiveFunction(int n) {
        System.out.println(n);
        recursiveFunction(n + 1);
    }

}
