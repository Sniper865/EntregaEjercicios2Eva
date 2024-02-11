package ejercicio11_figurasGeometricas;

/**
 * <h3>Clase Figura</h3>
 * <h2>Esta clase será la padre de las demás figuras.</h2>
 * 
 * @author By: Daniel Garcia
 * @version 1.0
 */
public class Figura {
	Color color;

	/**
	 * El parámetro color hace referencia a la clase enum de colores, que
	 * compartirán cada figura.
	 * 
	 * @param color
	 */
	public Figura(Color color) {
		this.color = color;
	}

	public Figura() {
	}

	/**
	 * Constructor de Figura.
	 */
	// MÉTODOS PARA CÁLCULOS
	public double calcularArea() {
		return 0.0;
	}

	public double calcularPerimetro() {
		return 0.0;
	}
	// FIN MÉTODOS CÁLCULOS

	// INICIO MÉTODOS PARA COLOR
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	// FIN MÉTODOS PARA COLOR
	@Override
	public String toString() {
		return "Color: " + color + "";
	}
}
