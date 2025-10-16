import java.util.ArrayList;
import java.util.List;

/**
 * Producto concreto que representa una impresión fotográfica.
 * Esta clase es parte del patrón Factory Method como ConcreteProduct.
 * Implementa la funcionalidad específica para manejar impresiones de fotos.
 */
public class Impresion extends Producto {
    private String color;        // Tipo de color para la impresión
    private List<Foto> fotos;    // Colección de fotos asociadas a la impresión

    /**
     * Constructor para crear una nueva impresión
     * @param numero Identificador único de la impresión
     * @param color Tipo de color seleccionado para la impresión
     * @param fotos Lista de fotos a imprimir, puede ser null
     */
    public Impresion(int numero, String color, List<Foto> fotos) {
        super(numero);
        this.color = color;
        this.fotos = (fotos == null) ? new ArrayList<>() : fotos;
    }

    /**
     * Implementación del método abstracto para mostrar los detalles específicos
     * de una impresión, incluyendo su número, color y lista de fotos.
     */
    @Override
    public void mostrarDetalles() {
        System.out.println("Impresión N°" + numero + "  (Color: " + color + ")");
        if (fotos.isEmpty()) {
            System.out.println("  Sin fotos asociadas.");
        } else {
            System.out.println("  Fotos:");
            for (Foto f : fotos) {
                System.out.println("   - " + f.getFichero());
            }
        }
    }


    public void imprimirTodas() {
        for (Foto f : fotos) f.print();
    }
}
