/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Pablo Rodriguez
 */
public class EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner asd = new Scanner(System.in);
        System.out.println("INGRESE UNA EDAD PARA VER EN QUE FASE DE LA VIDA SE ENCUENTRA");
        int a = asd.nextInt();
        if (a<0){
            System.out.println("NO HA NACIDO :0");
        }
        else if(a<5){
            System.out.println("ES UN BEBÉ");
        }
        else if(a<12){
            System.out.println("ES UN NIÑO");
        }
        else if(a<18){
            System.out.println("ES UN ADOLECENTE");
        }
        else if(a<40){
            System.out.println("ES UN ADULTO");
        }
        else{
            System.out.println("ES UN ADULTO MAYOR");
        }
         
    
}
}
