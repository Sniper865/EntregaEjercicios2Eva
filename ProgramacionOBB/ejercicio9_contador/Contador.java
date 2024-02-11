package ejercicio9_contador;

public class Contador {
    public int horas, minutos, segundos;

    public Contador(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    //horas
    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    //minutos
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getMinutos() {
        return minutos;
    }

    //segundos
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getSegundos() {
        return segundos;
    }

    //aumento de contador
    public void incrementarSegundos(int incremento) {
        this.segundos = this.segundos + incremento;
        while (this.segundos >= 60) {
            this.segundos -= 60;
            this.minutos++;
        }
    }

    public void incrementarMinutos(int incremento) {
        this.minutos = this.minutos + incremento;
        while (this.minutos >= 60) {
            this.minutos -= 60;
            this.horas++;
        }
    }

    //decremento de contador
    public void decrementarSegundos(int decremento) {
        this.segundos = this.segundos - decremento;
        while (this.segundos < 0) {
            this.segundos += 60;
            this.minutos--;
        }
    }

    public void decrementarMinutos(int decremento) {
        this.minutos = this.minutos - decremento;
        while (this.minutos < 0) {
            this.minutos += 60;
            this.horas--;
        }
    }

    public String toString() {
        return getHoras() + ":" + getMinutos() + ":" + getSegundos();
    }
}
