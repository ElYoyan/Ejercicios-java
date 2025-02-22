/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos;
import java.util.Scanner;
/**
 *
 * @author Est01
 */
public class CuentaBanco {
    
    //funciones:
    public static double consultaSaldo(){
        double saldo = 123456789.4;
        return saldo;
    }
    
    public static double hacerRetiro(){
        Scanner scanner = new Scanner (System.in);
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return valor;
        
        if (valor <= saldo){
            
        }
        
    }
    
    //metodo main:
    public static void main(String[] args){
        String usuario = "Jhojhan Yabur";
        while(true){
            System.out.println("Hola Usuario \n"+ usuario+ "\n");
            System.out.println("¿Que quieres hacer el día de hoy? \n");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Hacer retiros");
            System.out.println("3. Hacer consignacion");
            System.out.println("4. Salir");
            
            Scanner scanner = new Scanner (System.in);
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            if (opcion == 4){
                    break;
            }        
            
            switch(opcion){
                case 1:
                    System.out.println("Consultando saldo...");
                    consultaSaldo();
                    break;
                
                    
                    
            }
        }
    }
}
