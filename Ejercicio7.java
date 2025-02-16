//Determinar en que estado está el agua en función de su temperatura. Si es negativa el estado será sólido, si es menor que 100 será líquido y si es mayor que 100 será gas. Pedir al usuario el valor de la temperatura. 

package ejercicios;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la temperatura del agua");
        int temperatura = scanner.nextInt();

        if(temperatura<0){
            System.out.println("El estado del agua es Sólido");
        } else if (temperatura>0 && temperatura<100) {
            System.out.println("El estado del agua es Líquido");
        } else {
            System.out.println("El estado del agua es Gaseoso");
        }

        scanner.close();
    }
    
}
