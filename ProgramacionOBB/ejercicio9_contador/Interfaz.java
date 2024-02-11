package ejercicio9_contador;

import java.util.Scanner;

public class Interfaz {
    public static Scanner sc = new Scanner(System.in);
    private Contador contador;
    private Alarmas[] alarmas;

    public Interfaz() {
        contador = new Contador(0, 0, 0);
        alarmas = new Alarmas[5]; // Puedes ajustar el tamaño según sea necesario
        // Crear las alarmas especificadas
        alarmas[0] = new Alarmas(3, 0);
        alarmas[1] = new Alarmas(5, 30);
        alarmas[2] = new Alarmas(6, 0);
    }

    public void menu() {
        String aumento = "1. Para 10 unidades\n" +
                         "2. Para 1 unidad";
        int eleccion = 0;
        int opciones = 0;
        while (eleccion != 5) {
            String menu = "1. Inicializar/Reiniciar contador\n" +
                          "2. Crear alarmas\n" +
                          "3. Incrementar temporizador\n" +
                          "4. Decrementar temporizador\n" +
                          "5. Detener contador\n\n" +
                          contador.toString();
            System.out.println(menu);
            eleccion = sc.nextInt();
            switch (eleccion) {
                case 1:
                    contador.setHoras(0);
                    contador.setMinutos(0);
                    contador.setSegundos(0);
                    break;
                case 2:
                    crearAlarma();
                    break;
                case 3:
                    System.out.println("1. Aumentar Segundos\n" +
                                       "2. Aumentar Minutos");
                    opciones = sc.nextInt();
                    if (opciones == 1) {
                        System.out.println(aumento);
                        opciones = sc.nextInt();
                        if (opciones == 1) {
                            contador.incrementarSegundos(10);
                            opciones = 0;
                        } else if (opciones == 2) {
                            contador.incrementarSegundos(1);
                            opciones = 0;
                        }
                    } else if (opciones == 2) {
                        System.out.println(aumento);
                        opciones = sc.nextInt();
                        if (opciones == 1) {
                            contador.incrementarMinutos(10);
                            opciones = 0;
                        } else if (opciones == 2) {
                            contador.incrementarMinutos(1);
                            opciones = 0;
                        }
                    }
                    break;
                case 4:
                    System.out.println("1. Decrementar Segundos\n" +
                                       "2. Decrementar Minutos");
                    opciones = sc.nextInt();
                    if (opciones == 1) {
                        System.out.println(aumento);
                        opciones = sc.nextInt();
                        if (opciones == 1) {
                            contador.decrementarSegundos(10);
                            opciones = 0;
                        } else if (opciones == 2) {
                            contador.decrementarSegundos(1);
                            opciones = 0;
                        }
                    } else if (opciones == 2) {
                        System.out.println(aumento);
                        opciones = sc.nextInt();
                        if (opciones == 1) {
                            contador.decrementarMinutos(10);
                            opciones = 0;
                        } else if (opciones == 2) {
                            contador.decrementarMinutos(1);
                            opciones = 0;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Se detuvo el temporizador con exito");
                    break;
            }
        }
    }

    public void crearAlarma() {
        System.out.println("Ingrese la hora de la alarma (formato 24 horas): ");
        int horas = sc.nextInt();
        System.out.println("Ingrese los minutos de la alarma: ");
        int minutos = sc.nextInt();
        for (int i = 0; i < alarmas.length; i++) {
            if (alarmas[i] == null) {
                alarmas[i] = new Alarmas(horas, minutos);
                System.out.println("Alarma creada con éxito.");
                return;
            }
        }
        System.out.println("No se pueden crear más alarmas, el límite es de " + alarmas.length);
    }
}
