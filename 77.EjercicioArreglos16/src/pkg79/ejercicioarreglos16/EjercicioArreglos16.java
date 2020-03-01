
package pkg79.ejercicioarreglos16;

import java.util.Scanner;


public class EjercicioArreglos16 {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int eva1[]=new int[5], eva2[]=new int[5], eva3[]=new int[5], num, media;
        
        for(int i=0; i<5; i++){
            System.out.print("ALUMNO "+(i+1));
            System.out.print("Primer Trimestre -> "); eva1[i]=in.nextInt();
            System.out.print("Segunda Trimestre -> "); eva2[i]=in.nextInt();
            System.out.print("Tercera Trimestre -> "); eva3[i]=in.nextInt();
            System.out.println("\n");
        }
        
        System.out.println("Introduzca un alumno(1-5) - "); num=in.nextInt(); num-=1;
        
        media = (eva1[num]+eva2[num]+eva3[num])/3;
        
        System.out.println("Las notas del alumno "+(num+1));
        System.out.println("Primera Evaulacion: "+eva1[num]);
        System.out.println("Segunda Evaluacion: "+eva2[num]);
        System.out.println("Tercera Evaulacion: "+eva3[num]);
        System.out.println("La media del alumno es de "+media);
    }
    
}
