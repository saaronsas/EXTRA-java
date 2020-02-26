
package pkg56.ejerciciobucles21;

import javax.swing.JOptionPane;


public class EjercicioBucles21 {

    
    public static void main(String[] args) {
        
        int numero;
        boolean negativo=false;
        
        for(int i=0; i<10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introdzuca el numero "+(i+1)));
            
            if(numero<0){
                negativo=true;
            }
        }
        if(negativo==true){
            System.out.println("Hay numeros negativos");
        }else{
            System.out.println("No hay negativos");
        }
        
    }
    
}
