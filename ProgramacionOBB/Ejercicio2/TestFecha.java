package Ejercicio2;
import java.util.Scanner;
public class TestFecha {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fecha Primero = new Fecha(0, 0, 0);
        System.out.println("Escribe el año");
        Primero.setAnno(sc.nextInt());
        System.out.println("Escribe el mes");
        Primero.setMes(sc.nextInt());
        System.out.println("Escribe el dia");
        Primero.setDia(sc.nextInt());
        System.out.println(Primero.toString());
        sc.close();
    }
    
}
