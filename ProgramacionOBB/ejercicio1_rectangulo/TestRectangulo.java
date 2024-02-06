package ejercicio1_rectangulo;

import java.util.*;

public class TestRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangulo[] rectangulos = new Rectangulo[5];
        
        for (int i=0;i < rectangulos.length;i++) {
            int nRandom = (int) (Math.random()*20)+1;
            int nRandom2 = (int) (Math.random()*20)+1;
            rectangulos[i] = new Rectangulo(nRandom, nRandom2);
            rectangulos[i].area();
            rectangulos[i].perimetro();
        }
        System.out.println("De que rectangulo quieres ver los valores, hay 6 rectangulos");
        int eleccion = sc.nextInt();
        switch(eleccion-1){
            case 0:
                System.out.println(rectangulos[0].toString());
                break;
            case 1:
                System.out.println(rectangulos[1].toString());
                break;
            case 2:
                System.out.println(rectangulos[2].toString());
                break;
            case 3:
                System.out.println(rectangulos[3].toString()); 
                break;
            case 4:
                System.out.println(rectangulos[4].toString());
                break;
            case 5:
                System.out.println(rectangulos[5].toString());
                break;
        }
        sc.close();
    }
    
}