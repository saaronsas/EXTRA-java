
package pkg53.ejerciciobucles18;

import javax.swing.JOptionPane;


public class EjercicioBucles18 {

    
    public static void main(String[] args) {
        
        int cod;
        float litros, factura=0;
        
        for(int i=0; i<5; i++){
            cod  = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el codigo"));
            litros = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la cantidad de litros del articulo "+cod));
            
            switch(cod){
                case 1:
                    factura+=litros*0.6;
                    break;
                case 2:
                    factura+=litros*3;
                    break;
                case 3:
                    factura+=litros*1.25;
                    break;
            }
        }
        System.out.println("La factura es de "+factura);
    }
    
}
