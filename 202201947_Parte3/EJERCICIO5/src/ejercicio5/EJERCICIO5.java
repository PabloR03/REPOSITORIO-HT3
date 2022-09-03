/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;
/**
 *
 * @author Pablo Rodriguez
 */
public class EJERCICIO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner asd = new Scanner(System.in);
        System.out.println("INGRESE UNA CANTIDAD (ENTRE 0 Y 99999)");
        int a = asd.nextInt();
        if (a<0){
            System.out.println("NUMERO INVALIDO");
        }
        else if (a>99999){
            System.out.println("NUMERO INVALIDO");
        }
        else if (a<10){
            System.out.println("NUMERO CON 1 CIFRA");
        }
        else if (a<99){
            System.out.println("NUMERO CON 2 CIFRA");
        }
        else if (a<999){
            System.out.println("NUMERO CON 3 CIFRA");
        }
        else if (a<9999){
            System.out.println("NUMERO CON 4 CIFRA");
        }
        else if (a<99999){
            System.out.println("NUMERO CON 5 CIFRA");
        }
        
    }
    
}
