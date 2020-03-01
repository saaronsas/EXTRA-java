
package pkg79.ordenamientoinserccion;

import java.util.Scanner;


public class OrdenamientoInserccion {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int arreglo[], n, pos, aux;
        
        System.out.print("Introduzca el numero de elemnetos del arreglo: ");
        n=in.nextInt();
        
        arreglo=new int[n];
        
        System.out.println("Introduzca el arreglo");
        for(int i=0; i<n; i++){
            System.out.print("Numero "+(i+1)+":  "); arreglo[i]=in.nextInt();
        }
        
        for(int i=0; i<n; i++){
            pos=i;
            aux=arreglo[i];
            
            while(pos>0 && arreglo[pos-1]>aux){
                arreglo[pos]=arreglo[pos-1];
                pos--;
            }
            arreglo[pos]=aux;
        }
        
        System.out.println("\nArreglo ordenado");
        for(int i:arreglo){
            System.out.print(i+"  ");
        }
    }
    
}
