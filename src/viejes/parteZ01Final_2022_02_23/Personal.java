package viejes.parteZ01Final_2022_02_23;

import java.util.LinkedList;
import java.util.Scanner;

public class Personal {
    private LinkedList<Persona> personas;

    public Personal() {
        this.personas = new LinkedList<>();
    }

    public void listarPersonas() {
        String listado = '\n' + "Listado de personas: " + '\n';
        this.personas.forEach(persona -> System.out.println(persona.toString()));
    }

    public void addPersona(Persona persona) {
        this.personas.add(persona);
    }

    public void eliminarPersona(int dniEliminar) {
        this.personas.removeIf(persona -> persona.getDni() == dniEliminar);
    }

    public void modificarPersona(int dniBuscar) {
        this.personas.forEach(persona -> {
            if (persona.getDni() == dniBuscar) {
                Scanner entrada = new Scanner(System.in);
                System.out.println("Ingrese el nombre: ");
                String nombre = entrada.next();
                System.out.println("Ingrese el apellido: ");
                String apellido = entrada.next();
                System.out.println("Ingrese el dni: ");
                int dni = entrada.nextInt();
                persona.modificarDatos(nombre, apellido, dni);
            }
        });
    }

    public void buscarPersona(int dniBuscar) {
        for (Persona persona : this.personas) {
            if (persona.getDni() == dniBuscar) {
                System.out.println("Perona Encontrada: " + persona.toString());
                break;
            }
        }
    }

    public void verSueldo(int dniVerSueldo) {
        for (Persona persona : this.personas) {
            if (persona.getDni() == dniVerSueldo) {
                System.out.println("Sueldo $" + persona.verSueldo());
                break;
            }
        }
    }

    public void aumentarSalario(int dniAumentar, double incremento) {
        for (Persona persona : this.personas) {
            if (persona.getDni() == dniAumentar) {
                persona.subirSueldo(incremento);
                break;
            }
        }
    }
}
