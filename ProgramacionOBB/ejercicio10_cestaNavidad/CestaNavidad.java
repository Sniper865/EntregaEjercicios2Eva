package programacion.cestaNavidad;

import java.util.ArrayList;

public class CestaNavidad {
    private ArrayList<Producto> cProductos;
    public static int nCesta;
    private Cliente cliente;
    private int precioTotal;
    public CestaNavidad(int nProductos, Cliente cliente, int precioTotal) {
        this.cliente = cliente;
        cProductos = new ArrayList<Producto>();
        this.precioTotal = precioTotal;
        nCesta++;
    }
    
    //productos
    public void agregarProducto(Producto productos)throws Exception{
        if (precioTotal + productos.getPrecio() < 100){
            cProductos.add(productos);
        }else {throw new Exception("El valor de la cesta no puede ser mayor a 100€");}
    }

    //cliente
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    //nProductos

    public static int getNCesta(){
        return nCesta;
    }
    public String toString(){
        String s = "";
        s +="==============Nº"+getNCesta()+"=============="+"\n"+
               "\n"+
               "Datos del cliente: "+"\n"+
               cliente.toString()+"\n"+
               "Contenidos de la cesta: "+"\n";
               for (int i=0; i<cProductos.size(); i++){
                s+=cProductos.get(i).toString();
               }
               return s;
                
    }

    
    

}
