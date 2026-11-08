package CursoJava.l07_fundamentos_poo_clases_y_objetos.ej10_mate;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Simular el estado de un mate (lleno o vacío) y las cebadas disponibles hasta que se lava.
 * Concepto: 3. Ejemplo práctico: modelando una clase (estado y comportamiento).
 */
public class Mate {

    private int cebadasRestantes;
    private boolean lleno;

    public Mate(int cebadasMaximas) {
        this.cebadasRestantes = cebadasMaximas;
        this.lleno = false;
    }

    public void cebar() {
        if (lleno) {
            System.out.println("¡Cuidado! ¡Te quemaste!");
        } else {
            lleno = true;
            System.out.println("Se ha cebado el mate.");
        }
    }

    public void beber() {
        if (!lleno) {
            System.out.println("¡El mate está vacío!");
            return;
        }
        if (cebadasRestantes > 0) {
            cebadasRestantes--;
            System.out.println("Se ha bebido una cebada. Cebadas restantes: " + cebadasRestantes);
        }
        if (cebadasRestantes == 0) {
            System.out.println("Advertencia: el mate está lavado.");
        }
        lleno = false;
    }

    public int getCebadasRestantes() {
        return cebadasRestantes;
    }

    public boolean isLleno() {
        return lleno;
    }
}
