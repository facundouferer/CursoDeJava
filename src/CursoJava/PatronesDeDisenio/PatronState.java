package CursoJava.PatronesDeDisenio;

// Paso 1: Definir la interfaz del estado
interface EstadoTV {
    void encender();
    void apagar();
    void subirVolumen();
    void bajarVolumen();
}

// Paso 2: Implementar clases concretas para cada estado
class TVApagada implements EstadoTV {
    @Override
    public void encender() {
        System.out.println("Encendiendo la TV...");
    }

    @Override
    public void apagar() {
        System.out.println("La TV ya está apagada.");
    }

    @Override
    public void subirVolumen() {
        System.out.println("No se puede ajustar el volumen, la TV está apagada.");
    }

    @Override
    public void bajarVolumen() {
        System.out.println("No se puede ajustar el volumen, la TV está apagada.");
    }
}

class TVEncendida implements EstadoTV {
    @Override
    public void encender() {
        System.out.println("La TV ya está encendida.");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando la TV...");
    }

    @Override
    public void subirVolumen() {
        System.out.println("Subiendo el volumen de la TV.");
    }

    @Override
    public void bajarVolumen() {
        System.out.println("Bajando el volumen de la TV.");
    }
}

// Paso 3: Crear la clase contexto que utiliza el estado
class TV {
    private EstadoTV estado;

    public TV() {
        estado = new TVApagada(); // Inicialmente, la TV está apagada.
    }

    public void setEstado(EstadoTV estado) {
        this.estado = estado;
    }

    public void encender() {
        estado.encender();
        setEstado(new TVEncendida());
    }

    public void apagar() {
        estado.apagar();
        setEstado(new TVApagada());
    }

    public void subirVolumen() {
        estado.subirVolumen();
    }

    public void bajarVolumen() {
        estado.bajarVolumen();
    }
}

// Paso 4: Utilizar el patrón State

class PatronState {
    public static void main(String[] args) {

        TV tv = new TV();

        tv.encender();           // Encendiendo la TV...
        tv.encender();           // La TV ya está encendida.
        tv.subirVolumen();       // Subiendo el volumen de la TV.

        tv.apagar();             // Apagando la TV...
        tv.subirVolumen();       // No se puede ajustar el volumen, la TV está apagada.
        tv.encender();           // Encendiendo la TV...
        tv.bajarVolumen();       // Bajando el volumen de la TV.
    }
}
