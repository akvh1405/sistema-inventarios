package sistema.inventarios;
public class Alimento extends Producto implements Vendible {
    private String fechaCaducidad;
    public Alimento(String nombre, double precio, int stock, String fechaCaducidad){
        super(nombre,precio,stock); this.fechaCaducidad=fechaCaducidad;
    }
    @Override public double calcularDescuento(){ return precio * 0.80; }
    @Override public void mostrarDetalles(){
        System.out.println("[ALIMENTO] " + nombre + " | Precio: $" + precio + " | Stock: " + stock + " | Caduca: " + fechaCaducidad);
    }
    @Override public void vender(int cantidad){ if(hayStock() && cantidad <= stock) stock-=cantidad; }
    @Override public boolean hayStock(){ return stock > 0; }
}
