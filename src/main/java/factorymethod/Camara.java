/**
 * Producto concreto que representa una cámara fotográfica.
 * Esta clase es parte del patrón Factory Method como ConcreteProduct.
 * Implementa la funcionalidad específica para manejar cámaras.
 */
public class Camara extends Producto {
    private String marca;    
    private String modelo;   

    public Camara(int numero, String marca, String modelo) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Implementación del método abstracto para mostrar los detalles específicos
     * de una cámara, incluyendo su número de identificación, marca y modelo.
     */
    @Override
    public void mostrarDetalles() {
        System.out.println("Cámara N°" + numero + "  (Marca: " + marca + ", Modelo: " + modelo + ")");
    }
}
