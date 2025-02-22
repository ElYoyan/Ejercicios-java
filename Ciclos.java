/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclos;


/**
 *
 * @author Est01
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ciclo for
        int []  array = {1,2,3,4,5,6};
        for (int i: array){
            System.out.println("El numero es: " +i); 
        }
        System.out.println("Fin del For ");
    
        //ciclo do while
        int iterador = 0;
        do{
           System.out.println("El numero es: " + iterador); 
           iterador++;
        } while(iterador <= 10);
        System.out.println("Fin del do while");
        
        int j =9;
        while(j>=0){
            System.out.println("El numero es: " + j);  
            j--;
        }
         System.out.println("Fin del While");
    }
    
}
