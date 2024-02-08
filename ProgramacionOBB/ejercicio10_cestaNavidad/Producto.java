package ejercicio10_cestaNavidad;
public class Producto {
    private String nombre;
    private int precio,id;
    private boolean gluten;
    private static int idProducto;
    public Producto(String nombre, int precio, boolean gluten){
        this.nombre = nombre;
        this.precio = precio;
        this.gluten = gluten;
        this.id = idProducto;
        idProducto++;
    }

    //nombre
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //precio
    public int getPrecio(){
        return precio;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }

    //id
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    //gluten
    public boolean getGluten(){
        return gluten;
    }

    //idProducto
    public static int getidProducto(){
        return idProducto;
    }

    //toString
    public String toString() {
        return "======================================================="+"\n"+
               id+" - "+ nombre +" "+ precio +" euros , Contiene gluten:"+ gluten +"\n"+
               "=======================================================";
    }
}
