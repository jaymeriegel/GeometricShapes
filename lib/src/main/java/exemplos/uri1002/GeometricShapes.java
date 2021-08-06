/*
 * Direitos Autorais, 2021, Jayme Gomes
 */

package exemplos.uri1002;

/**
 * The class <code>GeometricShapes</code> represents the super class of
 * all others shapes.
 * 
 * @author Jayme
 *
 */

public abstract class GeometricShapes {
	
	/**
	 * @return the area
	 */
	abstract Double getArea();
	
	/**
	 * @return a String with data about the attributes of the Geometric shape
	 */
	abstract String showAttributes();
	
}
