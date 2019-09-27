package trabajoPracticoNro06;

import java.util.Scanner;

public class Principal {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner (System.in);
        int  cantidad, longitud;
		
		System.out.println("cantidad de contraseñas:");
		cantidad = scan.nextInt();
        
        System.out.println("longitud de la/las contraseña/as:");
        longitud = scan.nextInt();
        
        Passwords passwords = new Passwords(cantidad, longitud);

        System.out.println("CONTRASEÑAS");

        for (int i = 0; i < passwords.getPasswords().length; i++) {
        	
            System.out.print(passwords.getPasswords()[i]);
            System.out.print("--->");
            
            if(passwords.analizarSeguridad(passwords.getPasswords()[i])==1) {
            	System.out.print("FUERTE");
            }else {
            	System.out.print("DEBIL");
            }
            
            System.out.println("");
            
        }

	}

}
