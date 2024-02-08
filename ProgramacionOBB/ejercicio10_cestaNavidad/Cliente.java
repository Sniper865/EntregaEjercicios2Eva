package ejercicio10_cestaNavidad;
public class Cliente {
    private String nombre,DNI,puesto;
    public Cliente(String nombre, String DNI, String puesto ){
        this.nombre = nombre;
        this.DNI = DNI;
        this.puesto = puesto;
    }
    
    //nombre
    public String getNombre(){
        return nombre;
    }

    public void setNombre( String nombre ){
        this.nombre = nombre;
    }

    //DNI
    public String getDNI(){
        return DNI;
    }
    public void setDNI( String DNI){
        this.DNI = DNI;
    }

    //puesto
    public String getPuesto(){
        return puesto;
    }
    public void setPuesto( String puesto ){
        this.puesto = puesto;
    }

    //toString
    public String toString(){
        return "Nombre: "+getNombre()+"\n"+
               "DNI: "+getDNI()+"\n"+
               "Puesto: "+getPuesto();
    }
}
