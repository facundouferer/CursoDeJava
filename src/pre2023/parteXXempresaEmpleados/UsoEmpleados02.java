package pre2023.parteXXempresaEmpleados;

public class UsoEmpleados02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jefes fulano = new Jefes("Fulano", 69000);
		fulano.setCargo("Director de algo");
		System.out.println(fulano.getDatosEmpleado()+"\n"
				+fulano.getCargo());

	}

}
