package ejercicio6_static;

public class Pajaro {
    private String nombre, color;
    private int idPajaro;
    public static int contador;
    public Pajaro(String nombre, String color){
        this.nombre = nombre;
        this.color = color;
        contador++;
        idPajaro = contador;
    }
    public int getID(){
        return idPajaro;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getColor (){
        return color;
    }  
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        return "ID del pajaro: "+idPajaro+"\n"+
               "Nombre del pajaro: "+nombre+"\n"+
               "Color del pajaro: "+color;

    }
}
