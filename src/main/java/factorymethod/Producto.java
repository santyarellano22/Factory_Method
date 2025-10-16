public abstract class Producto {
    protected int numero; 

    /**
     * Constructor base para todos los productos
     * @param numero Identificador único del producto
     */
    public Producto(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }

    /**
     * Método abstracto que deben implementar todas las clases concretas
     * para mostrar sus detalles específicos
     */
    public abstract void mostrarDetalles();
}
