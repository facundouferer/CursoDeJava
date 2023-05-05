package CursoJava.Funciones;
/**Ejercicio 6:
 Escribir una función que calcule el área de un triángulo a partir de su base y su altura*/
public class Ejercicio06 {
    public static void main(String[] args) {
        double base = 4.5;
        double altura = 2.3;
        double area = calcularAreaTriangulo(base, altura);
        System.out.printf("El área del triángulo es: %.2f", area);
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        double area = (base * altura) / 2.0;
        return area;
    }
}
