package ejercicio7_director;

import java.util.Scanner;
public class PeliculaUnoTest {
    public static void main(String[] args) {                                                                        
        Scanner sc = new Scanner(System.in);
        Director DirUno = new Director("Woody","Allen","Francia",1935);
        System.out.println(DirUno.toString());
        Pelicula PelUno = new Pelicula();
        PelUno.setDirector(DirUno);
        System.out.println("Introduce el titulo de la pelicula");
        PelUno.setTitulo(sc.nextLine());
        System.out.println("Introduce el año de produccion de la pelicula");
        PelUno.setAProduccion(sc.nextInt());
        System.out.println(PelUno.toString());
        sc.close();
    }
}
