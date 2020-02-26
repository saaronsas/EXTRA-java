
package pkg39.ejerciciobucles4;

import javax.swing.JOptionPane;


public class EjercicioBucles4 {

    
    public static void main(String[] args) {
        
        int num, i=0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un nuemro"));
        
        while(num>=0){
            i++;
            num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca otro numero"));
        }
        JOptionPane.showMessageDialog(null, "Han aparecido "+i+" numeros positivos");
    }
    
}
