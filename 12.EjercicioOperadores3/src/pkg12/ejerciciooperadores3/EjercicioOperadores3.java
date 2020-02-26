
package pkg12.ejerciciooperadores3;

import java.util.Scanner;


public class EjercicioOperadores3 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float guillermo, total;
        
        System.out.print("Introduzca la cantidad de dinero de Guillermo: ");
        guillermo=in.nextFloat();
        
        total = guillermo+(guillermo/2)+((guillermo+guillermo/2)/2);
        
        System.out.println("Los tres suman "+total+" euros");
        
    }
    
}
