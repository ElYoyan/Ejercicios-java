/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionario;

/**
 *
 * @author Est01
 */
public class Cliente extends Persona {
    private String codigo_cliente;

    public Cliente(String codigo_cliente, String cedula, String nombre_completo, String direccion, String telefono) {
        super(cedula, nombre_completo, direccion, telefono);
        this.codigo_cliente = codigo_cliente;
    }

    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getCodigo_cliente() {
        return codigo_cliente;
    }

    /**
     *
     * @return Retorna el valor del objeto
     */
    @Override
    public String toString() {
        return "Hemos creado un cliente con codigo_cliente=" + codigo_cliente ;
    }
    
}
