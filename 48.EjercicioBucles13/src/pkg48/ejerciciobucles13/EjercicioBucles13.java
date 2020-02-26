
package pkg48.ejerciciobucles13;

import javax.swing.JOptionPane;


public class EjercicioBucles13 {

    
    public static void main(String[] args) {
        
        int numero, Spos=0, pos=0, Sneg=0, neg=0, ceros=0;
        float mpos, mneg;
        
        for(int i=0; i<10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Numero"+(i+1)));
            
            if(numero==0){
                ceros++;
            }else if(numero>0){
                pos++;
                Spos+=numero;
            }else if(numero<0){
                neg++;
                Sneg+=numero;
            }    
        }
        
        mpos = (float)Spos/pos;
        mneg = (float)Sneg/neg;
        
        if(pos==0){
            JOptionPane.showMessageDialog(null, "No hay numeros positivos");   
        }else{
            JOptionPane.showMessageDialog(null, "La media de los positivos es "+mpos);
        }
        if(neg==0){
            JOptionPane.showMessageDialog(null, "No hay numeros negativos");   
        }else{
            JOptionPane.showMessageDialog(null, "La media de los negativos es "+mneg);
        }
        JOptionPane.showMessageDialog(null, "Ha introducido "+ceros+" ceros");
        
        
    }
    
}
