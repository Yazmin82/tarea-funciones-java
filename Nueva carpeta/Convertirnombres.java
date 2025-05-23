/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertirnombres;

/**
 *
 * @author alfa
 */import java.util.Scanner;
public class Convertirnombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String nombre;

        while (true) {
            System.out.print("Ingresa el nombre completo en minúsculas (o escribe 'salir' para terminar): ");
            nombre = scanner.nextLine();

            if (nombre.equals("salir")) {
                System.out.println("Programa terminado.");
                break;
            } else {
                System.out.println("Nombre en mayúsculas: " + nombre.toUpperCase());
            }
        }

        scanner.close();
    }
}
    
    

