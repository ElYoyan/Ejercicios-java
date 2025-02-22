//Dada la fecha de hoy, calcular la fecha del día siguiente. Suponer que el año no es bisiesto. 

package ejercicios;
import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el dia actual");
        int dia = scanner.nextInt();
        System.out.println("Ingrese el mes actual en número (1 al 12)");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el año actual");
        int anio = scanner.nextInt();

        scanner.close();

        dia++;

        int[] diasCadaMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (dia > diasCadaMes[mes-1]){
            dia = 1;
            mes++;

            if (mes>12){
                mes = 1;
                anio++;
            }
        }

        System.out.println("La fecha del día de mañana es: " +dia+ "/" +mes+ "/" +anio);
    }
}
