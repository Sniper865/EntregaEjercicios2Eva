package herencia;

/**
 * <h2>Clase Trabajador que hereda de Persona</h2>
 * 
 * @version 1-2024
 * @author Carlos Sánchez Pellón
 * @since 22-01-2024
 */
public class Trabajador extends Persona {
	/**
	 * salario: salario base bruto; horas: horas trabajadas; IRPF: descuento al
	 * salario para calcular el sueldo; complementos: dinero a sumar al salario
	 */
	private float salario, irpf, complementos;
	private int horas;

	/**
	 * Cpnstructor
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param fecha Fecha de nacimiento
	 * @param salario Salario base bruto
	 * @param irpf Porcentaje a descontar del sueldo bruto
	 * @param complementos Complementos a sumar al salario base
	 * @param horas Horas trabajadas
	 * @see Persona.Persona(String, String, String, String)
	 */
	public Trabajador(String nombre, String apellidos, String dni, String fecha, float salario, float irpf,
			float complementos, int horas) {
		super(nombre, apellidos, dni, fecha);
		this.salario = salario;
		this.irpf = irpf;
		this.complementos = complementos;
		this.horas = horas;

	}
	
	/**
	 * Método para ver si dos trabajadores son iguales
	 * 
	 * @param t2 Segundo trabajador, al que se compara
	 * @return True si son iguales
	 */
	public boolean equals(Trabajador t2) {
		return this == t2;
	}

	/**
	 * Método para calcular el sueldo neto mensual
	 * 
	 * @return Sueldo neto mensual
	 */
	public float sueldoMes() {
		return (this.salario + this.complementos) - (this.salario + this.complementos) * (this.irpf / 100);
	}

	/**
	 * Método para calcular el sueldo por hora
	 * 
	 * @param diasMes Días del mes en el que se calcula el sueldo
	 * @return Sueldo por horas
	 * @see sueldoMes(int, int)
	 */
	public float sueldoHora(int diasMes, int horasDia) {
		return sueldoMes() / diasMes / horasDia;
	}

	/**
	 * Método para calcular el dinero total percibido por las horas trabajadas
	 * 
	 * @param diasMes Días del mes en el que se calcula el sueldo
	 * @return Total percibido
	 * @see sueldoHora(int, int)
	 */
	public float totalPercibido(int diasMes, int horasDia) {
		return sueldoHora(diasMes, horasDia) * this.horas;
	}

	/**
	 * Método para imprimir todos los datos del trabajador
	 * 
	 * @param diasMes Días del mes en el que se calcula el sueldo
	 * @return String con todos los datos del trabajador
	 * @see Persona.toString()
	 * @see sueldoMes()
	 * @see sueldoHora(int, int)
	 * @see totalPercibido(int, int)
	 */
	public String toString(int diasMes, int horasDia) {
		return "Trabajador :\n" + super.toString() + "\nSalario: " + this.salario + "\tComplementos: "
				+ this.complementos + "\tIRPF: " + this.irpf + "\tHoras trabajadas: " + this.horas
				+ "\n\nSueldo mensual: " + this.sueldoMes() + "\nSueldo por hora: " + this.sueldoHora(diasMes, horasDia)
				+ "\nTotal percibido: " + this.totalPercibido(diasMes, horasDia);
	}

}
