package exemplos.uri1002;

/**
 * 
 * @author Chrystian Rocha
 *
 */
public class Retangle extends GeometricShapes{

	private double lado, altura;
	
	/**
	 * 
	 * @param lado
	 * @param altura
	 */
	public Retangle(double lado, double altura) {
		super();
		if(lado <= 0 || altura <=0) {
			throw new IllegalArgumentException();
		}
		this.lado = lado;
		this.altura = altura;
	}

	/**
	 * @return the area
	 */
	@Override
	Double getArea() {
		// TODO Auto-generated method stub
		return lado * altura;
	}

	@Override
	String showAttributes() {
		// TODO Auto-generated method stub
		return "Attributes lado: " + lado + " altura: " + altura;
	}

}
