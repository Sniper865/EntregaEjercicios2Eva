package ejercicio11_figurasGeometricas;

import java.util.*;

/**
 * <h3>Clase Conjunto.</h3>
 * <h2>En ésta clase calcularemos las partes de las figuras.
 * 
 * </h2>
 * 
 * @author Tiago Lezcano
 * @version 1.0
 */
public class Conjunto {
	private ArrayList<Figura> Arrayfiguras;

	/**
	 * Constructor para la creación del ArrayList. Aquí serán guardadas las figuras
	 * y sus cálculos.
	 */
	public Conjunto() {
		Arrayfiguras = new ArrayList<Figura>();
	}

	// MÉTODOS PARA EL ARRAY DE FIGURAS.
	/**
	 * Método para agregar figuras.
	 * 
	 * @param figura
	 */
	public void addFigura(Figura figura) {
		Arrayfiguras.add(figura);
	}

	/**
	 * Retorna las figuras que hay dentro del Array.
	 * 
	 * @return
	 */
	public ArrayList<Figura> getArrayfiguras() {
		return Arrayfiguras;
	}
	// FIN MÉTODOS PARA ARRAY FIGURAS.

	// INICIO MÉTODOS PARA CÁLCULOS DE FIGURAS.
	/**
	 * Retorna la suma del valor de i, que será el cálculo de la área de la figura
	 * que queramos.
	 * 
	 * @return
	 */
	public double sumaAreas() {
		double i = 0;
		for (Figura figura : Arrayfiguras) {
			figura.calcularArea();
			i += figura.calcularArea();
		}
		return i;
	}

	/**
	 * 
	 * @return Retorna el valor de i, que será el cálculo del perímetro de la figura
	 *         que querramos.
	 */
	public double sumaPerimetros() {
		double i = 0;
		for (Figura figura : Arrayfiguras) {
			figura.calcularPerimetro();
			i += figura.calcularPerimetro();
		}
		return i;
	}

	// FIN MÉTODOS DE CÁLCULOS DE FIGURAS.

	/**
	 * Método toString para mostrar los datos de las figuras.
	 */
	public String toString() {
		String s = "Conjunto de Figuras";
		s += "\n";
		for (Figura figura : Arrayfiguras) {
			s += figura.toString();
			s += "\n";
		}
		return s;
	}

}
