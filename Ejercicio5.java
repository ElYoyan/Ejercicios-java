//Calcular el mayor de tres números enteros introducidos por teclado. 

package ejercicios;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int a = scanner.nextInt();
        System.out.println("Ingrese segundo número entero: ");
        int b = scanner.nextInt();
        System.out.println("Ingrese tercer número entero: ");
        int c = scanner.nextInt();

        if (a>b && a>c) {
            System.out.println("El número: " +a+ " es el mayor de los números ingresados");   
        } else if (b>a && b>c) {
            System.out.println("El número: " +b+ " es el mayor de los números ingresados");
        } else {
            System.out.println("El número: " +c+ " es el mayor de los números ingresados");
        }

        scanner.close();
    }
    

}
