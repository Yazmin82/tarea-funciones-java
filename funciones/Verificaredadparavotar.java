/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificaredadparavotar;

/**
 *
 * @author alfa
 */import java.util.Scanner;
public class Verificaredadparavotar {
    public static boolean puedeVotar(int edad) {
        return edad >= 18;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        if (puedeVotar(edad)) {
            System.out.println("Puede votar.");
        } else {
            System.out.println("No puede votar.");
        }

        scanner.close();
    }
}
    

    

