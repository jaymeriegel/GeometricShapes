/*
 * Direitos Autorais, 2021, Jayme Gomes.
 */
package exemplos.uri1002;

/**
 * A classe <code>Circle</code> represents a circle w/ radius.
 * 
 * @author Jayme
 *
 */
public class Circle extends GeometricShapes {
	
	/*
	 * 
	 */
	private double raio;

	/*
	 * 
	 */
	private static final double PI = 3.14159;

	/**
	 * Cria um c�rculo com <code>raio</code>.
	 * 
	 * @param raio o raio do novo c�rculo
	 * @throws IllegalArgumentException
	 * 			Quando o valor do raio � menor ou igual a zero.
	 */
	public Circle(double raio) {
		super();
		if (raio <= 0.0) {
			throw new IllegalArgumentException();
		}
		this.raio = raio;
	}

	/**
	 * @return the area
	 */
	public Double getArea() {
		return raio * raio * PI;
	}

	@Override
	public String showAttributes() {
		return "Attributes: raio";
	}

}
