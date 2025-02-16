// Escribir un programa que solicite un valor entero al usuario y determine si es positivo o negativo. 

package ejercicios;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrece un número entero: ");
        int numero = scanner.nextInt();

        if (numero>=0) {
            System.out.println("El número es Positivo");
        } else {
            System.out.println("El numero es Negativo");
        }

        scanner.close();
    }

    
}
