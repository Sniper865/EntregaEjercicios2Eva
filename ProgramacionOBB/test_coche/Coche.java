package test_coche;

public class Coche {
	private String marca, modelo, color;
	private int potencia, maletero, puertas, velocidad;
	private float precio;

	public Coche(String marca, String modelo, String color, int maletero, int puertas, int potencia, float precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.maletero = maletero;
		this.puertas = puertas;
		this.potencia = potencia;
		this.precio = precio;
		velocidad = 0;

	}

	public void setMarca(String marca) {
		this.marca = marca;

	}

	public String getMarca() {
		return marca;

	}

	public void setModelo(String modelo) {
		this.modelo = modelo;

	}

	public String getModelo() {
		return modelo;

	}

	public void setColor(String color) {
		this.color = color;

	}

	public String getColor() {
		return color;

	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;

	}

	public int getPotencia() {
		return potencia;

	}

	public void setMaletero(int maletero) {
		this.maletero = maletero;

	}

	public int getMaletero() {
		return maletero;

	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;

	}

	public int getPuertas() {
		return puertas;

	}

	public void setPrecio(float precio) {
		this.precio = precio;

	}

	public float getPrecio() {
		return precio;

	}

	public int getVelocidad() {
		return velocidad;

	}

	public void acelerar(int mas) {
		velocidad += mas;
		
	}

	public void frenar(int menos) {
		velocidad -= menos;
		
	}

	public void parar() {
		velocidad = 0;
		
	}

	public String toString() {
		String str = "****CARACTERÍSTICAS DEL COCHE****\nMARCA: " + marca + "\nMODELO: " + modelo + "\nCOLOR: " + color + 
				"\nPOTENCIA: " + " CV. \nMALETERO: " + maletero + " L. \nPUERTAS: " + puertas + "\nPRECIO: " + precio + " €\n";
		
		return str;
		
	}

}
