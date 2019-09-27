package clasesAbstractas;

public class Rectangulos extends FGeometricas{

	private double base;
	private double altura;
	
	public Rectangulos(double base, double altura) {
		this.base=base;
		this.altura=altura;
		// TODO Auto-generated constructor stub
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		double resultado = this.base*this.altura;
		return resultado;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

}
