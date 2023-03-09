package a06POO;

import java.time.LocalTime;

public class Concecionario {
    public static void main(String[]args){

        System.out.println(Auto.nombre);
        Auto auto1 = new Auto(4, "Rojo", "Ford", "Fiesta");
        Auto auto3 = new Auto(4, "Verde", "Fiat", "Uno");
        Usado auto2 = new Usado(4, "Verde", "Fiat", "Uno", 10000);

    }
}

class Auto{
    static String nombre = "Auto";
    private int puertas;
    private String color;
    private String marca;
    private String modelo;
    private boolean usado;
    public Auto(int puertas, String color, String marca, String modelo) {
        this.puertas = puertas;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.usado = false;
    }
    public int getPuertas() {
        return puertas;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }
    @Override
    public String toString() {
        return "Auto: " + marca + " " +modelo+ "\n" +
                puertas + " puertas \n"+
                "color: " + color + "\n" +
                "0 Km \n"+
                "Nombre:"+ nombre;
    }
}

class Usado extends Auto{
    int kilometros;
    public Usado(int puertas, String color, String marca, String modelo, int kilometros) {
        super(puertas, color, marca, modelo);
        super.setUsado(true);
        this.kilometros = kilometros;
    }
    public int getKilometros(){
        return kilometros;
    }
    @Override
    public String toString() {
        return "Auto: " + super.getMarca() + " " +super.getModelo()+ "\n" +
                super.getPuertas() + " puertas \n"+
                "color: " + super.getColor() + "\n" +
                this.kilometros+" Km \n";
    }

}