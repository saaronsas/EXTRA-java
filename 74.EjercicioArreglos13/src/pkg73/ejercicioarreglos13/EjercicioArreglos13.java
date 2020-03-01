
package pkg73.ejercicioarreglos13;

import java.util.Scanner;


public class EjercicioArreglos13 {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int arreglo[]=new int[10];
        
        int par=0, imp=0;
        
        System.out.println("Lenando arreglo");
        for(int i=0; i<10; i++){
            System.out.print("Numero "+(i+1)+":  ");
            arreglo[i] = in.nextInt();
            
            if(arreglo[i]%2==0){
                par++;
            }else{
                imp++;
            }
        }
        int pares[]=new int[par], impares[]=new int[imp];
        
        int j=0, z=0;
        for(int i=0; i<10; i++){
            if(arreglo[i]%2==0){
                pares[j]=arreglo[i];
                j++;
            }else{
                impares[z]=arreglo[i];
                z++;
            }
        }
        System.out.println("Pares");
        for(int i: pares){
            System.out.print(i+"  ");
        }
        System.out.println("Impares");
        for(int i:impares){
            System.out.print(i+"  ");
        }
    }
    
}
