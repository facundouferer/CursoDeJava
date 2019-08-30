package empresaEmpleados;

public class UsoEmpleados {

	public static void main(String[] args) {
		/*
		 * En este programa veremos: Polimorfismo, Principio de sustitución y Enlazado Dinámico
		 */
		
		Empleado[] Empleados = new Empleado[5];
		
		Empleados[0]=new Empleado("Gatón",48000);
		Empleados[1]=new Empleado("Carlitos",48000);
		Empleados[2]=new Empleado("Lucía",48000);
		Empleados[3]=new Empleado("Rita",48000);
		
		/*
		 * PRINCIPIO DE SUSTITUCIÓN
		 * Como un Jefe es un empleado por principio de sustitución
		 * podemos almacenar un objeto de tipo jefe en un array de empleado
		 * porque un JEFE es un EMPLEADO
		 */
		Empleados[4]=new Jefe("Victor",50000); //PRINCIPIO DE SUSTITUCIÓN
		
		for(Empleado objeto:Empleados) {
			/*
			 * Por POLIMORFISMO podemos utilizar el mismo método getSueldo
			 * que es distinto en la clase empleado y jefe
			 * pero como las dos propiedades tienen el mismo nombre (polimorfismo)
			 * y los mismo parámetros, podemos utilizar las dos
			 * Esto es porque el interprete de JAVA por medio del 
			 * ENLAZAMIENTO DINÁMICO sabe que método utilizar. 
			 */
			System.out.println(objeto.getDatosEmpleado()+"\nSALARIO: "+objeto.getSueldo());
		}
		
		
		
	}

}
