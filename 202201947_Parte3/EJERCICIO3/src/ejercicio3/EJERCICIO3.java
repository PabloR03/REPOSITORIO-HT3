/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Pablo Rodriguez
 */
public class EJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner asd = new Scanner(System.in);
        System.out.println("INGRESE UNA CANTIDAD (A)");
        int a = asd.nextInt();
        
        if (a%2==0){
            System.out.println("EL NUMERO INGRESADO ES PAR");
        if (a<0){
            System.out.println("ES NEGATIVO");
        }
        else if (a>0){
            System.out.println("ES POSITIVO");
        }
        else {
            System.out.println("ES CERO");
        }
        }
        
        if (a%2<0){
            System.out.println("EL NUMERO INGRESADO ES IMPAR");
        if (a<0){
            System.out.println("ES NEGATIVO");
        }
        else if (a>0){
            System.out.println("ES POSITIVO");
        }
        else {
            System.out.println("ES CERO");
        }
        }
        if (a%2>0){
            System.out.println("EL NUMERO INGRESADO ES IMPAR");
        if (a<0){
            System.out.println("ES NEGATIVO");
        }
        else if (a>0){
            System.out.println("ES POSITIVO");
        }
        else {
            System.out.println("ES CERO");
        }
        }
    }
    
}
