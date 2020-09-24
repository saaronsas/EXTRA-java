import java.util.Scanner;

public class Inter{
  public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    int numero = 1, num1 = 1, num2 = 1, num3 = 1, num4 = 1, num5 = 1, num6 = 1, num7 = 1, num8 = 1, num9 = 1

    
    System.out.println("VAMOS A DAR LA VUELTA A LOS NUMEROS");
    System.out.println("");

    System.out.println("¿Cual es tu numero?");
    numero = in.nextInt();
    System.out.println("");

    num1 = numero / 100000000;
   
    num2 = numero / 10000000;
    
    num3 = numero / 1000000;
    
    num4 = numero / 100000;
   
    num5 = numero / 10000;
   
    num6 = numero / 1000;
   
    num7 = numero / 100;
   
    num8 = numero / 10;
    
    num9 = numero / 1;
    
   

    
System.out.println("El numero al reves es   " + num9 + num8 + num7 + num6 + num5 + num4 + num3 + num2 + num1 );
    
  }

}