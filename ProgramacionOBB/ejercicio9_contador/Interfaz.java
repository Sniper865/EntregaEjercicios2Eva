package ejercicio9_contador;
import java.util.Scanner;
public class Interfaz {
    public static Scanner sc = new Scanner(System.in);
    public void menu(){
        String menu = "1. Inicializar/Reiniciar contador"+"\n"+
                      "2. Crear alarmas"+"\n"+
                      "3. Incrementar temporizador"+"\n"+
                      "4. Decrementar temporizador"+
                      "5. Detener contador";
        int eleccion = 0;
        while (eleccion != 5){
            Contador Uno = new Contador(0, 0, 0);
            System.out.println(menu);
            eleccion = sc.nextInt();
            switch (eleccion) {
                case 1:
                    Uno.setHoras(0);
                    Uno.setMinutos(0);
                    Uno.setSegundos(0);
                    break;
                case 2:
                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Se detuvo el temporizador con exito");
                    break;
                default:
                    break;
            }
        }
        
    }
}
