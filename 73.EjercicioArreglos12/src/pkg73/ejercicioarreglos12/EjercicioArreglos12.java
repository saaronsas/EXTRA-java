
package pkg73.ejercicioarreglos12;

import java.util.Scanner;

public class EjercicioArreglos12 {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int tabla[]=new int[10];
        
        System.out.println("Cargando arreglo");
        for (int i =0;i<10;i++){
            System.out.print((i+1)+"-Introduzca un numero: ");
            tabla[i]=in.nextInt();
        }
        
        int pos;                
        do{
            System.out.print("Digite posicion 1 a 10 para eliminar numero: ");
            pos=in.nextInt();
        }while((pos-1<0)||(pos-1>10));
        
        for (int x=pos-1;x<tabla.length-1;x++){
            tabla[x]=tabla[x+1];           
        }
        tabla[tabla.length-1]=0;
        
        
        for (int i:tabla)
            System.out.println(i+"  ");
        
    }
    
}
