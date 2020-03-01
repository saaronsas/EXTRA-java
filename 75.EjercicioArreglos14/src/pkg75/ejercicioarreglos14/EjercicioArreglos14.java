
package pkg75.ejercicioarreglos14;

import java.util.Scanner;


public class EjercicioArreglos14 {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int arreglo1[]=new int[5], arreglo2[]=new int[5];
        int a[]=new int[10];
        boolean o1=true, o2=true;
        
        do{
            for(int i=0; i<5; i++){
                System.out.print("Numero "+(i+1)+" -> 1: ");
                arreglo1[i]=in.nextInt();
            }
            for(int i=0; i<4; i++){
                if(arreglo1[i]>arreglo1[i+1]){
                    o1=false;
                    System.out.println("El arreglo 1 esta desordenado...");
                    break;
                }
            }
        }while(o1==false);
        do{
            for(int i=0; i<5; i++){
                System.out.print("Numero "+(i+1)+" -> 2: ");
                arreglo2[i]=in.nextInt();
            }
            for(int i=0; i<4; i++){
                if(arreglo2[i]>arreglo2[i+1]){
                    o2=false;
                    System.out.println("El arreglo 2 esta desordenado...");
                    break;
                }
            }
        }while(o2==false);
        
        int j=0, z=0;
        for(int i=0; i<10; i++){
            if(arreglo1[j]<arreglo2[z]){
       
                if(j>=4){
                    a[i]=arreglo2[z];
                    z++;
                }else{
                    a[i]=arreglo1[j]; 
                    j++;
                }
            }
            if(arreglo2[z]<arreglo1[j]){

                if(z>=4){
                    a[i]=arreglo1[j];
                    j++;
                }else{
                    a[i]=arreglo2[z];
                    z++;
                }
            }
            if(arreglo1[j]==arreglo2[z]){

                if(j>=4){
                    a[i]=arreglo2[z];
                    z++;
                }else{
                    a[i]=arreglo1[j];
                    j++;
                }
            }
        }
        System.out.println("Array fianl...");
        for(int i=0; i<10; i++){
            System.out.print(a[i]+"  ");
        }
        
    }
    
}
