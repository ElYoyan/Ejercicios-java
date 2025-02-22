package ciclos;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Ejercicio3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        double sumaNotas = 0;
        int numeroNotas = 7;
        double nota;
        
        for(int i=1 ; i <= numeroNotas;i++){
            
            while (true){
                System.out.println("Ingrese la nota de 0 a 5 numero "+i+" : ");
                nota = scanner.nextInt();
            
                if(nota>=0 && nota<=5){
                    break;
                } else {
                    System.out.println("Valor invalido");  
                }
            }
            
            sumaNotas += nota;
           
        }
        
        double promedio = sumaNotas/ (double) numeroNotas;
        
        System.out.println("El promedio del alumno es: " +promedio);
        
        scanner.close();
        
       
        
               
    }
    
}
