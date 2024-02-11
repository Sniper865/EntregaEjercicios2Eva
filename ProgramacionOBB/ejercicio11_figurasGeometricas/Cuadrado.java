package ejercicio11_figurasGeometricas;


/**
 * <h3>Clase Cuadrado</h3>
 * <h2>La clase Cuadrado será herencia de Figuras.</h2>
 * 
 * @author Tiago Lezcano
 * @version 1.0
 */
public class Cuadrado extends Figura {
	private int lado;

	/**
	 * Constructor para Cuadrado.
	 * 
	 * @param color
	 * @param lado
	 */
	public Cuadrado(Color color, int lado) {
		super(color);
		this.lado = lado;
	}

	// MÉTODOS PARA LADO
	/**
	 * Método getLado, retorna el valor dado al lado.
	 * 
	 * @return
	 */
	public int getLado() {
		return lado;
	}

	/**
	 * Método setLado, da un valor al parámetro lado.
	 * 
	 * @param lado
	 */
	public void setLado(int lado) {
		this.lado = lado;
	}
	// FIN MÉTODOS PARA LADO.

	// MÉTODOS PARA CÁLCULO DE CUADRADO.
	/**
	 * Método calcular área. calcula los lados del cuadrado para obtener el área.
	 * 
	 * @return area.
	 */
	public double calculaArea() {
		double area = lado * lado;
		return area;
	}

	/**
	 * Método calcular perímetro. calcula el lado por 4 para obtener el perímetro.
	 * 
	 * @return perímetro,
	 */
	public double calcularPerimetro() {
		double perimetro = 4 * lado;
		return perimetro;
	}
	// FIN MÉTODOS PARA CÁLCULO DE CUADRADO.

	@Override
	public String toString() {
		return "Cuadrado[" + super.toString() + "lado =" + lado + "," + "área =" + this.calcularArea() + ", perímetro ="
				+ this.calcularPerimetro() + "]";
	}
}
