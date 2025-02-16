//Pedir al usuario un valor. Si el valor es positivo, pedir un segundo valor y calcular la suma, resta y producto de ambos. Mostrar los resultados por pantalla. 

package ejercicios;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int numero1 = scanner.nextInt();

        if(numero1 >= 0){
            System.out.println("Ingrese otro numero entero: ");
            int numero2 = scanner.nextInt();

            System.out.println("La suma de los número ingresados es: " + (numero1 + numero2) );
            System.out.println("La resta de los número ingresados es: " + (numero1 - numero2) );
            System.out.println("La multiplicación de los número ingresados es: " + (numero1 * numero2) );
        } else {
            System.out.println("Su número es negativo");
        }
        scanner.close();
    }
    
}
