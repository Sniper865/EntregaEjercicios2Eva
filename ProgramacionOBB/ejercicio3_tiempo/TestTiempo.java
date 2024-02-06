package ejercicio3_tiempo;

import java.util.Scanner;

public class TestTiempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variable de tiempo 1 con horas, minutos y segundos
        Tiempo Uno = new Tiempo(0,0,0);
        System.out.println("Introduce lo(s) segundo(s)");
        Uno.setSegundos(sc.nextInt());
        System.out.println("Introduce lo(s) minuto(s)");
        Uno.setMinutos(sc.nextInt());
        System.out.println("Introduce la(s) hora(s)");
        Uno.setHoras(sc.nextInt());
        System.out.println(Uno.toString());

        //variable de tiempo 2 con horas y minutos
        Tiempo Dos = new Tiempo(0, 0);
        System.out.println("Introduce lo(s) minuto(s)");
        Dos.setMinutos(sc.nextInt());
        System.out.println("Introduce la(s) hora(s)");
        Dos.setHoras(sc.nextInt());
        System.out.println(Dos.toString());

        //variable de tiempo 3 con solo horas
        Tiempo Tres = new Tiempo(0);
        System.out.println("Introduce las horas");
        Tres.setHoras(sc.nextInt());
        System.out.println(Tres.toString());
        sc.close();
    }
    
}

