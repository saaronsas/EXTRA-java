
package pkg42.ejerciciobucles7;

import javax.swing.JOptionPane;


public class EjercicioBucles7 {

    
    public static void main(String[] args) {
       
        float suma=0, num, media=0;
        int i=0;
        
        num=Float.parseFloat(JOptionPane.showInputDialog("Introduzca un nuemro"));
        
        while(num>=0){
            suma+=num;
            i++;
            num=Float.parseFloat(JOptionPane.showInputDialog("Introduzca otro numero"));   
        }
        if(i==0){
            System.out.println("ERROR");
        }else{
            media=suma/i;
            JOptionPane.showMessageDialog(null, "La media de los "+i+" numeros es "+media);
        }
    }
    
}
