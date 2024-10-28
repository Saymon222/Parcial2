//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Laptop Gamer", "ASUS", 1500.00, 10, "Intel i7", 16);
        Celular celular1 = new Celular("Smartphone", "Samsung", 800.00, 20, 5000, 108);

        // Crear cliente
        Cliente c1 = new Cliente("Simón Pinzón ", "saipinzon215@gmail.com" );

        // Simular compras
        c1.comprarProducto(laptop1, 3);
        c1.comprarProducto(celular1, 2);

        // Mostrar detalles de las compras
        c1.mostrarCompra();

        // Mostrar inventario actualizado
        System.out.println("\nInventario actualizado:");
        laptop1.mostrarDetalles();
        celular1.mostrarDetalles();
    }
}