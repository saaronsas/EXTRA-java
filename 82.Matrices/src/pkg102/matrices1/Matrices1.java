
package pkg102.matrices1;

import java.util.Scanner;


public class Matrices1 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //int matriz[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        
        int matriz[][] = new int[3][3];
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Matriz["+i+"]["+j+"]: "); matriz[i][j]=in.nextInt();
            }
        }
        
        for(int i=0; i<3; i++){
            System.out.println("   ");
            for(int j=0; j<3; j++){
                System.out.print(matriz[i][j]+" ");
            }
        }
        
    }
    
}
