/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.util.Scanner;
/**
 *
 * @author Pablo Rodriguez
 */
public class EJERCICIO8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner asd = new Scanner(System.in);
        System.out.println("INGRESE UNA NOTA 1");
        double a = asd.nextDouble();
        Scanner ad = new Scanner(System.in);
        System.out.println("INGRESE UNA NOTA 2");
        double b = ad.nextDouble();
        Scanner ssd = new Scanner(System.in);
        System.out.println("INGRESE UNA NOTA 3");
        double c = ssd.nextDouble();
        Scanner sd = new Scanner(System.in);
        System.out.println("INGRESE UNA NOTA 4");
        double d = sd.nextDouble();
        a = (a*0.20);
        b = (b*0.20);
        c = (c*0.30);
        d = (d*0.30);
        
        double e;
        e = a+b+c+d;
        System.out.println("PROMEDIO:" + e);
        
        if (e<=60){
            System.out.println("PERDIDA");
        }
        else if (e<=70){
            System.out.println("DECENTE");
        }
        else if (e<=80){
            System.out.println("ACEPTABLE");
        }
        else if (e<=100){
            System.out.println("EXCELENTE");
        }
        else {
            System.out.println("NOTA FUERA DEL RANGO");
        }
    }
    
}
