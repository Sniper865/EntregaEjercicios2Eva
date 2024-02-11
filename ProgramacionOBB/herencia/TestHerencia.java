package herencia;

public class TestHerencia {

	public static void main(String[] args) {
		Trabajador t1 = new Trabajador("Carlos", "Sánchez Pellón", "50248241R", "7-11-2002", 1000, 20, 500, 300);

		System.out.println(t1.toString(30, 8));
	}

}
