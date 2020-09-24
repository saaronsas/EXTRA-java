import java.util.Scanner;

public class Cuadrado{
  public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    int num1 = 0, resultado = 0;
   
    System.out.println("Dame un numero");
    num1 = in.nextInt();
    System.out.println("");

    resultado = num1 * num1;

    System.out.println("El cuadrado de tu numero es =" + resultado);
    
    
  }  
  
}