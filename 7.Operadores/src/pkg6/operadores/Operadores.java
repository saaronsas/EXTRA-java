
package pkg6.operadores;

import java.util.Scanner;


public class Operadores {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float a, b, suma, resta, division, multiplicacion, modulo;
        
        System.out.println("Numero 1:  ");
        a = entrada.nextFloat();
        System.out.println("Numero 2:  ");
        b = entrada.nextFloat();
        
        suma=a+b;
        resta=a-b;
        multiplicacion=a*b;
        division=a/b;
        modulo=a%b;
        
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicacion: "+multiplicacion);
        System.out.println("Division: "+division);
        System.out.println("Resto: "+modulo);
        
    }
    
}
