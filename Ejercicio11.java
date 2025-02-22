//Solicitar al usuario la inicial del día de la semana y mostrar el nombre del día completo. La letra inicial puede ser mayúscula o minúscula. Usar la x para el miércoles.

package ejercicios;

import java.util.Scanner;


public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la inicial del dia de la semana, escriba X para el dia 3"); 
        char dia = scanner.next().toLowerCase().charAt(0);
 
        String nombreDia;
        switch (dia) {
            case 'l' : nombreDia = "Lunes"; break;
            case 'm' : nombreDia = "Martes"; break;
            case 'x' : nombreDia = "Miercoles"; break;
            case 'j' : nombreDia = "Jueves"; break;
            case 'v' : nombreDia = "Viernes"; break;
            case 's' : nombreDia = "Sabado"; break;
            case 'd' : nombreDia = "Domingo"; break;
            default: nombreDia = "Inicial invalida";
        }

        System.out.println("El día infresado es: " + nombreDia);

        scanner.close();
    }
    
}
