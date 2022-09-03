/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.util.Scanner;
/**
 *
 * @author Pablo Rodriguez
 */
public class EJERCICIO9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("3 DADOS CON NUMERO 6 (CASO1)");
        System.out.println("2 DADOS CON NUMERO 6 (CASO2)");
        System.out.println("1 DADOS CON NUMERO 6 (CASO3)");
        System.out.println("0 DADOS CON NUMERO 6 (CASO4)");
        
        Scanner as = new Scanner(System.in);
        int c = as.nextInt();
        switch (c){
        case 1:
                System.out.println("EXCELENTE");
                break;
        case 2:
                System.out.println("MUY BIEN");
                break;
        case 3:
                System.out.println("REGULAR");
                break;
        case 4:
                System.out.println("PESIMO");
                break;
        
        }
    }
    
}
