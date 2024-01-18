/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estatura;
import java.util.Scanner;

/**
 *
 * @author JUAN
 */
public class Estatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Double altura;
       Scanner entrada = new Scanner(System.in);        
        System.out.println("Escribe tu altura");
        altura=entrada.nextDouble();
        System.out.println("Tu altura es: "+altura);
        
    }
    
}
