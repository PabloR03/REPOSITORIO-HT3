/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;
import java.util.Scanner;
/**
 *
 * @author Pablo Rodriguez
 */
public class EJERCICIO7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a = 0;
        Scanner sc= new Scanner(System.in);
        System.out.println("INGRESE SU NOMRE");
        String Nombre = sc.nextLine();
        
        Scanner c = new Scanner(System.in);
        System.out.println("INGRESE Facultad");
        String Facultad = c.nextLine();
        System.out.println("SELECCIONO: " + Facultad);
           
        if (Facultad.endsWith("Ing. Sistemas")){
            System.out.println("Importe: 350");
            System.out.println("Mensualidad:650");
            a= ((350+650)*0.18);
            System.out.println("SU TOTAL ES" + (a));            
        }
        else if (Facultad.endsWith("Derecho")){
            System.out.println("Importe: 300");
            System.out.println("Mensualidad:550");
            a= ((300+550)*0.18);
            System.out.println("SU TOTAL ES" + (a));            
        }
        else if (Facultad.endsWith("Ing. Naviera")){
            System.out.println("Importe: 300");
            System.out.println("Mensualidad:500");
            a= ((300+500)*0.18);
            System.out.println("SU TOTAL ES" + (a));            
        }
        else if (Facultad.endsWith("Ing. Pesquera")){
            System.out.println("Importe: 310");
            System.out.println("Mensualidad:460");
            a= ((310+460)*0.18);
            System.out.println("SU TOTAL ES" + (a));            
        }
        else if (Facultad.endsWith("Contabilidad")){
            System.out.println("Importe: 280");
            System.out.println("Mensualidad: 490");
            a= ((280+490)*0.18);
            System.out.println("SU TOTAL ES" + (a));            
        }
        else if (Facultad.endsWith("Administracion")){
            System.out.println("Importe: 360");
            System.out.println("Mensualidad:520");
            a= ((360+520)*0.18);
            System.out.println("SU TOTAL ES" + (a));            
        }
        else{
            System.out.println("NO SELECCIONO FACULTAD");
        }
            
    }
    
}
