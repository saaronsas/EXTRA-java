
package pkg78.metodoburbuja;

import java.util.Scanner;


public class MetodoBurbuja {

    
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
        int arreglo[]=new int[10], aux;
        
        for(int i=0; i<10; i++){
            System.out.print("Numero "+(i+1)+":  "); arreglo[i]=in.nextInt();
        }
        
        for(int i=0; i<10; i++){
            for(int j=0; j<9; j++){
                if(arreglo[j]>arreglo[j+1]){
                    aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }
        
        System.out.println("El arreglo ordenado...");
        for(int i:arreglo){
            System.out.print(i+"  ");
        }
    }
    
}
