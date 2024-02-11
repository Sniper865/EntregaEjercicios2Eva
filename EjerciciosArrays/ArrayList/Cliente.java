package ArrayList;

public class Cliente {
    //Atributos
    private String nombre;
    private String email;
    private int edad;

    //Constructor
    public Cliente(){
    }
    
    public String getnombre(){
        return nombre;
    }
    public String email(){
        return email;
    }
    public int edad(){
        return edad;
    }

    public void setnombre (String nombre){
        this.nombre = nombre;
    }

    public void setemail (String email){
        this.email = email;
    }
    public void setedad(int edad){
        this.edad = edad;
    }


}
