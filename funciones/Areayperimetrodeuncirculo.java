/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areayperimetrodeuncirculo;

/**
 *
 * @author alfa
 */import java.util.Scanner;
    public class Areayperimetrodeuncirculo {
    public static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
     static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = calcularArea(radio);
        double perimetro = calcularPerimetro(radio);

        System.out.printf("Área del círculo: %.2f%n", area);
        System.out.printf("Perímetro del círculo: %.2f%n", perimetro);

        scanner.close();
    }
}
        
       


