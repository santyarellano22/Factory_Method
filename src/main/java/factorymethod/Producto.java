/**
 * Clase abstracta base para todos los productos del sistema.
 * Esta clase forma parte del patrón Factory Method como Product abstracto.
 * Define la estructura común que deben tener todos los productos.
 */
public abstract class Producto {
    protected int numero;    

    /**
     * Constructor base para todos los productos
     * @param numero Identificador único del producto
     */
    public Producto(int numero) {
        this.numero = numero;
    }

    /**
     * Obtiene el número identificador del producto
     * @return número identificador del producto
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Método abstracto que deben implementar todas las clases concretas
     * para mostrar sus detalles específicos
     */
    public abstract void mostrarDetalles();
}
