import java.util.Scanner;

public class Igual{
  public static void main(String[] args){

  
    Scanner in = new Scanner(System.in);
    int num1 = 0, num2 = 0;
    

    System.out.println("¿Cual es tu primer numero?");
    num1 = in.nextInt();
    System.out.println("");

    System.out.println("¿Cual es tu segundo numero?");
    num2 = in.nextInt();
    System.out.println("");

    
    if(num1 == num2){
      System.out.println("Son iguales");
    } else {
      System.out.println("No son iguales");
    }   




  }
}