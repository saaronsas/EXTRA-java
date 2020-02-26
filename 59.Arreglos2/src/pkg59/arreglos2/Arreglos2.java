
package pkg59.arreglos2;

import javax.swing.JOptionPane;


public class Arreglos2 {

    
    public static void main(String[] args) {
        
        int elemnt;
        
        elemnt=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de elementos del arrgle"));
        
        char[] letras = new char[elemnt];
        
        for(int i=0; i<elemnt; i++){
            letras[i]=JOptionPane.showInputDialog("Introduzca la letra "+(i+1)).charAt(0);
        }
        
        for(int i=0; i<elemnt; i++){
            System.out.print(letras[i]+" ");
        }
        
    }
    
}
