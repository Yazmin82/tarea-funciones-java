/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contaringenieria;

/**
 *
 * @author alfa
 */ import java.util.Scanner;
public class Contaringenieria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Introduce un texto largo:");
        String texto = Scanner.nextLine().toLowerCase();

        int contador = 0;
        int index = texto.indexOf("ingeniería");

        while (index != -1) {
            contador++;
            index = texto.indexOf("ingeniería", index + 1);
        }

        System.out.println("La palabra 'ingeniería' aparece " + contador + " veces.");

        Scanner.close();
    }
    
}

