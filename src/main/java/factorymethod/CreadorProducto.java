/**
 * Clase abstracta que define el Factory Method.
 * Esta es la clase Creator en el patrón Factory Method.
 * Define el método abstracto que las subclases implementarán para crear productos específicos.
 */
public abstract class CreadorProducto {
    /**
     * Factory Method - Método de fábrica
     * Este método abstracto debe ser implementado por las subclases para crear
     * instancias específicas de productos.
     *
     * @return Una nueva instancia de un producto específico
     */
    public abstract Producto crearProducto();
}

