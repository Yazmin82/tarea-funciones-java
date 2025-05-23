/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparaciondecadenas;

/**
 *
 * @author alfa
 */import java.util.Scanner;
public class Comparaciondecadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la primera cadena de numeros o letras: ");
        String cadena1 = scanner.nextLine();
        System.out.print("Ingrese la segunda cadena de numeros o letras: ");
        String cadena2 = scanner.nextLine();

        if (cadena1.length() == cadena2.length()) {
            System.out.println("Las cadenas tienen la misma longitud.");
        } else {
            System.out.println("Las cadenas tienen diferente longitud.");
        }

        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }

        scanner.close();

    }
    
}

