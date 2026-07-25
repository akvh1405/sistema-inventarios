package sistema.inventarios;
public class Ropa extends Producto implements Vendible {
    private String talla; private String material;
    public Ropa(String nombre, double precio, int stock, String talla, String material){
        super(nombre,precio,stock); this.talla=talla; this.material=material;
    }
    @Override public double calcularDescuento(){ return precio * 0.85; }
    @Override public void mostrarDetalles(){
        System.out.println("[ROPA] " + nombre + " | Talla: " + talla + " | Material: " + material + " | Precio: $" + precio + " | Stock: " + stock);
    }
    @Override public void vender(int cantidad){ if(hayStock() && cantidad <= stock) stock-=cantidad; }
    @Override public boolean hayStock(){ return stock > 0; }
}