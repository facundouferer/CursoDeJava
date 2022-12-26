package parteZ01Parcial_2_2022_11_17;

import java.util.ArrayList;
import java.util.Scanner;

public class Administrador {

    private ArrayList<Contacto> contactos;
    private Archivo archivo;

    public Administrador() {
        archivo = new Archivo("contactos.txt");
        this.contactos = new ArrayList<>();
    }
    static void mostrarMenu(){
        System.out.println("\n ADMINISTRADOR DE CONTACTOS:");
        System.out.println("1) Nuevo Contacto");
        System.out.println("2) Listar todos los Contacto");
        System.out.println("3) Buscar Contacto por nombre o apellido.");
        System.out.println("4) Buscar Contacto por DNI.");
        System.out.println("5) Eliminar Contacto por DNI");
        System.out.println("6) imprimir en un archivo.");
        System.out.println("7) Editar Contacto.");
        System.out.println("99) salir");
        System.out.print("Ingrese una opcion: ");
    }

    public void nuevoContacto(){
        boolean error = false;
        do{
            try{
                Scanner leer = new Scanner(System.in);
                System.out.print("Ingrese el nombre: ");
                String nombre = leer.next();
                System.out.print("Ingrese el apellido: ");
                String apellido = leer.next();
                System.out.print("Ingrese el DNI: ");
                int dni = leer.nextInt();
                System.out.print("Ingrese el telefono: ");
                String telefono = leer.next();
                System.out.print("Ingrese el email: ");
                String email = leer.next();
                Contacto nuevoContacto = new Contacto(nombre, apellido, dni, telefono, email);
                this.contactos.add(nuevoContacto);
            }catch (Exception e){
                System.out.println("ERROR EN EL INGRESO DE DATOS");
                error = true;
            }
        }while (error);
    }

    public void listarContacto(){
        for (Contacto contacto : contactos) {
            System.out.println(contacto.toString());
        }
        System.out.println("Cantidad de contactos: " + contactos.size());
    }

    public void buscarContactoNombre(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Nombre o Apellido: ");
        String nombreOapellido = leer.next();
        int cantContectos = 0;
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombreOapellido) || contacto.getApellido().equals(nombreOapellido)){
                System.out.println(contacto);
                cantContectos++;
            }
        }
        System.out.println("Cantidad de contactos: " + cantContectos);
    }

    public void buscarContactoDNI(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el DNI: ");
        int dni = leer.nextInt();
        int cantContectos = 0;
        for (Contacto contacto : contactos) {
            if (contacto.getDni() == dni){
                System.out.println(contacto);
                cantContectos++;
            }
        }
        System.out.println("Cantidad de contactos: " + cantContectos);
    }

    public void eliminarContactoDNI(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el DNI: ");
        int dni2 = leer.nextInt();
        //delete contacto by DNI
        for (Contacto contacto : contactos) {
            if (contacto.getDni() == dni2){
                contactos.remove(contacto);
                System.out.println("Contacto eliminado");
                break;
            }
        }
    }

    //editing data of contact
    public void editarContacto(){
        Scanner dniBuscar = new Scanner(System.in);
        System.out.print("Ingrese el DNI: ");
        int dni3 = dniBuscar.nextInt();
        for (Contacto contacto : contactos) {
            if (contacto.getDni() == dni3){
                Scanner leer = new Scanner(System.in);
                System.out.print("Ingrese el nombre: ");
                String nombre = leer.next();
                System.out.print("Ingrese el apellido: ");
                String apellido = leer.next();
                System.out.print("Ingrese el telefono: ");
                String telefono = leer.next();
                System.out.print("Ingrese el email: ");
                String email = leer.next();
                contacto.setNombre(nombre);
                contacto.setApellido(apellido);
                contacto.setTelefono(telefono);
                contacto.setEmail(email);
                System.out.println("Contacto editado");
                break;
            }
        }
    }

    public void imprimirEnArchivo(){
        String lista = "";
        for (Contacto contacto : contactos) {
            lista += contacto.toString() + "\n";
        }
        archivo.imprimir(lista);
    }

}

