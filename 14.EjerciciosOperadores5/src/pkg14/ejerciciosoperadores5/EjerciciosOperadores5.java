
package pkg14.ejerciciosoperadores5;

import java.util.Scanner;


public class EjerciciosOperadores5 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float part, exam1, exam2, examf, total;
        
        System.out.print("Participacion: ");
        part = in.nextFloat();
        System.out.print("Primer examen: ");
        exam1 = in.nextFloat();
        System.out.print("Segundo examen: ");
        exam2 = in.nextFloat();
        System.out.print("Examen final: ");
        examf = in.nextFloat();
        
        total = 0.1f*part+0.25f*exam1+0.25f*exam2+0.4f*examf;
        
        System.out.println("La media es "+total+" puntos");
        
    }
    
}
