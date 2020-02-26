
package pkg37.ejerciciobucles2;

import javax.swing.JOptionPane;


public class EjercicioBucles2 {

    
    public static void main(String[] args) {
        
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Introdzuca un numero"));
        
        while(num!=0){
            if(num<0){
                JOptionPane.showMessageDialog(null, "El numero "+num+" es nesgativo");
            } else {
                JOptionPane.showMessageDialog(null, "El nuemro "+num+" es positivo");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Introdzuca otro numero"));
        }
        
    }
    
}
