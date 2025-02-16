//Un año es bisiesto si es divisible por 4 y no es por 100, o si es divisible por 400. Escribe un programa que lea un año y devuelva si es bisiesto o no. 

package ejercicios;
import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el año: ");
        int año = scanner.nextInt();

        if (año%4==0 && año%100 != 0 || año%400==0) {
            System.out.println("El año es Bisiesto");
        } else {
            System.out.println("El año no es Bisiesto");
        }
        scanner.close();
    }
}
