package ejercicio12_granAlmacen;
import java.util.*;
public class Interfaz {
    public void VentaUno(){
        ArrayList <Ventas> sells = new ArrayList<Ventas>();
        //primera venta
        Producto pijama = new Producto(3,"Pijama",12345678,"tela",30.00);
        Producto pizza = new Producto (1,"Pizza",22345678,3.50,"20/5");
        Producto mp3 = new Producto(2, "Reproductor MP3", 21345678, 3.50, 80.00);
        Ventas Uno = new Ventas();
        Uno.addProducto(pijama);
        Uno.addProducto(mp3);
        Uno.addProducto(pizza);
        sells.add(Uno);
        System.out.println(sells.get(0).ventasToString());
       
        
    }
}
