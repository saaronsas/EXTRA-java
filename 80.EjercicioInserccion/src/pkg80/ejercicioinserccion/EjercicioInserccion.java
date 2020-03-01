
package pkg80.ejercicioinserccion;

import java.util.Scanner;


public class EjercicioInserccion {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int arreglo[], asc[], desc[], aux, pos, n;
        
        System.out.println("Introduzca el numero de numeros -> "); n=in.nextInt();
        
        arreglo = new int[n];
        asc = new int[n];
        desc = new int[n];
        
        System.out.println("*ARREGLO*");
        for(int i=0; i<n; i++){
            System.out.print("Numero "+(i+1)+":  ");
            arreglo[i]=in.nextInt();
        }
        
        for(int i=0; i<n; i++){
            aux=arreglo[i];
            pos=i;
            
            while(pos>0 && aux<arreglo[pos-1]){
                arreglo[pos]=arreglo[pos-1];
                pos--;
            }
            arreglo[pos]=aux;    
        }
        System.arraycopy(arreglo, 0, asc, 0, n);
        
        for(int i=0; i<n; i++){
            pos=i;
            aux=arreglo[i];
            
            while(pos>0 && arreglo[pos-1]<aux){
                arreglo[pos]=arreglo[pos-1];
                pos--;
            }
            arreglo[pos]=aux;
        }
        System.arraycopy(arreglo, 0, desc, 0, n);
        
        System.out.println("\nOrden Ascendente");
        for(int i:asc){
            System.out.print(i+"  ");
        }
        System.out.println("\nOrden Descendente");
        for(int i:desc){
            System.out.print(i+"  ");
        }
    }
    
}
