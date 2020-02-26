
package pkg13.ejerciciooperadores4;

import java.util.Scanner;


public class EjercicioOperadores4 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float ventas, coche;
        double salario;
        
        System.out.print("Introduzca la cantidad de ventas realizadas: ");
        ventas=in.nextFloat();
        System.out.print("Introduzca el valor de los coches: ");
        coche=in.nextFloat();
        
        salario=1000+150*ventas+0.05*coche*ventas;
        
        System.out.println("El salario del vendedor es de "+salario+" euros");
        
        
    }
    
}
