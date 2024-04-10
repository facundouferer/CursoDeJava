package viejes.parteYpracticaNro04;

public class UsoCuenta {

	public static void main(String[] args) {
		/*
		 * Crea una clase capaz de crear cuentas corrientes bancarias con las siguientes
		 * caracter�sticas:
		 * Nombre de clase: CuentaCorriente.
		 * Propiedades:
		 * saldo (double)
		 * nombreTitular (String)
		 * numeroCuenta (long)
		 * Constructor con dos par�metros:
		 * nombreTitular (String)
		 * saldo (double)
		 * Este constructor se encargar� de establecer un nombre de titular para la
		 * cuenta corriente, un saldo inicial y asignar� un n� a la cuenta corriente de
		 * tipo long de forma aleatoria
		 * M�todos:
		 * 2 setter: permitir�n hacer ingresos y reintegros en un objeto de tipo
		 * CuentaCorriente.
		 * 2 getter: Permitir�n obtener saldo de la cuenta y datos generales de una
		 * CuentaCorriente.
		 * 1 m�todo adicional: permitir� realizar transferencias de dinero de una cuenta
		 * a otra.
		 * 
		 * Crea una clase principal con el nombre de UsoCuenta. Crea dos instancias de
		 * CuentaCorriente con el nombre de Cuenta1 y Cuenta2. Haz una transferencia de
		 * Cuenta1 a Cuenta2 por un importe de $200. Imprime los datos de las dos
		 * cuentas en consola.
		 * 
		 */

		CuentaCorriente cuenta1 = new CuentaCorriente("Facundo", 300);
		CuentaCorriente cuenta2 = new CuentaCorriente("Anabela", 300);
		cuenta1.setReintegro(200);
		cuenta2.setIngreso(200);
		System.out.println(cuenta1.getDatos());
		System.out.println(cuenta2.getDatos());

	}

}
