package Parciales.Parcial2ProgII;
import java.io.File;
public class Pruebas {
    public static void main(String[] args) {
        File file = new File("test.txt");
        System.out.println(file.exists());
    }
}
