
package pkg71.ejercicioarreglos10;

import javax.swing.JOptionPane;


public class EjercicioArreglos10 {

    
    public static void main(String[] args) {
        
        int n, cont=9, var;
        int arreglo[]=new int[10];
        
        for(int i=0; i<10; i++){
            arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog("Numero "+(i+1)));
        }
        n=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero deposiciones desplazadas"));
        
        for(int i=0; i<n; i++){
            var=arreglo[9];
            for(int j=8; j>=0; j--){
                arreglo[j+1]=arreglo[j];
            }
            arreglo[0]=var;
        }
        
        for(int i=0; i<10; i++){
            System.out.print(arreglo[i]+"  ");
        }
    }
    
}
