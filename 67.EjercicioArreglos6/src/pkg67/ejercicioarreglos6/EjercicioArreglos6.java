
package pkg67.ejercicioarreglos6;

import javax.swing.JOptionPane;

/**
 * @author SaS
 */

public class EjercicioArreglos6 {

    
    public static void main(String[] args) {

        int[] a = new int[6], b = new int[6], c=new int[12];
       
        for(int i=0; i<6; i++){
            a[i]=Integer.parseInt(JOptionPane.showInputDialog("Numero "+(i+1)+" A"));
        }
        for(int i=0; i<6; i++){
            b[i]=Integer.parseInt(JOptionPane.showInputDialog("Numero "+(i+1)+" B"));
        }
        int z=0;
        for(int i=0; i<2; i++){
            for(int j=1+3*i; i<3; i++){
                c[z] = a[j-1];
                z++;
            }
            for(int j=1+3*i; i<3; i++){
                c[z] = b[j-1];
                z++;
            }
        }
        for(int i:c){
            System.out.print(c+" ");
        }
        
    }
    
}
