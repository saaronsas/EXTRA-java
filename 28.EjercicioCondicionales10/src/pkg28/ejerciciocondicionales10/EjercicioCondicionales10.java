
package pkg28.ejerciciocondicionales10;

import javax.swing.JOptionPane;


public class EjercicioCondicionales10 {

    
    public static void main(String[] args) {
        int dia, mes, año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los dias"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los meses"));
        año = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los años"));
        
        switch(mes){
            case 2:
                if(dia>=1&&dia<=28){
                    if(año!=0){
                        JOptionPane.showMessageDialog(null, "La fecha es correcta >> "+dia+"-"+mes+"-"+año);
                    }else{
                        JOptionPane.showMessageDialog(null, "La fecha es incorrecta (años)");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "La fecha es incorrecta (dias)");
                }
                break;
            default:
                if(mes==1||mes==3||mes==5||mes==7||mes==9||mes==11){
                    if(dia>=1&&dia<=31){
                        if(año!=0){
                            JOptionPane.showMessageDialog(null, "La fecha es correcta >> "+dia+"-"+mes+"-"+año);
                        }else{
                            JOptionPane.showMessageDialog(null, "La fecha es incorrecta (años)");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "La fecha es incorrecta (dias)");
                    }
                }else if(mes==4||mes==06||mes==8||mes==10||mes==12){
                    if(dia>=1&&dia<=28){
                        if(año!=0){
                            JOptionPane.showMessageDialog(null, "La fecha es correcta >> "+dia+"-"+mes+"-"+año);
                        }else{
                            JOptionPane.showMessageDialog(null, "La fecha es incorrecta (años)");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "La fecha es incorrecta (dias)");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "La fecha es incorrecta (mes)");
                }
        }
    }
    
}
