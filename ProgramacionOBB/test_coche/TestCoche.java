package test_coche;

import java.util.*;

public class TestCoche {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Coche coche1 = new Coche("Toyota", "Corolla", "azul", 0, 0, 0, 0);
        coche1.setPotencia(150);
        coche1.setMaletero(400);
        coche1.setPuertas(4);
        coche1.setPrecio(25000);
        System.out.println(coche1.toString());

        System.out.print("¿De qué color desea pintar el coche1? ");
        coche1.setColor(sc.next());

        Coche coche2 = new Coche("Ford", "Focus", "gris", 0, 0, 0, 0);
        coche2.setPotencia(120);
        coche2.setMaletero(350);
        coche2.setPuertas(5);
        coche2.setPrecio(22000);
        System.out.println(coche2.toString());

        Coche coche3 = new Coche("Mercedes-Benz", "Clase C", "negro", 0, 0, 0, 0);
        coche3.setPotencia(200);
        coche3.setMaletero(450);
        coche3.setPuertas(4);
        coche3.setPrecio(35000);
        System.out.println(coche3.toString());

        coche1.acelerar(80); // Acelera el coche1 a 80 km/h
        System.out.println("Velocidad del coche1: " + coche1.getVelocidad() + " km/h");

        coche2.acelerar(70); // Acelera el coche2 a 70 km/h
        System.out.println("Velocidad del coche2: " + coche2.getVelocidad() + " km/h");

        coche3.acelerar(100); // Acelera el coche3 a 100 km/h
        System.out.println("Velocidad del coche3: " + coche3.getVelocidad() + " km/h");

        coche1.frenar(30); // Reduce la velocidad del coche1 en 30 km/h
        System.out.println("Velocidad del coche1 después de frenar: " + coche1.getVelocidad() + " km/h");

        coche2.frenar(20); // Reduce la velocidad del coche2 en 20 km/h
        System.out.println("Velocidad del coche2 después de frenar: " + coche2.getVelocidad() + " km/h");

        coche3.frenar(50); // Reduce la velocidad del coche3 en 50 km/h
        System.out.println("Velocidad del coche3 después de frenar: " + coche3.getVelocidad() + " km/h");

        coche1.parar(); // Detiene el coche1
        System.out.println("Velocidad del coche1 después de parar: " + coche1.getVelocidad() + " km/h");

        coche2.parar(); // Detiene el coche2
        System.out.println("Velocidad del coche2 después de parar: " + coche2.getVelocidad() + " km/h");

        coche3.parar(); // Detiene el coche3
        System.out.println("Velocidad del coche3 después de parar: " + coche3.getVelocidad() + " km/h");
        sc.close();
    }
}
