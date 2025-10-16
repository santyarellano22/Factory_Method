import java.util.List;

/**
 * Creador concreto para el producto Impresion.
 * Implementa el Factory Method para crear instancias específicas de Impresion.
 * Esta clase es parte del patrón Factory Method como ConcreteCreator.
 */
public class CreadorImpresion extends CreadorProducto {
    private int numero;          // Número identificador de la impresión
    private String color;        // Tipo de color para la impresión
    private List<Foto> fotos;    // Lista de fotos a imprimir

    /**
     * Constructor que inicializa los datos necesarios para crear una impresión
     * @param numero Identificador único de la impresión
     * @param color Tipo de color para la impresión (ej: "Full Color", "Blanco y Negro")
     * @param fotos Lista de fotos que se incluirán en la impresión
     */
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
