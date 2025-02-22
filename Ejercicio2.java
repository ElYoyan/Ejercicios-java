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
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int estudiantes = 10;
        int sumaDeEdades = 0;
        int edad;
        
        for (int i = 1 ; i <= estudiantes; i++){
            System.out.println("Ingrese la edad del estudiantes numero " +i+ " : ");
            edad = scanner.nextInt();
            sumaDeEdades += edad;
        }
        
       double promedio = sumaDeEdades/ (double)estudiantes;
       
       System.out.println("El promedio de edades de los estudiantes es: " +promedio);
        
       scanner.close();
}
    
}
