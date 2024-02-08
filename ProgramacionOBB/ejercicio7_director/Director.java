package ejercicio7_director;

public class Director {
    private String nombre, apellido, pais;
    private int AA;
    public Director(String nombre, String apellido, String pais, int AA) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.AA = AA;
    }

    //nombre
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //apellido
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    //pais 
    public String getPais(){
        return pais;
    }
    public void setPais(String pais){
        this.pais = pais;
    }

    //AA
    public int getAA(){
        return AA;
    }
    public void setAA(int AA){
        this.AA = AA;
    }

    //toString
    public String toString(){
        return "Nombre del director "+this.nombre+" "+this.apellido+"\n"+
               "Pais de nacimiento "+ this.pais+"\n"+
               "Año de nacimiento "+ this.AA;
    }
}

