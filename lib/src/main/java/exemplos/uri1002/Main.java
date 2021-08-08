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
		double raio, EntradaA, EntradaB, EntradaC;
		Circle c1;
		Square s1;
		Retangle r1;
		Triangle t1;
		double area;
		
		teclado = new Scanner(System.in);
		raio = teclado.nextDouble();
		EntradaA = teclado.nextDouble();
		EntradaB = teclado.nextDouble();
		EntradaC = teclado.nextDouble();
		teclado.close();
		
		c1 = new Circle(raio);
		area = c1.getArea();
		/**
		 * Circulo o unico que não utiliza as mesma entradas dos outros
		 * Utiliza entradas e saidas do exercicio 1002
		 */
		System.out.printf("CIRCULO EX 1002: %.4f\n\n", area);

		/**
		 * Outros utilizam entradas e saidas do exercicio 1012
		 * 
		 */
		s1 = new Square(EntradaB);
		area = s1.getArea();

		System.out.printf("QUADRADO: %.3f\n", area);

		r1 = new Retangle(EntradaA, EntradaB);
		area = r1.getArea();

		System.out.printf("RETANGULO: %.3f\n", area);

		t1 = new Triangle(EntradaA, EntradaC);
		area = t1.getArea();
		
		System.out.printf("TRIANGULO: %.3f\n", area);
		
	}

}