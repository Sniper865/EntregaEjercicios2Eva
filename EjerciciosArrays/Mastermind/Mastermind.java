package EjerciciosArrays.Mastermind;

import java.util.*;
public class Mastermind {
    public static Scanner sc = new Scanner(System.in);
    public static String[] codeOrder(){
        String[] codeOrder = new String[4];
        String[] colors = {"blanco","negro","azul","rojo","verde","amarillo","morado","naranja"};
        for (int i = 0;i<codeOrder.length;i++){
            int randomNum = (int) (Math.random()*7);
            codeOrder[i] = colors[randomNum];
        }
        return codeOrder;
    }
    public static String secretCode(String[] codeOrder){ 
        String secretCode = Arrays.toString(codeOrder);
        //System.out.println(secretCode);
        return secretCode;
    }
    public static String[][] fillGuessTries (String[][] guessTries){
        for(int i = 0;i<guessTries.length;i++){
            for (int j=0;j<guessTries[i].length;j++){
                guessTries[i][j] = "O";
            }
        }
        return guessTries;
    }
    public static String[][] fillCheckGuess (String[][] checkGuess){
        for(int i = 0;i<checkGuess.length;i++){
            for (int j=0;j<checkGuess[i].length;j++){
                checkGuess[i][j] = "O";
            }
        }
        return checkGuess;
    }
    public static void tablero(String[][] guessTries, String[][] checkGuess){
        String tablero = ("---------------------------------------------"+"\n"+
                         guessTries[0][0]+" | "+ guessTries[0][1]+" | "+ guessTries[0][2]+" | "+ guessTries[0][3]+
                         "   "+checkGuess[0][0]+" "+checkGuess[0][1]+" "+checkGuess[0][2]+" "+checkGuess[0][3]+"\n"+
                         "---------------------------------------------"+"\n"+
                         guessTries[1][0]+" | "+ guessTries[1][1]+" | "+ guessTries[1][2]+" | "+ guessTries[1][3]+
                         "   "+checkGuess[1][0]+" "+checkGuess[1][1]+" "+checkGuess[1][2]+" "+checkGuess[1][3]+"\n"+
                         "---------------------------------------------"+"\n"+
                         guessTries[2][0]+" | "+ guessTries[2][1]+" | "+ guessTries[2][2]+" | "+ guessTries[2][3]+
                         "   "+checkGuess[2][0]+" "+checkGuess[2][1]+" "+checkGuess[2][2]+" "+checkGuess[2][3]+"\n"+
                         "---------------------------------------------"+"\n"+
                         guessTries[3][0]+" | "+ guessTries[3][1]+" | "+ guessTries[3][2]+" | "+ guessTries[3][3]+
                         "   "+checkGuess[3][0]+" "+checkGuess[3][1]+" "+checkGuess[3][2]+" "+checkGuess[3][3]+"\n"+
                         "---------------------------------------------"+"\n"+
                         guessTries[4][0]+" | "+ guessTries[4][1]+" | "+ guessTries[4][2]+" | "+ guessTries[4][3]+
                         "   "+checkGuess[4][0]+" "+checkGuess[4][1]+" "+checkGuess[4][2]+" "+checkGuess[4][3]+"\n"+
                         "---------------------------------------------"+"\n"+
                         guessTries[5][0]+" | "+ guessTries[5][1]+" | "+ guessTries[5][2]+" | "+ guessTries[5][3]+
                         "   "+checkGuess[5][0]+" "+checkGuess[5][1]+" "+checkGuess[5][2]+" "+checkGuess[5][3]+"\n"+
                         "---------------------------------------------"+"\n"+
                         guessTries[6][0]+" | "+ guessTries[6][1]+" | "+ guessTries[6][2]+" | "+ guessTries[6][3]+
                         "   "+checkGuess[6][0]+" "+checkGuess[6][1]+" "+checkGuess[6][2]+" "+checkGuess[6][3]+"\n"+
                         "---------------------------------------------"+"\n"+
                         guessTries[7][0]+" | "+ guessTries[7][1]+" | "+ guessTries[7][2]+" | "+ guessTries[7][3]+
                         "   "+checkGuess[7][0]+" "+checkGuess[7][1]+" "+checkGuess[7][2]+" "+checkGuess[7][3]+"\n"+
                         "---------------------------------------------"+"\n"+
                         guessTries[8][0]+" | "+ guessTries[8][1]+" | "+ guessTries[8][2]+" | "+ guessTries[8][3]+
                         "   "+checkGuess[8][0]+" "+checkGuess[8][1]+" "+checkGuess[8][2]+" "+checkGuess[8][3]+"\n"+
                         "---------------------------------------------"+"\n"+
                         guessTries[9][0]+" | "+ guessTries[9][1]+" | "+ guessTries[9][2]+" | "+ guessTries[9][3]+
                         "   "+checkGuess[9][0]+" "+checkGuess[9][1]+" "+checkGuess[9][2]+" "+checkGuess[9][3]+"\n" );
        System.out.println(tablero);
    }
    public static String guessTry(){
        System.out.println("Intenta Guess el codigo secreto, los colores son: "+"\n"+
                           "blanco, negro, azul, rojo, verde, amarillo, morado y naranja"+"\n"+
                           "El codigo consta de 4 colores");
        String Guess = sc.nextLine().toLowerCase();
        return Guess;
    }
    public static String[] splitGuess(String Guess) {
        String[] splitGuess = Guess.split(",");
        return splitGuess;
    }
    public static String[][] checkGuess(String[] splitGuess,int tries, String[] codeOrder, String[][] checkGuess, String secretCode){
        for (int i= 0; i< splitGuess.length;i++){
            if(secretCode.contains(splitGuess[i])){
                checkGuess[tries][i]= ".";
            }
            if (codeOrder[i].equals(splitGuess[i])){
                checkGuess[tries][i] = "... ";
            }
            
        }
        return checkGuess;
    }
    public static String[][] guessTries (String[] splitGuess, int tries, String[][] guessTries){
        for (int i=0;i<guessTries[tries].length;i++){
            guessTries[tries][i]=splitGuess[i];
        }
        return guessTries;
    }
    public static boolean checkWin(String[][] checkGuess, int tries, boolean victory){
        victory = false;
        for (int i = 0; i < checkGuess[tries].length; i++){
            if (!checkGuess[tries][i].equals("...")){
                return victory;
            }
        }
        victory = true;
        return victory;
    }
}