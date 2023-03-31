package pre2023.parteXXcuentaCorriente;

import java.util.Scanner;

public class CuentaCorriente {
	
	private String nombre;
	private double saldo;
	private int nroCuenta;
	
	public CuentaCorriente(String nombre, double saldo, int nroCuenta) {
		this.nombre = nombre;
		this.saldo = saldo;
		this.nroCuenta = nroCuenta;
	}
	
	public CuentaCorriente() {
		this.nombre = null;
		this.saldo = 0; 
		this.nroCuenta = 0;
	}
	
	public String verInformacion() {
		
		return ("\n-------INFORMACION DE CUENTA---------\n"+
				"Nombre: "+this.nombre+"\n"+
				"nro Cuenta: "+Double.toString(this.nroCuenta)+"\n"+
				"Saldo: $"+this.saldo+"\n");
	}
	
	public void depositar(double monto) {
		this.saldo = this.saldo + monto;
	}
	
	public void extraer(double monto) {
		this.saldo = this.saldo - monto;
	}
	
	public String verSaldo() {
		return "$ "+Double.toString(this.saldo);
	}
	
	public long verNroCuenta() {
		return this.nroCuenta;
	}
	
	//metodo estático: pueden utilizarse sin instanciar los objetos.
	
	public static void Transferir(CuentaCorriente origen, CuentaCorriente destino ,double monto) {
		destino.depositar(monto);
		origen.extraer(monto);
	}
	
	public static void ListarCuentas(CuentaCorriente[] cuentas) {
		for(CuentaCorriente cuenta:cuentas) {
			System.out.print(cuenta.verInformacion());
		}
	}
	
	public static void CrearCuentas(CuentaCorriente[] cuentas) {
		Scanner teclado = new Scanner(System.in);
		for(int i=0; i < cuentas.length; i++) {
			System.out.print("Nombre: ");
			String nombre = teclado.next();
			System.out.print("Saldo inicial: ");
			double saldo = teclado.nextDouble();
			System.out.print("Nro Cuenta: ");
			int nroCuenta = teclado.nextInt();
			System.out.print("\n---------------------\n");
			CuentaCorriente cuenta = new CuentaCorriente(nombre, saldo, nroCuenta);
			cuentas[i]= cuenta;
		}
	}
	
	public static CuentaCorriente BuscarCuenta(CuentaCorriente[] cuentas, int nroCuenta) {
		CuentaCorriente cuentaSalida = new CuentaCorriente();
		for(CuentaCorriente cuenta:cuentas) {
			if(cuenta.verNroCuenta()==nroCuenta) {
				cuentaSalida = cuenta;
				break;
			}
		}
		return cuentaSalida;
		
	}

}
