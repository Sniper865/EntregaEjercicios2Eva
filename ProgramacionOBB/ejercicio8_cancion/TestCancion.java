package ejercicio8_cancion;
import java.util.Scanner;
public class TestCancion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cancion Pepe = new Cancion("","");
        System.out.println("Introduce el titulo de la cancion");
        Pepe.setTitulo(sc.nextLine());
        System.out.println("Introduce el autor de la cancion");
        Pepe.setAutor(sc.nextLine());
        System.out.println(Pepe.toString());
        sc.close();
    }
}
