public class Celular extends Producto implements Vendible{

    private int capacidadBateria;
    private int camaraResolucion;

    public Celular(String nombre, String marca, double precio, int cantidadStock) {
        super(nombre, marca, precio, cantidadStock);
    }

    public Celular(String nombre, String marca, double precio, int cantidadStock, int capacidadBateria, int camaraResolucion) {
        super(nombre, marca, precio, cantidadStock);
        this.capacidadBateria = capacidadBateria;
        this.camaraResolucion = camaraResolucion;
    }

    @Override
    void mostrarDetalles() {
        System.out.println("Celular: " + nombre + " - Marca: " + marca + " - Batería: " + capacidadBateria + "Resolución - Cámara: " + camaraResolucion + " - Precio: $" + precio + " - Stock: " + cantidadStock);
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
