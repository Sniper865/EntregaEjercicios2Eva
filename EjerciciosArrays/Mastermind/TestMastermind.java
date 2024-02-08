package EjerciciosArrays.Mastermind;
public class TestMastermind {
    public static void main(String[] args) {
        boolean victory = false;
        int tries = 0;
        String[] codeOrder = Mastermind.codeOrder();
        String secretCode = Mastermind.secretCode(codeOrder);
        String[][] guessTries = new String[10][4];
        String[][] checkGuess = new String[10][4];
        checkGuess = Mastermind.fillCheckGuess(checkGuess);
        guessTries = Mastermind.fillGuessTries(guessTries);
        while (victory == false && tries < 10){
            Mastermind.tablero(guessTries, checkGuess);
            String guessTry = Mastermind.guessTry();
            String[] splitGuess = Mastermind.splitGuess(guessTry);
            checkGuess = Mastermind.checkGuess(splitGuess,tries,codeOrder,checkGuess,secretCode);
            guessTries = Mastermind.guessTries(splitGuess, tries, guessTries);
            victory = Mastermind.checkWin(checkGuess, tries, victory);
            tries++;
        }
        if (victory == true){
            System.out.println("Enhorabuena has adivinado el codigo secreto");
            Mastermind.tablero(guessTries, checkGuess);
        }
        else if (victory == false){
            System.out.println("Has perdido");
        }

    }
}
