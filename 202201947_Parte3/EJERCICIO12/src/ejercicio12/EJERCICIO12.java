/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;
import java.util.Scanner;
/**
 *
 * @author Pablo Rodriguez
 */
public class EJERCICIO12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner as = new Scanner(System.in);
        int d=1;
        System.out.println("INGRESE UN NUMERO PARA SU FACTORIAL");
        int c = as.nextInt();
        for(int i=2; i<=c ; i++)
        {
            d=d*(i);
            
        }
        System.out.println(("FACTORIAL: ")+ (d));
    }
    
}
