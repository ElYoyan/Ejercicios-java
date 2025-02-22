/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

/**
 *
 * @author Est01
 */
public class Ejemplo3 {
    
    public static void letraRepetida(char letra, int numero){
        
        for(int i=0 ; i<numero; i++){
            System.out.println(letra);
        }
    }
    
    
    public static void main(String[] arg){
        int num = 10;
        char letra1 = 'A';
        
       letraRepetida(letra1,num); 
        
        
                
    }
}
