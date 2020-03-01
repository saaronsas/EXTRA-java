
package pkg70.ejercicioarreglos9;

import javax.swing.JOptionPane;


public class EjercicioArreglos9 {

    
    public static void main(String[] args) {

        int arreglo[]=new int[10];
        int var;
        
        for(int i=0; i<10; i++){
            arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog("Numero "+(i+1)));
        }
        var=arreglo[9];
        for(int i=8; i>=0; i--){
            arreglo[i+1]=arreglo[i];
        }
        arreglo[0]=var;
        
        for(int i=0; i<10; i++){
            System.out.print(arreglo[i]+" - ");
        }
        
    }
    
}
