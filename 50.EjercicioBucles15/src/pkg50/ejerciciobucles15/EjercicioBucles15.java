
package pkg50.ejerciciobucles15;

import javax.swing.JOptionPane;


public class EjercicioBucles15 {

    
    public static void main(String[] args) {
        
        int edad;
        float altura, alt=0, sedad=0, cont=0, contA=0;
        
        for(int i=0; i<5; i++){
            edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad "+(i+1)));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la altura "+(i+1)));
            
            sedad+=edad;
            alt+=altura;
            if(altura>1.75){
                contA++;
            }
            if(edad>18){
                cont++;
            }
        }
        JOptionPane.showMessageDialog(null, "La media de las edades es de "+(sedad/5));
        JOptionPane.showMessageDialog(null, "La media de las alturas es de "+(alt/5));
        JOptionPane.showMessageDialog(null, "Los alumnos con mas de 1.75 son "+(int)contA);
        JOptionPane.showMessageDialog(null, "La cantidad de alumnos amyores a 18 años son "+(int)cont);
    }
    
    
}
