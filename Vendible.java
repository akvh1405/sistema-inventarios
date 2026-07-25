package sistema.inventarios;
public interface Vendible {
    void vender(int cantidad);
    boolean hayStock();
}