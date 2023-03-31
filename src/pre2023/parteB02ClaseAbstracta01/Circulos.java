package pre2023.parteB02ClaseAbstracta01;

public class Circulos extends FGeometricas{

	private double radio;
	
	public Circulos(double radio) {
		this.radio=radio;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		double resultado = (3.14*this.radio)*(3.14*this.radio);
		return resultado;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

}
