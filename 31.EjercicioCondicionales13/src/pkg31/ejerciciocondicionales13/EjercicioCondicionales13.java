
package pkg31.ejerciciocondicionales13;

import javax.swing.JOptionPane;


public class EjercicioCondicionales13 {

    
    public static void main(String[] args) {
        
        final int saldo=1000;
        int opc; float ingreso, saldoA;
        
        opc = Integer.parseInt(JOptionPane.showInputDialog("CAJERO AUTOMATICO\n\n"
                + "1. Ingresar dinero\n"
                + "2. Retirar dinero\n"
                + "3. Salir\n"));
        
        switch(opc){
            case 1:
                ingreso = Float.parseFloat(JOptionPane.showInputDialog("INTRODUCIENDO DINERO\nIntroduzca el dinero"));
                saldoA=saldo+ingreso;
                JOptionPane.showMessageDialog(null, "Saldo actual: "+saldoA);
                break;
            case 2:
                ingreso = Float.parseFloat(JOptionPane.showInputDialog("RETIRANDO DINERO\nIntroduzca el dinero"));
                saldoA=saldo-ingreso;
                if(ingreso>saldo){
                    JOptionPane.showMessageDialog(null, "Cantidad dinero insuficiente");
                    break;
                }
                JOptionPane.showMessageDialog(null, "Saldo actual: "+saldoA);
                break;
            case 3:
                break;
        }
        
    }
    
}
