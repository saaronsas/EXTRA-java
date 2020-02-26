
package pkg61.ejercicioarreglos1;

import java.util.Scanner;


public class EjercicioArreglos1 {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        float[] numeros = new float[5];
        
        for(int i=0; i<5; i++){
            System.out.print((i+1)+".Introduzca un numero: ");
            numeros[i]=in.nextFloat();
        }
        for(float i: numeros){
            System.out.println(i);
        }
    }
    
}
