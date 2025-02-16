// Escribir un programa que solicite un valor entero al usuario y determine si es par o impar

package ejercicios;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un número entero: ");
        int numero = scanner.nextInt();

        if (numero%2 == 0) {
            System.out.println("El numero: " +numero+ " es un numero Par");
        } else {
            System.out.println("El numero: " +numero+ " es un numero Impar");
        }
        
        scanner.close();
    }
}

