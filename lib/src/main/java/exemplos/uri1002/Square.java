package exemplos.uri1002;
/**
 * 
 * @author Chrystian Rocha
 *
 */
public class Square extends GeometricShapes{
	double lado;
	/**
	 * Cria um quadrado com lado <code>lado</code>.
	 * @param lado
	 * @throws IllegalArgumentException
	 * 			Quando o valor do lado � menor ou igual a zero.
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
		return "Attributes: lado";
	}

}
