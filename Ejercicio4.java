// Calcular el mayor de dos números enteros introducidos por teclado. 

package ejercicios;
import java.util.Scanner;


public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese otro número entero: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("El número " +numero1+ " es mayor que el número " +numero2); 
        } else if (numero1 < numero2){
            System.out.println("El número " +numero1+ " es menor que el número " +numero2);
        } else {
            System.out.println("El número " +numero1+ " es igual al número " +numero2); 
        }

        scanner.close();
    }
    
}
