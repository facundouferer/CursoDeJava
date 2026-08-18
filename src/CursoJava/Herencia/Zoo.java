package CursoJava.Herencia;

 class Zoo {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Zoológico");
        
        Terrestre animal = new Terrestre("León", 4, "Terrestre", 1);
        
        System.out.println(animal);

        Terrestre elefante = new Terrestre("Elefante", 4, "Terrestre", 1);
        System.out.println(elefante);

        Aereo aguila = new Aereo("Águila", 2, "Aéreo", true);
        System.out.println(aguila);

        Terrestre tortuga = new Terrestre("Tortuga", 4, "Terrestre", 2);
        System.out.println(tortuga);

        Terrestre serpiente = new Terrestre("Serpiente", 0, "Terrestre", 2);
        System.out.println(serpiente);
    }
}

 class Animal {

   private String nombre; // León, Águila, Elefante
   private String tipo; // Terrestre, Acuático, Aéreo
    private int cantidadPatas; // 4

    public Animal(String nombre, String tipo, int cantidadPatas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidadPatas = cantidadPatas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + " es del tipo " + tipo + " y tiene " + cantidadPatas + " patas.";
    }

    public int getCantidadPatas() {
        return cantidadPatas;
    }

    public String getTipo() {
        return tipo;
    }
    
}

class Terrestre extends Animal {

    private int nacimiento;

    public Terrestre(String nombre, int cantidadPatas, String tipo, int nacimiento) {
        super(nombre, tipo, cantidadPatas); // llamada al constructor de la clase superior (Animal)
        this.nacimiento = nacimiento;
    }

    public Terrestre(String nombre) {
        super(nombre, "Terrestre", 4);
    }

    @Override
    public String toString() {
        String tipoNacimiento = "";
        if(this.nacimiento == 1){
            tipoNacimiento = "Vivíparo";
        }else {
            if(this.nacimiento == 2){
                tipoNacimiento = "Ovíparo";
            } else {
                tipoNacimiento = "Ni idea";
            }
        }
        return  getNombre() + " tiene " + super.getCantidadPatas() + " patas " + super.getTipo() + " y es " + tipoNacimiento;
    }
}

class Aereo extends Animal {

    private int cantidadAlas; // 2
    private boolean puedeVolar; // true

    public Aereo(String nombre, int cantidadAlas, String tipo, boolean puedeVolar) {
        super(nombre, tipo, 2); // llamada al constructor de la clase superior (Animal)
        this.puedeVolar = puedeVolar;
        this.cantidadAlas = cantidadAlas;
    }

    public Aereo(String nombre) {
        super(nombre, "Aéreo", 2);
        this.puedeVolar = true;
        this.cantidadAlas = 2;
    }

    public int getCantidadAlas() {
        return cantidadAlas;
    }

    public void setCantidadAlas(int cantidadAlas) {
        this.cantidadAlas = cantidadAlas;
    }

    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

    @Override
    public String toString() {
        return  getNombre() + " tiene " + getCantidadAlas() + " alas y es " + super.getTipo();
    }
}



