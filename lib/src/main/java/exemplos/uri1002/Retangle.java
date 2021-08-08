package exemplos.uri1002;

/**
 * 
 * @author Chrystian Rocha
 *
 */
public class Retangle extends GeometricShapes{

	private double lado, altura;
	
	/**
	 * Cria um retangulo com <code>lado</code> e <code>altura</code>.
	 * 
	 * @param lado
	 * @param altura
	 * 	 * @throws IllegalArgumentException
	 * 			Quando o valor do lado ou altura é menor ou igual a zero.
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
