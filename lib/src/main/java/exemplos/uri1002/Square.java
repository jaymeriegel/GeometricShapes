package exemplos.uri1002;
/**
 * 
 * @author Chrystian Rocha
 *
 */
public class Square extends GeometricShapes{
	private double lado;
	
	/**
	 * Cria um quadrado com <code>lado</code>.
	 * 
	 * @param lado
	 * @throws IllegalArgumentException
	 * 			Quando o valor do lado é menor ou igual a zero.
	 */
	public Square(double lado) {
		super();
		if(lado <= 0.0) {
			throw new IllegalArgumentException();
		}
		this.lado = lado;
	}
	
	/**
	 * return area
	 */
	@Override
	Double getArea() {
		// TODO Auto-generated method stub
		return lado * lado;
	}

	@Override
	String showAttributes() {
		// TODO Auto-generated method stub
		return "Attributes lado: " + lado;
	}

}
