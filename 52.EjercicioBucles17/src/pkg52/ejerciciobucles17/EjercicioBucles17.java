
package pkg52.ejerciciobucles17;

import javax.swing.JOptionPane;


public class EjercicioBucles17 {

    
    public static void main(String[] args) {
        
        int codigo, cont=0, Lcod=0;
        float precio, litros, factura, facturaT=0;
        
        for(int i=0; i<5; i++){
            codigo=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el codigo del articulo "+(i+1)));
            litros=Float.parseFloat(JOptionPane.showInputDialog("Introduzca los litros del articulo "+codigo));
            precio=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el precio/litro"));
            
            factura=(float)litros*precio;
            if(factura>600){
                cont++;
            }
            facturaT+=factura;
            if(codigo==1){
                Lcod+=litros;
            }
        }
        JOptionPane.showMessageDialog(null, "La factura total es de "+facturaT);
        JOptionPane.showMessageDialog(null, "La ventas de mas de 600$ es de "+cont);
        JOptionPane.showMessageDialog(null, "Los litros vendididos del ariculo 1 son "+Lcod);
        
        
        
    }
    
}
