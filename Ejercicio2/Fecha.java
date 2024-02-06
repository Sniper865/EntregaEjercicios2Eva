package Ejercicio2;

public class Fecha {
    private int dia, mes, anno;

    public Fecha(int dia, int mes, int anno) {
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
    }

    // AÑOS
    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getAnno() {
        return anno;
    }

    // MESES
    public void setMes(int mes) {
        if (!comprobarMes(mes)) {
            this.mes = 0;
        } else {
            this.mes = mes;
        }
    }

    public int getMes() {
        return mes;
    }

    public boolean comprobarMes(int mes) {
        if (mes < 0 || mes > 12) {
            return false;
        }
        return true;
    }

    // DIAS
    public void setDia(int dia) {
        if (!comprobarDia(dia)) {
            this.dia = 0;
        } else {
            this.dia = dia;
        }
    }

    public int getDia() {
        return dia;
    }

    public boolean comprobarDia(int dia) {
        if ((this.anno % 4 == 0 && (this.anno % 100 != 0) || (this.anno % 400 == 0)) && (this.mes == 2)) {
            if (dia > 29 || dia < 0) {
                return false;
            }
        } else if (this.mes == 2) {
            if (dia > 28 || dia < 1) {
                return false;
            }
        } else if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10
                || this.mes == 12) {
            if (dia > 31 || dia < 1) {
                return false;
            }
        } else {
            if (dia > 30 || dia < 1) {
                return false;
            }

        }
        return true;
    }

    public String toString() {
        return "La fecha es:" + getDia() + "/" + getMes() + "/" + getAnno();
    }

}
 {
    
}
