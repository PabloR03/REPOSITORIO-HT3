/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Pablo Rodriguez
 */
public class EJERCICIO10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0;
        int b=0;
        Scanner as = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO MENOR O IGUAL A 100");
        int c = as.nextInt();
        
            do{
                c=c+1;
                b++;
                System.out.println(("numero:")+(c)+("veces:")+(b));
            }while (c <= 99);
        
        
    }
    
}
