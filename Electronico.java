/**
 * Subclase Electronico hereda de Producto e implementa Vendible
 * AQUI SE APLICA: Herencia y Polimorfismo
 */
public class Electronico extends Producto implements Vendible {
    private int garantiaMeses;

    public Electronico(int id, String nombre, double precio, int stock, int garantiaMeses) {
        super(id, nombre, precio, stock);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public double calcularDescuento() {
        // Electronicos tienen 10% de descuento si garantia > 12 meses
        return garantiaMeses > 12 ? precio * 0.10 : precio * 0.05;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("[ELECTRONICO] " + nombre + " | Precio: $" + precio + " | Stock: " + stock + " | Garantia: " + garantiaMeses + " meses | Precio final: $" + calcularPrecioFinal());
    }

    @Override
    public void vender(int cantidad) {
        if (stock >= cantidad) stock -= cantidad;
    }

    @Override
    public boolean hayStock() {
        return stock > 0;
    }
}
