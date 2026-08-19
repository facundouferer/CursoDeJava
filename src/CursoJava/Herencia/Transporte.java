package CursoJava.Herencia;

class Transporte {
    public static void main(String[] args) {

        int opcion = 1;
        System.out.println("¿Cuántos vehículos desea ingresar?");
        int cantidadVehiculos = Integer.parseInt(System.console().readLine());
        Vehiculo[] vehiculos = new Vehiculo[cantidadVehiculos];
        while (opcion != 0 && opcion <= cantidadVehiculos) {
            System.out.println("Ingrese el tipo de vehículo (1: Auto, 2: Moto, 0: Salir):");
            opcion = Integer.parseInt(System.console().readLine());
            if (opcion == 1) {
                System.out.println("Ingrese la marca del auto:");
                String marca = System.console().readLine();
                System.out.println("Ingrese el modelo del auto:");
                String modelo = System.console().readLine();
                System.out.println("Ingrese el año del auto:");
                int anio = Integer.parseInt(System.console().readLine());
                System.out.println("Ingrese el precio del auto:");
                double precio = Double.parseDouble(System.console().readLine());
                System.out.println("Ingrese el impuesto por rueda del auto:");
                double impuestoPorRueda = Double.parseDouble(System.console().readLine());
                vehiculos[opcion - 1] = new Auto(marca, modelo, anio, precio, impuestoPorRueda);
            } else if (opcion == 2) {
                System.out.println("Ingrese la marca de la moto:");
                String marca = System.console().readLine();
                System.out.println("Ingrese el modelo de la moto:");
                String modelo = System.console().readLine();
                System.out.println("Ingrese el año de la moto:");
                int anio = Integer.parseInt(System.console().readLine());
                System.out.println("Ingrese el precio de la moto:");
                double precio = Double.parseDouble(System.console().readLine());
                vehiculos[opcion - 1] = new Moto(marca, modelo, anio, precio);
            } else if (opcion != 0) {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        }

        System.out.println("Vehículos ingresados:");
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null) {
                System.out.println(vehiculos[i]);
            }
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