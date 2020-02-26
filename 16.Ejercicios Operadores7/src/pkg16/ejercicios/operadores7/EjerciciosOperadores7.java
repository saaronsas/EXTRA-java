
package pkg16.ejercicios.operadores7;

import java.util.Scanner;


public class EjerciciosOperadores7 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int horas, semanas, dias;
        
        System.out.print("Horas:  ");
        horas = in.nextInt();
        
        semanas = horas/168;
        dias=horas%168/24;
        horas%=24;
        
        System.out.println("\nSemanas: "+semanas);
        System.out.println("Dias: "+dias);
        System.out.println("Horas: "+horas);
        
        
        
    }
    
}
