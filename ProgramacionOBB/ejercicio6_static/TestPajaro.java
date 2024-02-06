package ejercicio6_static;

public class TestPajaro {
    public static void main(String[] args) {
        Pajaro Uno = new Pajaro("Petirrojo", "Negro y rojo");
        Pajaro Dos = new Pajaro("Cuervo", "Negro");
        Pajaro Tres = new Pajaro("Martin Pescador", "Azul");
        System.out.println(Uno.toString());
        System.out.println(Dos.toString());
        System.out.println(Tres.toString());
    }
}