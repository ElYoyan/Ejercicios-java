/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionario;
import java.util.ArrayList;
/**
 *
 * @author Est01
 */
public class Inventario {
    private ArrayList<Vehiculo> vehiculos;
    
    //constructor:

    public  Inventario() {
       this.vehiculos = new ArrayList();
    }
    //Metodo para agregar vehiculos:
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    
    //Metodopara eliminar
    public void eliminarVehiculo(Vehiculo vehiculo){
        vehiculos.remove(vehiculo);
    }
    
    //Getter:

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    @Override
    public String toString() {
        return "Se ha agregado al inventario el vehiculos=" + vehiculos ;
    }
    
}
