package herencia;

/**
 * <h2>Clase Persona que servirá de superclase para crear la subclase
 * trabajador</h2>
 * 
 * @version 1-2024
 * @author Carlos Sánchez Pellón
 * @since 22-01-2024
 */
public class Persona {
	private String nombre, apellidos, dni, fechaNacimiento;

	/**
	 * Constructor
	 * 
	 * @param nombre
	 * @param apellidos 
	 * @param dni
	 * @param fecha Fecha de nacimiento
	 */
	public Persona(String nombre, String apellidos, String dni, String fecha) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fecha;

	}

	/**
	 * Método para imprimir los datos de la persona
	 * 
	 * @return String con los datos
	 */
	public String toString() {
		return "Nombre: " + this.nombre + this.apellidos + "\tDNI: " + this.dni
				+ "\tFecha de nacimiento: " + this.fechaNacimiento;
	}

}
