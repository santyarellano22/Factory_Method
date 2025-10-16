public class Cliente {
    private String cedula;   
    private String nombre;   

    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de identificación del cliente
     * @return Cédula del cliente
     */
    public String getCedula() { return cedula; }

    /**
     * Obtiene el nombre completo del cliente
     * @return Nombre del cliente
     */
    public String getNombre() { return nombre; }
}
