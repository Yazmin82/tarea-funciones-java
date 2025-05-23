/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiondefechas;

/**
 *
 * @author alfa
 */import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Conversiondefechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Introduce una fecha de la sig manera YYYY-MM-DD: ");
        String input = Scanner.nextLine();
          try {
            LocalDate fecha = LocalDate.parse(input);
            LocalDate unaSemanaDespues = fecha.plusWeeks(1);
            LocalDate unMesAntes = fecha.minusMonths(1);

            System.out.println("Una semana después: " + unaSemanaDespues);
            System.out.println("Un mes antes: " + unMesAntes);
        } catch (Exception e) {
            System.out.println("incorrecto.");
        }
        Scanner.close();
    }
    
}



