/**
 * Clase abstracta base - Actividad Formativa 4
 * Define propiedades comunes a todos los productos
 * AQUI SE APLICA: Abstracción y Herencia
 */
public abstract class Producto {
    protected int id;
    protected String nombre;
    protected double precio;
    protected int stock;

    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Metodos abstractos - obligatorios para las clases hijas
    // AQUI SE APLICA: Polimorfismo
    public abstract double calcularDescuento();
    public abstract void mostrarDetalles();

    // Metodo concreto comun
    public double calcularPrecioFinal() {
        return precio - calcularDescuento();
    }
    
    public String getNombre(){ return nombre; }
}
