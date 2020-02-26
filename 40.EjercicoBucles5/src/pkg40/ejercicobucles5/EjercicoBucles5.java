
package pkg40.ejercicobucles5;

import javax.swing.JOptionPane;


public class EjercicoBucles5 {

    
    public static void main(String[] args) {
        
        int num, i=0, ale; 
         
        
        ale = (int)(Math.random()*100);
        
        do{
            num=Integer.parseInt(JOptionPane.showInputDialog("Introduce su nuemro"));
            
            if(num<ale){
                JOptionPane.showMessageDialog(null, "El numero es MAYOR");
            } else if(num>ale) {
                JOptionPane.showMessageDialog(null, "El numero es menor");
            }
            i++;
        }while(num!=ale);
        JOptionPane.showMessageDialog(null, "ENORABUENA\nHas tardado "+i+" intentos");
    }
    
}
