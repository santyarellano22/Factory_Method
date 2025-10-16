import java.util.List;

/**
 * Creador concreto para el producto Impresion.
 * Implementa el Factory Method para crear instancias específicas de Impresion.
 * Esta clase es parte del patrón Factory Method como ConcreteCreator.
 */
public class CreadorImpresion extends CreadorProducto {
    private int numero;          
    private String color;        
    private List<Foto> fotos;    


    public CreadorImpresion(int numero, String color, List<Foto> fotos) {
        this.numero = numero;
        this.color = color;
        this.fotos = fotos;
    }

    /**
     * Implementación del Factory Method para crear una nueva Impresion
     * @return Una nueva instancia de Impresion configurada con los parámetros especificados
     */
    @Override
    public Producto crearProducto() {
        return new Impresion(numero, color, fotos);
    }
}
