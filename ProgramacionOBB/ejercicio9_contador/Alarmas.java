// Alarmas.java
package ejercicio9_contador;

public class Alarmas {
    private int horasAlarma;
    private int minutosAlarma;
    private boolean activada;

    public Alarmas(int horas, int minutos) {
        this.horasAlarma = horas;
        this.minutosAlarma = minutos;
        this.activada = false;
    }

    public int getHorasAlarma() {
        return horasAlarma;
    }

    public int getMinutosAlarma() {
        return minutosAlarma;
    }

    public boolean isActivada() {
        return activada;
    }

    public void activarAlarma() {
        activada = true;
    }

    public void desactivarAlarma() {
        activada = false;
    }
}
