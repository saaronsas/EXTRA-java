
package pkg69.ejercicioarreglos8;

import javax.swing.JOptionPane;


public class EjercicioArreglos8 {

    
    public static void main(String[] args) {
        
        int arreglo[]=new int[10];
        int num, pos;
        
        for(int i=0; i<8; i++){
            arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog("Numero "+(i+1)));
        }
        
        num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el nuevo numero"));
        pos=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la posicion donde quiera incluirlo"));
        
        for(int i=8; i>pos-1; i--){
            arreglo[i+1]=arreglo[i];
        }
        arreglo[pos-1]=num;
        
        for(int i=0; i<9; i++){
            System.out.print(arreglo[i]+" ");
        }
    }
    
}
