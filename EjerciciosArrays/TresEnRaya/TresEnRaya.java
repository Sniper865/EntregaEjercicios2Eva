package EjerciciosArrays.TresEnRaya;

import java.util.*;

public class TresEnRaya {
    public static Scanner sc = new Scanner(System.in);

    public static String[][] tableroVacio(String[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = "◻";

            }
        }
        return tablero;
    }

    public static void tablero(String[][] tablero) {
        System.out.println(tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] +
                "\n" + "---------" +
                "\n" + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] +
                "\n" + "---------" +
                "\n" + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2]);
    }

    public static void quienJuega(boolean victoria, int juega) {
        if (juega==1) {
            System.out.println("Juega el jugador X");
        }
        if (juega==0) {
            System.out.println("Juega el jugador O");
        }
    }

    public static String[][] introducirFicha(String[][] tablero, int juega, boolean victoria) {
        if (victoria == false) {
            System.out.println("Escribe la fila");
            int x = sc.nextInt();
            System.out.println("Escribe la columna");
            int y = sc.nextInt();
            x = x - 1;
            y = y - 1;
            while (!tablero[x][y].equals("◻")) {
                System.out.println("Escribe una posicion valida, ya esta en uso esa posicion");
                System.out.println("Escribe la fila");
                x = sc.nextInt();
                System.out.println("Escribe la columna");
                y = sc.nextInt();
                x = x - 1;
                y = y - 1;
            }
            if (juega==1) {
                tablero[x][y]="X";
            } else if (juega==0) {
                tablero[x][y]="O";
            }
        }
        return tablero;
    }

    public static int cambioJugador(boolean victoria, int juega) {
        if (victoria == false) {
            if (juega==1) {
                System.out.println("Juega el jugador X");
                juega = juega-1;
            }
            else if (juega==0) {
                System.out.println("Juega el jugador O");
                juega = juega+1;
            }
        }
        return juega;
    }

    public static boolean comprobarVictoria(String[][] tablero, boolean victoria) {
        //comprobar fila 1 para X
        if (tablero[0][0].equals("X") && tablero[0][1].equals("X") && tablero[0][2].equals("X")) {
            victoria = true;       
        }
        else if (tablero[0][0].equals("O") && tablero[0][1].equals("O") && tablero[0][2].equals("O")) {
            victoria = true;       
        }
        //comprobar fila 2 para X
        else if (tablero[1][0].equals("X") && tablero[1][1].equals("X") && tablero[1][2].equals("X")) {
            victoria = true;        
        }         
        //comprobar fila 2 para O
        else if (tablero[1][0].equals("O") && tablero[1][1].equals("O") && tablero[1][2].equals("O")) {
            victoria = true;        
        }            
        //comprobar fila 3 para X
        else if (tablero[2][0].equals("X") && tablero[2][1].equals("X") && tablero[2][2].equals("X")) {
            victoria = true;
        }
        //comprobar fila 3 para O
        else if (tablero[2][0].equals("O") && tablero[2][1].equals("O") && tablero[2][2].equals("")) {
            victoria = true;
        }
        //comprobar columna 1 para X
        else if (tablero[0][0].equals("X") && tablero[1][0].equals("X") && tablero[2][0].equals("X")) {
            victoria = true;        
        } 
        //comprobar columna 1 para O
        else if (tablero[0][0].equals("O") && tablero[1][0].equals("O") && tablero[2][0].equals("O")) {
            victoria = true;        
        }            
        //comprobar columna 2 para X
        else if (tablero[1][0].equals("X") && tablero[1][1].equals("X") && tablero[1][2].equals("X")) {
            victoria = true;
        }
        //comprobar columna 2 para O
        else if (tablero[1][0].equals("O") && tablero[1][1].equals("O") && tablero[1][2].equals("O")) {
            victoria = true;
        }
        //comprobar columna 3 para X
        else if (tablero[2][0].equals("X") && tablero[2][1].equals("X") && tablero[2][2].equals("X")) {
            victoria = true;
        }
        //comprobar columna 3 para O
        else if (tablero[2][0].equals("O") && tablero[2][1].equals("O") && tablero[2][2].equals("O")) {
            victoria = true;
        }
        //comprobar diagonal 1 para X
        else if (tablero[0][0].equals("X") &&tablero[1][1].equals("X") &&tablero[2][2].equals("X")) {
            victoria = true;
        }
        //comprobar diagonal 1 para O
        else if (tablero[0][0].equals("O") &&tablero[1][1].equals("O") &&tablero[2][2].equals("O")) {
            victoria = true;
        }
        //comprobar diagonal 2 para X
        else if (tablero[0][2].equals("X") &&tablero[1][1].equals("X") &&tablero[2][0].equals("X")) {
            victoria = true;
        }
        //comprobar diagonal 2 para O
        else if (tablero[0][2].equals("O") &&tablero[1][1].equals("O") &&tablero[2][0].equals("O")) {
            victoria = true;
        }
        return victoria;
    }
    public static void ganador(boolean victoria,int juega, String[][]tablero, boolean empate){
        if (victoria==true && empate == false){
            if (juega == 1){
                System.out.println("Ha ganado el jugador X");
                 System.out.println(tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] +
                "\n" + "---------" +
                "\n" + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] +
                "\n" + "---------" +
                "\n" + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2]);
            }
            else if(juega == 0){
                System.out.println("Ha ganado el jugador O");
                 System.out.println(tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] +
                "\n" + "---------" +
                "\n" + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] +
                "\n" + "---------" +
                "\n" + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2]);
            }
        }
    }
    public static boolean empate(boolean victoria,String[][]tablero){
        boolean empate = false;
        if (victoria==false){
            for (int i=0;i<tablero.length;i++){
                for (int j=0;j<tablero.length;j++){
                    if (tablero[i][j].equals("◻")){
                        return empate;
                    }
                }
            }
        
        }
        empate = true;
        return empate;
    }
}

