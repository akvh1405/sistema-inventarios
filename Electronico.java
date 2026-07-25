package sistema.inventarios;
public class Electronico extends Producto implements Vendible {
    private int garantiaMeses;
    public Electronico(String nombre, double precio, int stock, int garantiaMeses){
        super(nombre,precio,stock); 
        this.garantiaMeses=garantiaMeses;
    }
    @Override public double calcularDescuento(){ return precio * 0.90; }
    @Override public void mostrarDetalles(){
        System.out.println("[ELECTRONICO] " + nombre + " | Precio: $" + precio + " | Stock: " + stock + " | Garantia: " + garantiaMeses + " meses");
    }
    @Override public void vender(int cantidad){ if(hayStock() && cantidad <= stock) stock-=cantidad; }
    @Override public boolean hayStock(){ return stock > 0; }
}
