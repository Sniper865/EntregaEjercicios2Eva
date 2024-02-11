package ejercicio10_cestaNavidad;

import java.util.ArrayList;

public class CestaNavidad {
    private ArrayList<Producto> products = new ArrayList<Producto>();
    public static int contador;
    private Cliente cliente;
    private int precioTotal, nCesta;
    public CestaNavidad() {
        this.nCesta = contador;
        contador++;
    }
    
    //products
    public void addProducto(Producto producto) throws Exception {
        this.products.add(producto);
        if (precioTotal + producto.getPrecio() > 100){
            new Exception("El precio total de la cesta no puede ser mayor a 100€");
        }else{
            precioTotal += producto.getPrecio();
        }
    }
    public void setProducto(ArrayList<Producto> products) {
        this.products = products;
    }
    public ArrayList<Producto> getProducts() {
        return products;
    }

    //cliente
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Cliente getCliente() {
        return cliente;
    }

    //nCesta
    public int getNCesta(){
        return nCesta;
    }


    
    

}
