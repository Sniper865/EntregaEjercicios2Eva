package ejericio5_biblioteca;

public class Persona {
    private String nombre, apellido1, apellido2;
    public Persona(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido1(){
        return apellido1;
    }
    public String getApellido2(){
        return apellido2;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido1(String apellido1){
        this.apellido1 = apellido1;
    }
    public void setApellido2(String apellido2){
        this.apellido2 = apellido2;  
    }

    public String toString() {
        return "Nombre: " + this.nombre+"\n"+
               "Primer Apellido: " + this.apellido1+"\n"+
               "Segundo Apellido: " + this.apellido2;
    }

}

