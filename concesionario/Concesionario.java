/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concesionario;
import java.util.ArrayList;
/**
 *
 * @author Est01
 */
public class Concesionario {


    /**
     * @param args the command line arguments
     */
    private ArrayList<Cliente> clientes;
    private ArrayList<Vendedor> vendedores;
    private ArrayList<Venta> ventas;
    private Inventario inventario;

    public Concesionario() {
        this.clientes = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.inventario = new Inventario();
    }
   
   //metodo para agregar clientes:
   public void agregarCliente(Cliente cliente){
       clientes.add(cliente);
   }
   
   //metodo para ver los clientes
   public ArrayList<Cliente> getClientes(){
       return clientes;
       
   }
   
   //metodo para agregar Vendedores:
   public void agregarVendedor(Vendedor vendedor){
       vendedores.add(vendedor);
   }
           
   //metodo get para vendedores
   public ArrayList<Vendedor> getVendedores(){
       return vendedores;
   }
   
   //metodopara gestionar inventario
   public void agregarVehiculo(Vehiculo vehiculo){
       inventario.agregarVehiculo(vehiculo);
   }
   
   public void eliminarVahiculo(Vehiculo vehiculo){
       inventario.eliminarVehiculo(vehiculo);
       
   }
   
   public ArrayList<Vehiculo> getInventario(){
       return inventario.getVehiculos();
   }
   
   //gestion de ventas
   public void registrarVenta(Vendedor vendedor, Cliente cliente, Vehiculo vehiculo, String fecha_venta){
       Venta venta = new Venta(vendedor, cliente, vehiculo, fecha_venta);
       ventas.add(venta);
   }
   
    public static void main(String[] args) {
        
        // TODO code application logic here
        //INtanciar clases:
        
        Concesionario concesionario = new Concesionario();
        
        //crear objetos cliente vendedor, vehiculio
        
        Cliente cliente1 = new Cliente ("c001","21646494","Martha Mercado","Calle 76 #46-5","3147315884");
        Vendedor vendedor1 = new Vendedor ("v001","1214727470","jahojhan Carvajal","Calle 7 #45-21 ","3116007314");
        Vehiculo vehiculo1 = new Vehiculo ("Ford",2025,"Renegade",300000000.00);
        
        //agregar estos objetos a sus clases
        concesionario.agregarCliente(cliente1);
        concesionario.agregarVendedor(vendedor1);
        concesionario.agregarVehiculo(vehiculo1);
        
        //registrar la venta
        String fecha_venta = "2025-02-23";
        concesionario.registrarVenta(vendedor1, cliente1, vehiculo1, fecha_venta);
        
        //imprimir el objeto concesionario
        System.out.println(concesionario);
        
        
    }

    @Override
    public String toString() {
        return "El dia: " + "el clientes=" + clientes + ", a travez del vendedor" + vendedores + ", ventas" + ventas + ", inventario" + inventario + '}';
    }
    
    
    
    
}


