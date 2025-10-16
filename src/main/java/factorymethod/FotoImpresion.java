public class FotoImpresion extends Producto{

    private String color;

    public FotoImpresion(int numero, String color) {
        super(numero);
        this.numero = numero;
        this.color = color;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Foto Impresa N°" + numero + " - Color: " + color);
    }

}
