/**
 * Subclase Ropa
 */
public class Ropa extends Producto implements Vendible {
    private String talla;
    private String material;

    public Ropa(int id, String nombre, double precio, int stock, String talla, String material) {
        super(id, nombre, precio, stock);
        this.talla = talla;
        this.material = material;
    }

    @Override
    public double calcularDescuento() {
        return precio * 0.15; // 15% descuento temporada
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("[ROPA] " + nombre + " | Talla: " + talla + " | Material: " + material + " | Precio: $" + precio + " | Stock: " + stock + " | Precio final: $" + calcularPrecioFinal());
    }

    @Override
    public void vender(int cantidad) { if (stock >= cantidad) stock -= cantidad; }

    @Override
    public boolean hayStock() { return stock > 0; }
}
