package ejercicio7_director;

public class PeliculaDosTest {
    public static void main(String[] args) {
        Director DirUno = new Director("Peter","Jackson","Nueva zelanda",1961);
        Pelicula PelUno = new Pelicula("El señor de los anillos");
        PelUno.setAProduccion(2001);
        PelUno.setDirector(DirUno);
        System.out.println(PelUno.toString());
    }
}
