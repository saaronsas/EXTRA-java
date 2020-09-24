import java.util.Scanner;

public class Numeros{
  public static void main(String[] args){


    Scanner in = new Scanner(System.in);
    double num1 = 0, num2 = 0;

    System.out.println("¿cual es tu numero A?");
    num1 = in.nextDouble();
    System.out.println("");

    System.out.println("¿cual es tu numero B?");
    num2 = in.nextDouble();
    System.out.println("");

    
    if(num1 < 0) {
       if(num2 < 0){ 
        System.out.println("A y B son negativos < 0");
      }else if (num2 > 0){
        System.out.println("A es negativo y B es positivo");
      }
    }
    
    if(num1 > 0) {
       if(num2 < 0){ 
        System.out.println("A es positivo y B es negativo");
      }else if(num2 > 0){
        System.out.println("A y B son positivos");
      }
    }
  }
}
