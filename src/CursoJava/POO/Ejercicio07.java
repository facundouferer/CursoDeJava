package CursoJava.POO;
/**Ejercicio 7:
 Crear una clase Mate que describa el funcionamiento de la conocida bebida tradicional local. La
 clase debe contener como miembros:
 1. Un atributo para la cantidad de cebadas restantes hasta que se lava el mate
 (representada por un número).
 2. Un atributo para el estado (lleno o vacío).
 3. El constructor debe recibir como parámetro n, la cantidad máxima de cebadas en base a
 la cantidad de yerba vertida en el recipiente.
 4. Un método cebar(), que llena el mate con agua. Si se intenta cebar con el mate lleno, se
 debe imprimir un mensaje de error 'Cuidado! Te quemaste!'
 5. Un método beber(), que vacía el mate y le resta una cebada disponible. Si se intenta
 beber un mate vacío, se debe imprimir un mensaje de error 'El mate está vacío !'
 6. Es posible seguir cebando y bebiendo el mate aunque no haya cebadas disponibles. En
 ese caso la cantidad de cebadas restantes se mantendrá en 0, y cada vez que se
 intente beber se debe imprimir un mensaje de aviso: 'Advertencia: el mate está lavado.'.
 Crear una aplicación en donde se cree un objeto Mate y se puedan tomar mates.*/
public class Ejercicio07 {

    public static void main(String[] args) {

        // Creamos un objeto de la clase Mate
        Mate mate = new Mate(10);

        // Cebar el mate hasta que esté lleno
        for (int i = 0; i < 11; i++) {
            mate.cebar();
        }

        // Tomar mates hasta que se acaben las cebadas
        while (mate.getCebadasRestantes() > 0) {
            mate.beber();
        }

        // Seguir tomando mates después de lavar el mate
        mate.beber();
        mate.cebar();
        mate.beber();
    }
}

class Mate {

    // Atributos
    private int cebadasRestantes;
    private boolean lleno;

    // Constructor
    public Mate(int n) {
        this.cebadasRestantes = n;
        this.lleno = false;
    }

    // Métodos cebar y beber
    public void cebar() {
        if (lleno) {
            System.out.println("Cuidado! Te quemaste!");
        } else {
            lleno = true;
            System.out.println("Se ha cevado el mate.");
        }
    }

    public void beber() {
        if (!lleno) {
            System.out.println("El mate está vacío !");
        } else {
            if (cebadasRestantes > 0) {
                cebadasRestantes--;
                System.out.println("Se ha bebido una cebada. Cebadas restantes: " + cebadasRestantes);
                if (cebadasRestantes == 0) {
                    System.out.println("Advertencia: el mate está lavado.");
                }
            } else {
                System.out.println("Advertencia: el mate está lavado.");
            }
            lleno = false;
        }
    }

    // Getters y setters
    public int getCebadasRestantes() {
        return cebadasRestantes;
    }

    public void setCebadasRestantes(int cebadasRestantes) {
        this.cebadasRestantes = cebadasRestantes;
    }

    public boolean isLleno() {
        return lleno;
    }

    public void setLleno(boolean lleno) {
        this.lleno = lleno;
    }
}
