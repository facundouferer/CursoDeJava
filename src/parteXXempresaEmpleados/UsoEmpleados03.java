package parteXXempresaEmpleados;

import java.util.Arrays;

public class UsoEmpleados03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados muchosEmpleados[] = new Empleados[5];
		
		muchosEmpleados[0] = new Empleados("Juan", 20000);
		muchosEmpleados[1] = new Empleados("pedro", 10000);
		muchosEmpleados[2] = new Empleados("carlos", 45000);
		muchosEmpleados[3] = new Empleados("Analía", 2000);
		muchosEmpleados[4] = new Empleados("Karina", 40000);
		
		System.out.println("\n SIN ORDENAMIENTO\n");
		
		for(Empleados e:muchosEmpleados) {
			System.out.println(e.getNombre());
			System.out.println(e.getDatosEmpleado());
		}
		
		Arrays.sort(muchosEmpleados);
		
		System.out.println("\n CON ORDENAMIENTO\n");
		
		for(Empleados e:muchosEmpleados) {
			System.out.println(e.getNombre());
			System.out.println(e.getDatosEmpleado());
		}
	}

}
