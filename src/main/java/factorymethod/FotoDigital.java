public class FotoDigital extends Producto {
    private String resolucion;

    public FotoDigital(int numero, String resolucion) {
        super(numero);
        this.numero = numero;
        this.resolucion = resolucion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Foto Digital N°" + numero + " - Resolución: " + resolucion);
    }
}
