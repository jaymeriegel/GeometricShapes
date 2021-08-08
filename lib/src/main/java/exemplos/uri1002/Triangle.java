package exemplos.uri1002;

/**
 * 
 * @author Chrystian Rocha
 *
 */
public class Triangle extends GeometricShapes{

	private double base;
	private double altura;

	/**
	 * Cria um triangulo com <code>base</code> e <code>altura</code>
	 * 
	 * @param base
	 * @param altura
	 * 	 * @throws IllegalArgumentException
	 * 			Quando o valor do base ou altura é menor ou igual a zero.
	 */
	public Triangle(double base, double altura) {
		super();
		if (base <= 0 || altura <= 0) {
			throw new IllegalArgumentException();
		}

		this.base = base;
		this.altura = altura;
	}

	@Override
	Double getArea() {
		// TODO Auto-generated method stub
		return (base * altura) / 2;
	}

	@Override
	String showAttributes() {
		// TODO Auto-generated method stub
		return "Attributes base: " + base + " altura: " + altura;
	}
	
	

}
