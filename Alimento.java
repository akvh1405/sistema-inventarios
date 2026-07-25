/**
 * Subclase Alimento
 * AQUI SE APLICA: Herencia y Polimorfismo
 */
public class Alimento extends Producto implements Vendible {
    private String fechaCaducidad;

    public Alimento(int id, String nombre, double precio, int stock, String fechaCaducidad) {
        super(id, nombre, precio, stock);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public double calcularDescuento() {
        // Alimentos tienen 20% por ser perecederos
        return precio * 0.20;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("[ALIMENTO] " + nombre + " | Precio: $" + precio + " | Stock: " + stock + " | Caduca: " + fechaCaducidad + " | Precio final: $" + calcularPrecioFinal());
    }

    @Override
    public void vender(int cantidad) { if (stock >= cantidad) stock -= cantidad; }

    @Override
    public boolean hayStock() { return stock > 0; }
}
