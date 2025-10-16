public class CreadorCamara extends CreadorProducto {
    private int numero;
    private String marca;
    private String modelo;

    public CreadorCamara(int numero, String marca, String modelo) {
        this.numero = numero;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public Producto crearProducto() {
        return new Camara(numero, marca, modelo);
    }
}
