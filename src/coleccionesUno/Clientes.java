package coleccionesUno;

public class Clientes {
	
	private String nombre; 
	private String nroCuenta; 
	private double saldo;
	
	public Clientes(String nombre, String nroCuenta, double saldo) {
		this.nombre = nombre;
		this.nroCuenta = nroCuenta;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNroCuenta() {
		return nroCuenta;
	}

	public void setNroCuenta(String nroCuenta) {
		this.nroCuenta = nroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
