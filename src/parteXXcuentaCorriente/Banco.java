package parteXXcuentaCorriente;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Define el array con la cantidad de cuentas con las que se van a operar.
		Scanner teclado = new Scanner(System.in);
		System.out.print("Cantidad de cuentas a guardar:");
		int cantCuentas = teclado.nextInt();
		CuentaCorriente[] cuentas = new CuentaCorriente[cantCuentas];

		// Creación de las cuentas
		CuentaCorriente.CrearCuentas(cuentas);		

		int seleccion;
		
		do {
			System.out.print("\n--------------------------\n" 
					+ "SELECCIONE OPERACIÓN:\n" 
					+ "1 - Buscar cuenta\n"
					+ "2 - Listar cuentas\n"
					+ "3 - Realizar Transferencia\n"
					+ "0 - Finalizar\n" + "--------------------------\n");
			
			seleccion = teclado.nextInt();
			
			switch (seleccion) {

			case 1:
				// buscar una cuenta
				System.out.println("Ingresar el NRO de cuenta a buscar:");
				CuentaCorriente cuentaBuscada = CuentaCorriente.BuscarCuenta(cuentas, teclado.nextInt());
				if (cuentaBuscada.verNroCuenta() != 0) {
					System.out.println("BUSQUEDA EXITOSA!\n");
					System.out.print(cuentaBuscada.verInformacion());
				} else {
					System.out.println("no se encontro la cuenta buscada");
				}
				break;
			case 2:
				CuentaCorriente.ListarCuentas(cuentas);
				break;
			case 3:
				System.out.print("Ingrese el nro de la Cuenta ORIGEN: ");
				int nroCtaOrigen = teclado.nextInt();
				System.out.print("Ingrese el nro de la Cuenta DESTINO: ");
				int nroCtaDestino = teclado.nextInt();
				CuentaCorriente origen = CuentaCorriente.BuscarCuenta(cuentas, nroCtaOrigen);
				CuentaCorriente destino = CuentaCorriente.BuscarCuenta(cuentas, nroCtaDestino);
				System.out.print("Ingrese el monto a transferir: ");
				double monto = teclado.nextDouble();
				CuentaCorriente.Transferir(origen, destino, monto);
			default:
				break;
			}
		} while (seleccion != 0);
		
		System.out.println("FIN DE LA EJECUCIÓN");

	}

}
