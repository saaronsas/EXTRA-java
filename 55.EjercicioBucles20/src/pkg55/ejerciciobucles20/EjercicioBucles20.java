
package pkg55.ejerciciobucles20;

import javax.swing.JOptionPane;

public class EjercicioBucles20 {

    
    public static void main(String[] args) {
        
        int num; 
        float sueldos, sueldoM=0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero"));

        for(int i=0; i<num; i++){
            sueldos = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el sueldo "+(i+1)));
            
            if(sueldos>sueldoM){
                sueldoM=sueldos;
            }
        }
        System.out.println("El sueldo Maximo es "+sueldoM);
    }
    
}
