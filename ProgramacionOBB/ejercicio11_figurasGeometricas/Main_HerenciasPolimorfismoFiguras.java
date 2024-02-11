package ejercicio11_figurasGeometricas;
/**
 * <h3>Main de Figuras</h3>
 * <h4>Esta clase main será la prueba de la herencia de
 * Figuras, cuya hijas son Círculo, Cuadrado y Triángulo.</h4>
 * @author Tiago Lezcano.
 * @version 1.0
 */
public class Main_HerenciasPolimorfismoFiguras {
	public static void main(String[] args) {
		Conjunto Array1 = new Conjunto();
		Array1.addFigura(new Cuadrado(Color.Rojo,6));
		Array1.addFigura(new Circulo(Color.Verde,5)); 
		
		System.out.println(Array1.toString());
		System.out.println("La suma de las Áreas es: "+ Array1.sumaAreas());
		System.out.println("La suma de los perímetros es: "+ Array1.sumaPerimetros());
	}
}
