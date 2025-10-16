import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Pedido {
    
    private Cliente cliente;                    
    private List<Producto> productos = new ArrayList<>();  // Lista de productos en el pedido
    private Date fecha;                         // Fecha en que se realiza el pedido
    private int numeroTarjetaCredito;          

    /**
     * Constructor que inicializa un nuevo pedido.
     * @param cliente El cliente que realiza el pedido
     * @param numeroTarjetaCredito Número de tarjeta para procesar el pago
     */
    public Pedido(Cliente cliente, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
        this.fecha = new Date();  // Se establece automáticamente la fecha actual
    }

    /**
     * Agrega un nuevo producto al pedido.
     * @param p El producto a agregar a la lista de productos
     */
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void mostrarPedido() {
        System.out.println("---- Pedido ----");
        System.out.println("Cliente: " + cliente.getNombre() + " (C.C. " + cliente.getCedula() + ")");
        System.out.println("Fecha: " + fecha);
        // Por seguridad, solo se muestran los últimos 4 dígitos de la tarjeta
        System.out.println("Tarjeta: ****" + (numeroTarjetaCredito % 10000));
        System.out.println("Productos:");
        // Itera sobre cada producto y muestra sus detalles específicos
        for (Producto p : productos) {
            p.mostrarDetalles();
        }
        System.out.println("----------------\n");
    }
}
