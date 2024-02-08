package EjerciciosArrays.TresEnRaya;

public class TestTresEnRaya {
    
    public static void main(String[] args) {
        String[][] tablero = new String[3][3];
        boolean victoria=false;
        int juega = 1;
        tablero = TresEnRaya.tableroVacio(tablero);
        boolean empate = false;
        while (victoria == false && empate == false){
            TresEnRaya.tablero(tablero);
            TresEnRaya.quienJuega(victoria, juega);
            tablero=TresEnRaya.introducirFicha(tablero, juega,victoria);
            victoria = TresEnRaya.comprobarVictoria(tablero,victoria);
            TresEnRaya.ganador(victoria, juega, tablero, empate);
            juega = TresEnRaya.cambioJugador(victoria,juega);
            if (victoria == true){
             empate= TresEnRaya.empate(victoria, tablero);
            }
        if (empate == true){
            System.out.println("Empate");
            }
        }
    }
}

