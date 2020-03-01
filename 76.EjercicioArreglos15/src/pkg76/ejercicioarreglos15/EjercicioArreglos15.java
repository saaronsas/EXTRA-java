
package pkg76.ejercicioarreglos15;

import java.util.Scanner;


public class EjercicioArreglos15 {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int arreglo[]=new int[10];
        int pos=-1, num;
        boolean o=true;
        
        do{
            for(int i=0; i<10; i++){
                System.out.print("Numero "+(i+1)+":  ");
                arreglo[i]=in.nextInt();
            }
            
            for(int i=0; i<9; i++){
                if(arreglo[i]>arreglo[i+1]){
                    o=false;
                    break;
                }
            }
        }while(o==false);
        
        System.out.println("\nIntroduzca su numero a encontrar:  ");
        num = in.nextInt();
        
        for(int i=0; i<10; i++){
            if(num==arreglo[i]){
                pos=i;
            }
        }
        if(pos==-1){
            System.out.println("El numero introducido no se encuentra en el arreglo...");
        } else {
            System.out.println("El numero "+num+" se encuentra en la posicion "+pos);
        }
        
    }
    
}
