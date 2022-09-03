/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Pablo Rodriguez
 */
public class EJERCICIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner asd = new Scanner(System.in);
        System.out.println("INGRESE UNA CANTIDAD (A)");
        int a = asd.nextInt();
        Scanner ad = new Scanner(System.in);
        System.out.println("INGRESE UNA CANTIDAD (B)");
        int b = ad.nextInt();
        
        if (a<b){
            System.out.println("LA CANTIDAD MAYOR ES (B)");
       
        }
        else if (a>b){
            System.out.println("LA CANTIDAD MAYOR ES (A)");
            
        }
        else {
            System.out.println("SON IGUALES");
        }
        
    }
    
}
