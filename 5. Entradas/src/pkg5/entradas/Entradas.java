
package pkg5.entradas;

import java.util.Scanner;


public class Entradas {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
         int numero;
         float num;
         double n;
         String cadena, cadena2;
         char letra;
         
         //Numeros decimales van con coma (,)
         System.out.println("Digite un numero:  ");
         numero = entrada.nextInt();
         System.out.println("Digite un numero decimal:  ");
         num=entrada.nextFloat();
         System.out.println("Digite un numero decimal 2:  ");
         n=entrada.nextDouble();
         
         //Cadenas
         System.out.print("Introduzca una cadena:  ");
         cadena=entrada.next();
         System.out.println("Su cadena es : "+cadena);
         System.out.print("Introduzca su segunda cadena:  ");
         cadena2=entrada.nextLine();
         System.out.println("Su segunda cadena es : "+cadena2);
         System.out.println("Introduzca una letra:  ");
         letra=entrada.next().charAt(0);
         System.out.println("Su letra es "+letra);
    }
    
}
