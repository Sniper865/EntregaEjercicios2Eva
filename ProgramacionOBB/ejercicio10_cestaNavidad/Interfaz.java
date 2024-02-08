package ejercicio10_cestaNavidad;
import java.util.*;
public class Interfaz {
    
    public static Scanner sc = new Scanner(System.in);

    Producto jamon = new Producto("Jamon Serrano", 40, false);
    Producto lata = new Producto("Lata Foie Grass", 10, true);
    Producto turron = new Producto("Turron de Almendras", 5, true);
    Producto caja = new Producto("Caja de mazapanes", 8, true);
    Producto sidra = new Producto("Botella de Sidra", 8, false);
    Producto cava = new Producto("Botella de Cava", 15, false);

    public void MostrarProductos() {
        System.out.println(jamon.toString());
        System.out.println(lata.toString());
        System.out.println(turron.toString());
        System.out.println(caja.toString());
        System.out.println(sidra.toString());
        System.out.println(cava.toString());
    }

    public void Menu(){
        ArrayList <CestaNavidad> cestas;
        int eleccion = 0;
        while (eleccion != 10){
            System.out.println("");
            eleccion = sc.nextInt();
            switch(eleccion){
                case 1:
                    System.out.println("Añadir una nueva cesta");
                    cestas.add(CestaNavidad);
                    break;
                case 2:

                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
            }

        }
    }
}
