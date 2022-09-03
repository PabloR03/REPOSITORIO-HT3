/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;

/**
 *
 * @author Pablo Rodriguez
 */
public class EJERCICIO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner asd = new Scanner(System.in);
        System.out.println("INGRESE UNA CANTIDAD (A)");
        int a = asd.nextInt();
        Scanner sd = new Scanner(System.in);
        System.out.println("INGRESE UNA CANTIDAD (B)");
        int b = sd.nextInt();
        Scanner ad = new Scanner(System.in);
        System.out.println("INGRESE UNA CANTIDAD (C)");
        int c = ad.nextInt();
        if (a <= b){
            if (b<=c){
                System.out.println("EL PRDEN  DE LAS CANTIDADES ES: (C), (B), (A)");
            }
        }
        if (a <= c){
            if (c<=b){
                System.out.println("EL PRDEN  DE LAS CANTIDADES ES: (B), (C), (A)");
            }
        }
        
        if (b <= a){
            if (a<=c){
                System.out.println("EL PRDEN  DE LAS CANTIDADES ES: (C), (A), (B)");
            }
        }
        if (b <= c){
            if (c<=a){
                System.out.println("EL PRDEN  DE LAS CANTIDADES ES: (A), (C), (B)");
            }
        }
        if (c <= b){
            if (b<=a){
                System.out.println("EL PRDEN  DE LAS CANTIDADES ES: (A), (B), (C)");
            }
        }
        if (c <= a){
            if (a<=b){
                System.out.println("EL PRDEN  DE LAS CANTIDADES ES: (B), (A), (c)");
            }
        }
        
    }
    
}
