package CursoJava.PatronesDeDisenio;

// Paso 1: Clase abstracta que define el Template Method
abstract class BebidaCaliente {
    // Template Method que define la estructura del proceso
    public final void prepararBebida() {
        hervirAgua();
        prepararIngrediente();
        verterEnTaza();
        agregarCondimentos();
    }

    // Pasos abstractos que deben implementarse en las subclases
    abstract void prepararIngrediente();
    abstract void agregarCondimentos();

    // Pasos comunes con implementaciones concretas
    void hervirAgua() {
        System.out.println("Hirviendo agua.");
    }

    void verterEnTaza() {
        System.out.println("Vertiendo en la taza.");
    }
}

// Paso 2: Clases concretas que heredan de la clase abstracta
class Te extends BebidaCaliente {
    @Override
    void prepararIngrediente() {
        System.out.println("Colocando una bolsita de té.");
    }

    @Override
    void agregarCondimentos() {
        System.out.println("Agregando limón.");
    }
}

class Cafe extends BebidaCaliente {
    @Override
    void prepararIngrediente() {
        System.out.println("Moliendo granos de café.");
    }

    @Override
    void agregarCondimentos() {
        System.out.println("Agregando azúcar y leche.");
    }
}

// Paso 3: Programa principal que utiliza el patrón Template Method
class PatronTemplateMethod {
    public static void main(String[] args) {
        System.out.println("Preparando té:");
        BebidaCaliente te = new Te();
        te.prepararBebida();

        System.out.println("\nPreparando café:");
        BebidaCaliente cafe = new Cafe();
        cafe.prepararBebida();
    }
}
