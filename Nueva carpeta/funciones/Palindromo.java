/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromo;

/**
 *
 * @author alfa
 */import java.util.Scanner;
public class Palindromo {
     public static boolean esPalindromo(String texto) {
        texto = texto.replaceAll("\\s+", "").toLowerCase(); // eliminar espacios y poner en minúsculas
        String reverso = new StringBuilder(texto).reverse().toString();
        return texto.equals(reverso);
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe un  texto: ");
        String texto = scanner.nextLine();

        if (esPalindromo(texto)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }

        scanner.close();
    }
}
        
    
    

