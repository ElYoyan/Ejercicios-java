//Pedir un mes (número) y mostrar el nombre del mes. 

package ejercicios;
import java.util.Scanner; 


public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdusca el numero del mes: ");
        int mes = scanner.nextInt();

        
        String[] nombreDelMes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio","Agosto", "Septiembre", "Octubre","Noviembre", "Diciembre"};

        if (mes>=1 && mes<=12){

            System.out.println("El nombre del Mes es: " +nombreDelMes[mes - 1]);
        } else {
            System.out.println("Número inválido ingrese un número del 1 al 12" );
        }


        scanner.close();
    }

  

}
