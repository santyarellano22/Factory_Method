/**
 * Clase que representa una fotografía individual en el sistema.
 * Esta clase es auxiliar y se utiliza principalmente en conjunto con la clase Impresion.
 * Mantiene la información del archivo de la foto y proporciona funcionalidad básica de impresión.
 */
public class Foto {
    private String fichero;    // Nombre del archivo que contiene la foto

    /**
     * Constructor que inicializa una nueva foto
     * @param fichero Nombre o ruta del archivo que contiene la imagen
     */
    public Foto(String fichero) {
        this.fichero = fichero;
    }

    /**
     * Obtiene el nombre del archivo de la foto
     * @return String con el nombre del archivo
     */
    public String getFichero() {
        return fichero;
    }

    public void print() {
        System.out.println("  -> Imprimiendo fichero: " + fichero);
    }
}
