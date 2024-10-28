public class Laptop extends Producto implements Vendible{

    private String procesador;
    private int memoriaRam;

    public Laptop(String nombre, String marca, double precio, int cantidadStock) {
        super(nombre, marca, precio, cantidadStock);
    }

    public Laptop(String nombre, String marca, double precio, int cantidadStock, String procesador, int memoriaRam) {
        super(nombre, marca, precio, cantidadStock);
        this.procesador=procesador;
        this.memoriaRam=memoriaRam;
    }

    @Override
    void mostrarDetalles() {
        System.out.println("Laptop: " + nombre + " - Marca: " + marca + " - Procesador: " + procesador + " - RAM: " + memoriaRam + "GB - Precio: $" + precio + " - Stock: " + cantidadStock);
    }

    @Override
    public double calcularPrecioVenta(int cantidad) {
        double precioTotal = cantidad * getPrecio();
        if (cantidad > 5) {
            precioTotal *= 0.9; // 10% de descuento si compra más de 5 unidades
        }
        return precioTotal;
    }
}
