package ejercicio9_contador;

public class Contador {
    public int horas,minutos,segundos,incremento;
    public Contador(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    //horas
    public void setHoras(int horas){
        this.horas = horas;
    }
    public int getHoras(){
        return horas;
    }

    //minutos
    public void setMinutos(int minutos){
        this.minutos = minutos;
    }
    public int getMinutos(){
        return minutos;
    }

    //segundos
    public void setSegundos(int segundos){
        this.segundos = segundos;
    }
    public int getSegundos(){
        return segundos;
    }

    public String toString() {
        return getHoras()+":"+getMinutos()+":"+getSegundos();
    }

    //conversor de tiempo
    public int segundosMinutos(int minutos){
        while (this.segundos > 59){
            this.segundos = this.segundos - 60;
            minutos = minutos + 1;
        }
        return minutos;
    }

    public int minutosHoras(int horas){
        while (this.minutos > 59){
            this.minutos = this.minutos - 60;
            horas = horas + 1;
        }
        return horas;
    }

    //aumento de contador
    public int incrementarSegundos(int incremento){
        this.segundos = this.segundos + incremento;
        return this.segundos;
    }
    public int incrementarMinutos(int incremento){
        this.minutos = this.minutos + incremento;
        return this.minutos;
    }

    //decremento de contador
    public int decrementarSegundos(int incremento){
        this.segundos = this.segundos - incremento;
        return this.segundos;
    }
    public int decrementarMinutos(int incremento){
        this.minutos = this.minutos + incremento;
        return this.minutos;
    }
}
