package CursoJava.Herencia;

class Transporte {
    public static void main(String[] args) {

        Auto listaDeAutos[] = new Auto[3];

        listaDeAutos[0] = new Auto("Ford", "Fiesta", 2020, 20000, 2);
        listaDeAutos[1] = new Auto("Chevrolet", "Onix", 2021, 25000, 2.5);
        listaDeAutos[2] = new Auto("Toyota", "Corolla", 2022, 30000, 3);

        for (Auto auto : listaDeAutos) {
            System.out.println(auto);
        }

    }
}

class Vehiculo {
    private String marca;
    private String modelo;
    private int puertas;
    private int anio;
    private double precio;
    private int cantidadRuedas;
    private double impuestoPorRueda;

    public Vehiculo(String marca, String modelo, int anio, int puertas, double precio, double impuestoPorRueda) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.puertas = puertas;
        this.precio = precio;
        this.impuestoPorRueda = impuestoPorRueda;

    }

     public Vehiculo(String marca, String modelo, int anio, int puertas, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.puertas = puertas;
        this.precio = precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setImpuestoPorRueda(double impuestoPorRueda) {
        this.impuestoPorRueda = impuestoPorRueda;
    }

    public double getImpuestoCantRuedas() {
        this.impuestoPorRueda = ((impuestoPorRueda * this.cantidadRuedas) * this.precio ) / 100;
        return impuestoPorRueda;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public double getPrecioImpuesto() {
        return this.precio + this.impuestoPorRueda;
    }

    @Override
    public String toString() {
        return  marca + " " + modelo + ", " + anio + ", " + puertas + " Puertas, U$s " + this.getPrecioImpuesto();
    }

    public String getDatosBasicos() {
        return  marca + " " + modelo + ", " + anio ;
    }
}

class Moto extends Vehiculo {

    public Moto(String marca, String modelo, int anio, double precio) {
        super(marca, modelo, anio, 0, precio, 0);
        super.setCantidadRuedas(2);
    }

    @Override
    public String toString() {
        return  super.getDatosBasicos() + ", U$s " + this.getPrecioImpuesto();
    }

}

class Auto extends Vehiculo {
    
    public Auto(String marca, String modelo, int anio, double precio, double impuestoPorRueda) {
        super(marca, modelo, anio, 4, precio, impuestoPorRueda);
    }

}