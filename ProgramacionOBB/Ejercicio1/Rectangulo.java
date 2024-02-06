package ejercicio1;

public class Rectangulo {
    private int base, altura;
    public Rectangulo(int base,int altura) {
        this.base = base;
        this.altura = altura;
    }   
    public int perimetro(){
        int perimetro = (base*2) + (altura*2);
        return perimetro;
    }
    public int area (){
        int area = base*altura;
        return area;
    }
    public int getBase(){
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public String toString(){
        return " Altura = "+getAltura()+"\n"+" Base = "+getBase()+"\n"+" Perimetro = "+perimetro()+"\n"+" Area = "+area()+"\n";
    }
}
