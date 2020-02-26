
package pkg63.ejercicioarreglos3;

import javax.swing.JOptionPane;


public class EjercicioArreglos3 {

    
    public static void main(String[] args) {
        
        float[] num = new float[5];
        int pos=0, mpos=0, neg=0, mneg=0, ceros=0;
        
        for(int i=0; i<5; i++){
            num[i] = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el nuemro "+(i+1)));
            
            if(num[i]<0){
                neg++;
                mneg+=num[i];
            } else if (num[i]>0){
                pos++;
                mpos+=num[i];
            }else{
                ceros++;
            }
        }
        
        mneg/=neg;
        mpos/=pos;
        
        JOptionPane.showMessageDialog(null, "La media de los positivos es "+mpos);
        JOptionPane.showMessageDialog(null, "La media de los negativos es "+mneg);
        JOptionPane.showMessageDialog(null, "La cantidad de numeros = 0 es "+ceros);
    }
    
}
