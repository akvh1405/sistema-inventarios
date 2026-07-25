import java.util.ArrayList;
import java.util.List;

/**
 * Programa principal - Demuestra POLIMORFISMO
 * Un ArrayList de tipo Producto guarda objetos de diferentes subclases
 */
public class Main {
    public static void main(String[] args) {
        // Lista polimorfica: todos son Producto pero se comportan diferente
        List<Producto> inventario = new ArrayList<>();

        inventario.add(new Electronico(1, "Laptop HP", 15000, 10, 24));
        inventario.add(new Alimento(2, "Leche Entera", 30, 50, "2026-08-01"));
        inventario.add(new Ropa(3, "Playera Nike", 599, 20, "M", "Algodon"));
        inventario.add(new Electronico(4, "Mouse Logitech", 450, 100, 6));

        System.out.println("=== SISTEMA DE GESTION DE INVENTARIOS ===");
        
        // AQUI SE DEMUESTRA EL POLIMORFISMO: mismo metodo, diferente comportamiento
        for (Producto p : inventario) {
            p.mostrarDetalles(); // Cada clase tiene su propia implementacion
        }

        System.out.println("\n=== PRUEBA DE VENTA POLIMORFICA ===");
        for (Producto p : inventario) {
            if (p instanceof Vendible) {
                ((Vendible) p).vender(2);
                System.out.println("Vendidas 2 unidades de: " + p.getNombre());
            }
        }

        System.out.println("\n=== INVENTARIO DESPUES DE VENTA ===");
        for (Producto p : inventario) {
            p.mostrarDetalles();
        }
    }
}
