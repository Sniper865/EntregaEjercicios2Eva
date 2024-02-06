package ejercicio3;

public class Tiempo {
    private int minutos,segundos,horas;
    public Tiempo(int horas,int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    public Tiempo(int horas, int minutos){
        this.horas = horas;
        this.minutos = minutos;
    }
    public Tiempo(int horas){
        this.horas = horas;

    //gets de los diferentes valores
    }
    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    //set de todas las horas
    public void setHoras(int horas){
        this.horas = minutosHoras(horas);
    }

    public void setMinutos(int minutos){
        this.minutos = segundosMinutos(minutos);
    }

    public void setSegundos(int segundos){
        this.segundos = segundos;
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
    public String toString(){
        return "El tiempo final es: "+getHoras()+":"+getMinutos()+":"+getSegundos();
    }
}

