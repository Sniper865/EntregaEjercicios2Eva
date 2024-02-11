package ArrayList;
import java.util.ArrayList;

public class TestArrayListCliente {
    public static void main(String[] args){
        ArrayList<String> listaClientes = new ArrayList<String>();
        listaClientes.add("Carlos");
        listaClientes.add("Pedro");
        listaClientes.add("Luis");
        listaClientes.add("Mario");
        listaClientes.add("Alberto");

        System.out.println(listaClientes);

        listaClientes.remove("Carlos");
        System.out.println(listaClientes);

        listaClientes.clear();
        System.out.println(listaClientes);
    }
}
