import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String correo;
    private List<Producto> listaCompras;


    public Cliente() {
    }

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.listaCompras=new ArrayList<>();
    }




    public void comprarProducto(Producto producto, int cantidad) {

        if (producto.getCantidadStock() >= cantidad) {
            listaCompras.add(producto);
            producto.setCantidadStock(producto.getCantidadStock() - cantidad);
            System.out.println("Compra exitosa: " + producto.getNombre() + " x " + cantidad);
        } else {
            System.out.println("Stock insuficiente para " + producto.getNombre());
        }
    }

    public void mostrarCompra() {
        double costoTotal = 0;
        System.out.println("Cliente: " + nombre + " - Correo: " + correo);

        for (Producto producto : listaCompras) {

            int cantidadComprada = 1;

            double precio = ((Vendible) producto).calcularPrecioVenta(cantidadComprada);
            costoTotal += precio;
            producto.mostrarDetalles();
            System.out.println("Cantidad comprada: " + cantidadComprada + ", Precio total: $" + precio);
        }
        System.out.println("Costo total de la compra: $" + costoTotal);
    }
}
