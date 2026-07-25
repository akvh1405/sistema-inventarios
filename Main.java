package sistema.inventarios;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> inventario = new ArrayList<Producto>();
        inventario.add(new Electronico("Laptop HP", 15000, 10, 24));
        inventario.add(new Alimento("Leche Entera", 30, 50, "2026-08-01"));
        inventario.add(new Ropa("Playera Nike", 599, 20, "M", "Algodon"));
        
        System.out.println("=== SISTEMA DE GESTION DE INVENTARIOS ===");
        for (Producto p : inventario) {
            p.mostrarDetalles();
            System.out.println("Precio con descuento: $" + p.calcularDescuento());
            System.out.println("Stock despues: " + p.getStock());
            System.out.println("--------------------");
        }
    }
}