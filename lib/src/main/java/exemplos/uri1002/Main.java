/**
 * 
 */
package exemplos.uri1002;

import java.util.Scanner;

/**
 * @author Jayme Gomes
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado;
		double raio, lado;
		Circle c1;
		Square s1;
		double area;
		
		teclado = new Scanner(System.in);
		raio = teclado.nextDouble();
		lado = teclado.nextDouble();
		teclado.close();
		
		c1 = new Circle(raio);
		area = c1.getArea();
		
		System.out.printf("A = %.3f\n", area);

		s1 = new Square(lado);
		area = s1.getArea();

		System.out.printf("A = %.3f\n", area);

	}

}