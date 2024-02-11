package ejercicio12_granAlmacen;
import java.util.*;
public class Ventas {
    public static int contador;
    private ArrayList<Producto> products = new ArrayList<Producto>();
    private int codigoVentas;
    private double precioTotal;
    public Ventas(ArrayList<Producto> products) {
        contador++;
        this.codigoVentas = contador;
        this.products = products;
    }
    public Ventas(){
        contador++;
        this.codigoVentas = contador;
    }
    
    //codigoVentas
    public void setCodigo(int codigoVentas) {
        this.codigoVentas = codigoVentas;
    }
    public int getCodigoVentas() {
        return codigoVentas;
    }

    //productos
    public void setProductos(ArrayList<Producto> products) {
        this.products = products;
    } 
    public void addProducto(Producto producto) {
        this.products.add(producto);
    }  
    public ArrayList<Producto> getProductos() {
        return products;
    }

    public double getPrecioTotal(){
        for (int i = 0; i < this.products.size(); i++){
            this.precioTotal += this.products.get(i).getPrecio();
        }
        return precioTotal;
    }

    public String ventasToString(){
        String productos = "";
        for (int i = 0; i < this.products.size(); i++){
            productos += this.products.get(i).productosToString()+"\n";
        }
        return "Codigo Ventas:"+getCodigoVentas()+"\n"+
               "Precio Total: "+getPrecioTotal()+"\n"+
               "Informacion de los productos: "+"\n"+productos;
    }
}
