
package pkg17.ejerciciosoperadores8;

import java.util.Scanner;


public class EjerciciosOperadores8 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        
        double a,b,c, total1, total2;
        
        System.out.print("a:  ");
        a=in.nextDouble();
        System.out.print("b:  ");
        b=in.nextDouble();
        System.out.print("c:  ");
        c=in.nextDouble();
        
        total1 = (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
        total2 = (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
        
        System.out.println("El resultado es "+total1+" y "+total2);
        
    }
    
    
}
