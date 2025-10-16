import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== SISTEMA DE GESTIÓN DE PRODUCTOS ===");
            System.out.println("1. Crear nuevo pedido");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            if (opcion == 0) {
                System.out.println("¡Gracias por usar el sistema!");
                break;
            } else if (opcion == 1) {
                crearPedido();
            } else {
                System.out.println("Opción no válida");
            }
        }
        scanner.close();
    }

    private static void crearPedido() {
        // Obtener datos del cliente
        System.out.println("\n-- Datos del Cliente --");
        System.out.print("Ingrese la cédula del cliente: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el número de tarjeta de crédito: ");
        int numeroTarjeta = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Cliente cliente = new Cliente(cedula, nombre);
        Pedido pedido = new Pedido(cliente, numeroTarjeta);

        // Menú de productos
        while (true) {
            System.out.println("\n-- Agregar Producto --");
            System.out.println("1. Agregar Impresión");
            System.out.println("2. Agregar Cámara");
            System.out.println("0. Finalizar pedido");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            if (opcion == 0) break;

            switch (opcion) {
                case 1:
                    pedido.agregarProducto(crearImpresion());
                    break;
                case 2:
                    pedido.agregarProducto(crearCamara());
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }

        // Mostrar el pedido final
        System.out.println("\n=== RESUMEN DEL PEDIDO ===");
        pedido.mostrarPedido();
    }

    private static Producto crearImpresion() {
        System.out.println("\n-- Nueva Impresión --");
        System.out.print("Ingrese el número de impresión: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Ingrese el tipo de color (ej: Full Color): ");
        String color = scanner.nextLine();

        List<Foto> fotos = new ArrayList<>();
        while (true) {
            System.out.print("Ingrese nombre del archivo de foto (o 'fin' para terminar): ");
            String nombreFoto = scanner.nextLine();

            if (nombreFoto.equalsIgnoreCase("fin")) break;

            fotos.add(new Foto(nombreFoto));
        }

        CreadorProducto creador = new CreadorImpresion(numero, color, fotos);
        return creador.crearProducto();
    }

    private static Producto crearCamara() {
        System.out.println("\n-- Nueva Cámara --");
        System.out.print("Ingrese el número de cámara: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese la marca de la cámara: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese el modelo de la cámara: ");
        String modelo = scanner.nextLine();

        CreadorProducto creador = new CreadorCamara(numero, marca, modelo);
        return creador.crearProducto();
    }
}
