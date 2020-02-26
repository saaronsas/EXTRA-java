
package pkg10.ejerciciooperadores1;

import java.util.Scanner;


public class EjercicioOperadores1 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float nota1, nota2, nota3, media;
        
        System.out.print("Nota 1: ");
        nota1 = in.nextFloat();
        System.out.print("Nota 2: ");
        nota2 = in.nextFloat();
        System.out.print("Nota 3: ");
        nota3 = in.nextFloat();
        
        media = (nota1+nota2+nota3)/3;
        
        System.out.println("\nLa media de las calificaciones es "+media);
        
    }
   
}
