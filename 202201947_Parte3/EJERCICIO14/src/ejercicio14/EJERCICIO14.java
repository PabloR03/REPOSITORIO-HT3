/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Pablo Rodriguez
 */
public class EJERCICIO14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("RESOLVERÁ INTEGRAL POR METODO DE SIMPSON");
        float a, b, c, d, e, f;
        System.out.println("INGRESE UN VALOR DE INICIO PARA INTEGRAR");
        Scanner as = new Scanner(System.in);
        a = as.nextInt();
        
        System.out.println("INGRESE UN VALOR FINAL PARA INTEGRAR");
        Scanner ass = new Scanner(System.in);
        b = ass.nextInt();
        
        System.out.println("FUNCION A INTEGRAR: X^2 + X");
        d = ((b-a)/(b))/3;
        c = ((((a)*(a))+ (a)))   + (4*(((a+1)*(a+1))+ (a+1))) + (2*(((a+2)*(a+2)) + (a+2))) + (4*(((a+3)*(a+3))+ (a+3))) + (2*(((a+4)*(a+4))+ (a+4))) +(4*(((a+5)*(a+5))+ (a+5))) + (2*(((a+6)*(a+6))+ (a+6))) + (4*(((a+7)*(a+7))+ (a+7))) + (2*(((a+8)*(a+8))+ (a+8))) + (4*(((a+9)*(a+9))+ (a+9))) + (((a+10)*(a+10))+ (a+10));
        e = c*d;
        System.out.println("LA RESPUESTA ES: " + (e));
    }
    
}
