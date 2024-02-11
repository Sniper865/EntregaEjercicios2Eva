package ejercicio11_figurasGeometricas;

/**
 * <h3>Clase Círculo</h3>
 * <h4>Clase herencia de Figura.</h4>
 * 
 * @author Dnaiel Garcia
 * @version 1.0
 */
public class Circulo extends Figura {
	private int radio;

	/**
	 * Constructor de la figura Círculo.
	 * 
	 * @param color
	 * @param radio
	 */
	public Circulo(Color color, int radio) {
		super(color);
		this.radio = radio;
	}

	public Circulo() {

	}

	// MÉTODOS PARA OBTENER EL RADIO.
	/**
	 * Método getRadio
	 * 
	 * @return devuelve el valor dado a Radio.
	 */
	public int getRadio() {
		return radio;
	}

	/**
	 * Método setRadio, introduce el valor al parámetro Radio.
	 * 
	 * @param radio
	 */
	public void setRadio(int radio) {
		this.radio = radio;
	}

	// FIN MÉTODOS DEL RADIO.
	// MÉTODOS PARA CALCULAR EL ÁREA Y PERÍMETRO.
	/**
	 * Método para calcular el área del círculo.
	 * 
	 * @return area.
	 */
	public double calculaArea() {
		double area = Math.PI * Math.pow(radio, 2);
		return area;
	}

	/**
	 * Método para calcular el perímetro del círculo.
	 * 
	 * @return perimetro.
	 */
	public double calculaPerimetro() {
		double perimetro = Math.PI * Math.pow(radio, 2);
		return perimetro;
	}
	// FIN MÉTODOS PARA ÁREA Y PERÍMETRO.

	@Override
	public String toString() {
		return "Círculo [radio =" + radio + ", área =" + this.calculaArea() + ", perímetro =" + this.calculaPerimetro()
				+ super.toString() + "]";
	}
}
