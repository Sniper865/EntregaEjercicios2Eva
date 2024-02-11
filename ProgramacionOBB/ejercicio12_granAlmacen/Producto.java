package ejercicio12_granAlmacen;

public class Producto {
    private double precio,extraGarantia;
    private String nombre, caducidad, material;
    private int codigoBarras, tipo;

    //productos de alimentacion
    public Producto (int tipo, String nombre, int codigoBarras, double precio, String caducidad){
        this.tipo = tipo;
        this.nombre = nombre;
        this.codigoBarras = codigoBarras;
        this.precio = precio;
        this.caducidad = caducidad;
    }

    //productos de electronica
    public Producto (int tipo, String nombre, int codigoBarras, double extraGarantia, double precio){
        this.tipo = tipo;
        this.nombre = nombre;
        this.codigoBarras = codigoBarras;
        this.precio = precio;
        this.extraGarantia = extraGarantia;
    }

    //productos de ropa
    public Producto (int tipo, String nombre, int codigoBarras, String material, double precio){
        this.tipo = tipo;
        this.nombre = nombre;
        this.codigoBarras = codigoBarras;
        this.precio = precio;
        this.material = material;
    }

    //tipo
    public void setTipo(int tipo){
        this.tipo = tipo;
    }
    public int getTipo(){
        return tipo;
    }


    //precio
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public double getPrecio(){
        return precio;
    }

    //extraGarantia
    public void setGarantia(double extraGarantia){
        this.extraGarantia = extraGarantia;
    }
    public double getGarantia(){
        return extraGarantia;
    }

    //nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    /*caducidad
    formato de fecha de caducidad dd/mm
    en el caso de que caduque en otro año seria dd/mm/yyyy
    si es en la misma decada simplemente yy
    */
    public void setCaducidad(String caducidad){
        this.caducidad = caducidad;
    }
    public String getCaducidad(){
        return caducidad;
    }

    //material
    public void setMaterial(String material){
        this.material = material;
    }
    public String getMaterial(){
        return material;
    }

    //codigo de Barras
    public void setCodigo(int codigoBarras){
        this.codigoBarras = codigoBarras;
    }
    public int getCodigo(){
        return codigoBarras;
    }

    public String productosToString(){
        if (getTipo()== 1){
            return "Nombre: "+ getNombre()+"\n"+
                   "Codigo de Barras: "+ getCodigo()+"\n"+
                   "Caducidad: "+ getCaducidad()+"\n"+
                   "Precio: "+ getPrecio()+"\n";
        }
        else if (getTipo()==2){
            return "Nombre: "+ getNombre()+"\n"+
                   "Codigo de Barras: "+ getCodigo()+"\n"+
                   "Bonus Garantia: "+ getGarantia()+"\n"+
                   "Precio: "+ getPrecio()+"\n";  
        }
        else if (getTipo()==3){
            return "Nombre: "+ getNombre()+"\n"+
                   "Codigo de Barras: "+ getCodigo()+"\n"+
                   "Material: "+ getMaterial()+"\n"+
                   "Precio: "+ getPrecio()+"\n";
        }
        return "Producto no valido";
    }
}
