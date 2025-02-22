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
public class Ejercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba una letra en Mayuscula: ");
        String letra = scanner.next();
        
        String minusculas = letra.toLowerCase();
        System.out.println("La letra ingresada en minusula es: "+ minusculas);
        
        scanner.close();
  
    }
    
}
