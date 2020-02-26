
package pkg15.ejerciciosoperadores6;

import java.util.Scanner;


public class EjerciciosOperadores6 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double a, b;
        double total;
        
        System.out.print("a:  ");
        a=in.nextFloat();
        System.out.print("b:  ");
        b=in.nextFloat();
        
        total = Math.pow(a, 2)+Math.pow(b, 2)+2*a*b;
        
        System.out.println("El resultado es "+total);
    }
    
}
